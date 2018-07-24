package net.klu2.micronaut;

import io.micronaut.http.client.Client;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@Client("http://localhost:8080")
public interface SampleClient extends SampleApi {
}
