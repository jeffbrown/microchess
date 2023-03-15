package io.unityfoundation.demo;

import io.micronaut.http.annotation.*;

@Controller("/microchess")
public class MicrochessController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}