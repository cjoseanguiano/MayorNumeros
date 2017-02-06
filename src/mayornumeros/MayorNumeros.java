/*
11. Lee una secuencia de números y determina cual es el mayor de ellos.
 */
package mayornumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class MayorNumeros {

    public static void main(String[] args) {
        int num_secuencia;
        int num;
        int mayor = 0;

        num_secuencia = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero a leer"));

        for (int i = 0; i < num_secuencia; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

            if (num > mayor) {
                mayor = num;
                JOptionPane.showMessageDialog(null, "El numero mayor es : " + mayor);
            } else {
                JOptionPane.showMessageDialog(null, "El numero mayor es : " + mayor);

            }
        }

    }
}
