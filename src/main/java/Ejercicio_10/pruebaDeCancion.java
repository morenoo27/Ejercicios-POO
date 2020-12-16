/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

/**
 *
 * @author aleja
 */
public class pruebaDeCancion {
    public static void main(String[] args) {
        
        Cancion cacionPredetermianda = new Cancion();
        
        System.out.println("Cacion predeterminada:\n"
                + "Titulo de la cancion:" + cacionPredetermianda.getTitulo()
                + "\nAutor de la cancion:" + cacionPredetermianda.getAutor());
        
        cacionPredetermianda.setAutor("Imagine Dragons");
        cacionPredetermianda.setTitulo("Radioactive");
        
        System.out.println("Nueva cancion:\n"
                + "Titulo de la cancion:" + cacionPredetermianda.getTitulo()
                + "\nAutor de la cancion:" + cacionPredetermianda.getAutor());
        
        Cancion cancionParametrizada = new Cancion("Bad Bunny","Dakiti");
        
        System.out.println("Temazo:\n"
                + "Titulo del temazo:" + cancionParametrizada.getAutor()
                + "\nAutor del temazo:" + cancionParametrizada.getTitulo());
    }
}
