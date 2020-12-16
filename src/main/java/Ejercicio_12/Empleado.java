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
public class Empleado {
    
    //declaramos las variables privadas que vamosa  necesitar
    private int NIF, horasExtras, numHijos;
    private double sueldoBase, pagoHoraExtra, IRPF;
    private String casado;

    public Empleado() {
        NIF=01234567;
        numHijos=0;
        casado="No";
        sueldoBase=1000;
        IRPF=19;
        horasExtras=0;
        pagoHoraExtra=0;
    }

    public Empleado(int NIF, int horasExtras, int numHijos, double sueldoBase, double pagoHoraExtra, double IRPF, String casado) {
        this.NIF = NIF;
        this.horasExtras = horasExtras;
        this.numHijos = numHijos;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.IRPF = IRPF;
        this.casado = casado;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
