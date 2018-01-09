package fr.proxibanque.proxibanquev4.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestClient.class, TestCompte.class, TestConseiller.class, TestGerant.class, TestVirement.class })
public class AllTests {

}
