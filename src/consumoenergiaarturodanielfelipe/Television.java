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
public class Television extends Electrodomestico{
    private double Pulgadas =20;
    private boolean Sintonizador = false;
    private boolean AltaDefinicion = true;
   private ArrayList<Double> pre;
    
    public Television(){
        pre=new ArrayList<Double>();
    }

    public Television(float pPrecioBase, String pColor, char pConsumoEnergetico, float pPeso, double pPulgadas, boolean pSintonizador,boolean pAltaDefinicion) {
        super(pPrecioBase, pColor, pConsumoEnergetico, pPeso);
        this.AltaDefinicion = pAltaDefinicion;
        this.Pulgadas = pPulgadas;
        this.Sintonizador = pSintonizador;
       pre=new ArrayList<Double>();
    }
    public Television(float pPrecioBase,float pPeso) {
        super(pPrecioBase,pPeso);
        this.AltaDefinicion = true;
        this.Pulgadas = 20;
        this.Sintonizador = false;
       pre=new ArrayList<Double>();
    }

    /**
     * @return the Pulgadas
     */
    public double getPulgadas() {
        return Pulgadas;
    }

    public ArrayList<Double> getPre() {
        return pre;
    }

    /**
     * @param Pulgadas the Pulgadas to set
     */
    public void setPulgadas(double Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    /**
     * @return the Sintonizador
     */
    public boolean isSintonizador() {
        return Sintonizador;
    }

    /**
     * @param Sintonizador the Sintonizador to set
     */
    public void setSintonizador(boolean Sintonizador) {
        this.Sintonizador = Sintonizador;
    }

    /**
     * @return the AltaDefinicion
     */
    public boolean isAltaDefinicion() {
        return AltaDefinicion;
    }

    /**
     * @param AltaDefinicion the AltaDefinicion to set
     */
    public void setAltaDefinicion(boolean AltaDefinicion) {
        this.AltaDefinicion = AltaDefinicion;
    }
    
    public double PrecioFinal(){
   double precio =0.0; 
   double porcentaje=0.0; 
   
        if(this.getPulgadas()>= 40 ){
            porcentaje=  this.getPrecioBase()/ 0.30;
            precio= this.getPrecioBase()+porcentaje;
        } 
        else
             if( this.getPulgadas()<= 40 )   { 
        porcentaje=  this.getPrecioBase()/ 0.04; 
        precio= this.getPrecioBase()+porcentaje;
        } 
        if(this.isSintonizador()== true){
            precio= this.getPrecioBase()+2000;
        }
            
        return precio+this.precioFinal();  
        }

    @Override
    public String toString() {
        return super.toString()+"Television{" + "Pulgadas=" + Pulgadas + ", Sintonizador=" + Sintonizador + ", AltaDefinicion=" + AltaDefinicion + '}';
    }
  public String monstrarPrecio(){
    String imprimir="";
    for (int i=0;i<pre.size();i++) { //for simplificado, de la primera a la ultima posición en orden
            //toma el objeto actual en cursos y lo almacena en el objeto cursoMatriculado
            imprimir += "Saldo final de los teles: " + this.PrecioFinal() + "\n";

        }
    return imprimir;
}
    }
    

