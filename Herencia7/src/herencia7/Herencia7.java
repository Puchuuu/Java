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
public class Herencia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        int opcion;
        
        do{
            opcion = menu.ejecutarMenu();
            switch(opcion)
            {
                case 1:
                    menu.nuevoAnimal();
                    break;
                case 2:
                    menu.nuevoInsecto();
                    break;
                case 3:
                    menu.nuevaAraña();
                    break;
                case 4:
                    menu.mostrarAnimales();
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
            }
        }while(opcion!=0);
    }
    
}

