package net.klu2.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
public class QueryValueTest {

    private static EmbeddedServer server;
    private static SampleClient client;

    @BeforeClass
    public static void setupServer() throws IOException {
        server = ApplicationContext.run(EmbeddedServer.class);
        client = server.getApplicationContext().createBean(SampleClient.class);
    }

    @Test
    public void postWithRequestParam() {
        assertEquals("3", client.changeValue("3").getValue());
    }

    @Test
    public void getWithRequestParam() {
        assertEquals("x", client.getValue("x").getValue());
    }

    @Test
    public void getWithRequestParam2() {
        assertEquals("x", client.getValue2("x").getValue());
    }

    @Test
    public void getWithUriParam() {
        assertEquals("x", client.getValue3("x").getValue());
    }

    @Test
    public void postWithoutParams() {
        assertEquals("-1", client.changeToDefault().getValue());
    }


}
