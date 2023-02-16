/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Jugador {

    private String nom;
    private int punts;
    private int nAencertar;

    /**
     * Crea el jugador
     *
     * @param nom Introduce el nombre
     * @param nAencertar Introduce numero de aciertos
     * @throws Maex
     */
    public Jugador(String nom, int nAencertar) throws Maex {
        if (nom == null || nom.isBlank()) {
            throw new Maex("el nom no pot estar buit");
        }
        this.nom = nom;
        this.punts = 0;
        this.nAencertar = Math.abs(nAencertar);
    }

    /**
     * Compara entre el numero que le entra como parametro y el numero a acertar
     *
     * @param nombre numero a comprar
     * @return
     */
    public String compara(int nombre) {
        if (nombre == nAencertar) {
            return "iguals";
        }
        if (nombre < nAencertar) {
            return "prova un major";
        }
        return "prova un menor";
    }

    /**
     * Incrementa uno a los puntos del jugador
     */
    public void incrementaPunts() {
        punts++;
    }

    /**
     * Devuelve los puntos del jugador
     *
     * @return int punts
     */
    public int getPunts() {
        return punts;
    }

    /**
     * Devuelve el nombre del jugador
     *
     * @return string nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Devuelve el numero a acertar
     *
     * @return int nAencertar
     */
    public int getnAencertar() {
        return nAencertar;
    }

    /**
     * Asigna el numero a acertar al jugador
     *
     * @param nAencertar
     */
    public void setnAencertar(int nAencertar) {
        this.nAencertar = nAencertar;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    /**
     *Compara
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nom, other.nom);
    }

}
