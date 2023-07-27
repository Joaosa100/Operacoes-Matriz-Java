package Prova2;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a matriz QUADRADA.");

        System.out.print("Quantas linhas? ");
        int qtdeLinhas = scanner.nextInt();

        System.out.print("Quantas colunas? ");
        int qtdeColunas = scanner.nextInt();

        double[][] matriz = new double[qtdeLinhas][qtdeColunas];
        for (int a = 0; a < matriz.length; a++) {
            for (int n = 0; n < matriz[a].length; n++) {
                System.out.printf("Informe o valor da coluna %d, linha %d: ", n + 1, a + 1);
                matriz[a][n] = scanner.nextDouble();
            }
        }
        System.out.println("Matriz que você digitou:");
        for(double[] posicoes: matriz) {
            System.out.println(Arrays.toString(posicoes));
        }

        System.out.println("\nDIGITE O NÚMERO DO MÉTODO QUE VOCÊ QUER UTILIZAR E PRESSIONE ENTER:");
        System.out.println("1 - Calcular o fatorial de cada posição da matriz.");
        System.out.println("2 - Calcular a média dos valores da matriz.");
        System.out.println("3 - Calcular a soma dos valores da matriz.");
        System.out.println("4 - Calcular a soma do fatorial de cada posição de uma determinada linha da matriz.");
        System.out.println("5 - Calcular a quantidade de números pares na matriz.");
        System.out.println("6 - Calcular a quantidade de números primos na matriz.");
        System.out.println("7 - Ordernar linhas da matriz.");
        System.out.println("8 - Calcular a quantidade de números ímpares na matriz.");
        System.out.println("9 - Calcular a multiplicação dos valores de uma matriz.");
        System.out.println("10 - Calcular a média de uma linha de uma matriz.");
        System.out.println("PARA FINALIZAR O PROGRAMA DIGITE 0 E PRESSIONE ENTER.");

        int escolha = scanner.nextInt();

        while (escolha != 0) {
            if (escolha == 1) {
                metodos.calculaFatorial(matriz);
            } else  if (escolha == 2) {
                System.out.println(metodos.mediaDasPosicoes(matriz));
            } else if (escolha == 3) {
                System.out.println(metodos.somaDasPosicoes(matriz));
            } else if (escolha == 4) {
                System.out.println(metodos.somaDoFatorialDeUmaLinha(matriz));
            } else if (escolha == 5) {
                System.out.println(metodos.qtdPares(matriz));
            } else if (escolha == 6) {
                System.out.println(metodos.qtdPrimos(matriz));
            } else if (escolha == 7) {
                metodos.ordenarLinhas(matriz);
            } else if (escolha == 8) {
                System.out.println(metodos.qtdImpares(matriz));
            } else if (escolha == 9) {
                System.out.println(metodos.multiplicacaoDasPosicoes(matriz));
            } else if (escolha == 10) {
                System.out.println(metodos.mediaDeUmaLinha(matriz));
            }


            System.out.println();
            System.out.println("Essa foi a matriz que você digitou:");
            for(double[] posicoes: matriz) {
                System.out.println(Arrays.toString(posicoes));
            }
            System.out.println("\nDIGITE O NÚMERO DO MÉTODO QUE VOCÊ QUER UTILIZAR E PRESSIONE ENTER:");
            System.out.println("1 - Calcular o fatorial de cada posição da matriz.");
            System.out.println("2 - Calcular a média dos valores da matriz.");
            System.out.println("3 - Calcular a soma dos valores da matriz.");
            System.out.println("4 - Calcular a soma do fatorial de cada posição de uma determinada linha da matriz.");
            System.out.println("5 - Calcular a quantidade de números pares na matriz.");
            System.out.println("6 - Calcular a quantidade de números primos na matriz.");
            System.out.println("7 - Ordernar linhas da matriz.");
            System.out.println("8 - Calcular a quantidade de números ímpares na matriz.");
            System.out.println("9 - Calcular a multiplicação dos valores de uma matriz.");
            System.out.println("10 - Calcular a média de uma linha de uma matriz.");
            System.out.println("PARA FINALIZAR O PROGRAMA DIGITE 0 E PRESSIONE ENTER.");
            escolha = scanner.nextInt();

        }

        scanner.close();

    }
}