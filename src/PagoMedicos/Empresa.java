/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PagoMedicos;

/**
 *
 * @author Ricardo
 */
public class Empresa extends Entidad {
    
    private String tipo;
    private String razonSocial;
    private String ruc;
    
    public Empresa (String razonSocial, String tipo, String ruc){
        super();
        this.razonSocial = razonSocial;
        this.tipo = tipo;
        this.ruc = ruc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRuc() {
        return ruc;
    }
    

    @Override
    public double pago() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double total = 0;
        if(tipo == "A"){
            total = 5000;
        }
        if(tipo == "B"){
            total = 2200;
        }
        return total;
    }
}
