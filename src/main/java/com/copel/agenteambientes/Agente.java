/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.copel.agenteambientes;

import static com.copel.agenteambientes.main.ambiente;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author allan
 */
public class Agente {

    private static String[][] repreAmbiente;
    private String posicao;
    private int line;
    private int colunm;
    private int[] actionPlan;
    private Vector<Integer> way;
    public List<Integer> acoes;

    public Agente(String[][] repreAmbiente) {
        this.repreAmbiente = repreAmbiente;

    }

    public String movaAgente(int x) {


        int maxLine = repreAmbiente.length;
        int maxColunm = repreAmbiente[0].length;

        if (!repreAmbiente[line][colunm].equals("O")) {
            repreAmbiente[line][colunm] = "+";

            if (x == 1) {
                if (line - 1 >= 0 && colunm - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm - 1].equals("x")) {
                        repreAmbiente[line - 1][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }
            if (x == 2) {
                if (line - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm].equals("x")) {
                        repreAmbiente[line - 1][colunm] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 3) {
                if (colunm + 1 < maxColunm - 1 && line - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm + 1].equals("x")) {
                        repreAmbiente[line - 1][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 4) {
                if (colunm - 1 >= 0) {
                    if (!repreAmbiente[line][colunm - 1].equals("x")) {
                        repreAmbiente[line][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 6) {
                if (colunm + 1 <= maxColunm - 1) {
                    if (!repreAmbiente[line][colunm + 1].equals("x")) {
                        repreAmbiente[line][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 7) {
                if (colunm - 1 >= 0 && line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm - 1].equals("x")) {
                        repreAmbiente[line + 1][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 8) {
                if (line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm].equals("x")) {
                        repreAmbiente[line + 1][colunm] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (x == 9) {
                if (colunm + 1 <= maxColunm - 1 && line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm + 1].equals("x")) {
                        repreAmbiente[line + 1][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }
            lerPos();
            if (repreAmbiente[line][colunm].equals("O")) {
                System.out.println("Sucessso!!");
            }
        } else {
            System.out.println("Sucessso!!");
        }

        return lerPos();

    }
    public String funcaoSucessora(int x, int y, int acao) {

        colunm = x;
        line = y;

        int maxLine = repreAmbiente.length;
        int maxColunm = repreAmbiente[0].length;

        if (!repreAmbiente[line][colunm].equals("O")) {
            repreAmbiente[line][colunm] = "+";

            if (acao == 1) {
                if (line - 1 >= 0 && colunm - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm - 1].equals("x")) {
                        repreAmbiente[line - 1][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }
            if (acao == 2) {
                if (line - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm].equals("x")) {
                        repreAmbiente[line - 1][colunm] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 3) {
                if (colunm + 1 < maxColunm - 1 && line - 1 >= 0) {
                    if (!repreAmbiente[line - 1][colunm + 1].equals("x")) {
                        repreAmbiente[line - 1][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 4) {
                if (colunm - 1 >= 0) {
                    if (!repreAmbiente[line][colunm - 1].equals("x")) {
                        repreAmbiente[line][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 6) {
                if (colunm + 1 <= maxColunm - 1) {
                    if (!repreAmbiente[line][colunm + 1].equals("x")) {
                        repreAmbiente[line][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 7) {
                if (colunm - 1 >= 0 && line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm - 1].equals("x")) {
                        repreAmbiente[line + 1][colunm - 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 8) {
                if (line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm].equals("x")) {
                        repreAmbiente[line + 1][colunm] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }

            if (acao == 9) {
                if (colunm + 1 <= maxColunm - 1 && line + 1 <= maxLine - 1) {
                    if (!repreAmbiente[line + 1][colunm + 1].equals("x")) {
                        repreAmbiente[line + 1][colunm + 1] = "A";
                        repreAmbiente[line][colunm] = "_";
                    }
                }
            }
            lerPos();
            if (repreAmbiente[line][colunm].equals("O")) {
                System.out.println("Sucessso!!");
            }
        } else {
            System.out.println("Sucessso!!");
        }

        return lerPos();


    }

    public String lerPos() {
        String tmp = null;
        String[][] matrix = Ambiente.espaco;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("A")) {
                    tmp = i + "," + j;
                    colunm = j;
                    line = i;
                    break;
                }
            }

        }
        posicao = tmp;
        return tmp;
    }

    public void printCdm() {
        System.out.println("IR (x)");
        String[][] matrix = {
            {"1", "2", "3"},
            {"4", "A", "6"},
            {"7", "8", "9"},};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void printCrencas() {

        System.out.println("\ncrenças do agente acerca do ambiente grid 2D");

        try {
            String[][] matrix = repreAmbiente;

            int rows = matrix.length;
            int columns = matrix[0].length;
            String str = "|\t";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    str += matrix[i][j] + "\t";
                }

                System.out.println(str + "|");
                str = "|\t";
            }

        } catch (Exception e) {
            System.out.println("Matrix is empty!!");
        }

    }

    public void printCaminho() {

        try {
            String[][] matrix = repreAmbiente;

            int rows = matrix.length;
            int columns = matrix[0].length;
            String str = "|\t";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    str += matrix[i][j] + "\t";
                }

                System.out.println(str + "|");
                str = "|\t";
            }

        } catch (Exception e) {
            System.out.println("Matrix is empty!!");
        }

    }

    public void executaPlano() {
//
//         for(int i = 0;i< way.size();i++){
//               repreAmbiente[line][colunm]= "+";
//           }
//           printMatrix();
    }

//      public boolean executaPlano(){
//         lerPos();
//         int[] direction = {2,4,6,8};
//         int i=0;
//         while(!repreAmbiente[line][colunm].equals("0")){
//              int oldline= line;
//              int oldColumn = colunm;
//             ir(direction[i]);
//             if( oldline ==line && oldColumn == colunm){
//                    if(i<3){
//                        i++;
//                    }else{
//                    i=0;
//                    }
//             }   
//         }
//          return true;
//     }  
    public void acoesPosiveis() {
        lerPos();
        int maxLine = repreAmbiente.length;
        int maxColunm = repreAmbiente[0].length;
        acoes = new ArrayList<>();

        if (line - 1 >= 0 && colunm - 1 >= 0) {
            if (!repreAmbiente[line - 1][colunm - 1].equals("x")) {
                acoes.add(1);
            }
        }

        if (line - 1 >= 0) {
            if (!repreAmbiente[line - 1][colunm].equals("x")) {
                acoes.add(2);
            }
        }

        if (colunm + 1 < maxColunm - 1 && line - 1 >= 0) {
            if (!repreAmbiente[line - 1][colunm + 1].equals("x")) {
                acoes.add(3);
            }
        }

        if (colunm - 1 >= 0) {
            if (!repreAmbiente[line][colunm - 1].equals("x")) {
                acoes.add(3);
            }
        }

        if (colunm + 1 <= maxColunm - 1) {
            if (!repreAmbiente[line][colunm + 1].equals("x")) {
                acoes.add(6);
            }
        }

        if (colunm - 1 >= 0 && line + 1 <= maxLine - 1) {
            if (!repreAmbiente[line + 1][colunm - 1].equals("x")) {
                acoes.add(7);
            }
        }

        if (line + 1 <= maxLine - 1) {
            if (!repreAmbiente[line + 1][colunm].equals("x")) {
                acoes.add(8);
            }
        }

        if (colunm + 1 <= maxColunm - 1 && line + 1 <= maxLine - 1) {
            if (!repreAmbiente[line + 1][colunm + 1].equals("x")) {
                acoes.add(9);
            }
        }

        printAcoes();
    }

    public void printAcoes() {

        System.out.println("Estado");
        System.out.println("(" + this.colunm + "," + this.line + ")");
        System.out.print("{");
        for (int i = 0; i < acoes.size(); i++) {
            System.out.print("ir(" + acoes.get(i) + "),");
        }
        System.out.println("}");
        acoes.clear();
    }

    public void custos() {
        double t = 1.5;
        int k = 1;
        Integer[] a = {2, 4, 6, 8};

        for (int i = 0; i < acoes.size(); i++) {
            for (int j = 0; j < a.length; j++) {
                if (acoes.get(i) % 2 == 0) {
                    k++;
                } else {
                    t = t + 1.5;
                }
            }
        }
        System.out.println("Caminho custo" + k + t);
    }

    public void cicloDeRaciocinio() {
        printCrencas();
        acoesPosiveis();
        if(way.size()>0){
        way.get(0);
        System.out.println("Proxima acao do plano: ir(" + way.get(0) + ")");
        ambiente.moveAgentenoAmbiente(way.get(0));
        movaAgente(way.get(0));
        way.remove(0);
        }
    }

    public Vector<Integer> getWay() {
        return way;
    }

    public void setWay(Vector<Integer> way) {
        this.way = way;

    }

    public List<Integer> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Integer> acoes) {
        this.acoes = acoes;
    }

}
