/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericio_4;

/**
 *
 * @author aleja
 */
public class Linea {

    private PuntoGeometrico puntoInicial;
    private PuntoGeometrico puntoFinal;

    public Linea() {

        //creamos el punto inical
        PuntoGeometrico puntoInicial = new PuntoGeometrico(0, 0);
        //punto final
        PuntoGeometrico puntoFinal = new PuntoGeometrico(1, 1);
        //Igualamos valores
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;

    }

    public Linea(PuntoGeometrico puntoInicial, PuntoGeometrico puntoFinal) {

        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;

    }

    public void mueveALaDerecha(double cantidadX) {

        //si queremos moverlo a la derecha, ambos puntos, la coordenada x se
        //sumara tantas unidades como sea marcada por el objeto
        this.puntoInicial.setX(puntoInicial.getX() + cantidadX);
        this.puntoFinal.setX(puntoFinal.getX() + cantidadX);

    }

    public void mueveALaIzquierda(double cantidadX) {

        //si queremos moverlo a la derecha, ambos puntos, la coordenada x se
        //restara tantas unidades como sea marcada por el objeto
        this.puntoInicial.setX(puntoInicial.getX() - cantidadX);
        this.puntoFinal.setX(puntoFinal.getX() - cantidadX);

    }

    public void mueveArriba(double cantidadY) {

        //si queremos moverlo a la derecha, ambos puntos, la coordenada y se
        //sumara tantas unidades como sea marcada por el objeto
        this.puntoInicial.setX(puntoInicial.getX() + cantidadY);
        this.puntoFinal.setX(puntoFinal.getX() + cantidadY);

    }

    public void mueveAbajo(double cantidadY) {

        //si queremos moverlo a la derecha, ambos puntos, la coordenada y se
        //restara tantas unidades como sea marcada por el objeto
        this.puntoInicial.setX(puntoInicial.getX() + cantidadY);
        this.puntoFinal.setX(puntoFinal.getX() + cantidadY);

    }

    public PuntoGeometrico getPuntoInicial() {

        return puntoInicial;

    }

    public PuntoGeometrico getPuntoFinal() {

        return puntoFinal;

    }

    public void setPuntoInicial(PuntoGeometrico puntoInicial) {

        this.puntoInicial = puntoInicial;

    }

    public void setPuntoFinal(PuntoGeometrico puntoFinal) {

        this.puntoFinal = puntoFinal;

    }

    public void mostrarLinea() {

        System.out.println("[(" + this.puntoInicial.getX()
                + "," + this.puntoInicial.getY()
                + ") , (" + this.puntoFinal.getX()
                + "," + this.puntoFinal.getY() + ")]");

    }
}
