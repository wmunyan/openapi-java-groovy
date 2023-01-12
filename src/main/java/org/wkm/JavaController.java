package org.wkm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/java")
public class JavaController {

	@Get(uri = "/", produces = "text/plain")
	String index() {
		return "Java Controller Response";
	}
}
