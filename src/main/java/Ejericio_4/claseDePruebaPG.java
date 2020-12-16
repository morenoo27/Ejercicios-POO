package Ejericio_4;


import Ejericio_4.PuntoGeometrico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class claseDePruebaPG {
    public static void main(String[] args) {
        
        //creamos el constructor del valor predeterminado y 
        //otro con valor parametrizado
        PuntoGeometrico valorPredeterminado = new PuntoGeometrico();
        PuntoGeometrico puntoA = new PuntoGeometrico(4, 2);
        PuntoGeometrico puntoB = new PuntoGeometrico(8, 6);
        
        //creamos una linea predeterminada y otra con valores parametrizados
        Linea linea1 = new Linea();
        Linea linea2 = new Linea(puntoA, puntoB);
        
        //mostramos por consola los valores del constructor
        System.out.println("Valores predeterminados del Punto Geometrico:\n"
                + "(" + valorPredeterminado.getX() + "," 
                + valorPredeterminado.getY() + ")" );
        
        //si queremos actualizar el valor del punto utilizamos el ".set"
        valorPredeterminado.setX(5);
        valorPredeterminado.setY(9);
        
        //volvemos a mostrar por consola
        System.out.println("Nuevo valor del Punto Geometrico:\n"
                + "(" + valorPredeterminado.getX() + "," 
                + valorPredeterminado.getY() + ")" );
        
        //si queremos unos valores definidos, con aniadirlos al constructor,
        //se actualizan de manera automatica
        PuntoGeometrico valorParametrizado = new PuntoGeometrico(7, 3);
        
        System.out.println("Valor del Punto Geometrico parametrizado:\n"
                + "(" + valorParametrizado.getX() + "," 
                + valorParametrizado.getY() + ")" );
        
        linea1.mostrarLinea();
        linea1.mueveALaDerecha(4);
        linea1.mueveAbajo(1);
        linea1.mostrarLinea();
        
        linea2.mostrarLinea();
    }
}
