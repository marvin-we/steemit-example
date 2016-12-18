package example.steemit.com.endpoints;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/helloworld")
public class HelloWorldEndpoint {	
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name;
	}
	
	@GET
	public String giveIP(@PathParam("name") String name) {
		try {
			return InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			return e.getMessage();
		}
	}
	
}
	