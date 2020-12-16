package Ejericio_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class PuntoGeometrico {
    
    //definimos la variables que vamos a usar, como nos dicen que osn reales,
    //pueden ser de tipo "double"
    //Estas variables deben ser privadas
    private double x;
    private double y;
    
    //creamos la clase de PuntoGeometrico por defecto
    public PuntoGeometrico() {
        //los valores preddeterinados son valores nulos o cero
        this.x=0;
        this.y=0;
    }

    //la siguiente clase es parametrizada,por loq ue necesitamos las variables
    // x e y
    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //esta clase lo que hace devolver el valor de la variable x al sitio donde
    //se invoque un ".getX"
    public double getX() {
        return x;
    }

    //esta clase lo que hace devolver el valor de la variable y al sitio donde
    //se invoque un ".getY"
    public double getY() {
        return y;
    }

    //esta clase se utiliza para actualizar la variable x en este caso donde se
    //invoque un ".setX"
    public void setX(double x) {
        this.x = x;
    }

    //esta clase se utiliza para actualizar la variable y en este caso donde se
    //invoque un ".setY"
    public void setY(double y) {
        this.y = y;
    }

}

