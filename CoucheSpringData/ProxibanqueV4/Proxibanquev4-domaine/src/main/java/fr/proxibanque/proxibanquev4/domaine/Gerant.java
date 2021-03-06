package fr.proxibanque.proxibanquev4.domaine;


import java.io.Serializable;
import java.util.List;
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

public class Gerant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDGER")
    private Integer idger;
    @Column(name = "LOGINGER")
    private String loginger;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PRENOMGER")
    private String prenomger;
    @Column(name = "NOMGER")
    private String nomger;
    @OneToMany(mappedBy = "idger")
    private List<Conseiller> conseillerList;
    
    

    public Gerant(Integer idger, String loginger, String password, String prenomger, String nomger) {
		super();
		this.idger = idger;
		this.loginger = loginger;
		this.password = password;
		this.prenomger = prenomger;
		this.nomger = nomger;
	}

	public Gerant(Integer idger, String loginger, String password, String prenomger, String nomger,
			List<Conseiller> conseillerList) {
		super();
		this.idger = idger;
		this.loginger = loginger;
		this.password = password;
		this.prenomger = prenomger;
		this.nomger = nomger;
		this.conseillerList = conseillerList;
	}

	public Gerant() {
    }

    public Gerant(Integer idger) {
        this.idger = idger;
    }

    public Integer getIdger() {
        return idger;
    }

    public void setIdger(Integer idger) {
        this.idger = idger;
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

    @XmlTransient
    public List<Conseiller> getConseillerList() {
        return conseillerList;
    }

    public void setConseillerList(List<Conseiller> conseillerList) {
        this.conseillerList = conseillerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idger != null ? idger.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gerant)) {
            return false;
        }
        Gerant other = (Gerant) object;
        if ((this.idger == null && other.idger != null) || (this.idger != null && !this.idger.equals(other.idger))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proxibanquev4scriptcorrige.Gerant[ idger=" + idger + " ]";
    }
    
}

