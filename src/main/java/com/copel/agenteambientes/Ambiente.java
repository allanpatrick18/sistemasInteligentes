/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.copel.agenteambientes;

import java.util.ArrayList;

/**
 *
 * @author allan
 */
public class Ambiente {
   
    
    public String [] [] espaco; 

    public Ambiente(String[][] espaco) {
        this.espaco = espaco;
    }

    
    public void printMatrix(){
    
    
     try{
        String [] [] matrix = espaco;
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        String str = "|\t";

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                str += matrix[i][j] + "\t";
            }

            System.out.println(str + "|");
            str = "|\t";
        }

    }catch(Exception e){System.out.println("Matrix is empty!!");}
     
    }
    
    
    public void colocarParede(int m, int n){
        espaco[m][n] = "X";
        printMatrix();
        
    }
      
    public void colocarAgente(int m, int n){
        espaco[m][n] = "A";
        printMatrix();
        
    }

    public String[][] getEspaco() {
        return espaco;
    }

    public void setEspaco(String[][] espaco) {
        this.espaco = espaco;
    }
    
        
   
    
    
    
}
