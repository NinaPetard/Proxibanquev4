package fr.proxibanque.proxibanquev4.domaine;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Loriane
 * La classe permet l'instanciation d'un objet de type CompteEpargne, avec pour attribut propre un taux de rémunération tauxRem.
 * La classe hérite de la classe Compte.
 * Cette classe est une "entity class" et va permettre la persistence en base de données d'un compte épargne.
 */
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte {

    @Column(name = "TAUXREM", precision = 1, scale = 2)
    private float tauxRem;

    //Constructeur
    public CompteEpargne(int numCompte, float solde, Date dateOuv, Client client, float tauxRem) {
            super(numCompte, solde, dateOuv, client);
            this.tauxRem = tauxRem;
            super.typeCompte = "epargne";
    }

    public CompteEpargne() {
        super();
        super.typeCompte = "epargne";
    } 
    
    public float getTauxRem() {
        return tauxRem;
    }

    public void setTauxRem(float tauxRem) {
        this.tauxRem = tauxRem;
    }

    public String getTypeCompte() {
        return typeCompte;
    }
    
}
