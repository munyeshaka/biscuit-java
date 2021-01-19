/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

public class Utilisateurs extends Personne {
 private   String fonction,username,password;
  private   int codeprofil;

    public String getFonction() {
        return fonction;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getCodeprofil() {
        return codeprofil;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCodeprofil(int codeprofil) {
        this.codeprofil = codeprofil;
    }
    

    public Utilisateurs() {
        super();
        
             
    }
    
    
}
