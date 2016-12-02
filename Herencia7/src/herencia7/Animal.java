/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia7;


public class Animal {
    
    protected String Nombre;
    protected int NumeroPatas;
    protected float Peso;
    protected int Tipo;
    protected String[] Tipos = {"Aéreo","Terrestre","Acuático"};
    
    public void setNombre(String n){
        
        Nombre = n;
    }
    public void setPatas(int p){
        
        NumeroPatas = p;
    }
    public void setPeso(float peso){
        
        Peso = peso;
    }
    public void setTipo(int t){
        
        Tipo = t-1;
    }
    
    public String getnombre(){
        
        return Nombre;
    }
    public int getPatas(){
        
        return NumeroPatas;
    }
    public float getPeso(){
        
        return Peso;
    }
    public String getTipo(){
        
        return Tipos[Tipo];
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+Nombre);
        System.out.println("Número de patas: "+NumeroPatas);
        System.out.println("Peso: "+Peso);
        System.out.println("Tipo: "+Tipos[Tipo]);
    }
}