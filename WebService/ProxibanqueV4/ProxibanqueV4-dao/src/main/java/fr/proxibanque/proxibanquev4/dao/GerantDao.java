package fr.proxibanque.proxibanquev4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Gerant;

public interface GerantDao extends JpaRepository<Gerant, Integer>{

}
