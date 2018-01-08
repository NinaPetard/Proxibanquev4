package fr.proxibanque.proxibanquev4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;

public interface ConseillerDao extends JpaRepository<Conseiller, Integer>{

}
