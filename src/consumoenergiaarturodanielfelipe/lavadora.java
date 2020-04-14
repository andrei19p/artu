/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoenergiaarturodanielfelipe;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class lavadora extends Electrodomestico{
    private double Carga = 5;
    private ArrayList<Double> pre;
    
    
    public lavadora (){
        pre=new ArrayList<Double>();
    }

    public lavadora(float pPrecioBase, String pColor, char pConsumoEnergetico, float pPeso, double pCarga) {
        super(pPrecioBase, pColor, pConsumoEnergetico, pPeso);
        this.Carga= pCarga;
        pre=new ArrayList<Double>();
    }
    public lavadora(float pPrecioBase, float pPeso) {
        super(pPrecioBase,pPeso);
        this.Carga= 5;
        pre=new ArrayList<Double>();
    }
    /**
     * @return the Carga
     */
    public double getCarga() {
        return Carga;
    }

    public ArrayList<Double> getPre() {
        return pre;
    }

    /**
     * @param Carga the Carga to set
     */
    public void setCarga(double Carga) {
        this.Carga = Carga;
    }
    public double PrecioFinal(){
    double precio=0.0; 
    
    if(this.getPeso()>30){
    precio=4500;
    }
    return precio+this.precioFinal(); 
    
    
    }

    @Override
    public String toString() {
        return super.toString()+"lavadora{" + "Carga=" + Carga + '}';
    }
public String monstrarPrecio(){
    String imprimir="";
    for (int i=0;i<pre.size();i++) { //for simplificado, de la primera a la ultima posición en orden
            //toma el objeto actual en cursos y lo almacena en el objeto cursoMatriculado
            imprimir += "Total final de las lavadores: " + this.PrecioFinal() + "\n";

        }
    return imprimir;
}
}
