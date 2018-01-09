package fr.proxibanque.proxibanquev4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Virement;



public interface VirementDao extends JpaRepository<Virement, Integer>{

}
