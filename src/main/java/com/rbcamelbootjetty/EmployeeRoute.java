package com.rbcamelbootjetty;

import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRoute extends AbstractSampleRoute {
	
	@Override
	public void configure() throws Exception {
		
		restConfiguration().component("jetty")
		//seems adding host is very much required for jetty 
		.host("localhost").port(8081)
		.bindingMode(RestBindingMode.json);
				
		rest("/say")
			.get("/hello")
			.route().transform(constant("Welcome"));
		
		  rest("/employee")
	         .get("/{id}").produces("application/json").to("direct:getEmployee")
	         .post().consumes("application/json").type(Employee.class).to("direct:createEmployee")
	         .delete("/{id}").to("direct:deleteEmployee");

	     from("direct:getEmployee")
	         .log("GET /user/${header.id} request received!")
	         .setBody(simple("${header.id}"))
	         .to("bean:employeeService?method=getEmployee");

	     from("direct:createEmployee")
	         .log("POST /user/ request received!")
	         .to("bean:employeeService?method=createEmployee");

	     from("direct:deleteEmployee")
	         .log("DELETE /user/${header.id} request received!")
	         .setBody(simple("${header.id}"))
	         .to("bean:employeeService?method=deleteEmployee");
	}
	
	
}
