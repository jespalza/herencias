/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author jespa
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marcas m = new Marcas();
        m.setMarca(JOptionPane.showInputDialog("Marca del SRV"));
        m.setReferencia(JOptionPane.showInputDialog("Referencia del SRV"));
        m.setRam(JOptionPane.showInputDialog("Memoria del SRV"));
        m.setDisco(JOptionPane.showInputDialog("Disco del SRV"));
        m.setProcesador(JOptionPane.showInputDialog("Procesador del SRV"));
        m.setGrafica(JOptionPane.showInputDialog("Grafica del SRV"));
        System.out.println(m.MostraMar());

    }
    
}
