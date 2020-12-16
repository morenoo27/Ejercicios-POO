/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12;

/**
 *
 * @author aleja
 */
public class pruebaDeEmpleado {
    public static void main(String[] args) {
        
        //cremoas el constructor de empleado por defecto
        Empleado paquitoElFlojo = new Empleado();
        
        System.out.println("Fichero de Paquito el Flojo:"
                + "\nNIF:" + paquitoElFlojo.getNIF()
                + "\nCasado:" + paquitoElFlojo.getCasado()
                + "\nHijos:" + paquitoElFlojo.getNumHijos()
                + "\nSueldo:" + paquitoElFlojo.getSueldoBase()
                + "\nIRPF:" + paquitoElFlojo.getIRPF()
                + "\nHoras extras:" + paquitoElFlojo.getHorasExtras()
                + "\nHoras extras pagadas:" + paquitoElFlojo.getPagoHoraExtra());
                
        //Paquito forma mejorada
        paquitoElFlojo.setCasado("Si");
        paquitoElFlojo.setHorasExtras(100);
        paquitoElFlojo.setIRPF(50);
        paquitoElFlojo.setNIF(76645316);
        paquitoElFlojo.setNumHijos(2);
        paquitoElFlojo.setPagoHoraExtra(500);
        paquitoElFlojo.setSueldoBase(1000000);
        
        Empleado Machocus = new Empleado(78102412, 500, 0, 50000, 100, 15, "no");
    
        System.out.println("Fichero de Paquito version mejorada de su vida:"
                + "\nNIF:" + Machocus.getNIF()
                + "\nCasado:" + Machocus.getCasado()
                + "\nHijos:" + Machocus.getNumHijos()
                + "\nSueldo:" + Machocus.getSueldoBase()
                + "\nIRPF:" + Machocus.getIRPF()
                + "\nHoras extras:" + Machocus.getHorasExtras()
                + "\nHoras extras pagadas:" + Machocus.getPagoHoraExtra());
    }
}
