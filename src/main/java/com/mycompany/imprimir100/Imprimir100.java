/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimir100;

import java.util.Random;

/**
 *
 * @author Eric Rodriguez
 */
public class Imprimir100 {

    static void llenar(){
        Random random =new Random();
        for (int i = 0; i < 10; i++) {
            x[i]=Math.abs(random.nextInt()%100);
            
        }
    }
    static void mostrar(){
        for (int i = 0; i < 10; i++) {
            
            System.out.println(i+"-->"+x[i]);        }
    }
    static int x[]=new int [10];
    
    static void burbujas(){
        int temp;
        for (int a = 0; a < 10; a++) {
            for (int y = 1; y < 10; y++) {
                if(x[y-1] >= x[y]){
                    temp=x[y];
                    x[y]=x[y-1];
                    x[y-1]=temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        
        llenar();
        mostrar();
        burbujas();
        System.out.println("Los numeros en orden serian: ");
        mostrar();
    }
}
