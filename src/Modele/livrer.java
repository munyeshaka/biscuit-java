/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Sampras Kubuntu
 */
public class livrer {
  private int codeMP_ProduitMP;  
  private String dateLivraison_Livrer;
  private int Qte_Livrer;

    public livrer() {
        super();
    }

    public void setCodeMP_ProduitMP(int codeMP_ProduitMP) {
        this.codeMP_ProduitMP = codeMP_ProduitMP;
    }

    public void setDateLivraison_Livrer(String dateLivraison_Livrer) {
        this.dateLivraison_Livrer = dateLivraison_Livrer;
    }

    public void setQte_Livrer(int Qte_Livrer) {
        this.Qte_Livrer = Qte_Livrer;
    }

    public void setIdF_Fournisseur(int idF_Fournisseur) {
        this.idF_Fournisseur = idF_Fournisseur;
    }

    public int getCodeMP_ProduitMP() {
        return codeMP_ProduitMP;
    }

    public String getDateLivraison_Livrer() {
        return dateLivraison_Livrer;
    }

    public int getQte_Livrer() {
        return Qte_Livrer;
    }

    public int getIdF_Fournisseur() {
        return idF_Fournisseur;
    }
  private int idF_Fournisseur;
}

