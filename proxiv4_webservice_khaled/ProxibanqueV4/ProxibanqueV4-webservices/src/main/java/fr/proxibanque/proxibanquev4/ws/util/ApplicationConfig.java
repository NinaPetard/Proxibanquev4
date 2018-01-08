package fr.proxibanque.proxibanquev4.ws.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/webapi")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
	  	//mettre ci-dessous le(s) package(s) qui contien(nen)t les WS. S'il y en a plusieurs, séparer d'une virgule.
	      packages("fr.proxibanque.proxibanquev4.ws.service");
		}
	
}
