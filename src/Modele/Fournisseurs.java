
package Modele;


public class Fournisseurs extends Personne{
  private  String sexe,Nationalite;

    public void setNationalite(String Nationalite) {
        this.Nationalite = Nationalite;
    }

    public String getNationalite() {
        return Nationalite;
    }

    public Fournisseurs() {
        super();
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
    
}
