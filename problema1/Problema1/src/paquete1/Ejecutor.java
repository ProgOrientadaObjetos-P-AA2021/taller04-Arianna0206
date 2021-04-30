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

        String nombreEstudiante;
        double materia1;
        double materia2;
        double materia3;
        double promedio;

        nombreEstudiante = "Arianna";
        materia1 = 9.56;
        materia2 = 7;
        materia3 = 8.88;

        PromedioEstudiante pE = new PromedioEstudiante(nombreEstudiante, materia1,
                materia2, materia3);
        pE.calcularPromedio();
        System.out.printf("%s\n", pE);

    }
}
