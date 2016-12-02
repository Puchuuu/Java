/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Random;

public class Clase {
    
    private Random rnd = new Random();
    protected String Aulas[] = {"Matemáticas","Filosofía","Física"};
    protected int ID = 000+(int)(rnd.nextDouble()*2+0);
    protected final int MaximoAlumnos = 35;//AQUÍ NO SÉ SI LLAMAR A LA CLASE PERSONA, ESTUDIANTE, PROFESORT, A TODAS?
    protected Profesor[] Profesores = new Profesor[10];
    protected Estudiante[] Estudiantes = new Estudiante[40];
    
    public void crearClase(){
        
        int i;
        
        for(i=0;i<10;i++)
        {
            Profesores[i] = new Profesor();
            Profesores[i].setProfesor();
        }
        for(i=0;i<40;i++)
        {
            Estudiantes[i] = new Estudiante();
            Estudiantes[i].setEstudiante();
        }
    }
    public boolean darClase(){
        
        int i, contFaltas = 0;
        boolean clase = true;
        Random rnd = new Random();
        int profesor = (int)(rnd.nextDouble()*10+0);
        int aula = (int)(rnd.nextDouble()*2+0);
        
        if(Profesores[profesor].probabilidadFalta() == true)
        {
            clase = false;
            System.out.println("El profesor ha faltado");
        }
        else
            System.out.println("El profesor está asistiendo a clase");
        if(Profesores[profesor].Materia != Aulas[aula])
        {
            clase = false;
            System.out.println("El profesor no se corresponde al aula");
            System.out.println("Materia profesor: "+Profesores[profesor].Materia+" | Materia aula: "+Aulas[aula]);
        }
        else
            System.out.println("El profesor se corresponde al aula");
        for(i=0;i<40;i++)
        {
            if(Estudiantes[i].probabilidadFalta() == true)
                contFaltas++;
        }
        System.out.println("Faltas: "+contFaltas);
        if(contFaltas>17)
        {
            clase = false;
            System.out.println("No se puede dar clase porque hay más del 50% de faltas de asistencia");
        }
        
        return clase;
    }
    public void dibujarClase(){
        
        char falta = 'X';
        char asistencia = 'O';
        char clase[][] = new char[5][7];
        int i, j;
        
        for(i=0;i<5;i++)
        {
            for(j=0;j<7;j++)
            {
                if(Estudiantes[i].probabilidadFalta()==true)
                    clase[i][j] = falta;
                else
                    clase[i][j] = asistencia;
                
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<7;j++)
            {
                System.out.print("["+clase[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
}

