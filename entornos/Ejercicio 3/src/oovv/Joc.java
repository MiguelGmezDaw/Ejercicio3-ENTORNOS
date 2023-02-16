/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Joc {

    private Jugador j1;
    private Jugador j2;
    private Jugador jActiu;

    /**
     *  Asigna los jugadores
     *
     * @param j1
     * @param j2
     */
    public Joc(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
        this.jActiu = j1;
    }

    /**
     * Da nombre de los jugadoles
     *
     * @return devuleve los nombre de los jugadores en una matriz de string
     */
    public String[] getNomsJugadors() {
        return new String[]{j1.getNom(), j2.getNom()};
    }

    /**
     * Llama al metodo getAleatorio que devuelve un numero aleatorio entre los
     * valores introducidos y lo asigna a nAcertar de cada usuario.
     */
    public void iniciaJoc() {
        j1.setnAencertar(Tutil.getAleatori(1000, 9999));
        j2.setnAencertar(Tutil.getAleatori(1000, 9999));
        jActiu = j1;
    }

    /**
     * Llama al metodo comparar para comparar el numero que a introducido el
     * usuario con el que contiene el jugador
     *
     * @param num numero introducido
     * @return devulve un string con el resultado de la compraracion
     */
    public String compara(int num) {
        return jActiu.compara(num);
    }

    /**
     * Sirve para cambiar el jugador activo
     */
    public void canviaJugador() {
//        jActiu = jActiu.equals(j1) ? j2 : j1;
        jActiu = jActiu == j1 ? j2 : j1;
    }

    /**
     * Felicita al jugador ganador y dice los puntos del perdedor
     *
     * @return string con el mensaje
     */
    public String getMissatgeFelicitacio() {
        String cad = "Felicitats " + jActiu.getNom() + " has encertat!\n";
        canviaJugador();
        cad += "El nombre de " + jActiu.getNom() + " és " + jActiu.getnAencertar();
        return cad;
    }

    /**
     * Llama a la clase incrementaPunts() que es la encargada de sumar uno al
     * jugador y luego los muestras
     *
     * @return int con el numero de puntos del jugador activo
     */
    public int incrementaPunts() {
        jActiu.incrementaPunts();
        return jActiu.getPunts();
    }

}
