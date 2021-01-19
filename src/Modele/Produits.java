
package Modele;

public class Produits {
 private   int code,Quantite,Prix;
 private   String Nom,Categorie;

    public Produits() {
    }

    public int getCode() {
        return code;
    }

    public int getQuantite() {
        return Quantite;
    }

    public int getPrix() {
        return Prix;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setCategorie(String Categorie) {
        this.Categorie = Categorie;
    }

    public String getNom() {
        return Nom;
    }

    public String getCategorie() {
        return Categorie;
    }
    
    
}
