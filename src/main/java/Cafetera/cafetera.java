/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author aleja
 */
public class cafetera {

    double capacidadMaxima, cantidadActual;
    static final double CAPACIDADMAXIMA = 1000, VACIO = 0;

    public  cafetera() {
        this.capacidadMaxima = CAPACIDADMAXIMA;
        this.cantidadActual = VACIO;

    }

    public cafetera(double capacidadMaxima) {
        
        this.cantidadActual = capacidadMaxima;
    }
    
    public cafetera(double capacidadMaxima, double cantidadActual) {
        
        if (cantidadActual>capacidadMaxima) {
            
            this.cantidadActual = capacidadMaxima;
            this.capacidadMaxima = capacidadMaxima;
        } else {
            
            this.cantidadActual = cantidadActual;
            this.capacidadMaxima = capacidadMaxima;
        }

    }
    
    public void llenarCafetera(){
        
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
        
        if (cantidadAServir>cantidadActual) {
            this.cantidadActual = VACIO;
            
        } else {
            this.cantidadActual -= cantidadAServir;
            //this.cantidadActual = cantidadActual - cantidadAServir;
        }
    }
    
    public void vaciarCafetera(){
        
        //actualizar la cantidad actual de la cafetera a 0
        this.cantidadActual = VACIO;
    }
    
    public void agregarCafe(double cantidadAgregar){
        
        if ((cantidadAgregar + this.cantidadActual) > this.capacidadMaxima) {
            
            //saldria algo para decir que no se puede rellenar
        }
    }
}
