/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author macbookair
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombreCliente;
        String nombreBanco;
        double valorCheque;
        double comision;
        
        nombreCliente = "Arianna Ramón";
        nombreBanco = "Banco de Loja";
        valorCheque = 122.5;
        
        Cheque eF = new Cheque(nombreCliente,nombreBanco,
                valorCheque);
        eF.calcularComision();
        System.out.printf("%s\n", eF);
            
        
    }
}
