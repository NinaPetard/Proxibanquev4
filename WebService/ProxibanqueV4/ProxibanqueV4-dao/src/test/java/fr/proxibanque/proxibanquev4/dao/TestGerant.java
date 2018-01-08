package fr.proxibanque.proxibanquev4.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

public class TestGerant extends TestCase{
	private Gerant gerant1;
	
	//private 
		private GerantDao springDao;
		private ClassPathXmlApplicationContext appContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Ce gérant doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		gerant1 = new Gerant("popo","popo","popo","popo");
		
		
				
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
	
}
