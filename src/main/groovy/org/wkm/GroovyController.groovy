package org.wkm

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/groovy")
class GroovyController {

    @Get(uri = "/", produces = "text/plain")
    String index() {
        "Groovy Controller Response"
    }
}