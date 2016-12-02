/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Random;

public class Profesor extends Persona{
    
    protected String materias[] = {"Matemáticas","Filosofía","Física"};
    protected int nMateria;
    protected String Materia;
    
    public Profesor()
    {
        
    }
    public Profesor(String n, int e, char s, int m){
        super(n,e,s);
        nMateria = m;
    }
    
    public void setProfesor(){
        
        Random rnd = new Random();
        int nombre = (int)(rnd.nextDouble()*39+0);
        Nombre = nombres[nombre];
        int edad = (int)(rnd.nextDouble()*16+12);//IGUAL TENGO QUE CREAR UN RND PARA CADA UNO PQ VARIAN
        Edad = edad;
        if((nombre>20)||(nombre<=40))
            Sexo = 'M';
        int nMateria = (int)(rnd.nextDouble()*2+0);
        Materia = materias[nMateria];
    }
    
    public boolean probabilidadFalta(){
        
        boolean falta = false;
        Random rnd = new Random();
        int probabilidad = (int)(rnd.nextDouble()*100+0);
        
        if((probabilidad>=0)&&(probabilidad<=20))
            falta = true;
        
        return falta;
    }
}
