package fr.proxibanque.proxibanquev4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Compte;

public interface CompteDao extends JpaRepository<Compte, Integer>{

}
