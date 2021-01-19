
package Modele;


public class Personne {
   private int code;
   private String nom,addresse,telephone,Email;

    public Personne() {
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return Email;
    }
    
   
}
