package com.rbcamelbootjetty;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractSampleRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		
		onException(Exception.class)
		.handled(true)
		.log(LoggingLevel.INFO, "Handled Exception");
	}

}
