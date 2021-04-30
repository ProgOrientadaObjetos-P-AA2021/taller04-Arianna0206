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
public class ProfesorInstituto {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;

    public ProfesorInstituto(String n, String a, double sB, int c) {
        nombre = n;
        apellido = a;
        sueldoBasico = sB;
        cedula = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerSueldoBasico(double sB) {
        sueldoBasico = sB;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + 20;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String toString() {

        String cadena = String.format("El profesor tiene las siguientes "
                + "caracteristicas: \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cédula: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
        return cadena;
    }
}
