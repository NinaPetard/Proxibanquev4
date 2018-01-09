package fr.proxibanque.proxibanquev4.domaine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adminl
 */
@Entity
@Table(name = "VIREMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Virement.findAll", query = "SELECT v FROM Virement v")
    , @NamedQuery(name = "Virement.findByNumvir", query = "SELECT v FROM Virement v WHERE v.numvir = :numvir")
    , @NamedQuery(name = "Virement.findByCompteemetteur", query = "SELECT v FROM Virement v WHERE v.compteemetteur = :compteemetteur")
    , @NamedQuery(name = "Virement.findByComptecible", query = "SELECT v FROM Virement v WHERE v.comptecible = :comptecible")
    , @NamedQuery(name = "Virement.findByMontantvir", query = "SELECT v FROM Virement v WHERE v.montantvir = :montantvir")
    , @NamedQuery(name = "Virement.findByDatevir", query = "SELECT v FROM Virement v WHERE v.datevir = :datevir")
    , @NamedQuery(name = "Virement.findByLibelle", query = "SELECT v FROM Virement v WHERE v.libelle = :libelle")})
public class Virement implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMVIR")
    private int numvir;
    @Column(name = "COMPTEEMETTEUR")
    private int compteemetteur;
    @Column(name = "COMPTECIBLE")
    private int comptecible;
    @Column(name = "MONTANTVIR")
    private int montantvir;
    @Column(name = "DATEVIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevir;
    @Column(name = "LIBELLE")
    private String libelle;
    @JoinColumn(name = "LOGINCONS", referencedColumnName = "LOGINCONS")
    @ManyToOne
    private Conseiller logincons;
    
    

    public Virement(int numvir, Integer compteemetteur, Integer comptecible, int montantvir, Date datevir,
			String libelle, Conseiller logincons) {
		super();
		this.numvir = numvir;
		this.compteemetteur = compteemetteur;
		this.comptecible = comptecible;
		this.montantvir = montantvir;
		this.datevir = datevir;
		this.libelle = libelle;
		this.logincons = logincons;
	}

	public Virement() {
    }

    public Virement(int numvir) {
        this.numvir = numvir;
    }

    public int getNumvir() {
        return numvir;
    }

    public void setNumvir(int numvir) {
        this.numvir = numvir;
    }

    public Integer getCompteemetteur() {
        return compteemetteur;
    }

    public void setCompteemetteur(Integer compteemetteur) {
        this.compteemetteur = compteemetteur;
    }

    public Integer getComptecible() {
        return comptecible;
    }

    public void setComptecible(Integer comptecible) {
        this.comptecible = comptecible;
    }

    public int getMontantvir() {
        return montantvir;
    }

    public void setMontantvir(int montantvir) {
        this.montantvir = montantvir;
    }

    public Date getDatevir() {
        return datevir;
    }

    public void setDatevir(Date datevir) {
        this.datevir = datevir;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Conseiller getLogincons() {
        return logincons;
    }

    public void setLogincons(Conseiller logincons) {
        this.logincons = logincons;
    }

  

    
    @Override
    public String toString() {
        return "javaapplicationproxibanquev4.Virement[ numvir=" + numvir + " ]";
    }
    
}