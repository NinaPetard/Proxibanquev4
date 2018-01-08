package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;


import junit.framework.TestCase;

public class TestClient extends TestCase{
	
	private Client client1;
	private Client client2;
	private Client client3;
	private ClientDao springDao;
	private ClassPathXmlApplicationContext appContext;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		client1 = new Client(1,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate");
		client2 = new Client(10,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate");
		client3 = new Client(20,"kevin","Touzet","23 rue de la frite","92500","paris","01478745973","patate@patate");
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


}
