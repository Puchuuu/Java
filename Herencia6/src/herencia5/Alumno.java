/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

import java.util.Random;
import java.util.Scanner;

public class Alumno extends Persona{
public Scanner teclado = new Scanner(System.in);
    
    private Random rnd = new Random();
    protected int Curso;
    protected String Cursos[] = {"1º","2º","3º","4º"};
    private final boolean Repetir = false;
    protected boolean Repetidor = Repetir;
    protected int añosCentro;
    
    public Alumno(){
        
    }
    public Alumno(String n, char s, String f, String dni, int c, int a)
    {
        super(n,s,f,dni);
        Curso = c;
        añosCentro = a;
    }
    
    public void mostrarAlumno()
    {
        System.out.println("Alumno: "+Nombre+" "+Apellidos);
        System.out.println("Sexo: "+Sexo);
        System.out.println(fechaNacimiento);
        System.out.println(DNI);
        System.out.println(Cursos[Curso]);
        System.out.println("Repetidor: "+Repetidor);
        System.out.println(añosCentro+" años en el centro");
    }
    
    public void crearAlumno()
    {
        int curso = (int)(rnd.nextDouble()*3+0);
        crearPersona();
        Curso = curso;
        System.out.println("Es el alumno "+Nombre+" repetidor?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        if(teclado.nextInt()==1)
            Repetidor = true;
        switch(curso)
        {
            case 0:
                añosCentro = 1;
                if(Repetidor==true)
                    añosCentro++;
                break;
            case 1:
                añosCentro = 2;
                if(Repetidor==true)
                    añosCentro++;
                break;
            case 2: 
                añosCentro = 3;
                if(Repetidor==true)
                    añosCentro++;
                break;
            case 3:
                añosCentro = 4;
                if(Repetidor==true)
                    añosCentro++;
                break;
        }
    }
}
