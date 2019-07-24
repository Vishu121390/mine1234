package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class Greet {
	@GET
	public String greet() {
		return "welcome to JAX-RS";
	}

}
