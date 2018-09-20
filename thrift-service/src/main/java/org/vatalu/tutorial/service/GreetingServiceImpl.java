package org.vatalu.tutorial.service;

import org.vatalu.tutorial.thrift.GreetingService;

import java.util.logging.Logger;

public class GreetingServiceImpl implements GreetingService.Iface {

	private static final Logger logger =  Logger.getLogger(GreetingServiceImpl.class.getName());
	
	public String sayHello(String name) {
		logger.info(String.format("调用sayHello方法的参数name = {%s}", name));
		
		return "Hello, " + name;
	}

}