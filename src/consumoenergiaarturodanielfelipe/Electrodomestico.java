/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoenergiaarturodanielfelipe;

import java.util.ArrayList;

/**
 *
 * @author artqu
 */
public class Electrodomestico {
    private float PrecioBase = 100;
    private String Color = "Blanco";
    private char ConsumoEnergetico = 'F';
    private float Peso = 5;
    ArrayList<String> color;
    
    public Electrodomestico(){
    
    }
    
    public Electrodomestico(float pPrecioBase, String pColor, char pConsumoEnergetico, 
                            float pPeso){
        this.PrecioBase = pPrecioBase;
        this.Color = pColor;
        this.ConsumoEnergetico = pConsumoEnergetico;
        this.Peso = pPeso;
        this.color=new ArrayList<String>();
        color.add("Blanco");
        color.add("Negro");
        color.add("Azul");
        color.add("Rojo");
        color.add("Gris");
        color.add("blanco");
        color.add("negro");
        color.add("azul");
        color.add("rojo");
        color.add("gris");
    }
    public Electrodomestico(float pPrecioBase,
                            float pPeso){
        this.PrecioBase = pPrecioBase;
        this.Color = "Blanco";
        this.ConsumoEnergetico = 'F';
        this.Peso = pPeso;
    }
    private double comprobarConsumoEnergetico(char consumo){
        double costo_adicional=0.0;
        switch(consumo){
            case 'A':
                costo_adicional=6000;
                break;
            case 'B':
                costo_adicional=6000;
                break;
            case 'C':
                costo_adicional=6000;
                break;
            case 'D':
                costo_adicional=6000;
                break;
            case 'E':
                costo_adicional=6000;
                break;
            case 'F':
                costo_adicional=6000;
                break;
            default:
                costo_adicional=0;
                break;
        }
        return costo_adicional;
    }
    public boolean comprobarColor(String colores){
        boolean aux=false;
        for(int i=0;i<color.size();i++){
            if(colores==color.get(i))
                aux=true;
        }
        return aux; 
    }
    private double costoPesp(){
        double costo=0.0;
        if(Peso>=0 && Peso<=19){
            costo=2000;
        }
        else
            if(Peso>=20 && Peso<=49){
                costo=3500;
            }
        else
                if(Peso>=50 && Peso<=79){
                    costo=5000;
                }
        else
                    if(Peso>=80)
                        costo=6000;
        return costo;
                
}
           
    public double precioFinal(){
        return this.comprobarConsumoEnergetico(ConsumoEnergetico)+
                this.PrecioBase + this.costoPesp();
    }
    /**
     * @return the PrecioBase
     */
    public float getPrecioBase() {
        return PrecioBase;
    }

    /**
     * @param PrecioBase the PrecioBase to set
     */
    public void setPrecioBase(float PrecioBase) {
        this.PrecioBase = PrecioBase;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the ConsumoEnergetico
     */
    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    /**
     * @param ConsumoEnergetico the ConsumoEnergetico to set
     */
    public void setConsumoEnergetico(char ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    /**
     * @return the Peso
     */
    public float getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "PrecioBase=" + PrecioBase + ", Color=" + Color + ", ConsumoEnergetico=" + ConsumoEnergetico + ", Peso=" + Peso + '}';
    }
    

}
