package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Gerant;

public interface GerantDao extends JpaRepository<Gerant, Integer>{
	public List<Gerant> findByNomger(String name);

}
