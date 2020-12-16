/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_14;

/**
 *
 * @author aleja
 */
public class Personas {
    public static void main(String[] args) {
        
        Persona Vico = new Persona();
        System.out.println("Datos de una buenisima persona:"
                + "\n" + Vico.getNombre() + " " + Vico.getPrimerApellido()
                + " " + Vico.getSegundoApellido()
                + "\nEdad: " + Vico.getEdad()+ "*Se conserva bien*"
                + "\nNIF: " + Vico.getNIF());
        
        //Persona chicoNormalYCorriente = new Persona(Nombre, PrimerApellido, SegundoApellido, 0, 0);
    }
}
