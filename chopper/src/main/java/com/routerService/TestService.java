package com.routerService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;
import com.pqlUtils.PqlService;

@Path("/testservice")
public class TestService {
PqlService obj;
@GET
@Produces(MediaType.TEXT_PLAIN)
public String getTestService() {
	JSONObject test = new JSONObject();
	test.put("key","testing successsss");
	
return test.toString();

}
//public static void main(String[] args) {
//	TestService obj1 =new TestService();
//	PqlService.defaultCommands();
//	System.out.println("testing with main");
//}
}