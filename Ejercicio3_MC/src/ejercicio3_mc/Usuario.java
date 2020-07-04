/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_mc;

/**
 *
 * @author omarmora
 */
public class Usuario {
    public String nombre;
    public int edad;
    public float peso, altura;

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public float getpeso() {
        return peso;
    }

    public void setpeso(float peso) {
        this.peso = peso;
    }

    public float getaltura() {
        return altura;
    }

    public void setaltura(float altura) {
        this.altura = altura;
    }
    
    
}
