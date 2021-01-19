/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Date;

/**
 *
 * @author Sampras Kubuntu
 */
public class commander {
    
    private int codeMP,idUser,quantiteCM;
    private Date dateCM;

    public int getCodeMP() {
        return codeMP;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getQuantiteCM() {
        return quantiteCM;
    }

    public Date getDateCM() {
        return dateCM;
    }

    public void setCodeMP(int codeMP) {
        this.codeMP = codeMP;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setQuantiteCM(int quantiteCM) {
        this.quantiteCM = quantiteCM;
    }

    public void setDateCM(Date dateCM) {
        this.dateCM = dateCM;
    }
    
    
    
}
