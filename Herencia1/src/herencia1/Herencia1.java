/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;



public class Herencia1 {

    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("12384-GN","Biologia 1","Santillana",256);
        Libro libro2 = new Libro("92635-HJ","Matemáticas 2","Cruïlla",355);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        if(libro1.getPaginas()>libro2.getPaginas())
            System.out.println("El libro "+libro1.getITitulo()+" tiene más páginas");
        else
            System.out.println("El libro "+libro2.getITitulo()+" tiene más páginas");
    }
    
}
