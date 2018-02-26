/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

/**
 *
 * @author jespa
 */
public class Caracteristicas {
    String ram,disco,grafica,procesador = null;

     public String MostrarRef (){
         String MostrarRef;
         MostrarRef = ("cuenta con :\n Memoria: "+ram+" \n Disco: "+disco+"\n Procesador: "+procesador+" \n Grafica"+grafica);
         return MostrarRef;
    }
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    
}
