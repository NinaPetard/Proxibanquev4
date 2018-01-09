package fr.proxibanque.proxibanquev4.dao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import fr.proxibanque.proxibanquev4.domaine.Virement;
import junit.framework.TestCase;

public class TestVirement extends TestCase{
	private Virement virement1;
	
	//private 
	private VirementDao springDao;
	private ClassPathXmlApplicationContext appContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		virement1 = new Virement(17, 50, 47, 45000, (Date)null,"prêt",(Conseiller)null);
		
		
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (VirementDao) appContext.getBean("virementDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		virement1 = null;
		appContext = null;
		springDao = null;
	}
	
	public void testSaveVirement() {
		springDao.save(virement1);
	}
	
}
