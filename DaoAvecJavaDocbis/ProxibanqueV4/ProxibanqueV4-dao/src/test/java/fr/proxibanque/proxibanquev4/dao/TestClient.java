package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
//import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import junit.framework.TestCase;

public class TestClient extends TestCase{
	
	private Client client1;
	private Client client2;
	private Client client3;
	private Client client4;
	private Client client5;
	//private Collection<Compte> listeCompte1;
	private Conseiller conseiller1;
	
	//private 
	private ClientDao springDao;
	private ClassPathXmlApplicationContext appContext;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Il est impératif que ce conseiller soit déja positioné en Base de donné pour que le save fonctionne
		conseiller1= new Conseiller(1,"pdupond","David","tata","Gerard");
		client1 = new Client(1,"toto","toto","23 rue","92250","Paris","06148755","to@to",conseiller1);
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (ClientDao) appContext.getBean("clientDao");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		client1 = null;
		appContext = null;
		springDao = null;
	}

	public void testSaveClient() {
		springDao.save(client1);
	}
	
	public void testfindbyNomcli() {
		String i ="toto";
		List<Client> liste_ger = springDao.findByNomcli(i);
		for (Client g : liste_ger) {
			System.out.println(g.getNomcli());
		}
	}
	
	public void testfindbyIdcli() {
		int i = 1;
		Client cli = springDao.findByIdcli(i);
		System.out.println(cli.getNomcli());
		
}
	
	
	
}
