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
public class Persona {
    
    private String Nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private int edad;
    private int NIF;

    public Persona() {
        Nombre="Juan Carlos";
        PrimerApellido="Fernandez";
        SegundoApellido="Vico";
        edad=25;
        NIF=01234567;
    }

    public Persona(String Nombre, String PrimerApellido, String SegundoApellido, int edad, int NIF) {
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.edad = edad;
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public int getNIF() {
        return NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

}
