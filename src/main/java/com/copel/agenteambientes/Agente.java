/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.copel.agenteambientes;

/**
 *
 * @author allan
 */
public class Agente {
    
    private static String [][] repreAmbiente;
    private String posicao;
    private int  line;
    private int colunm;

    public Agente(String[][] repreAmbiente) {
        this.repreAmbiente = repreAmbiente;
        
    }

    
    public void ir (int x){
        lerPos();
        int maxLine = repreAmbiente.length;
        int maxColunm = repreAmbiente[0].length;
       
       
        if (x==1){
           if(line-1 >= 0 && colunm-1>= 0){
                if(repreAmbiente [line-1][colunm-1 ].equals("_")){
                    if(!repreAmbiente [line-1][colunm-1 ].equals("x")){
                        repreAmbiente [line-1][colunm-1 ] = "A";
                         repreAmbiente [line][colunm ] = "_";
                }     
            }
        }
        if (x==2){
           if(line-1>=0)
                if(repreAmbiente [line-1][colunm ].equals("_")){
                    if(!repreAmbiente [line-1][colunm ].equals("x"))
                        repreAmbiente [line-1][colunm ] = "A";
                         repreAmbiente [line][colunm ] = "_";
                }     
            }
        }
        if (x==3){
            if(colunm +1<maxColunm -1 && line -1>= 0)
                if(repreAmbiente [line-1][colunm+1].equals("_")){
                      if(!repreAmbiente [line-1][colunm+1].equals("x")){
                             repreAmbiente [line-1][colunm+1 ] = "A";
                                 repreAmbiente [line][colunm ] = "_";
                }     
            }
        }
        if (x==4){
            if(colunm-1>= 0)
                if(repreAmbiente [line][colunm-1].equals("_")){
                      if(!repreAmbiente [line][colunm-1].equals("x")){
                    repreAmbiente [line][colunm-1 ] = "A";
                       repreAmbiente [line][colunm ] = "_";
                }       
            }
        }
        if (x==6){
              if(colunm +1<=maxColunm -1)
                    if(repreAmbiente [line][colunm+1].equals("_")){
                           if(!repreAmbiente [line][colunm+1].equals("x")){
                            repreAmbiente [line][colunm+1 ] = "A";
                               repreAmbiente [line][colunm ] = "_";
                        }
               }
        }
        if (x==7){
              if(colunm-1>= 0 && line +1 <= maxLine-1)
                    if(repreAmbiente [line +1][colunm -1].equals("_")){
                          if(!repreAmbiente [line +1][colunm -1].equals("x")){
                        repreAmbiente [line +1][colunm -1 ] = "A";
                           repreAmbiente [line][colunm ] = "_";
                    }
            }
        }
        if (x==8){
              if( line +1 <=maxLine -1)
                    if(repreAmbiente [line +1][colunm].equals("_")){
                          if(!repreAmbiente [line +1][colunm].equals("x")){
                        repreAmbiente [line +1][colunm] = "A";
                           repreAmbiente [line][colunm ] = "_";
                    }   
            }
        }
         if (x==9){
              if(colunm +1 <= maxColunm-1 && line +1<=maxLine-1)
                    if(repreAmbiente [line +1][colunm +1].equals("_")){
                          if(!repreAmbiente [line +1][colunm +1].equals("x")){
                        repreAmbiente [line +1][colunm +1 ] = "A";
                           repreAmbiente [line][colunm ] = "_";
               }
            } 
        }
    printMatrix();
    }
    
    public String lerPos(){
        String tmp = null;
        String[][] matrix = repreAmbiente;
        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                   if(matrix[i][j].equals("A")){
                       tmp=i+","+j;
                       colunm = j;
                       line = i;
                       break;
                   }
                }
               
            } 
       posicao = tmp;
        return tmp;
    }
    
    public void printCdm(){
           System.out.println("IR (x)");
             String[][] matrix = {
              { "1", "2", "3"},
              { "4", "A", "6"},
              { "7", "8", "9"},
            };

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    
     private void printMatrix(){
    
    
     try{
        String [] [] matrix = repreAmbiente;
        
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
    
}
