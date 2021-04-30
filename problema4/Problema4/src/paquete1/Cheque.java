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
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque(String nC, String nB, double vC) {
        nombreCliente = nC;
        nombreBanco = nB;
        valorCheque = vC;

    }

    public void establecerNombreCliente(String nC) {
        nombreCliente = nC;
    }

    public void establecerNombreBanco(String nB) {
        nombreBanco = nB;
    }

    public void establecerValorCheque(double vC) {
        valorCheque = vC;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    public String toString() {
        String cadena = String.format("La entidad financiera es: \n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión: %.1f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComision());
        return cadena;
    }
}
