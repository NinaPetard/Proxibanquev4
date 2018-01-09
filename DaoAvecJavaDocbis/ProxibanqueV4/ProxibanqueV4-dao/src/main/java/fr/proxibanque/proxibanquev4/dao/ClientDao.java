package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;

/**
 * @author Victor 
 * Cette interface ClientDao permet l'utilisation de méthode proposé par l'interface générique JpaRepository.
 * Cette interface générique prends deux paramètres en entré, la classe entity Client et une clé primaire. 
 * Elle permet par exemple d'utiliser via spring-data, la méthode save qui prend en paramètre un Entity client.
 * Si ce client a un idcli (correspondant à la clé primaire de la table Client) déja enregistré en base,
 * alors la méthode save fera un update de la ligne correspondante en remplaçant les infos contenus dans les
 * différentes colonnes de la table Client par ceux enregistré dans l'objet Client passé en paramètre.
 * Si l'idcli de l'objet client n'existe pas alors la méthode save rajoutera une nouvelle ligne dans la table.
 * 
 * Une méthode supplémentaire a été défini dans l'interface ClientDao, findByNomcli, cette méthode permet
 * de retourner tous les clients ayant le même nom.
 * 
 * Une méthode supplémentaire a été défini dans l'interface ClientDao, findByIdcli, cette méthode permet
 * de retourner un client par son Idcli.
 */

public interface ClientDao extends JpaRepository<Client, Integer>{
	public List<Client> findByNomcli(String name);
	public Client findByIdcli(int name);
	
}
