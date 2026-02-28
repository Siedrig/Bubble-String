/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.siedrig.bubblestring;

/**
 *
 * @author romeu
 */
public class BubbleString {

    public static void main(String[] args) {
        
        new BubbleString();
       
    }
    
    public BubbleString(){
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        String pessoas[] = {"Pedro", "Valéria", "Ana", "Luiz", "Zoe", "Miguel"};
        bubbleSort_v05(paises);
        visualizar(paises);
        
        bubbleSort_v05(pessoas);
        visualizar(pessoas);
       
    }
    
    public void visualizar(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    
    public void troca(String  vetor[], int posa, int posb) {
        String temp = vetor[posa];
        vetor[posa] = vetor[posb];
        vetor[posb] = temp;        
    }
     public  boolean  bubbleSort_v05 (String vetor []) {
        if (vetor == null) return false; 
        boolean trocou;    int i = 0; 
        do {
            trocou = false;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
              if (vetor[j].compareTo(vetor[j+1]) >0) {
                    troca(vetor, j, j+1 );
                    trocou = true;
               }
            }
            i++;
        } while (trocou);
        return true;
    } 
}
