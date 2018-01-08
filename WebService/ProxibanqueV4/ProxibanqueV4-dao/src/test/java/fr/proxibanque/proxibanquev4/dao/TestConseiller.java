package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

public class TestConseiller extends TestCase{
	private Conseiller conseiller2;
	private Gerant gerant1;
	
	//private 
	private ConseillerDao springDao;
	private ClassPathXmlApplicationContext appContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Ce gérant doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		gerant1 = new Gerant("jchirac","Jacques","Chirac","popo");
		
		conseiller2 = new Conseiller("pkhaled", "David","tata","Gerard",gerant1);
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (ConseillerDao) appContext.getBean("conseillerDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		conseiller2 = null;
		appContext = null;
		springDao = null;
	}
	
	public void testSaveConseiller() {
		springDao.save(conseiller2);
	}
}
