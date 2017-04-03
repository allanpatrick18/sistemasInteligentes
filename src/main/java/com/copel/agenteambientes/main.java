/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.copel.agenteambientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author allan
 */
public class main {

  public static void main(String[] args) throws IOException {  
      
      
      String m , n;
      String line,colunm, selection;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("N:");
      n = in.readLine();
      System.out.println("M:");
      m = in.readLine();
      
      int t = Integer.parseInt(n);
      int t0 = Integer.parseInt(m);
      String [] [] space = new String [t] [t0];
      
      for(int i = 0; i < t ; i++){
          for(int j = 0;j < t0 ;j++){
            space [i][j] = "_";
          
          }
      }
      
      Ambiente ambiente = new Ambiente(space);
      ambiente.printMatrix();
      System.out.println("Escolha posiçao das paredes :");
      System.out.println("Deseja escolher posiçao das paredes");
      System.out.println("s-sim");
      System.out.println("n-nao");
      selection = in.readLine();
        if(selection.equals("s")){
           while(true){
              System.out.println("Line");
              line = in.readLine();
              if(line.equals("e")){
                  break;
              }
              System.out.println("Colunm");
              colunm = in.readLine();
              if(colunm.equals("e")){
                  break;
              }
              ambiente.colocarParede(Integer.parseInt(line), Integer.parseInt(colunm));
              System.out.println("e-sair");

        }
      }
      System.out.println("Set inicail posiçao");
            System.out.println("Line");
            line = in.readLine();
             System.out.println("Colunm");
             colunm = in.readLine();
             ambiente.colocarAgente(Integer.parseInt(line), Integer.parseInt(colunm));
             
             Agente agente = new Agente(ambiente.getEspaco());
          
       while(true){
           agente.printCdm();
           System.out.println("Set inicail posiçao");
           String tmp = in.readLine();
           int ir = Integer.parseInt(tmp);
           agente.ir(ir);
       }
              
       
}
      
      
  
}
