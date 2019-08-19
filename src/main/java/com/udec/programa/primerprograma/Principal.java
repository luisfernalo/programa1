/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.programa.primerprograma;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luis fernando lopez diaz
 */
public class Principal {
    int [] vector = new int[20];
    byte contador=0;
    int valor_minimo=0;
    int valor_maximo=0;
    int respuesta=0;
    /**
     * este metodo recoje los numero y calcula el limite menor y mayor valor
     */
    public Principal(){
        do{
            Scanner numeros=new Scanner(System.in);
            System.out.println("digite el valor");
            int valor = numeros.nextInt();
            if(valor_minimo>valor){
                valor_minimo=valor;
            }
            if(valor_maximo<valor){
                valor_maximo=valor;
            }
            vector[contador]=valor;
            contador++;
            System.out.println("desea continuar si=1 no=0");
            Scanner continuar = new Scanner(System.in);
            respuesta=continuar.nextInt();
        }while(respuesta==1);        
        Ordenar(vector,valor_maximo,valor_minimo);
    }
    /**
     * 
     * @param vector
     * @param valor_maximo
     * @param valor_minimo 
     * este metodo organiza el array y imprime los valores que no ingresaron 
     */
    private void Ordenar(int[] vector, int valor_maximo, int valor_minimo) {
        Arrays.sort(vector);
        
        for(int i=1;i<vector.length;i++){
            if(valor_minimo==valor_maximo){
                break;
            }
            if(valor_minimo==vector.length){
                valor_minimo++;
            }else{
                System.out.println(valor_minimo);
                valor_minimo++;
            }
        }
    }
    public static void main(String [] args){
        Principal principal = new Principal();
    }

    
}
