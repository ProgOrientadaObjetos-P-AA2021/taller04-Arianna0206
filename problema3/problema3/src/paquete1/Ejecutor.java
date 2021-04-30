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

        int cedulaDueño;
        String marcaVehiculo;
        int añoFabricacion;
        double valorVehiculo;
        int añosAntiguedad;
        double valorMatricula;

        cedulaDueño = 1104567034;
        marcaVehiculo = "NISSAN";
        añoFabricacion = 2017;
        valorVehiculo = 40000;
        
        Automotor aT = new Automotor(cedulaDueño,marcaVehiculo,añoFabricacion,
        valorVehiculo);
        
        aT.calcularAñoAntiguedad();
        aT.calcularValorMatricula();
        System.out.printf("%s\n", aT);
        
        
     }
}
