/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author juan.espalza
 */
public class persona {

    String nombre, edad = null;
    
        public persona(String Nom, String Ed)
        {
            this.nombre = Nom;
            this.edad = Ed;
        }
        public String Mostrar()
        {
            return ("El nombre del estudiante es: "+ nombre + " la edad es: " + edad);
        }
}
