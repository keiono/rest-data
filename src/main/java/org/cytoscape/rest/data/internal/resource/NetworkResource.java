package org.cytoscape.rest.data.internal.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cytoscape.rest.RESTResource;

@Path("/networks")
public class NetworkResource implements RESTResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getNetworks() {
		System.out.println("GET called: networks");
		return "TEST GET networks";
	}
	
}
