/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia5;

/**
 *
 * @author Robb
 */
public class Herencia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesor profesor1 = new Profesor();
        Limpiadora limpiadora1 = new Limpiadora();
        Alumno alumno1 = new Alumno();
        
        profesor1.crearProfesor();
        limpiadora1.crearLimpiadora();
        alumno1.crearAlumno();
        profesor1.mostrarProfesor();
        limpiadora1.mostrarLimpiadora();
        alumno1.mostrarAlumno();
    }
    
}
