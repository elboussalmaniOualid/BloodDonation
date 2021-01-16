package com.ehealth.dondusang.calendrier;

import java.util.List;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.RepositoryRestHandlerAdapter;

import org.springframework.web.method.support.HandlerMethodArgumentResolver;

public class GlobalRepositoryRestConfiguration extends RepositoryRestHandlerAdapter{

	public GlobalRepositoryRestConfiguration(List<HandlerMethodArgumentResolver> argumentResolvers) {
		super(argumentResolvers);
		// TODO Auto-generated constructor stub
	}

}
