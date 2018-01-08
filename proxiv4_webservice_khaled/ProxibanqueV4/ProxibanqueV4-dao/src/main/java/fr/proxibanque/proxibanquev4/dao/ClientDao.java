package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import fr.proxibanque.proxibanquev4.domaine.Client;



public interface ClientDao extends JpaRepository<Client, Integer>{
	
}
