/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package herencia7;

import java.util.*;

public class Menu {
    
    private Vector Animales = new Vector(5,5);
    protected int contAnimal = 0;
    protected int contInsecto = 0;
    
    public static Scanner teclado = new Scanner(System.in);
    public static int ejecutarMenu(){
        

        int op;        

        System.out.println(" - - - - - - M E N U - - - - - -");
        System.out.println("1. Añadir Animal");
        System.out.println("2. Añadir Insecto");
        System.out.println("3. Añadir Araña");
        System.out.println("4. Ver Base de Datos");
        System.out.println("0. Salir");
        
        op = teclado.nextInt();
        
        return op;
    }
    
    public void nuevoAnimal(){
        
        String Nombre;
        int Patas;
        float Peso;
        int Tipo;
        
        Animales.addElement(new Animal());
        System.out.println("Dame el nombre del animal: ");
        Nombre = teclado.next();
        ((Animal)Animales.elementAt(contAnimal)).setNombre(Nombre);
        System.out.println("Dame el número de patas: ");
        Patas = teclado.nextInt();
        ((Animal)Animales.elementAt(contAnimal)).setPatas(Patas);
        System.out.println("Dame el peso del animal: ");
        Peso = teclado.nextFloat();
        ((Animal)Animales.elementAt(contAnimal)).setPeso(Peso);
        System.out.println("Dame el tipo del animal: ");
        System.out.println("1. Aéreo\n2. Terrestre\n3. Acuático");
        Tipo = teclado.nextInt();
        ((Animal)Animales.elementAt(contAnimal)).setTipo(Tipo);
        contAnimal++;
    }
    
    public void nuevoInsecto(){
        
        int col1, col2, col3, col4, nColor;
        
        Animales.addElement(new Insecto());
        nuevoAnimal();
        System.out.println("Ahora vas a añadir el color de las patas del insecto. Comprueba que los colores que quieres añadir se en cuentran en la BBDD: ");
        ((Insecto)Animales.elementAt(contAnimal-1)).mostrarColores();
        System.out.println("Necesitas añadir algún color?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        nColor = teclado.nextInt();
        if(nColor == 1)
            Insecto.añadirColor();
        System.out.println("Dame el color de la pata izquierda delantera del bicho");
        ((Insecto)Animales.elementAt(contAnimal-1)).mostrarColores();
        col1 = teclado.nextInt()-1;
        ((Insecto)Animales.elementAt(contAnimal)).setColorPataIzDel(col1);
        System.out.println("Dame el color de la pata derecha delantera del bicho");
        ((Insecto)Animales.elementAt(contAnimal-1)).mostrarColores();
        col2 = teclado.nextInt()-1;
        ((Insecto)Animales.elementAt(contAnimal)).setColorPataDerTr(col2);
        System.out.println("Dame el color de la pata izquierda trasera del bicho");
        ((Insecto)Animales.elementAt(contAnimal-1)).mostrarColores();
        col3 = teclado.nextInt()-1;
        ((Insecto)Animales.elementAt(contInsecto)).setColorPataIzTr(col3);
        System.out.println("Dame el color de la pata derecha trasera del bicho");
        ((Insecto)Animales.elementAt(contAnimal-1)).mostrarColores();
        col4 = teclado.nextInt()-1;
        ((Insecto)Animales.elementAt(contAnimal)).setColorPataDerTr(col4);
        contAnimal++;
    }
    
    public void nuevaAraña(){
        
        int col1, col2;
        int nColor;
        
        nuevoAnimal();
        nuevoInsecto();
        Animales.addElement(new Araña());
        System.out.println("Ahora vas a añadir el color de las patas del insecto. Comprueba que los colores que quieres añadir se en cuentran en la BBDD: ");
        Insecto.mostrarColores();
        System.out.println("Necesitas añadir algún color?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        nColor = teclado.nextInt();
        if(nColor == 1)
            Insecto.añadirColor();
        System.out.println("Dime el color de la pata central izquierda de la araña: ");
        col1 = teclado.nextInt()-1;
        ((Araña)Animales.elementAt(contAnimal)).setColorPataCenIz(col1);
        System.out.println("Dime el color de la pata central derecha de la araña: ");
        col2 = teclado.nextInt()-1;
        ((Araña)Animales.elementAt(contAnimal)).setColorPataCenDer(col2);
        contAnimal++;
    }
    
    public void mostrarAnimales(){
        
        int i;
        
        for(i=0;i<Animales.size();i++)
        {
            ((Animal)Animales.elementAt(i)).mostrarInfo();
            System.out.println("= = = = = = = = =");
        }
    }
    }
