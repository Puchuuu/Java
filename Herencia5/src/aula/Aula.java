/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;



public class Aula {

    
    public static void main(String[] args) {
        
        Clase aula = new Clase();
        boolean clase;
        
        aula.crearClase();
        clase = aula.darClase();
        if(clase==false)
        {
            aula.dibujarClase();
        }
        else
        {
            aula.dibujarClase();
            System.out.println("La clase se está dando sin problemas");
        }
    }
    
        
}
