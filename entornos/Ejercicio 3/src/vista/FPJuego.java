/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.FPersonalizar;

/**
 *
 * @author Eduardo Silvestre
 */
public class FPJuego extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalV
     */
    public FPJuego() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        bPlay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        eNomJugador1 = new javax.swing.JLabel();
        tfNombreJug1 = new javax.swing.JTextField();
        eMissatgeJug1 = new javax.swing.JLabel();
        ePuntsJug1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eNomJugador2 = new javax.swing.JLabel();
        tfNombreJug2 = new javax.swing.JTextField();
        eMissatgeJug2 = new javax.swing.JLabel();
        ePuntsJug2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/stop100.png"))); // NOI18N
        bPlay.setActionCommand("tanca");
        bPlay.setBorderPainted(false);
        bPlay.setContentAreaFilled(false);
        bPlay.setFocusPainted(false);
        bPlay.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/play100.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        eNomJugador1.setBackground(new java.awt.Color(51, 255, 255));
        eNomJugador1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eNomJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomJugador1.setText("nom");
        eNomJugador1.setOpaque(true);

        tfNombreJug1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfNombreJug1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombreJug1.setText("0000");
        tfNombreJug1.setActionCommand("juga1");

        eMissatgeJug1.setBackground(new java.awt.Color(255, 102, 51));
        eMissatgeJug1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eMissatgeJug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMissatgeJug1.setText("missatge");
        eMissatgeJug1.setOpaque(true);

        ePuntsJug1.setBackground(new java.awt.Color(102, 153, 255));
        ePuntsJug1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        ePuntsJug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePuntsJug1.setText("0");
        ePuntsJug1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNomJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNombreJug1)
                    .addComponent(eMissatgeJug1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ePuntsJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eNomJugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombreJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eMissatgeJug1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ePuntsJug1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        eNomJugador2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eNomJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomJugador2.setText("nom");
        eNomJugador2.setOpaque(true);

        tfNombreJug2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfNombreJug2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombreJug2.setText("0000");
        tfNombreJug2.setActionCommand("juga2");
        tfNombreJug2.setEnabled(false);

        eMissatgeJug2.setBackground(new java.awt.Color(255, 102, 51));
        eMissatgeJug2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eMissatgeJug2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMissatgeJug2.setText("missatge");
        eMissatgeJug2.setOpaque(true);

        ePuntsJug2.setBackground(new java.awt.Color(102, 153, 255));
        ePuntsJug2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        ePuntsJug2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePuntsJug2.setText("0");
        ePuntsJug2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNomJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNombreJug2)
                    .addComponent(eMissatgeJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ePuntsJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eNomJugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombreJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eMissatgeJug2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ePuntsJug2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("??ADIVINE EL NUMERO!");

        jButton1.setBackground(new java.awt.Color(174, 174, 207));
        jButton1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jButton1.setText("Personalize su ventana");
        jButton1.setActionCommand("PersonalizarVentana");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bPlay)
                        .addGap(31, 31, 31))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Crea un mensaje cuando se va a cerrar la ventana
     *
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this,
                "??Est??s seguro de que quieres cerrar la aplicaci??n?",
                "Confirmaci??n de cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FPJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPlay;
    private javax.swing.JLabel eMissatgeJug1;
    private javax.swing.JLabel eMissatgeJug2;
    private javax.swing.JLabel eNomJugador1;
    private javax.swing.JLabel eNomJugador2;
    private javax.swing.JLabel ePuntsJug1;
    private javax.swing.JLabel ePuntsJug2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfNombreJug1;
    private javax.swing.JTextField tfNombreJug2;
    // End of variables declaration//GEN-END:variables

    /**
     * assigna l'o??dor d'acci?? als components.
     *
     * @param oidor o??dor d'esdevenimet d'acci??
     */
    public void setOidor(ActionListener oidor) {
        tfNombreJug1.addActionListener(oidor);
        tfNombreJug2.addActionListener(oidor);
        bPlay.addActionListener(oidor);
        jButton1.addActionListener(oidor);
    }

    /**
     * Devuelve el numbre del jugador 1
     *
     * @return string con el nombre del jugador 1
     */
    public int getNombreJ1() {
        return Integer.parseInt(tfNombreJug1.getText());
    }

    /**
     * Devuelve el numbre del jugador 2
     *
     * @return string con el nombre del jugador 2
     */
    public int getNombreJ2() {
        return Integer.parseInt(tfNombreJug2.getText());
    }

    /**
     * Asigna mediante una matriz de entrada el nombre a los jugadores
     *
     * @param noms matriz que contiene el nombre de los jugadores
     */
    public void mostraNomsJugadors(String[] noms) {
        eNomJugador1.setText(noms[0]);
        eNomJugador2.setText(noms[1]);
    }

    /**
     * Crea las condiciones idoneas para comenzar el juego
     */
    public void iniciaJoc() {
        tfNombreJug1.setText("0000");
        tfNombreJug2.setText("0000");
        eNomJugador1.setBackground(new Color(51, 255, 255));
        eNomJugador2.setBackground(new Color(242, 242, 242));
        tfNombreJug1.setEnabled(true);
        tfNombreJug2.setEnabled(false);
        eMissatgeJug1.setText("missatge");
        eMissatgeJug2.setText("missatge");
        bPlay.setSelected(false);
        bPlay.setActionCommand("tanca");
    }

    /**
     * Muestra el resultado del jugador 1
     *
     * @param resultat
     */
    public void mostraJ1(String resultat) {
        eMissatgeJug1.setText(resultat);
    }

    /**
     * Cambia la finestra para el turno al jugador 2
     */
    public void canviaAJugador2() {
        eNomJugador2.setBackground(new Color(51, 255, 255));
        eNomJugador1.setBackground(new Color(242, 242, 242));
        tfNombreJug2.setEnabled(true);
        tfNombreJug1.setEnabled(false);
    }

    /**
     * Muestra los puntos del jugador 1
     *
     * @param punts
     */
    public void mostraPuntsJ1(int punts) {
        ePuntsJug1.setText(punts + "");
    }

    /**
     * Cambia el panel para Terminar la jugada
     */
    public void fiJugada() {
        eNomJugador2.setBackground(new Color(242, 242, 242));
        eNomJugador1.setBackground(new Color(242, 242, 242));
        tfNombreJug2.setEnabled(false);
        tfNombreJug1.setEnabled(false);
        bPlay.setSelected(true);
        bPlay.setActionCommand("nova jugada");
    }

    /**
     * Muestra los puntos del jugador 2
     *
     * @param punts
     */
    public void mostraPuntsJ2(int punts) {
        ePuntsJug2.setText(punts + "");
    }

    /**
     * Muestra el resultado del jugador 2
     *
     * @param resultat
     */
    public void mostraJ2(String resultat) {
        eMissatgeJug2.setText(resultat);
    }

    /**
     * Cambia la finestra para el turno al jugador 1
     */
    public void canviaAJugador1() {
        eNomJugador1.setBackground(new Color(51, 255, 255));
        eNomJugador2.setBackground(new Color(242, 242, 242));
        tfNombreJug1.setEnabled(true);
        tfNombreJug2.setEnabled(false);
    }
}
