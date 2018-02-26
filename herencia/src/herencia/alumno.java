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
public class alumno extends persona
{
        String Semestre;
        public alumno(String Nom,String Ed,String Sem)
        {
                super(Nom,Ed);
                this.Semestre=Sem;
        }
        public String Mostrar()
        {
            return super.Mostrar() + " El semestre es: "+ Semestre;
        }
}
