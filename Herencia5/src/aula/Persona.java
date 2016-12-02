/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Robb
 */
public class Persona {
    
    protected String Nombre;
    protected int Edad;
    private final char Hombre = 'H';
    private final char Mujer = 'M';
    protected char Sexo = Hombre;
    protected String nombres[] = /*40*/{"Roberto","Miguel","Aaron","Alejandro","Antonio","Raúl","Marc","Jordi","Saul","Iván","Guillermo","Leo","Manolo","Mario","Alexis","Rubén","Javier","Jose","José","Alberto","Sofia","Sara","Anna","Ana","Alejandra","Laura","Marina","Cristina","Miriam","Sandra","Silvia","Elena","Helena","Lídia","Andrea","Anabel","Isabel","Olivia","Olga","Iratxe"};
    public Persona()
    {
        
    }
    public Persona(String n, int e, char s){
        
        Nombre = n;
        Edad = e;
        Sexo = s;
    }
    
    public void setNombre(String n){
        
        Nombre = n;
    }
    public void setEdad(int e){
        
        Edad = e;
    }
    public void setSexo(char s){
        
        if(s=='M')
            Sexo = Mujer;
    }
    
    public String getNombre(){
        
        return Nombre;
    }
    public int getEdad(){
        
        return Edad;
    }
    public char getSexo(){
        
        return Sexo; 
   }
}
