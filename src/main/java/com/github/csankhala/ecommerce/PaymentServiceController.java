package com.github.csankhala.ecommerce;

import io.micronaut.http.annotation.*;

@Controller("/paymentService")
public class PaymentServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}