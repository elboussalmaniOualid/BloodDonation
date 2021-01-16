package com.ehealth.dondusang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ehealth.dondusang.calendrier.Calendrier;
import com.ehealth.dondusang.donneur.Donneur;
@Configuration
@SpringBootApplication
public class DondusangApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DondusangApplication.class, args);
	}
	@Autowired
      private RepositoryRestConfiguration repositoryRestConfiguration;
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Donneur.class,Calendrier.class);
		//repositoryRestConfiguration.
	}

}
