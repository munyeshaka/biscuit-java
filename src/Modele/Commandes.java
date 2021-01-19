/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author HP
 */
public class Commandes {
private int idcommande;
private String datecommande;
private int idclients;

    public void setIdcommande(int idcommande) {
        this.idcommande = idcommande;
    }

    public void setDatecommande(String datecommande) {
        this.datecommande = datecommande;
    }

    public void setClients(int clients) {
        this.idclients = clients;
    }

    public int getIdcommande() {
        return idcommande;
    }

    public String getDatecommande() {
        return datecommande;
    }

    public int getClients() {
        return idclients;
    }
    
}
