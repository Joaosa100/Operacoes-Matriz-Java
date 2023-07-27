package Prova2;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos {

    public void calculaFatorial(double[][] matriz) {

        int qtdLinhas = 0;
        int qtdColunas = 0;
        for (int a = 0; a < matriz.length; a++) {
            qtdColunas++;
            qtdLinhas++;
        }

        int[][] matrizResposta = new int[qtdLinhas][qtdColunas];
        int atual = 0;
        int fat = 0;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                fat = 1;
                atual = (int) matriz[a][n];
                if (atual>=0) {
                    for (int i = 1; i <= atual; i++) {
                        fat = fat * i;
                    }
                    matrizResposta[a][n] = fat;
                }
            }
        }
        for(int[] posicoes: matrizResposta) {
            System.out.println(Arrays.toString(posicoes));
        }
    }

    public double mediaDasPosicoes(double[][] matriz){
        System.out.println("Você escolheu o método para calcular a média dos valores de uma matriz.");

        int qtdeLinhas = 0;
        int qtdeColunas = 0;

        double total = 0;
        for (int a = 0; a < matriz.length; a++) {
            qtdeLinhas ++;
            qtdeColunas ++;
            for (int n = 0; n < matriz[a].length; n++) {
                total += matriz[a][n];
            }
        }

        double media = total / (qtdeLinhas * qtdeColunas);
        System.out.println("Média dos valores da matriz: ");

        for(double[] notasDoAluno: matriz) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        return media;
    }

    public double somaDasPosicoes(double[][] matriz){
        System.out.println("Você escolheu o método para calcular a soma dos valores de uma matriz.");

        double total = 0;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                total += matriz[a][n];

            }
        }

        System.out.println("Soma dos valores da matriz: ");

        for(double[] i: matriz) {
            System.out.println(Arrays.toString(i));
        }
        return total;
    }

    public int somaDoFatorialDeUmaLinha(double[][] matriz) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual linha calcular você deseja soma do fatorial?");
        int linhaSelecionada = entrada.nextInt();

        int qtdColunas = 0;
        for (int a = 0; a < matriz.length; a++) {
            qtdColunas++;
        }

        int[] linha = new int[qtdColunas];
        int[] vetorResposta = new int[qtdColunas];
        int soma = 0;


        if (linhaSelecionada == 0) {
            for (int i = 0; i < qtdColunas; i++) {
                linha[i] = (int) matriz[0][i];
            }
        }
        for (int i = 0; i < qtdColunas; i++) {
            linha[i] = (int) matriz[linhaSelecionada][i];
        }

        for (int j = 0; j < linha.length; j++) {
            int n = linha[j];
            int fat = 1;
            if (n>=0) {
                for (int i = 1; i <= n; i++) {
                    fat = fat * i;
                }
                vetorResposta[j] = fat;
                soma += vetorResposta[j];
            }
        }
        return soma;
    }

    public String qtdPares(double[][] matriz) {

        int qtdPares = 0;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                if (matriz[a][n] % 2 == 0) {
                    qtdPares++;
                }

            }
        }
        return "Quantidade de números pares na matriz: " + qtdPares;
    }
    public String qtdPrimos(double[][] matriz) {
        int qtdPrimos = 0;
        int qtdDivisores = 0;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                for (int i = 1; i <= matriz[a][n]; i++) {
                    if (matriz[a][n] % i == 0) {
                        qtdDivisores++;
                    }
                }
                if (qtdDivisores == 2) {
                    qtdPrimos++;
                }
                qtdDivisores = 0;
            }
        }
        return "Quantidade de números primos na matriz: " + qtdPrimos;
    }

    public void ordenarLinhas(double[][] matriz) {
        int qtdColunas = 0;
        for (int a = 0; a < matriz.length; a++) {
            qtdColunas++;
        }
        int[] vetor = new int[qtdColunas];
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                vetor[n] = (int) matriz[a][n];
            }
            Arrays.sort(vetor);
            System.out.println(Arrays.toString(vetor));
            vetor = new int[qtdColunas];
        }
    }

    public String qtdImpares(double[][] matriz) {
        System.out.println("Você escolheu o método para Calcular a quantidade de números ímpares da matriz.");
        int qtdImpares = 0;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                if (matriz[a][n] % 2 != 0) {
                    qtdImpares++;
                }

            }
        }
        return "Quantidade de números ímpares na matriz: " + qtdImpares;
    }

    public double multiplicacaoDasPosicoes(double[][] matriz){
        System.out.println("Você escolheu o método para calcular a multiplicação dos valores de uma matriz.");

        double total = 1;
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                total *= matriz[a][n];

            }
        }

        System.out.println("Multiplicação dos valores da matriz: ");

        for(double[] i: matriz) {
            System.out.println(Arrays.toString(i));
        }
        return total;
    }

    public double mediaDeUmaLinha(double[][] matriz) {
        System.out.println("Você escolheu o método para calcular a média de uma linha de uma matriz.");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual linha a calcular você deseja a média?");
        int linhaSelecionada = entrada.nextInt();

        int qtdColunas = 0;
        for (int a = 0; a < matriz.length; a++) {
            qtdColunas++;
        }

        int[] linha = new int[qtdColunas];
        //int[] vetorResposta = new int[qtdColunas];
        double soma = 0;


        if (linhaSelecionada == 0) {
            for (int i = 0; i < qtdColunas; i++) {
                linha[i] = (int) matriz[0][i];
            }
        }
        for (int i = 0; i < qtdColunas; i++) {
            linha[i] = (int) matriz[linhaSelecionada][i];
        }

        for (int j = 0; j < linha.length; j++) {
            soma += linha[j];
        }
        return soma/linha.length;
    }

}