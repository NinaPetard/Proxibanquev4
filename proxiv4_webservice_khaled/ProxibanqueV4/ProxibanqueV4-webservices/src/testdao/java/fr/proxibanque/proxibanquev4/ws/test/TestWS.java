package fr.proxibanque.proxibanquev4.ws.test;

import java.util.ArrayList;
import java.util.List;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import junit.framework.TestCase;
import fr.proxibanque.proxibanquev4.domaine.Client;


public class TestWS extends TestCase {

	public void  getListClient() {
		List<Client> liste_cli= new ArrayList();
		ClientDao client = null;
		
		liste_cli = client.findAll();
		
		
		for(Client c : liste_cli) {
			System.out.println(c.getNomcli());
		}
		
		
	}

}
