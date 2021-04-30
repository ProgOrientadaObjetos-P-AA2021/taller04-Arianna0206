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
        String nombre;
        String apellido;
        double sueldoBasico;
        double sueldoTotal;
        int cedula;
        
        nombre = "Arianna";
        apellido = "Ramón";
        sueldoBasico = 350;
        cedula = 1105679011;
        
        ProfesorInstituto pI = new ProfesorInstituto(nombre, apellido,
        sueldoBasico, cedula);
        pI.calcularSueldoTotal();
        System.out.printf("%s\n", pI);
    }
}
