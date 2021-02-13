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
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Esta es la primera ejecucion del programa");
        Persona m1 = new Medico("Stevan", "Sanchez", "1234", 10, 40);
        Persona e1 = new AsisteteEnf("Lorena", "Benitez", "m", 1);
        Entidad p1 = new Empresa("Cobranzas", "A", "134132433");
        
        System.out.println("Stevan cobro: " +m1.pago());
        System.out.println("Lorena cobro: " +e1.pago());
        System.out.println("Cobranzas cobro: " +p1.pago());
    }
    
}
