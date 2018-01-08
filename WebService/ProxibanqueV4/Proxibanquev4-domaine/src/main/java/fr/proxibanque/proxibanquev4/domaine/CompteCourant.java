package fr.proxibanque.proxibanquev4.domaine;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Loriane
 * La classe permet l'instanciation d'un objet de type CompteCourant, avec pour attribut propre un decouvert.
 * La classe hérite de la classe Compte.
 * Cette classe est une "entity class" et va permettre la persistence en base de données d'un compte courant.
 */
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("courant")
public class CompteCourant extends Compte {

    @Column(name = "DECOUVERT", precision = 10, scale = 2)
    private float decouvert;

    //Constructeur
    public CompteCourant(int numCompte, float solde, Date dateOuv, Client client, float decouvert) {
            super(numCompte, solde, dateOuv, client);
            this.decouvert = decouvert;
            super.typeCompte = "courant";
    }

    public CompteCourant() {
        super();
        super.typeCompte = "courant";
    }
    
    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }  
       
}