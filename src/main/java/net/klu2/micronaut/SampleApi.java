package net.klu2.micronaut;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.QueryValue;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
public interface SampleApi {

    @Post("/api/change")
    Result changeValue(@QueryValue(value = "id") String id);

    @Get("/api/get-value1")
    Result getValue(@QueryValue(value = "id") String id);

    @Get("/api/get-value2{?id}")
    Result getValue2(@QueryValue(value = "id") String id);

    @Get("/api/get-value3/{id}")
    Result getValue3(@QueryValue(value = "id") String id);


    @Post("/api/change-to-default")
    Result changeToDefault();

    class Result {
        private String value;

        public Result(String value) {
            this.value = value;
        }

        public Result() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
