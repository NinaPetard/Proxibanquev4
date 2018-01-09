package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;

public interface ClientDao extends JpaRepository<Client, Integer>{
	public List<Client> findByNomcli(String name);
}
