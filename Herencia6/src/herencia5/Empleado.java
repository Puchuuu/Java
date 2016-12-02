/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

import java.util.Random;

public class Empleado extends Persona{
    
    private Random rnd = new Random();
    protected int nSS;
    protected float Sueldo;
    
    public Empleado(){
        
    }
    public Empleado(String n, char s, String f, String dni, int ss, float dinero){
        
        super(n,s,f,dni);
        nSS = ss;
        Sueldo = dinero;
    }
    
    public void setnSS(int ss){
        
        nSS = ss;
    }
    public void setSueldo(float s){
        
        Sueldo = s;
    }
    
    public int getnSS(){
        
        return nSS;
    }
    public float getSueldo(){
        
        return Sueldo;
    }
    
    public void crearEmpleado()
    {
        crearPersona();
        int ss = (int)(rnd.nextDouble()*1000000+0);
        float s = rnd.nextFloat()*1500+650;
        nSS = ss;
        Sueldo = s;
    }
}
