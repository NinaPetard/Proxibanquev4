package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Compte;


public interface CompteDao extends JpaRepository<Compte, Integer>{
	public List<Compte> findByNumcompte(int name);

}
