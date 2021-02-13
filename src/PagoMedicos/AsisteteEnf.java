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
public class AsisteteEnf extends Persona {
    
   private String jornada;
   private int nivel;
   
   public AsisteteEnf (String name, String lastName, String jornada, int nivel){
       super(name, lastName);
       this.jornada = jornada;
       this.nivel = nivel;
       
   }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getJornada() {
        return jornada;
    }

    public int getNivel() {
        return nivel;
    }

   
   
    @Override
    public double pago() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double total = 0;

        if(jornada == "m" && nivel == 1){
            total = 450;
        }
        if(jornada == "m" && nivel == 2){
            total = 450 + 450*0.10;
        }
        if(jornada == "v" && nivel == 1){
            total = 560;
        }
        if(jornada == "v" && nivel == 2){
            total = 560 + 105;
        }
        
        return total;
    }
    
   
   
}
