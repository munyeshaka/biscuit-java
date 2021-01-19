
package Controle;

//import java.sql.SQLException;
import Modele.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Factory  {
   private static Statement stm;
  private static Connection conn = null;
  private static PreparedStatement pstm = null;
    private static ResultSet rs = null;
   private static DefaultTableModel model;
   

     //************ utilisateurs **************//
    
    public static void insertutilisateur(Utilisateurs u){
       // conn = DbConnection.getConnection();
                try{
       
                        conn = DbConnection.getConnection();
                            pstm = conn.prepareStatement(" INSERT INTO utilisateur (NomUser_Utilisateur,"
                                    + " tel_Utilisateur, adresse_Utilisateur, fonction_Utilisateur, username_Utilisateur,"
                                    + " password_Utilisateur,codeProfil_Profil) VALUES (?,?,?,?,?,?,?); ");
                            pstm.setString(1, u.getNom());
                            pstm.setString(2,u.getTelephone() );
                            pstm.setString(3, u.getAddresse());
                            pstm.setString(4, u.getFonction());
                            pstm.setString(5, u.getUsername());
                            pstm.setString(6, u.getPassword());
                            pstm.setInt(7, u.getCodeprofil());

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    
    public static void updateutilisateur(Utilisateurs u){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE utilisateur SET NomUser_Utilisateur ='"+u.getNom()+"',"
                + " tel_Utilisateur= '"+u.getTelephone()+"',"
                + "adresse_Utilisateur ='"+u.getAddresse()+"',"
                + "fonction_Utilisateur ='"+u.getFonction()+"',"
                + "username_Utilisateur='"+u.getUsername()+"',"
                + "password_Utilisateur ='"+u.getPassword()+"',password_Utilisateur ='"+u.getPassword()+"'"
                    + " WHERE iduser_Utilisateur = '"+u.getCode()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    
    }
    public static void deleteutilisateur(Utilisateurs u){
       
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from utilisateur  WHERE iduser_Utilisateur = '"+u.getCode()+"'";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
           
    }
    public static ArrayList<Utilisateurs> displayutilisateur(){
    
            ArrayList<Utilisateurs> listu=new ArrayList();
            Utilisateurs ut =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT utilisateur.codeProfil_Profil,NomUser_Utilisateur,tel_Utilisateur,"
                                        + "adresse_Utilisateur,fonction_Utilisateur,"
                                        + "username_Utilisateur,password_Utilisateur,"
                                         + "nom_Profil FROM utilisateur,profil "
                                        + "WHERE utilisateur.codeProfil_Profil= profil.codeProfil_Profil");
                                while(rs.next()){
                                    ut=new Utilisateurs();
//                                    ut.setCode(rs.getInt("iduser_Utilisateur"));
                                    ut.setNom(rs.getString("NomUser_Utilisateur"));
                                    ut.setAddresse(rs.getString("adresse_Utilisateur"));
                                    ut.setFonction(rs.getString("fonction_Utilisateur"));
                                    ut.setUsername(rs.getString("username_Utilisateur"));
                                    ut.setPassword(rs.getString("password_Utilisateur"));
                                    ut.setCodeprofil(rs.getInt("codeProfil_Profil"));
                                    listu.add(ut);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listu;
                  
    
    }
    
        //************ produits MP **************//
    public static void insertproductMP(ProduitsMP p){
        try{
       
                        
         pstm = conn.prepareStatement(" INSERT INTO produitmp (NomMP_ProduitMP,"
         + " Prix_ProduitMP, categorie_ProduitMP, commentaire_ProduitMP) VALUES (?,?,?,?); ");
         pstm.setString(1, p.getNom());
         pstm.setInt(2,p.getPrix() );
         pstm.setString(3, p.getCategorie());
         pstm.setString(4, p.getCommentaires());
         pstm.executeUpdate();
         pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public static void updateproductMP(ProduitsMP p){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE produitmp SET NomMP_ProduitMP ='"+p.getNom()+"',"
                + " Prix_ProduitMP= '"+p.getPrix()+"',"
                + "categorie_ProduitMP ='"+p.getCategorie()+"',"
                + "commentaire_ProduitMP ='"+p.getCommentaires()+"',"
               +" WHERE codeMP_ProduitMP = '"+p.getCode()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    }
    public static void deleteproductMP(ProduitsMP p){
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from produitmp  WHERE codeMP_ProduitMP = '"+p.getCode()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
     public static ArrayList<ProduitsMP> displayProduitsMP(){
    
            ArrayList<ProduitsMP> listPM=new ArrayList();
            ProduitsMP pmp =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM produitmp ORDER BY codeMP_ProduitMP  DESC");
                                while(rs.next()){
                                    pmp=new ProduitsMP();
                                    pmp.setCode(rs.getInt("codeMP_ProduitMP"));
                                    pmp.setNom(rs.getString("NomMP_ProduitMP"));
                                    pmp.setPrix(rs.getInt("Prix_ProduitMP"));
                                    pmp.setCategorie(rs.getString("categorie_ProduitMP"));
                                    pmp.setCommentaires(rs.getString("commentaire_ProduitMP"));
                                    
                                    listPM.add(pmp);
                            
                                }
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listPM;
    }
    
            //************ produits PF **************//
    public static void insertproductPF(ProduitsPF pf){
        try{
       
                        
                            pstm = conn.prepareStatement(" INSERT INTO produitsf (nom_ProduitsF,"
                                    + "categorie_ProduitsF,qualite_ProduitsF,"
                                    + "quantite_ProduitsF,prix_ProduitsF) VALUES (?,?,?,?,?); ");
                            pstm.setString(1, pf.getNom());
                            pstm.setString(2,pf.getCategorie());
                            pstm.setString(3, pf.getQualite());
                            pstm.setInt(4, pf.getQuantite());
                            pstm.setInt(5, pf.getPrix());
                           

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public static void updateproductPF(ProduitsPF pf){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE produitsf SET nom_ProduitsF ='"+pf.getNom()+"',"
                + " categorie_ProduitsF= '"+pf.getCategorie()+"',"
                + "qualite_ProduitsF ='"+pf.getQualite()+"',"
                + "quantite_ProduitsF ='"+pf.getQuantite()+"',"
                + "quantite_ProduitsF ='"+pf.getQuantite()+"',"
               +" WHERE id_ProduitsF = '"+pf.getCode()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    
    }
    public static void deleteproductPF(ProduitsPF pf){
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from produitmp  WHERE codeMP_ProduitMP = '"+pf.getCode()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
    public static ArrayList<ProduitsPF> displayproductPF()
    {
         ArrayList<ProduitsPF> listPF =new ArrayList();
            ProduitsPF ppf =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM produitsf ORDER BY id_ProduitsF  DESC");
                                while(rs.next()){
                                    ppf=new ProduitsPF();
                                    ppf.setCode(rs.getInt("id_ProduitsF"));
                                    ppf.setNom(rs.getString("nom_ProduitsF"));
                                    ppf.setCategorie(rs.getString("categorie_ProduitsF"));
                                    ppf.setQualite(rs.getString("qualite_ProduitsF"));
                                    ppf.setQuantite(rs.getInt("quantite_ProduitsF"));
                                    ppf.setPrix(rs.getInt("prix_ProduitsF"));
                                    listPF.add(ppf);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listPF;
    
    }
    
                //************ commande **************//
    public static void insertcommande(Commandes c){
        try{
       
                        
                            pstm = conn.prepareStatement(" INSERT INTO commandespf (date_CommandesPF,"
                                    + " idClient_Clients) VALUES (?,?); ");
                            pstm.setString(1, c.getDatecommande());
                            pstm.setInt(2,c.getClients());
                                                  
                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    
    }
    public static void updatecommande(Commandes c){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE commandespf SET date_CommandesPF ='"+c.getDatecommande()+"',"
                
               +" WHERE id_ProduitsF = '"+c.getIdcommande()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    }
    public static void deletecommande(Commandes c){
         try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from commandespf  WHERE idCmdePF_CommandesPF  = '"+c.getIdcommande()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
    public static void getcommandebyID(int c){}
    public static ArrayList<Commandes> displaycommande()
    {
        ArrayList<Commandes> listcom =new ArrayList();
            Commandes cm =new Commandes();
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM ProduitsPF ORDER BY iduser_Utilisateur DESC");
                                while(rs.next()){
                                    cm.setIdcommande(rs.getInt("idCmdePF_CommandesPF"));
                                    cm.setDatecommande(rs.getString("date_CommandesPF "));
                                    cm.setClients(rs.getInt("idClient_Clients"));
                                    
                                    listcom.add(cm);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listcom;
        
    
    }
    
                    //************ facture **************//
    public static void insertfacture(factures f){
        try{      
                        
                            pstm = conn.prepareStatement(" INSERT INTO facture (date_CommandesPF,"
                                    + " iduser_Utilisateur,idCmdePF_CommandesPF) VALUES (?,?,?); ");
                            pstm.setString(1,f.getDatefacture());
                            pstm.setInt(2,f.getIduser());
                            pstm.setInt(3,f.getIdcommande());
                                                  
                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public static void updatefacture(factures f){
    try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE facture SET dateF_Facture ='"+f.getDatefacture()+"',"
                
               +" WHERE idFacture_Facture  = '"+f.getIdfacture()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    }
    public static void deletefacture(factures f){
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from facture  WHERE idFacture_Facture   = '"+f.getIdfacture()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
    public static void getfacturebyID(int f){}
    public static ArrayList<factures> displayfacture(){
         ArrayList<factures> listfa =new ArrayList();
            factures fa =new factures();
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM ProduitsPF ORDER BY iduser_Utilisateur DESC");
                                while(rs.next()){
                                    fa.setIdfacture(rs.getInt("idCmdePF_CommandesPF"));
                                    fa.setDatefacture(rs.getString("date_CommandesPF "));
                                    fa.setIduser(rs.getInt("idClient_Clients"));
                                    fa.setIdcommande(rs.getInt("idClient_Clients"));
                                    
                                    listfa.add(fa);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listfa;
        
    }
    
     //************ profil utilisateur **************//
    public static void insertprofil(profil_utilisateur f)
    {
    
    try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into profil "
                        + "(Nom_Profil)"
                        + "VALUES('"+f.getNomProfil()+"')";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
    
    }
    public static void updateprofil(profil_utilisateur f)
    {
      try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE profil SET Nom_Profil ='"+f.getNomProfil()+"',"
                
               +" WHERE Code_Profil_Profil = '"+f.getCodeProfil()+"'";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    
    
    }
    public static void deleteprofil(int f){}
    public static void getprofilbyID(int f){}
    public static ArrayList<profil_utilisateur> displayprofil()
    {
        ArrayList<profil_utilisateur> listprof =new ArrayList();
            profil_utilisateur pf =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM profil ORDER BY codeProfil_Profil DESC");
                                while(rs.next()){
                                    pf=new profil_utilisateur();
                                    pf.setCodeProfil(rs.getInt("codeProfil_Profil"));
                                    pf.setNomProfil(rs.getString("nom_Profil"));
                                    listprof.add(pf);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listprof;
        
    
    }
    
    //    ****stockmatierepremiere***//
    
    public  void insertstockmp(StockMP st){
        try{
       
                        
                            pstm = conn.prepareStatement(" INSERT INTO stockmp (Taille_StockMP,"
                                    + " adresse_StockMP, description_StockMP) VALUES (?,?,?); ");
                            pstm.setString(1, st.getTaille());
                            pstm.setString(2,st.getAdresse());
                            pstm.setString(3, st.getDescription());                          

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public  void updatestockmp(StockMP st){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE produitsf SET nom_ProduitsF ='"+st+"',"
                + " Taille_StockMP = '"+st.getTaille()+"',"
                + "adresse_StockMP ='"+st.getAdresse()+"',"
                + "description_StockMP ='"+st.getDescription()+"'"
                    +" WHERE idstockMP_StockMP  = '"+st.getIdstock()+"'  ";
                
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
    }
    public static void deletestockmp(StockMP st){
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from stockmp  WHERE idstockMP_StockMP   = '"+st.getIdstock()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
    public static ArrayList<StockMP> displaystockmp(){
        ArrayList<StockMP> listSMP =new ArrayList();
            StockMP smp =new StockMP();
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM ProduitsPF ORDER BY iduser_Utilisateur DESC");
                                while(rs.next()){
                                    smp.setIdstock(rs.getInt("idstockMP_StockMP"));
                                    smp.setTaille(rs.getString("Taille_StockMP "));
                                    smp.setAdresse(rs.getString("adresse_StockMP"));
                                    smp.setDescription(rs.getString("description_StockMP"));
                                    
                                    
                                    
                                    listSMP.add(smp);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listSMP;
    }
          
//////***********stockproduitfini*****//////
       
//******fournisseur ********//         
   public static void insertfournisseur(Fournisseurs F){
        
       try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into fournisseur "
                        + "(Nom_F_Fournisseur,telephone_Fournisseur,Adresse_Fournisseur,"
                        + "sexe_Fournisseur,email_Fournisseur,nationalite_Fournisseur)"
                        + "VALUES('"+F.getNom()+"','"+F.getTelephone()+"'"
                        + ",'"+F.getAddresse()+"','"+F.getSexe()+"'"
                        + ",'"+F.getEmail()+"','"+F.getNationalite()+"')";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
    }

    public static void deletefournisseur(Fournisseurs F){
       try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "delete from fournisseur where idF_Fournisseur ="+F.getCode()+"";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
    }
    public static void updatefournisseur(Fournisseurs F){
            try{
                        conn = DbConnection.getConnection();
                           stm=conn.createStatement();
                           
                           stm.executeUpdate("UPDATE fournisseur SET "
                                + "Nom_F_Fournisseur='"+F.getNom()+"'"
                                + ",telephone_Fournisseur='"+ F.getTelephone()+"',"
                                + ",Adresse_Fournisseur='"+F.getAddresse()+"'"
                                + ",sexe_Fournisseur='"+F.getSexe()+"'"
                                + ",email_Fournisseur='"+F.getEmail()+"'" 
                                + ",nationalite_Fournisseur='"+F.getNationalite()+"'"
                                + " WHERE idF_Fournisseur="+F.getCode());
                  
                  JOptionPane.showMessageDialog(null, "Modification effectuée!!!");
                 }catch( SQLException e)
                 {
                     System.err.println(e);  
                 }      
    }

    public static ArrayList<Fournisseurs>displayfournisseur(){
         ArrayList<Fournisseurs> listfou =new ArrayList();
            Fournisseurs fou =null;   //pour ne pas afficher un seul elememt
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                 rs = stm.executeQuery("SELECT * FROM fournisseur ORDER BY idF_Fournisseur DESC");
                                while(rs.next()){
                                    fou=new Fournisseurs();//pour ne pas afficher un seul elememt
                                    fou.setCode(rs.getInt("idF_Fournisseur"));
                                    fou.setNom(rs.getString("Nom_F_Fournisseur"));
                                    fou.setTelephone(rs.getString("telephone_Fournisseur"));
                                    fou.setAddresse(rs.getString("Adresse_Fournisseur"));
                                    fou.setSexe(rs.getString("sexe_Fournisseur"));
                                    fou.setEmail(rs.getString("email_Fournisseur"));
                                    fou.setNationalite(rs.getString("nationalite_Fournisseur"));
                                    
                                    listfou.add(fou);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listfou;
    }
    
//********client***************//
    
     public static void insertclient(clients cl){
         try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into clients "
                        + "(Nom_Clients,Telephone_Clients,Adresse_Clients,"
                        + "Email_Clients,Nationalite_Clients)"
                        + "VALUES('"+cl.getNom()+"','"+cl.getTelephone()+"'"
                        + ",'"+cl.getAddresse()+"'"
                        + ",'"+cl.getEmail()+"'"
                        + ",'"+cl.getNationalite()+"')";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
            
             }
    public static void deleteclient(clients cl){
                try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "delete from clients where idClient_Clients ="+cl.getCode()+"";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
             }
    public static void updateclient(clients cl){
                try{
                        conn = DbConnection.getConnection();
                           stm=conn.createStatement();
                           
                           stm.executeUpdate("UPDATE clients SET "
                                + "Nom_Clients='"+cl.getNom()+"'"
                                + ",Telephone_Clients='"+ cl.getTelephone()+"',"
                                + ",Adresse_Clients='"+cl.getAddresse()+"'"
                                + ",Email_Clients='"+cl.getEmail()+"'" 
                                + ",Nationalite_Clients='"+cl.getNationalite()+"'"
                                + " WHERE idClient_Clients="+cl.getCode());
                  
                  JOptionPane.showMessageDialog(null, "Modification effectuée!!!");
                 }catch(SQLException e)
                 {
                     System.err.println(e);  
                 } 
             }
    public static ArrayList<clients> displayclient(){
        ArrayList<clients> listcl =new ArrayList();
            clients cli =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM clients ORDER BY idClient_Clients DESC");
                                while(rs.next()){
                                    cli=new clients();
                                    cli.setCode(rs.getInt("idClient_Clients"));
                                    cli.setNom(rs.getString("Nom_Clients"));
                                    cli.setTelephone(rs.getString("Telephone_Clients"));
                                    cli.setAddresse(rs.getString("Adresse_Clients"));
                                    cli.setEmail(rs.getString("Email_Clients"));
                                    cli.setNationalite(rs.getString("Nationalite_Clients"));
                                    
                                    
                                    listcl.add(cli);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listcl;
                   
            
             }
        //************ commander **************//
   
    public static void insertcommander(commander c){
       // conn = DbConnection.getConnection();
                try{
                        conn = DbConnection.getConnection();
                            pstm = conn.prepareStatement(" INSERT INTO commander (codeMP_ProduitMP,"
                                    + " iduser_Utilisateur, datecde_commander, qte_commander) VALUES (?,?,?,?); ");
                            
                            pstm.setInt(1, c.getCodeMP());
                            pstm.setInt(2, c.getIdUser());
                            pstm.setDate(3, c.getDateCM());
                            pstm.setInt(4, c.getQuantiteCM());

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public static void updatecommander(commander c){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE commander SET "
                + " datecde_commander ='"+c.getDateCM()+"',"
                + "qte_commander='"+c.getQuantiteCM()+"',"
                    + " WHERE codeMP_ProduitMP = '"+c.getCodeMP()+"' AND iduser_Utilisateur = '"+c.getIdUser()+"' ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    
    }
    public static void deletecommander(commander c){
       
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from commander  WHERE codeMP_ProduitMP = '"+c.getCodeMP()+"' AND iduser_Utilisateur = '"+c.getIdUser()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
           
    }
    public static ArrayList<commander> displaycommander(){
    
            ArrayList<commander> comm=new ArrayList();
            commander cm =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT produitmp.codeMP_ProduitMP,utilisateur.iduser_Utilisateur,datecde_commander,"
                                        + "qte_commander FROM utilisateur,profil,produitmp "
                                        + "WHERE commander.iduser_Utilisateur= utilisateur.iduser_Utilisateur"
                                        +" AND commander.codeMP_ProduitMP = produitmp.codeMP_ProduitMP");
                                while(rs.next()){
                                    cm=new commander();
//                                    ut.setCode(rs.getInt("iduser_Utilisateur"));
                                    cm.setCodeMP(rs.getInt("codeMP_ProduitMP"));
                                    cm.setIdUser(rs.getInt("iduser_Utilisateur"));
                                    cm.setDateCM(rs.getDate("datecde_commander"));
                                    cm.setQuantiteCM(rs.getInt("qte_commander"));
                                    comm.add(cm);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return comm;
                  
    
    }
    //************ contenir **************//
   
    public static void insertcontenir(Contenir c){
       // conn = DbConnection.getConnection();
                try{
                        conn = DbConnection.getConnection();
                            pstm = conn.prepareStatement(" INSERT INTO contenir (id_ProduitsF,"
                                    + " idCmdePF_CommandesPF, QtePF_contenir) VALUES (?,?,?); ");
                            
                            pstm.setInt(1, c.getIdPF());
                            pstm.setInt(2, c.getIdComPF());
                            pstm.setInt(3, c.getQtePF());

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    public static void updatecontenir(Contenir c){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE contenir SET "
                + "QtePF_contenir='"+c.getQtePF()+"',"
                    + " WHERE id_ProduitsF = '"+c.getIdPF()+"' AND idCmdePF_CommandesPF = '"+c.getIdComPF()+"' ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    
    }
    public static void deletecontenir(Contenir c){
       
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from contenir WHERE id_ProduitsF = '"+c.getIdPF()+"' AND idCmdePF_CommandesPF = '"+c.getIdComPF()+"' ";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
           
    }
    public static ArrayList<Contenir> displaycontenir(){
    
            ArrayList<Contenir> cont=new ArrayList();
            Contenir cm =null;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT id_ProduitsF,idCmdePF_CommandesPF,QtePF_contenir,"
                                        + "WHERE contenir.id_ProduitsF= produitsf.id_ProduitsF"
                                        +" AND contenir.idCmdePF_CommandesPF = commandespf.idCmdePF_CommandesPF");
                                while(rs.next()){
                                    cm=new Contenir();
//                                    ut.setCode(rs.getInt("iduser_Utilisateur"));
                                    cm.setIdPF(rs.getInt("codeMP_ProduitMP"));
                                    cm.setIdComPF(rs.getInt("iduser_Utilisateur"));
                                    cm.setQtePF(rs.getInt("qte_commander"));
                                    cont.add(cm);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return cont;
                  
    
    }
       //*****************fabriquer*************************
    
   
    
    
    
      public static void insertfabriquer(fabriquer f){
       // conn = DbConnection.getConnection();
                try{
       
                        conn = DbConnection.getConnection();
                            pstm = conn.prepareStatement(" INSERT INTO fabriquer (iduser_Utilisateur,"
                                    + " id_ProduitsF,dateS_Fabriquer,duree_Fabriquer,"
                                    + " cout_Fabriquer,benefice_Fabriquer) VALUES (?,?,?,?,?,?,?); ");
                            pstm.setInt(1, f.getIduser_Utilisateur());
                            pstm.setInt(2, f.getId_ProduitsF() );
                            pstm.setString(3, f.getDateS_Fabriquer());
                            pstm.setString(4, f.getDuree_Fabriquer());
                            pstm.setInt(5, f.getCout_Fabriquer());
                            pstm.setInt(6, f.getBenefice_Fabriquer());
                            

                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
    }
    
   public static void updatefabriquer(fabriquer f){
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="UPDATE utilisateur SET "
                
                + "dateS_Fabriquer ='"+f.getDateS_Fabriquer()+"',"
                + "duree_Fabriquer ='"+f.getDuree_Fabriquer()+"',"
                + "cout_Fabriquer='"+f.getCout_Fabriquer()+"',"
                + "benefice_Fabriquer  ='"+f.getBenefice_Fabriquer()+"'"
                    + " WHERE codeMP_ProduitMP = '"+f.getCodeMP_ProduitMP()+"'  ";
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    
    }
    public static void deletefabriquer(fabriquer f){
       
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from fabriquer  WHERE codeMP_ProduitMP = '"+f.getCodeMP_ProduitMP()+"'";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
           
    }
    //**********entrer MP*************
        public static void insertEntrees_MP(entrezMP MP){
         try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into entrermp "
                        + "(idstockMP_StockMP,codeMP_ProduitMP,iduser_Utilisateur,"
                        + "dateEntrerMP_EntrerMP,qte_EntrerMP)"
                        + "VALUES('"+MP.getId_Stock_MP()+"'"
                        + ",'"+MP.getId_P()+"'"
                        + ",'"+MP.getId_U()+"'"
                        + ",'"+MP.getDat_En()+"'"
                        + ",'"+MP.getQ_EN()+"')";
                        
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
            
             }  

public static void updateEntrees_MP(entrezMP MP){
                try{
                        conn = DbConnection.getConnection();
                           stm=conn.createStatement();
                           stm.executeUpdate("UPDATE entrermp SET "
//                                + "idstockMP_StockMP='"+MP.getId_du_Produit()+"'"
            
                                + ",dateEntrerMP_EntrerMP='"+MP.getDat_En()+"'" 
                                + ",qte_EntrerMP='"+MP.getQ_EN()+"'"
                                + " WHERE idstockMP_StockMP="+MP.getId_Stock_MP()
                                + " and codeMP_ProduitMP='"+ MP.getId_P()+"',"
                                + " and iduser_Utilisateur='"+MP.getId_U());
                  
                  JOptionPane.showMessageDialog(null, "Modification effectuée!!!");
                 }catch(SQLException e)
                 {
                     System.err.println(e);  
                 } 
             }
 public static ArrayList<entrezMP> displayEntrees_MP(){
        ArrayList<entrezMP> listMP =new ArrayList();
            entrezMP MP =new entrezMP();
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM entrermp ORDER BY idstockMP_StockMP DESC");
                                while(rs.next()){
                                    
                                    
                                    
                                    MP.setId_Stock_MP(rs.getInt("idstockMP_StockMP"));
                                    MP.setId_P(rs.getInt("codeMP_ProduitMP "));
                                    MP.setId_U(rs.getInt("iduser_Utilisateur"));
                                    MP.setDat_En(rs.getInt("dateEntrerMP_EntrerMP"));
                                    MP.setQ_EN(rs.getInt("qte_EntrerMP "));
                                  
                                    
                                    listMP.add(MP);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listMP;
                   
            
             }
 public static void deleteEntrees_MP(entrezMP MP){
        try {
             conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
            String Requete="delete from entrermp  WHERE idstockMP_StockMP="+MP.getId_Stock_MP()
                                + " and codeMP_ProduitMP='"+ MP.getId_P()+"',"
                                + " and iduser_Utilisateur='"+MP.getId_U()+"'";
            
            stm.executeUpdate(Requete);
            
            
        } catch (SQLException e) {
        }
    }
 
   /*************SortirMP**************/
    
     public static void insertSortirMP(SortirMP smp)
     {
     
     try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into sortirmp "
                        + "(iduser_Utilisateur,codeMP_ProduitMP,idstockMP_StockMP,"
                        + "dateSortieMP_SortirMP,qte_SortirMP)"
                        + "VALUES('"+smp.getIduser_Utilisateur()+"','"+smp.getCodeMP_ProduitMP()+"'"
                        + ",'"+smp.getIdstockMP_StockMP()+"'"
                        + ",'"+smp.getDateSortieMP_SortirMP()+"'"
                        + ",'"+smp.getQte_SortirMP()+"')";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                     {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
     }
     
     public static void DeleteSortirMP(SortirMP smp)
     {
                try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "delete from sortirmp where iduser_Utilisateur ="+smp.getIduser_Utilisateur()+"";
                
//                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
             }
     public static void UpdateSortirMP(SortirMP smp){
     
     try{
                        conn = DbConnection.getConnection();
                           stm=conn.createStatement();
                           
                           stm.executeUpdate("UPDATE sortirmp SET "
                                + ",dateSortieMP_SortirMP='"+smp.getDateSortieMP_SortirMP()+"'" 
                                + ",qte_SortirMP='"+smp.getQte_SortirMP()+"'"+
  " WHERE iduser_Utilisateur='"+smp.getIduser_Utilisateur()+"'"+
        "and codeMP_ProduitMP ='"+smp.getCodeMP_ProduitMP()+"'"+"and idstockMP_StockMP= '"+smp.getIdstockMP_StockMP()+"'");
 
                  
                  JOptionPane.showMessageDialog(null, "Modification effectuée!!!");
                 }catch(SQLException e)
                 {
                     System.err.println(e);  
                 } 
     }

      public static ArrayList<SortirMP> DisplaySortiMP(){
        ArrayList<SortirMP> listsmp =new ArrayList();
            SortirMP smp =null;
                        try{ 
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM sortirmp ORDER BY iduser_Utilisateur DESC");
                                while(rs.next()){
                                  
                                    smp.setIduser_Utilisateur(rs.getInt("iduser_Utilisateur"));
                                    smp.setCodeMP_ProduitMP(rs.getInt("codeMP_ProduitMP"));
                                    smp.setIdstockMP_StockMP(rs.getInt("idstockMP_StockMP"));
                                    smp.setDateSortieMP_SortirMP(rs.getString("dateSortieMP_SortirMP"));
                                    smp.setQte_SortirMP(rs.getInt("qte_SortirMP"));
                                    smp.setIduser_Utilisateur(rs.getInt("iduser_Utilisateur"));
                                    listsmp.add(smp);
                                }
                            
                                
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listsmp;               
   
    }
       /**********SortirPF********************/
       
 static void  insererSortirPF(sortirPF ent){
        try{
                            pstm = conn.prepareStatement(" INSERT INTO sortirpf (Taille_StockMP,"
 + " iduser_Utilisateur, id_ProduitsF,idstockPF_StockPF,dateEntrerPF_EntrerPF,qte_EntrerPF) VALUES (?,?,?,?,?); ");
                            pstm.setInt(1, ent.getIduser_Utilisateur());
                            pstm.setInt(2,ent.getId_ProduitsF());
                            pstm.setInt(3, ent.getIdstockPF_StockPF());
                            pstm.setString(4, ent.getDateSortiePF_SortirPF());
                            pstm.setInt(5, ent.getQte_SortirPF());
                            
                                pstm.executeUpdate();
                                pstm.close();
                            
                        }catch(SQLException e){
                            
                        }
        
        
    }      
   public static ArrayList<sortirPF> displaySORTIRPF(){
           
        ArrayList<sortirPF> listPF =new ArrayList();
         sortirPF PF=null ;
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM sortirpf ORDER BY iduser_Utilisateur DESC");
                                while(rs.next()){
                                    PF= new sortirPF();
                                    PF.setIduser_Utilisateur(rs.getInt("iduser_Utilisateur"));
                                    PF.setId_ProduitsF(rs.getInt("id_ProduitsF"));
                                    PF.setIdstockPF_StockPF(rs.getInt("idstockPF_StockPF"));
                                   PF.setDateSortiePF_SortirPF(rs.getString("dateSortiePF_SortirPF"));
                                   PF.setQte_SortirPF(rs.getInt("qte_SortirPF"));
                                  
                            
       listPF.add(PF);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listPF;
                   
            
}
     public static void deleteSortirpf(sortirPF cl){
                try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "delete from sortirpf where iduser_Utilisateur ="+cl.getIduser_Utilisateur()+" and id_ProduitsF="+cl.getId_ProduitsF()
                        +" and idstockPF_StockPF="+cl.getIdstockPF_StockPF()+"";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }
      }
        static void update_sortirpf(sortirPF ent)
    {
        try {
            conn = DbConnection.getConnection();
            stm = conn.createStatement(); 
String Requete="UPDATE entrerpf SET dateSortiePF_SortirPF ='"+ent.getDateSortiePF_SortirPF()+"',"
                                + "qte_SortirPF='"+ent.getQte_SortirPF()+"'"+
  " WHERE iduser_Utilisateur='"+ent.getIduser_Utilisateur()+"'"+
        "and id_ProduitsF ='"+ent.getId_ProduitsF()+"'"+"and idstockPF_StockPF= '"+ent.getIdstockPF_StockPF()+"'";
                
                stm.executeUpdate(Requete);
            
        } catch (SQLException e) {
        }
        
    }
        //*******livrer**************
         public static void insererLivraison(livrer l){
    try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "insert into livrer "
                        + "(idF_Fournisseur,codeMP_ProduitMP,dateLivraison_Livrer,"
                        + "Qte_Livrer)"
                        + "VALUES('"+l.getIdF_Fournisseur()+"','"+l.getCodeMP_ProduitMP()+"','"+l.getDateLivraison_Livrer()+"'"
                        + ",'"+l.getQte_Livrer()+"')";
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }}
    public static void deleteLivraison(livrer l){
    try{
            
               conn  = DbConnection.getConnection();
               stm = conn.createStatement();
               
                String SqlRe = "delete from livrer where idF_Fournisseur ="+l.getIdF_Fournisseur()+" and codeMP_ProduitMP ="+l.getCodeMP_ProduitMP()+"";
                
                   stm.executeUpdate(SqlRe);         

                  }catch(SQLException e)
                  {
                     JOptionPane.showMessageDialog(null, "Veuillez entrer les valeurs valides!!!"+e.getLocalizedMessage()); 
                  }}
    public static void updateLivraison(livrer l){
        try{
                        conn = DbConnection.getConnection();
                           stm=conn.createStatement();
                           
                           stm.executeUpdate("UPDATE livrer SET "
                             //   + "codeMP_ProduitMP='"+l.getCodeMP_ProduitMP()+"'"
                                + "dateLivraison_Livrer='"+ l.getDateLivraison_Livrer()+"',"
                                + "Qte_Livrer='"+l.getQte_Livrer()+"'"
//                                + ",Email_Clients='"+cl.getEmail()+"'" 
//                                + ",Nationalite_Clients='"+cl.getNationalite()+"'"
                                + " WHERE idF_Fournisseur='"+l.getIdF_Fournisseur()+"'"
                                + " and codeMP_ProduitMP ="+l.getCodeMP_ProduitMP());
                  
                  JOptionPane.showMessageDialog(null, "Modification effectuée!!!");
                 }catch(SQLException e)
                 {
                     System.err.println(e);  
                 } 
    }
    public static ArrayList<livrer>  displayLivraison(){
     ArrayList<livrer> listlivraison =new ArrayList();
            livrer liv =new livrer();
                        try {
                                conn = DbConnection.getConnection();
                                stm = conn.createStatement();
                                rs = stm.executeQuery("SELECT * FROM livrer");
                                while(rs.next()){
                                    liv.setCodeMP_ProduitMP(rs.getInt("CodeMP_ProduitMP"));
                                    liv.setIdF_Fournisseur(rs.getInt("IdF_Fournisseur"));
                                    liv.setDateLivraison_Livrer(rs.getString("DateLivraison_Livrer"));
                                    liv.setQte_Livrer(rs.getInt("Qte_Livrer"));
                                   // liv.setEmail(rs.getString("Email_Clients"));
                                   // liv.setEmail(rs.getString("Nationalite_Clients"));
                                    
                                    
                                    listlivraison.add(liv);
                            
                                }
                                
                                    
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Probleme d'affichage du tableau ! " + e.getLocalizedMessage());
                        }
                        return listlivraison;
                        }
    

    }
    
    

