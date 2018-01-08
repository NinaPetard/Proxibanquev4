package fr.proxibanque.proxibanquev4.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Loriane 
 * La classe Compte est la classe-mère des classes CompteCourant et CompteEntreprise.
 * Un objet Compte a pour attributs un numéro de compte numCompte, une date d'ouverture dateOuv,
 * un solde, et un Client.
 * Cette classe est une "entity class" et va permettre la persistence en base de données d'un compte.
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_COMPTE")
@Table(name = "COMPTE")
//@NamedQueries({
//    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c")
//    , @NamedQuery(name = "Compte.findByNumCompte", query = "SELECT c FROM Compte c WHERE c.numCompte = :numCompte")
//    , @NamedQuery(name = "Compte.findByDateOuv", query = "SELECT c FROM Compte c WHERE c.dateOuv = :dateOuv")
//    , @NamedQuery(name = "Compte.findBySolde", query = "SELECT c FROM Compte c WHERE c.solde = :solde")})
public abstract class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compte_generator")
    @SequenceGenerator(name="compte_generator", sequenceName = "cpt_seq")
    @Column(name = "NUMCOMPTE", nullable = false)
    private Integer numCompte;
    @Column(name = "DATEOUV")
    private Date dateOuv;
    @Column(name = "SOLDE", precision = 10, scale = 2)
    private float solde;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;
    
    
    @Transient protected String typeCompte;

    
    //Constructeurs
    public Compte(int numCompte, float solde, Date dateOuv, Client client) {
            super();
            this.numCompte = numCompte;
            this.solde = solde;
            this.dateOuv = dateOuv;
            this.client = client;
    }
    
    public Compte() {
        super();
    }

    public Compte(Integer numCompte) {
        this.numCompte = numCompte;
    }

    public Integer getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(Integer numCompte) {
        this.numCompte = numCompte;
    }

    public Date getDateOuv() {
        return dateOuv;
    }

    public void setDateOuv(Date dateOuv) {
        this.dateOuv = dateOuv;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public String getTypeCompte() {
        return typeCompte;
    }
	
	@Override
	public String toString() {
		return " n° " + numCompte;
	}
	
}
