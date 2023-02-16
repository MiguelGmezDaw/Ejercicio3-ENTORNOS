/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Joc;
import vista.FPJuego;
import vista.FPersonalizar;
import vista.FPersonalizar;

/**
 *
 * @author Administrador
 */
public class CFPJuego implements ActionListener {

    private FPJuego finestra;
    private Joc elJoc;

    /**
     * Constructor
     *
     * @param finestra
     * @param elJoc
     */
    public CFPJuego(FPJuego finestra, Joc elJoc) {
        this.finestra = finestra;
        this.elJoc = elJoc;
        String[] noms = elJoc.getNomsJugadors();
        finestra.mostraNomsJugadors(noms);
    }

    /**
     * Control de la ventana FPJuego
     *
     * @param e Oidor de la ventana
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "juga1":
                int num = finestra.getNombreJ1();
                String resultat = elJoc.compara(num);
                if (resultat.equals("iguals")) {
                    String missatge = elJoc.getMissatgeFelicitacio();
                    JOptionPane.showMessageDialog(finestra, missatge);
                    int punts = elJoc.incrementaPunts();
                    finestra.mostraPuntsJ1(punts);
                    finestra.fiJugada();
                } else {
                    finestra.mostraJ1(resultat);
                    elJoc.canviaJugador();
                    finestra.canviaAJugador2();
                }
                break;
            case "juga2":
                num = finestra.getNombreJ2();
                resultat = elJoc.compara(num);
                if (resultat.equals("iguals")) {
                    String missatge = elJoc.getMissatgeFelicitacio();
                    JOptionPane.showMessageDialog(finestra, missatge);
                    int punts = elJoc.incrementaPunts();
                    finestra.mostraPuntsJ2(punts);
                    finestra.fiJugada();
                } else {
                    finestra.mostraJ2(resultat);
                    elJoc.canviaJugador();
                    finestra.canviaAJugador1();
                }
                break;
            case "tanca":
                System.exit(0);
                break;
            case "nova jugada":
                elJoc.iniciaJoc();
                finestra.iniciaJoc();
                break;
            case "PersonalizarVentana":
                FPersonalizar fpers = new FPersonalizar();
                fpers.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }

}
