/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoenergiaarturodanielfelipe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artqu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> el=new ArrayList<Electrodomestico> ();
       String dat=JOptionPane.showInputDialog("Cuantos electrodomesticos desea agregar");
       String[] colores = {"Azul", "Blanco", "Negro", "Rojo", "Gris"};
        String[] consumo = {"A","B","C","D","E","F"};
       lavadora lav=new lavadora();
       Television tev=new Television();
       double total=0.0;
       int in=0;
       int datos=Integer.parseInt(dat);
       for(int i=0;i<datos;i++){
         in= JOptionPane.showOptionDialog(null, 
        "¿Cual Electrodomestico desea agregar?", 
        "Feedback", 
        JOptionPane.OK_CANCEL_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        null, 
        new String[]{"Televisor", "Lavadora"}, 
        "default"); 
       if(in==0){
//          ele=new Television();
          float precioBase=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio base"));
          Object selection=JOptionPane.showInputDialog(null,"Elija un Color",
"Seleccion",JOptionPane.QUESTION_MESSAGE,null,colores,null);
          Object selection_consumo=JOptionPane.showInputDialog(null,"Seleccione el tipo de consumo",
"Seleccion",JOptionPane.QUESTION_MESSAGE,null,consumo,null);
          
             double pulgadas=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las pulgadas"));
               int sint= JOptionPane.showConfirmDialog(null,
                                 "Tiene sintonizador", "Please select",
                                 JOptionPane.YES_NO_OPTION);
                 int alt= JOptionPane.showConfirmDialog(null,
                                 "Es de alta definicion el televisor", "Please select",
                                 JOptionPane.YES_NO_OPTION);
          float peso=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el peso"));
           String color=String.valueOf(selection);
        String con=String.valueOf(selection_consumo);
        char cons=con.charAt(0);
         boolean sintonizador;
         boolean altDefinicion;
        if(sint==0){
        sintonizador=true;
                }
        else{
            sintonizador=false;
        }
        if(alt==0){
        altDefinicion=true;
                }
        else{
            altDefinicion=false;
        }
          tev=new Television(precioBase,color,cons,peso,pulgadas,sintonizador,altDefinicion);
          tev.getPre().add(tev.precioFinal());
          el.add(tev);

          JOptionPane.showMessageDialog(null, tev.toString());
          
       }
       else
           if(in==1){
               float precioBase=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio base"));
              Object selection=JOptionPane.showInputDialog(null,"Elija un Color",
"Seleccion",JOptionPane.QUESTION_MESSAGE,null,colores,null);
          float peso=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el peso"));
            Object selection_consumo=JOptionPane.showInputDialog(null,"Seleccione el tipo de consumo",
"Seleccion",JOptionPane.QUESTION_MESSAGE,null,consumo,null);
             double carga=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la carga"));
        String color=String.valueOf(selection);
        String con=String.valueOf(selection_consumo);
        char cons=con.charAt(0);
          lav=new lavadora(precioBase,color,cons,peso,carga);
          el.add(lav);
          lav.getPre().add(lav.precioFinal());
           }
       }
               JOptionPane.showMessageDialog(null,tev.monstrarPrecio());
               JOptionPane.showMessageDialog(null,lav.monstrarPrecio());
                 for(Electrodomestico e:el){
                     total+=e.precioFinal();
                 }     

               JOptionPane.showMessageDialog(null,"Total final es:"+total);
        
    }
    
}
