/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_09;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class NIF {

    //atributos que vamos a usar
    private String dni;
    private char letra;

    //constructor por defecto
    public NIF() {
        this.dni = "00000000";
        this.letra = 'O';
    }

    //constructor con parametros
    public NIF(String DNI) {
        this.dni = DNI;
        this.letra = ponerLetra(DNI);

    }

    //CREAMOS EL METODO PARA PONER LA LETRA
    private char ponerLetra(String DNI) {

//        variables que necesitamos
        int numero, resultado;
        final int CONSTANTE = 23;

        //convertimos el strin a int
        numero = Integer.parseInt(DNI);

        //hacemos la operacion
        resultado = numero % CONSTANTE;

        switch (resultado) {
            case 0:
                this.letra = 'T';
                break;
            case 1:
                this.letra = 'R';
                break;
            case 2:
                this.letra = 'W';
                break;
            case 3:
                this.letra = 'A';
                break;
            case 4:
                this.letra = 'G';
                break;
            case 5:
                this.letra = 'M';
                break;
            case 6:
                this.letra = 'Y';
                break;
            case 7:
                this.letra = 'F';
                break;
            case 8:
                this.letra = 'P';
                break;
            case 9:
                this.letra = 'D';
                break;
            case 10:
                this.letra = 'X';
                break;
            case 11:
                this.letra = 'B';
                break;
            case 12:
                this.letra = 'N';
                break;
            case 13:
                this.letra = 'J';
                break;
            case 14:
                this.letra = 'Z';
                break;
            case 15:
                this.letra = 'S';
                break;
            case 16:
                this.letra = 'Q';
                break;
            case 17:
                this.letra = 'V';
                break;
            case 18:
                this.letra = 'H';
                break;
            case 19:
                this.letra = 'L';
                break;
            case 20:
                this.letra = 'C';
                break;
            case 21:
                this.letra = 'K';
                break;
            case 22:
                this.letra = 'E';
                break;
        }

        return letra;
    }

    public String getDNI() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "NIF = " + dni + "-" + letra;
    }
    
    public void mostrar(){
        System.out.println(toString());
    }
    
    //metodo de clase= static
    public static String leer(){
        
        System.out.println("Introduce numero de DNI:");
        
        Scanner teclado = new Scanner(System.in);
        
        //esto lo que hace es simplificar el hecho de declarar una variable,
        //igualarla al teclado.nextline y devolver la variable
        return teclado.nextLine();
    }
}
