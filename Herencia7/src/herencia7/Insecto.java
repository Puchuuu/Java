
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia7;

import java.util.*;




public class Insecto extends Animal{
    
    public static Scanner teclado = new Scanner(System.in);
    protected static Vector Colores = new Vector(5,5);
    
    protected int ColorPataIzDel;
    protected int ColorPataDerDel;
    protected int ColorPataIzTr;
    protected int ColorPataDerTr;
    
    public Insecto()
    {
        llenarColores();        
    }
    public static void llenarColores(){
        
        Colores.addElement("Rojo");
        Colores.addElement("Azul");
        Colores.addElement("Verde");
        Colores.addElement("Negro");
        Colores.addElement("Lila");
        Colores.addElement("Blanca");
        Colores.addElement("Naranja");
    }
    public static void añadirColor(){
        
        String color;
        
        System.out.println("Escribe el color que quieres añadir: ");
        color = teclado.next();
        Colores.addElement(color);
    }
    public static void mostrarColores(){
        int i;
        
        for(i=0;i<Colores.size();i++)
        {
            System.out.println((i+1)+". "+Colores.elementAt(i));
        }
    }
    
    public void setColorPataIzDel(int c1){
        
        ColorPataIzDel = c1;
    }
    public void setColorPataDerDel(int c2){
        
        ColorPataDerDel = c2;
    }
    public void setColorPataIzTr(int c3){
        
        ColorPataIzTr = c3;
    }
    public void setColorPataDerTr(int c4){
        
        ColorPataDerTr = c4;
    }
    
    public Object getColorPataIzDel(){
        
        return Colores.elementAt(ColorPataIzDel);
    }
    public Object getColorPataDerDel(){
        
        return Colores.elementAt(ColorPataDerDel);
    }
    public Object getColorPataIzTr(){
        
        return Colores.elementAt(ColorPataIzTr);
    }
    public Object getColorPataDerTr(){
        
        return Colores.elementAt(ColorPataDerTr);
    }
    
    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Color pata izquierda delantera: "+this.ColorPataIzDel);
        System.out.println("Color pata derecha delantera: "+this.ColorPataDerDel);
        System.out.println("Color pata izquierda trasera: "+this.ColorPataIzTr);
        System.out.println("Color pata derecha trasera: "+this.ColorPataDerTr);
    }
}