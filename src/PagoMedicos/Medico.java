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
public class Medico extends Persona {
    
    private String codigo;
    private double tarifa;
    private int horas;
       
    
    public Medico(String name, String lastName, String codigo, double tarifa, int horas ){
        super(name, lastName);
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.horas = horas;
    }

    @Override
    public double pago() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double total = 0;
        int aux;
        if(tarifa <= 40){
           total = horas * tarifa;
        }
        if(tarifa > 40){
            aux = 40 - horas;
            total = horas * 40;
            total = total + aux*tarifa + aux*tarifa*0.05;
        }
        
        return total;
    }
    
    
}
