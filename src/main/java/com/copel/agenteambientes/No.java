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
public class No {
     String palavra;    //dado
     No filhoEsquerda; //cria filho  a esquerda
     No filhoDireita;  // cria filho a direita
    public No(String palavra){
		this.palavra = palavra;
	}
     public void mostraNo(){   
       {   
             System.out.print(palavra);   
             System.out.print(", ");   
        }   
     }   
   }
