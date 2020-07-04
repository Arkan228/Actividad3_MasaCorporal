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
public class Evaluacion {

    public static float calculo(float altura, float peso) {
        float MC=(float) (peso/(Math.pow(altura,2)));
        return MC;
    }
    public static void imprimir (String nombre, int edad, float altura, float peso, float IMC){
        Calculadora.jTextArea1.setText("Hola "+nombre+"\n Tu edad es de "+edad+" kilos\n Tu peso es de "+peso+" metros\n Tu Indice de Masa Corporal es de "+IMC);
    }
}
