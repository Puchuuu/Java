/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;



public class Libro {

    private String ISBN;
    private String Titulo;
    private String Autor;
    private int numPaginas;
    
    public Libro(String isbn, String tit, String aut, int pag){
        
        ISBN = isbn;
        Titulo = tit;
        Autor = aut;
        numPaginas = pag;
    }
    
    @Override
    public String toString(){
        
        return "El libro "+Titulo+" con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+numPaginas+" páginas";
    }
    
    public void setISBN(String isbn){
        ISBN = isbn;
    }
    public void setTitulo(String tit){
        Titulo = tit;
    }
    public void setAutor(String aut){
        Autor = aut;
    }
    public void setPaginas(int pag){
        numPaginas = pag;
    }
    
    public String getISBN(){
        return ISBN;
    }
    public String getITitulo(){
        return Titulo;
    }
    public String getIautor(){
        return Autor;
    }
    public int getPaginas(){
        
        return numPaginas;
    }
    
}
