package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;

public interface ConseillerDao extends JpaRepository<Conseiller, Integer>{
	public List<Conseiller> findByNomcons(String name);

}
