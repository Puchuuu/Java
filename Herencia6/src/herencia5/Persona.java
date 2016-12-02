/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

import java.util.Random;

public class Persona {
    
    private Random rnd = new Random();
    protected String Nombre;
    protected String Apellidos;
    private final char Hombre = 'H';
    private final char Mujer = 'M';
    protected char Sexo = Hombre;
    protected String fechaNacimiento;
    protected String DNI;
    protected String Nombres[] = /*40*/{"Roberto","Miguel","Aaron","Alejandro","Antonio","Raúl","Marc","Jordi","Saul","Iván","Guillermo","Leo","Manolo","Mario","Alexis","Rubén","Javier","Jose","José","Alberto","Sofia","Sara","Anna","Ana","Alejandra","Laura","Marina","Cristina","Miriam","Sandra","Silvia","Elena","Helena","Lídia","Andrea","Anabel","Isabel","Olivia","Olga","Iratxe"};
    
    public Persona(){
        
    }
    
    public Persona(String n, char s, String f, String dni){
        
    }
    
    public void setNombre(String n){
        
        Nombre = n;
    }
    public void setApellidos(String a){
        
        Apellidos = a;
    }
    public void setSexo(char s){
        
        if(s=='M')
            Sexo = Mujer;
    }
    public void setNacimiento(String f){
        
        fechaNacimiento = f;
    }
    public void setDNI(String d){
        
        DNI = d;
    }
    
    public String getNombre(){
        
        return Nombre;
    }
    public String getApellidos(){
        
        return Apellidos;
    }
    public char getSexo(){
        
        return Sexo;
    }
    public String getNacimiento(){
        
        return fechaNacimiento;
    }
    public String getDNI(){
        
        return DNI;
    }
    
    public void crearPersona()
    {
        int nombre = (int)(rnd.nextDouble()*39+0);
        int apellidos = (int)(rnd.nextDouble()*39+0);
        Nombre = Nombres[nombre];
        Apellidos = Nombres[apellidos];
        if((nombre>20)&&(nombre<=40))
            Sexo = 'M';
        fechaNacimiento = "18/01/1993";
        DNI = "45127276B";
    }
}
