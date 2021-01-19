/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import Controle.Factory;
import Modele.Utilisateurs;
import Modele.profil_utilisateur;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import saveur.menu;

/**
 *
 * @author Patrick Shriver
 */
public class Utilisateur extends javax.swing.JFrame {

    private final DefaultTableModel model;
    /**
     * Creates new form Utilisateur
     */
        ArrayList<profil_utilisateur> lpr= null;
    public Utilisateur() {
        this.model = new DefaultTableModel();
        initComponents();
        affichagerUtilisateur();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBLId = new javax.swing.JLabel();
        LBLNom = new javax.swing.JLabel();
        LBLFonction = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        TXTNom = new javax.swing.JTextField();
        TXTFonction = new javax.swing.JTextField();
        LBLAdresse = new javax.swing.JLabel();
        LBLNomUtilisateur = new javax.swing.JLabel();
        TXTAdresse = new javax.swing.JTextField();
        TXTTelephone = new javax.swing.JTextField();
        BTNAjouter = new javax.swing.JButton();
        BTNSupprimer = new javax.swing.JButton();
        BTNModifier = new javax.swing.JButton();
        LBLTelephone = new javax.swing.JLabel();
        LBLCodeProfile = new javax.swing.JLabel();
        TXTNomUtilisateur1 = new javax.swing.JTextField();
        TXTMotDePasse1 = new javax.swing.JTextField();
        LBLMotDePasse = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboCodeProf = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabUtilisateur = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        LBLId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLId.setText("ID");

        LBLNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLNom.setText("Nom");

        LBLFonction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLFonction.setText("Fonction");

        TXTNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNomActionPerformed(evt);
            }
        });

        LBLAdresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLAdresse.setText("Adresse");

        LBLNomUtilisateur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLNomUtilisateur.setText("Nom d'Utilisateur");

        TXTAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAdresseActionPerformed(evt);
            }
        });

        TXTTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTTelephoneActionPerformed(evt);
            }
        });

        BTNAjouter.setText("Ajouter");
        BTNAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAjouterActionPerformed(evt);
            }
        });

        BTNSupprimer.setText("Supprimer");

        BTNModifier.setText("Modifier");

        LBLTelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLTelephone.setText("Telephone");

        LBLCodeProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLCodeProfile.setText("Profile");

        TXTNomUtilisateur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNomUtilisateur1ActionPerformed(evt);
            }
        });

        TXTMotDePasse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMotDePasse1ActionPerformed(evt);
            }
        });

        LBLMotDePasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LBLMotDePasse.setText("Mot de Passe");

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboCodeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodeProfActionPerformed(evt);
            }
        });

        TabUtilisateur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Fonction", "Adresse", "Telephone", "Nom d'Utilisateur", "Mot de Passe", "Code de Profile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabUtilisateur);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LBLNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LBLFonction, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                    .addComponent(LBLId, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBLMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(LBLNomUtilisateur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LBLAdresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLCodeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNAjouter)
                                .addGap(18, 18, 18)
                                .addComponent(BTNModifier)
                                .addGap(18, 18, 18)
                                .addComponent(BTNSupprimer)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(0, 39, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TXTMotDePasse1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCodeProf, javax.swing.GroupLayout.Alignment.LEADING, 0, 293, Short.MAX_VALUE)
                            .addComponent(TXTId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTFonction, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTAdresse, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTTelephone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(TXTNomUtilisateur1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLNom)
                            .addComponent(TXTNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLFonction)
                            .addComponent(TXTFonction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLAdresse)
                            .addComponent(TXTAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLNomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTNomUtilisateur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTMotDePasse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLCodeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCodeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNAjouter)
                    .addComponent(BTNSupprimer)
                    .addComponent(BTNModifier)
                    .addComponent(jButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("         UTILISATEUR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAdresseActionPerformed

    private void TXTTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTTelephoneActionPerformed

    private void TXTNomUtilisateur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNomUtilisateur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNomUtilisateur1ActionPerformed

    private void TXTMotDePasse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMotDePasse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMotDePasse1ActionPerformed

    private void TXTNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
menu cl= new menu();
       cl.setVisible(rootPaneCheckingEnabled);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAjouterActionPerformed
      Utilisateurs uti = new Utilisateurs();
      uti.setFonction(TXTFonction.getText());
      uti.setUsername(TXTNomUtilisateur1.getText());
      uti.setAddresse(TXTAdresse.getText());
      uti.setTelephone(TXTTelephone.getText());
      uti.setUsername(TXTNomUtilisateur1.getText());
      uti.setPassword(TXTMotDePasse1.getText());
      
      int n=comboCodeProf.getSelectedIndex();
      uti.setCodeprofil(lpr.get(n).getCodeProfil());
       lpr=new ArrayList();
    for(profil_utilisateur pro:lpr){
        comboCodeProf.addItem(pro.getNomProfil());
    }
      
      Factory.insertutilisateur(uti);
    }//GEN-LAST:event_BTNAjouterActionPerformed

    public void affichagerUtilisateur(){
            model.addColumn("Nom");
            model.addColumn("Fonction");
            model.addColumn("Addresse");
            model.addColumn("Telephone");
            model.addColumn("Username");
            model.addColumn("Password");
            model.addColumn("Profil");
        ArrayList<Utilisateurs> listu = new ArrayList();
        listu = Factory.displayutilisateur();
        for(Utilisateurs u:listu){
             model.addRow(new Object[]{
                    
                 
                 //u.getCode(),
                  u.getNom(),
                  u.getFonction(),
                  u.getAddresse(),
                  u.getTelephone(),
                  u.getUsername(),
                  u.getPassword(),
                  getProfil(u.getCodeprofil())
             });
             TabUtilisateur.setModel(model);
        }
    }
    public String getProfil(int x){
        String Nom="";
        for(profil_utilisateur pi:lpr){
            if(pi.getCodeProfil()==x){
                Nom=pi.getNomProfil();
                break;
            }
        }
        return Nom;
    }
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        ArrayList<Utilisateurs> listu = new ArrayList();
        listu = Factory.displayutilisateur();
        for(Utilisateurs u:listu){
             model.addRow(new Object[]{
                
                  u.getNom(),
                  u.getFonction(),
                  u.getAddresse(),
                  u.getTelephone(),
                  u.getUsername(),
                  u.getPassword(),
                  getProfil(u.getCodeprofil())
             });
             TabUtilisateur.setModel(model);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed
public void loadprofil(){
    ArrayList<profil_utilisateur> lpr=new ArrayList();
    for(profil_utilisateur pro:lpr){
        comboCodeProf.addItem(pro.getNomProfil());
    }
}
        
    private void comboCodeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodeProfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAjouter;
    private javax.swing.JButton BTNModifier;
    private javax.swing.JButton BTNSupprimer;
    private javax.swing.JLabel LBLAdresse;
    private javax.swing.JLabel LBLCodeProfile;
    private javax.swing.JLabel LBLFonction;
    private javax.swing.JLabel LBLId;
    private javax.swing.JLabel LBLMotDePasse;
    private javax.swing.JLabel LBLNom;
    private javax.swing.JLabel LBLNomUtilisateur;
    private javax.swing.JLabel LBLTelephone;
    private javax.swing.JTextField TXTAdresse;
    private javax.swing.JTextField TXTFonction;
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTMotDePasse1;
    private javax.swing.JTextField TXTNom;
    private javax.swing.JTextField TXTNomUtilisateur1;
    private javax.swing.JTextField TXTTelephone;
    private javax.swing.JTable TabUtilisateur;
    private javax.swing.JComboBox comboCodeProf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}