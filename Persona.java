/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author LabSispc02
 */
public class Persona {
    
    private String name;
    private byte edad;
    private int cedula;
    private char sexo;
    private short peso;
    private float altura;

    public Persona(){
        
    }

    public Persona(String name, byte edad, char sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula=0;
        this.peso=2;
        this.altura=(float) 3.1;
    }
    
   
    
    public float CalcularlMC(short peso, float altura){
    float p_Ideal= (float) (peso/Math.pow(altura, 2));
     if(p_Ideal<20){
      return -1;
     } 
     else if (p_Ideal>=20 &&p_Ideal<=25){
      return 0;
     } 
     else{
     return 1;
     }
    
    }
    
    public boolean esMayorDeEdad(byte edad){
    
        if(edad<=18){
        return false;
        } else{
         return true;
        }
    }
    public char comprobarSexo(char sexo){
        if(toUpperCase(sexo)=='H' || toUpperCase(sexo)=='M'){ 
            return sexo;
        } else { 
            System.out.println("Sexo incorrecto");
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
    public int generaCedula(int cedula){
    
      cedula=(int) (Math.random()*10);
      return cedula;
      
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
    
    
}
