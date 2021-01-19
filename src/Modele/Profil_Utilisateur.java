/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author bemuc
 */
public class profil_utilisateur {
 private   int codeProfil;
 private   String NomProfil;

    public profil_utilisateur() {
    }

    public int getCodeProfil() {
        return codeProfil;
    }

    public String getNomProfil() {
        return NomProfil;
    }

    public void setCodeProfil(int codeProfil) {
        this.codeProfil = codeProfil;
    }

    public void setNomProfil(String NomProfil) {
        this.NomProfil = NomProfil;
    }
 
}
