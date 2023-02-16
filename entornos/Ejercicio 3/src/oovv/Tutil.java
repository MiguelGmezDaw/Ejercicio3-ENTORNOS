/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Tutil {

    /**
     * Crea un numero alatorio entre los valores introducidos
     *
     * @param inf numero minimo
     * @param sup numero maximo
     * @return numero con decimales aleatorio entre el minimo y el maximo
     */
    public static Double getAleatori(double inf, double sup) {
        int n = getAleatori((int) (inf * 1000), (int) (sup * 1000));
        return n / 1000.0;
    }

    /**
     *Crea un numero alatorio entre los valores introducidos
     *
     * @param inf numero minimo
     * @param sup numero maximo
     * @return numero sin decimales aleatorio entre el minimo y el maximo
     */
    public static int getAleatori(int inf, int sup) {
        if (inf > sup) {
            return getAleatori(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }
}
