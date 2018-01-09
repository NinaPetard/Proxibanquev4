package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.CompteCourant;
import fr.proxibanque.proxibanquev4.domaine.CompteEpargne;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

public class TestCompte extends TestCase{
	private Compte compte1;
	private Compte compte2;
	
	//private 
		private CompteDao springDao;
		private ClassPathXmlApplicationContext appContext;

		@Override
		protected void setUp() throws Exception {
			super.setUp();
		
		//Ce client doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		compte1 = new CompteCourant(17,12000,(Date)null,(Client)null,500);
		compte2 = new CompteEpargne(145, 78900,(Date)null, (Client)null, 5);
				
						
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (CompteDao) appContext.getBean("compteDao");
			}
		
		@Override
		protected void tearDown() throws Exception {
			super.tearDown();
			compte1 = null;
			appContext = null;
			springDao = null;
		}

		public void testSaveCompteCourant() {
			springDao.save(compte1);
	}
		public void testSaveCompteEpargne() {
			springDao.save(compte2);
}
}
