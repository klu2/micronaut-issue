package net.klu2.micronaut;

import io.micronaut.http.annotation.Controller;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
@Controller("/")
public class SampleController implements SampleApi {
    @Override
    public Result changeValue(String id) {
        return new Result(id);
    }

    @Override
    public Result getValue(String id) {
        return new Result(id);
    }

    @Override
    public Result getValue2(String id) {
        return new Result(id);
    }

    @Override
    public Result getValue3(String id) {
        return new Result(id);
    }

    @Override
    public Result changeToDefault() {
        return new Result("-1");
    }
}
