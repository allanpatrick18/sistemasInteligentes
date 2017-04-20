/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.copel.agenteambientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author allan
 */
public class main {

    public static Ambiente ambiente = null;

    public static void main(String[] args) throws IOException {

        String m, n;
        String line, colunm, selection;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("N:");
        n = in.readLine();
        System.out.println("M:");
        m = in.readLine();

        int t = Integer.parseInt(n);
        int t0 = Integer.parseInt(m);
        String[][] space = new String[t][t0];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t0; j++) {
                space[i][j] = "_";

            }
        }

        ambiente = new Ambiente(space);
        ambiente.printMatrix();
        System.out.println("Escolha posiçao das paredes :");
        System.out.println("Deseja escolher posiçao das paredes");
        System.out.println("s-sim");
        System.out.println("n-nao");
        selection = in.readLine();
        if (selection.equals("s")) {
            while (true) {
                System.out.println("Line");
                line = in.readLine();
                if (line.equals("e")) {
                    break;
                }
                System.out.println("Colunm");
                colunm = in.readLine();
                if (colunm.equals("e")) {
                    break;
                }
                ambiente.colocarParede(Integer.parseInt(line), Integer.parseInt(colunm));
                System.out.println("e-sair");

            }
        }
        System.out.println("Set inicail posiçao");
        System.out.println("Line");
        line = "0";
//            line = in.readLine();
        System.out.println("Colunm");
//             colunm = in.readLine();
        colunm = "0";
        ambiente.colocarAgente(Integer.parseInt(line), Integer.parseInt(colunm));

        System.out.println("Set objetivo posiçao");
        System.out.println("Line");
        line = "2";
//            line = in.readLine();
        System.out.println("Colunm");
//             colunm = in.readLine();
        colunm = "2";
        ambiente.colocarObjetivo(Integer.parseInt(line), Integer.parseInt(colunm));

        Agente agente = new Agente(ambiente.getEspaco());
        agente.setPosicaoObjetivo(Integer.parseInt(line), Integer.parseInt(colunm));
        Vector<Integer> k = new Vector();
        int i = 0;
        while (true) {
            System.out.println("Set direçes do caminho");
            String tmp = in.readLine();
            if (tmp.equals("n")) {
                break;
            }
            k.add(i, Integer.parseInt(tmp));
            i++;
        }
        agente.setWay(k);
        while (agente.verificaObjetivo()) {
            agente.cicloDeRaciocinio();
            ambiente.printMatrix();
        }
        agente.cicloDeRaciocinio();

    }

}
