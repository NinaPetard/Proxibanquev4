package fr.proxibanque.proxibanquev4.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



@Entity
@Table(name = "CONSEILLER")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Conseiller.findAll", query = "SELECT c FROM Conseiller c")
//    , @NamedQuery(name = "Conseiller.findByLoginCons", query = "SELECT c FROM Conseiller c WHERE c.loginCons = :loginCons")
//    , @NamedQuery(name = "Conseiller.findByPassword", query = "SELECT c FROM Conseiller c WHERE c.password = :password")
//    , @NamedQuery(name = "Conseiller.findByPrenomCons", query = "SELECT c FROM Conseiller c WHERE c.prenomCons = :prenomCons")
//    , @NamedQuery(name = "Conseiller.findByNomCons", query = "SELECT c FROM Conseiller c WHERE c.nomCons = :nomCons")})
public class Conseiller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGINCONS")
    private String loginCons;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PRENOMCONS")
    private String prenomCons;
    @Column(name = "NOMCONS")
    private String nomCons;
    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "conseiller", cascade = CascadeType.PERSIST)
    //private List<Client> listeCli;
    @JoinColumn(name = "LOGINGER", referencedColumnName = "LOGINGER")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Gerant gerant;
    
    
    //Constructeurs    
    public Conseiller() {
    }
    

//    public Conseiller(String loginCons, String password, String nomCons, String prenomCons, List<Client> listeCli) {
//            super();
//            this.loginCons = loginCons;
//            this.password = password;
//            this.nomCons = nomCons;
//            this.prenomCons = prenomCons;
//            this.listeCli = listeCli;
//    }
    



	public Conseiller(String loginCons, String password, String prenomCons, String nomCons, Gerant gerant) {
		super();
		this.loginCons = loginCons;
		this.password = password;
		this.prenomCons = prenomCons;
		this.nomCons = nomCons;
		this.gerant = gerant;
	}


	public Conseiller(String loginCons, String password, String nomCons, String prenomCons) {
            super();
            this.loginCons = loginCons;
            this.password = password;
            this.nomCons = nomCons;
            this.prenomCons = prenomCons;
    }

    public Conseiller(String loginCons, String password) {
            super();
            this.loginCons = loginCons;
            this.password = password;
    }

    public String getLoginCons() {
        return loginCons;
    }

    public void setLoginCons(String loginCons) {
        this.loginCons = loginCons;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenomCons() {
        return prenomCons;
    }

    public void setPrenomCons(String prenomCons) {
        this.prenomCons = prenomCons;
    }

    public String getNomCons() {
        return nomCons;
    }

    public void setNomCons(String nomCons) {
        this.nomCons = nomCons;
    }

//    @XmlTransient
//    public List<Client> getListeCli() {
//        return listeCli;
//    }
//
//    public void setListeCli(List<Client> listeCli) {
//        this.listeCli = listeCli;
//    }
    
	@Override
	public String toString() {
		return " " + nomCons;
	}
	
}
