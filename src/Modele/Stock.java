
package Modele;


public class Stock {
    private int idstock;

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    public int getIdstock() {
        return idstock;
    }
 private   String Taille,Adresse,Description;

    public Stock() {
    }

    public void setTaille(String Taille) {
        this.Taille = Taille;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getTaille() {
        return Taille;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getDescription() {
        return Description;
    }

    
    
    
}
