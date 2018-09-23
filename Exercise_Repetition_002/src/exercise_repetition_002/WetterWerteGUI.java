/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_repetition_002;

import java.time.LocalDateTime;

/**
 *
 * @author Pascal
 */
public class WetterWerteGUI extends javax.swing.JFrame {

    /**
     * Creates new form WetterWerteGUI
     */
    private WetterModell model = new WetterModell();
    private int lf, temp;

    public WetterWerteGUI() {
        initComponents();
        wetterListe.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lb_tp = new javax.swing.JLabel();
        slider_tp = new javax.swing.JSlider();
        lb_lf = new javax.swing.JLabel();
        slider_lf = new javax.swing.JSlider();
        bt_einf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wetterListe = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eingabe"));
        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        lb_tp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lb_tp);

        slider_tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slider_tp.setMajorTickSpacing(10);
        slider_tp.setMaximum(40);
        slider_tp.setMinimum(-20);
        slider_tp.setMinorTickSpacing(10);
        slider_tp.setPaintLabels(true);
        slider_tp.setPaintTicks(true);
        slider_tp.setValue(50);
        slider_tp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onTempChange(evt);
            }
        });
        jPanel2.add(slider_tp);

        lb_lf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(lb_lf);

        slider_lf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        slider_lf.setMajorTickSpacing(20);
        slider_lf.setMinorTickSpacing(20);
        slider_lf.setPaintLabels(true);
        slider_lf.setPaintTicks(true);
        slider_lf.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onLuftChange(evt);
            }
        });
        jPanel2.add(slider_lf);

        bt_einf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_einf.setText("Einfügen");
        bt_einf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_einfActionPerformed(evt);
            }
        });
        jPanel2.add(bt_einf);

        getContentPane().add(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Anzeige"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setViewportView(wetterListe);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);

        jMenu2.setText("Datei");

        jMenuItem1.setText("Speichern");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Laden");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaden(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExit(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_einfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_einfActionPerformed
        WetterWert wd = new WetterWert(LocalDateTime.now(), temp, lf);
        model.add(wd);
    }//GEN-LAST:event_bt_einfActionPerformed

    private void onTempChange(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onTempChange


    }//GEN-LAST:event_onTempChange

    private void onLuftChange(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onLuftChange

    }//GEN-LAST:event_onLuftChange

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //speichern

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void onLaden(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaden
        //laden

    }//GEN-LAST:event_onLaden

    private void onExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onExit

    }//GEN-LAST:event_onExit

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
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WetterWerteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_einf;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_lf;
    private javax.swing.JLabel lb_tp;
    private javax.swing.JSlider slider_lf;
    private javax.swing.JSlider slider_tp;
    private javax.swing.JList<String> wetterListe;
    // End of variables declaration//GEN-END:variables
}