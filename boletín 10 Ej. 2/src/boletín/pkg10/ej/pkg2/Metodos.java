/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg10.ej.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Metodos {

    private int naa = (int) (Math.random() * 51);
    private int ndi;
    private int naz;

    public void Metodos(int naa, int ndi, int naz) {
        this.naa = naa;
        this.ndi = ndi;
        this.naz = naz;

    }

    public void all() {

        JOptionPane.showMessageDialog(null, "El número a adivinar es aleatorio entre 1 y 50");
        
        ndi = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos"));

        int contador = 0;

        do {
            contador++;

            naz = Integer.parseInt(JOptionPane.showInputDialog("¿Qué número crees que es?"));

            if (naz > 0 && naa > naz) {
                JOptionPane.showMessageDialog(null, "INCORRECTO: El número es mayor");

            }
            if (naz < 50 && naa < naz) {
                JOptionPane.showMessageDialog(null, "INCORRECTO: El número es menor");
            }
            if (naz > 50 || naz < 0) {
                JOptionPane.showMessageDialog(null, "Invalid choice #ERROR");

            }
            if (naz == naa) {
                JOptionPane.showMessageDialog(null, "GANASTE, el número es correcto");
                break;

            }
            if (contador == ndi) {
                JOptionPane.showMessageDialog(null, "GAME OVER");
                break;
            }

        } while (naa <= 50 && naa >= 1);

    }

}
