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
public class factures {
 private   int idfacture,iduser,idcommande;
private    String datefacture;

    public int getIdfacture() {
        return idfacture;
    }

    public int getIduser() {
        return iduser;
    }

    public int getIdcommande() {
        return idcommande;
    }

    public String getDatefacture() {
        return datefacture;
    }

    public void setIdfacture(int idfacture) {
        this.idfacture = idfacture;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setIdcommande(int idcommande) {
        this.idcommande = idcommande;
    }

    public void setDatefacture(String datefacture) {
        this.datefacture = datefacture;
    }
    
}
