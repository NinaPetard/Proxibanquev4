package fr.proxibanque.proxibanquev4.domaine;




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
@Table(name = "COMPTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c")
    , @NamedQuery(name = "Compte.findByNumcompte", query = "SELECT c FROM Compte c WHERE c.numcompte = :numcompte")
    , @NamedQuery(name = "Compte.findByTypeCompte", query = "SELECT c FROM Compte c WHERE c.typeCompte = :typeCompte")
    , @NamedQuery(name = "Compte.findByDateouv", query = "SELECT c FROM Compte c WHERE c.dateouv = :dateouv")
    , @NamedQuery(name = "Compte.findBySolde", query = "SELECT c FROM Compte c WHERE c.solde = :solde")
    , @NamedQuery(name = "Compte.findByDecouvert", query = "SELECT c FROM Compte c WHERE c.decouvert = :decouvert")
    , @NamedQuery(name = "Compte.findByTauxrem", query = "SELECT c FROM Compte c WHERE c.tauxrem = :tauxrem")})
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMCOMPTE")
    private Integer numcompte;
    @Column(name = "TYPE_COMPTE")
    private String typeCompte;
    @Column(name = "DATEOUV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateouv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOLDE")
    private BigDecimal solde;
    @Column(name = "DECOUVERT")
    private BigDecimal decouvert;
    @Column(name = "TAUXREM")
    private BigDecimal tauxrem;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne
    private Client idcli;

    public Compte() {
    }

    public Compte(Integer numcompte) {
        this.numcompte = numcompte;
    }

    public Integer getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(Integer numcompte) {
        this.numcompte = numcompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Date getDateouv() {
        return dateouv;
    }

    public void setDateouv(Date dateouv) {
        this.dateouv = dateouv;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public BigDecimal getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(BigDecimal decouvert) {
        this.decouvert = decouvert;
    }

    public BigDecimal getTauxrem() {
        return tauxrem;
    }

    public void setTauxrem(BigDecimal tauxrem) {
        this.tauxrem = tauxrem;
    }

    public Client getIdcli() {
        return idcli;
    }

    public void setIdcli(Client idcli) {
        this.idcli = idcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numcompte != null ? numcompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.numcompte == null && other.numcompte != null) || (this.numcompte != null && !this.numcompte.equals(other.numcompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplicationproxibanquev4.Compte[ numcompte=" + numcompte + " ]";
    }
    
}

