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
public class PromedioEstudiante {

    private String nombreEstudiante;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public PromedioEstudiante(String nE, double m1, double m2, double m3) {
        nombreEstudiante = nE;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
    }

    public void establecerNombreEstudiante(String nE) {
        nombreEstudiante = nE;
    }

    public void establecerMateria1(double m1) {
        materia1 = m1;
    }

    public void establecerMateria2(double m2) {
        materia2 = m2;
    }

    public void establecerMateria3(double m3) {
        materia3 = m3;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String toString() {
        String cadena = String.format("Nombre del estudiante: %s\\n"
                + "Materia 1: %.2f\n"
                + "Materia 2: %.2f\n"
                + "Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromedio());
        return cadena;
    }
}
