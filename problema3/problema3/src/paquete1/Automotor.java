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
public class Automotor {

    private int cedulaDueño;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private int añoAntiguedad;
    private double valorMatricula;

    public Automotor(int cD, String mV, int aF, double vV) {
        cedulaDueño = cD;
        marcaVehiculo = mV;
        añoFabricacion = aF;
        valorVehiculo = vV;

    }

    public void establecerCedulaDueño(int cD) {
        cedulaDueño = cD;
    }

    public void establecerMarcaVehiculo(String mV) {
        marcaVehiculo = mV;
    }

    public void establecerAñoFabricacion(int aF) {
        añoFabricacion = aF;
    }

    public void establecerValorVehiculo(double vV) {
        valorVehiculo = vV;
    }

    public void calcularAñoAntiguedad() {
        añoAntiguedad = 2021 - añoFabricacion;
    }

    public void calcularValorMatricula() {
        valorMatricula = 0.002 * valorVehiculo * añoAntiguedad;
    }

    public int obtenerCedulaDueño() {
        return cedulaDueño;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAñoFabricacion() {
        return añoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public int obtenerAñoAntiguedad() {
        return añoAntiguedad;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String toString() {

        String cadena = String.format("El automotor es el siguiente: \n"
                + "Cédula del dueño: %d\n"
                + "Marca de vehículo: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerCedulaDueño(),
                obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;

    }
}
