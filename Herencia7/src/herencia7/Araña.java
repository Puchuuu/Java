/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia7;

/**
 *
 * @author adaw
 */
public class Araña extends Insecto{
    
    private int ColorPataCenIz;
    private int ColorPataCenDer;
    
    public void setColorPataCenIz(int c1){
        
        ColorPataCenIz = c1;
    }
    public void setColorPataCenDer(int c2){
        
        ColorPataCenDer = c2;
    }
    
    public String getColorPataCenIz(){
        
        return (String)Colores.elementAt(ColorPataCenIz);
    }
    public String getColorPataCenDer(){
        
        return (String)Colores.elementAt(ColorPataCenDer);
    }
    
    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Color Pata Central Izquierda: "+this.getColorPataCenIz());
        System.out.println("Color Pata Central Derecha: "+this.getColorPataCenDer());
    }
}

