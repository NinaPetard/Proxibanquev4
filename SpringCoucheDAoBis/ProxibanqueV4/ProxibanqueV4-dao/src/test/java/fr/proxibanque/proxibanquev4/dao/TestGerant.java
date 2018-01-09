package fr.proxibanque.proxibanquev4.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

public class TestGerant extends TestCase{
	private Gerant gerant1;
	
	//private 
		private GerantDao springDao;
		private ClassPathXmlApplicationContext appContext;
		//private List<Conseiller> listeConseiller1;
		
		

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Conseiller conseiller1 = new Conseiller("toto","toto","toto","toto");
		//listeConseiller1 = new ArrayList<Conseiller>();
		//listeConseiller1.add(conseiller1);
		//gerant1 = new Gerant("popo","popo","popo","popo",listeConseiller1);
		gerant1 = new Gerant((Integer)1,"popo","popo","popo","popo");
		
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (GerantDao) appContext.getBean("gerantDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		gerant1 = null;
		appContext = null;
		springDao = null;
	}
	
	public void testSaveGerant() {
		springDao.save(gerant1);
	}
	
	public void testfindby() {
		String i ="popo";
		List<Gerant> liste_ger = springDao.findByNomger(i);
		for (Gerant g : liste_ger) {
			System.out.println(g.getLoginger());
			
			
		}
		
	}
}
