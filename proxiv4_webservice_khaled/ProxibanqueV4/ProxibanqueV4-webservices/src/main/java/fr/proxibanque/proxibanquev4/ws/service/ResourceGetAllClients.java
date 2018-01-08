package fr.proxibanque.proxibanquev4.ws.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.core.JsonProcessingException;



import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;


@ApplicationPath("getallclients")
public class ResourceGetAllClients {
		private ClientDao client;

		@GET
		@Path("/listeclient")
	    @Produces(MediaType.APPLICATION_JSON) //On renvoie un json.    
		public String getAllClient() throws JsonGenerationException, JsonMappingException, IOException {
			List<Client> liste_cli = new ArrayList();
			
			
			liste_cli = client.findAll();
			String json = null;
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			
			try {
			json = mapper.writeValueAsString(liste_cli);
		    }
		    catch (JsonProcessingException e) {
		        e.printStackTrace();
		    }
			
	    	return json;
			
			
			
			
		}
	
}



