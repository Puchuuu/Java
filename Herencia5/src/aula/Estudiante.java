/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Random;

public class Estudiante extends Persona{
    
    protected int nCualificaciones = 0;
    protected float[] cualificacion = new float[10]; 
    
    public Estudiante()
    {
        
    }
    public Estudiante(String n, int e, char s, float c){
        super(n,e,s);
        cualificacion[nCualificaciones] = c;
    }
    
    public void setEstudiante(){
        
        Random rnd = new Random();
        int nombre = (int)(rnd.nextDouble()*39+0);
        Nombre = nombres[nombre];
        int edad = (int)(rnd.nextDouble()*16+12);//IGUAL TENGO QUE CREAR UN RND PARA CADA UNO PQ VARIAN
        Edad = edad;
        if((nombre>20)||(nombre<=40))
            Sexo = 'M';
        int nota = (int)(rnd.nextDouble()*10+0);
        cualificacion[nCualificaciones] = nota;
        nCualificaciones++;        
    }
    public boolean probabilidadFalta(){

         boolean falta = false;
         Random rnd = new Random();
         int probabilidad = (int)(rnd.nextDouble()*100+0);
         
         if((probabilidad>=0)&&(probabilidad<=50))
             falta = true;

         return falta;
     }
}
