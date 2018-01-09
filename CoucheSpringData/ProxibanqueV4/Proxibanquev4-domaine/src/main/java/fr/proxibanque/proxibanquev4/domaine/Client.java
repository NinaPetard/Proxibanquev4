package fr.proxibanque.proxibanquev4.domaine;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CLIENT")
@XmlRootElement
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCLI")
    private int idcli;
    @Column(name = "PRENOMCLI")
    private String prenomcli;
    @Column(name = "NOMCLI")
    private String nomcli;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "CODEPOSTAL")
    private String codepostal;
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "TELEPHONE")
    private String telephone;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "idcli")
    private Collection<Compte> compteCollection;
    @JoinColumn(name = "IDCONS", referencedColumnName = "IDCONS")
    @ManyToOne
    private Conseiller idcons;
    
    

    public Client(int idcli, String prenomcli, String nomcli, String adresse, String codepostal, String ville,
			String telephone, String email, Conseiller idcons) {
		super();
		this.idcli = idcli;
		this.prenomcli = prenomcli;
		this.nomcli = nomcli;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
		this.idcons = idcons;
	}
    
    
	public Client(int idcli, String prenomcli, String nomcli, String adresse, String codepostal, String ville,
			String telephone, String email) {
		super();
		this.idcli = idcli;
		this.prenomcli = prenomcli;
		this.nomcli = nomcli;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
	}


	public Client() {
    }

    public Client(int idcli) {
        this.idcli = idcli;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public String getPrenomcli() {
        return prenomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Compte> getCompteCollection() {
        return compteCollection;
    }

    public void setCompteCollection(Collection<Compte> compteCollection) {
        this.compteCollection = compteCollection;
    }

    public Conseiller getIdcons() {
        return idcons;
    }

    public void setIdcons(Conseiller idcons) {
        this.idcons = idcons;
    }

   

    @Override
    public String toString() {
        return "proxibanquev4scriptcorrige.Client[ idcli=" + idcli + " ]";
    }
    
}