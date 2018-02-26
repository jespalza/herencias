/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author juan.espalza
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String N,E,S; 
        N = JOptionPane.showInputDialog("Ingresar Nombre Estudiante");
        E = JOptionPane.showInputDialog("Ingresar Edad del Estudiante");
        S = JOptionPane.showInputDialog("Ingresar Semestre del Estudiante");
        alumno alu = new alumno(N, E, S);
        System.out.println(alu.Mostrar());
    }
    
}
