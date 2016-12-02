/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

import java.util.Random;

public class Profesor extends Empleado{
    
    private Random rnd = new Random();
    protected String Materias[] = {"Matemáticas","Filosofía","Castellano","Catalán"};
    protected int Materia;
    protected String Contratos[] = {"Temporal","Fijo"};
    protected int Contrato;
    protected String Clases[] = {"1º","2º","3º","4º"};
    protected String Tutoria;
    protected int Tutorias;
    
    public Profesor()
    {
        
    }
    public Profesor(String n, char s, String f, String dni, int ss, float dinero, int m, int c, int tutoria)
    {
        super(n,s,f,dni,ss,dinero);
        Materia = m;
        Contrato = c;
        Tutorias = tutoria;
    }
    
    public void complementoSueldo(){
        
        Sueldo = Sueldo+80;
    }
    
    public void mostrarProfesor()
    {
        System.out.println("Profesor "+Nombre+" "+Apellidos);
        System.out.println("Sexo: "+Sexo);
        System.out.println(fechaNacimiento);
        System.out.println(DNI);
        System.out.println("SS: "+nSS);
        System.out.println(Sueldo+"€");
        System.out.println(Materias[Materia]);
        System.out.println(Contratos[Contrato]);
        System.out.println("Tutor de "+Tutoria);
    }
    public void crearProfesor()
    {
        crearEmpleado();
        Materia = (int)(rnd.nextDouble()*3+0);
        Contrato = (int)(rnd.nextDouble()*1+0);
        Tutorias = (int)(rnd.nextDouble()*3+0);
        Tutoria = Clases[Tutorias];
    }
}
