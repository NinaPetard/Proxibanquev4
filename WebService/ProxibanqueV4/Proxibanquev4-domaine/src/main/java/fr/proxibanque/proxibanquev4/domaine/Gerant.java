package fr.proxibanque.proxibanquev4.domaine;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adminl
 */
@Entity
@Table(name = "GERANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gerant.findAll", query = "SELECT g FROM Gerant g")
    , @NamedQuery(name = "Gerant.findByLoginger", query = "SELECT g FROM Gerant g WHERE g.loginger = :loginger")
    , @NamedQuery(name = "Gerant.findByPassword", query = "SELECT g FROM Gerant g WHERE g.password = :password")
    , @NamedQuery(name = "Gerant.findByPrenomger", query = "SELECT g FROM Gerant g WHERE g.prenomger = :prenomger")
    , @NamedQuery(name = "Gerant.findByNomger", query = "SELECT g FROM Gerant g WHERE g.nomger = :nomger")})
public class Gerant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGINGER")
    private String loginger;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PRENOMGER")
    private String prenomger;
    @Column(name = "NOMGER")
    private String nomger;
    //@OneToMany(mappedBy = "loginger")
    //private Collection<Conseiller> conseillerCollection;
    
    
    
    public Gerant() {
    }

    public Gerant(String loginger, String password, String prenomger, String nomger) {
		super();
		this.loginger = loginger;
		this.password = password;
		this.prenomger = prenomger;
		this.nomger = nomger;
	}

	public Gerant(String loginger) {
        this.loginger = loginger;
    }

    public String getLoginger() {
        return loginger;
    }

    public void setLoginger(String loginger) {
        this.loginger = loginger;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenomger() {
        return prenomger;
    }

    public void setPrenomger(String prenomger) {
        this.prenomger = prenomger;
    }

    public String getNomger() {
        return nomger;
    }

    public void setNomger(String nomger) {
        this.nomger = nomger;
    }

//    @XmlTransient
//    public Collection<Conseiller> getConseillerCollection() {
//        return conseillerCollection;
//    }
//
//    public void setConseillerCollection(Collection<Conseiller> conseillerCollection) {
//        this.conseillerCollection = conseillerCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginger != null ? loginger.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gerant)) {
            return false;
        }
        Gerant other = (Gerant) object;
        if ((this.loginger == null && other.loginger != null) || (this.loginger != null && !this.loginger.equals(other.loginger))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplicationproxibanquev4.Gerant[ loginger=" + loginger + " ]";
    }
    
}
