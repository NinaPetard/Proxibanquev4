package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import junit.framework.TestCase;

public class TestClient extends TestCase{
	
	private Client client1;
	private Client client2;
	private Client client3;
	private Client client4;
	private Client client5;
	private Collection<Compte> listeCompte1;
	private Conseiller conseiller1;
	
	//private 
	private ClientDao springDao;
	private ClassPathXmlApplicationContext appContext;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Ce conseiller doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		conseiller1 = new Conseiller("pdupond", "Paul","toto","Dupond");
		
		
		client1 = new Client(1,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate",listeCompte1, conseiller1);
		client2 = new Client(10,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate",listeCompte1, conseiller1);
		client3 = new Client(20,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate",listeCompte1, conseiller1);
		client4 = new Client(20,"a","a","a","a","a","a","a",listeCompte1, conseiller1);
		client5 = new Client(200,"a","a","a","a","a","a","a",listeCompte1, conseiller1);
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
	public void testSaveClient2() {
		springDao.save(client2);
	}
	public void testSaveClient3() {
		springDao.save(client3);
	}
	public void testSaveClient4() {
		springDao.save(client4);
	}
	public void testSaveClient5() {
		springDao.save(client5);
	}

}
