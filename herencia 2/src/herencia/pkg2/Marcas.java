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
public class Marcas extends Caracteristicas{
    
    String Marca, Referencia = null;
    
    public String MostraMar(){
        String MostraMar;
        MostraMar =("El Srv marca "+Marca+ " con referencia: "+Referencia+" "+super.MostrarRef());
        return MostraMar;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }



}
