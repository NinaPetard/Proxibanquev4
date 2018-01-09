package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
//import fr.proxibanque.proxibanquev4.domaine.CompteCourant;
//import fr.proxibanque.proxibanquev4.domaine.CompteEpargne;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

public class TestCompte extends TestCase{
	private Compte compte1;
	private Compte compte2;
	private Client client1;
	
	//private 
		private CompteDao springDao;
		private ClassPathXmlApplicationContext appContext;

		@Override
		protected void setUp() throws Exception {
			super.setUp();
		
		//Ce client doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		client1 = new Client(1, "toto", "toto", "23 rue", "92250", "Paris", "06","to@to");
		compte1 = new Compte(125,"courant",(Date)null,14589, (Integer) null, 0.03, client1);
		
				
						
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

		public void testSaveCompte() {
			springDao.save(compte1);
		}
		
		public void testfindby() {
			int i = 125;
			List<Compte> liste_ger = springDao.findByNumcompte(i);
			for (Compte g : liste_ger) {
				System.out.println(g.getTypeCompte());
			}
		}
}
