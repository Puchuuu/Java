/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

import java.util.Random;

public class Limpiadora extends Empleado{
    
    private Random rnd = new Random();
    protected int Planta;//Cuando haces este programa para un instituto concreto, con x plantas...haces un vector con las posibilidades, constantes, o qué? 
    protected int Hora;
    protected String Horario[] = {"Mañana","Tarde"};
    
    public Limpiadora(){
        
    }
    public Limpiadora(String n, char s, String f, String dni, int ss, float dinero, int p, int h){
        super(n,s,f,dni,ss,dinero);
        Planta = p;
        Hora = h;
    }
    
    public void mostrarLimpiadora()
    {
        System.out.println("Limpiadora: "+Nombre+" "+Apellidos);
        System.out.println("Sexo: "+Sexo);
        System.out.println(fechaNacimiento);
        System.out.println(DNI);
        System.out.println("SS: "+nSS);
        System.out.println(Sueldo+"€");
        System.out.println("Limpia planta "+Planta);
        System.out.println("Horario de "+Horario[Hora]);
    }
    
    public void crearLimpiadora()
    {
        crearEmpleado();
        Planta = (int)(rnd.nextDouble()*3+1);
        Hora = (int)(rnd.nextDouble()*1+0);
    }
}   
