package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //DECLARAÇÃO DA VARIÁVEL DA QUANTIDADE DE NUMEROS QUE SERÁ INSERIDO PELO USUÁRIO
        int n;

        //METÓDO PARA CHECAR SE O NUMERO INSERIDO PELO USUÁRIO É INTEIRO
        while (true) {
            System.out.println("Digite quantos números inteiros você irá inserir");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            }
            else {
                System.out.println("O número digitado não é inteiro.");
                System.out.println("Por favor, digite a quantidade de números inteiros que você irá inserir: ");
                sc.next();
            }
        }

        //DECLARAÇÃO E INICIALIZAÇÃO DO VETOR
        int[] vect = new int[n];

        //INSERÇÃO PELO USUÁRIO DOS NUMEROS COM A CHECAGEM SE OS NUMEROS SAO INTEIROS E PAR
        for(int i=0; i< vect.length; i++) {
            while (true) {
                System.out.println("Digite um número: ");

                if (sc.hasNextInt()) {
                    vect[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("O número digitado não é inteiro.");
                    System.out.println("Digite um número inteiro: ");
                    sc.next();
                }
            }
        }

        //IMPRESSÃO NA TELA DOS NÚMEROS PARES QUE FORAM INSERIDOS PELO USUÁRIO
        System.out.println("NÚMEROS PARES: ");

        //CONTAGEM NUMEROS INTEIROS PARES INSERIDOS PELO USUÁRIO E IMPRESSÃO DELES
        int countPairs = 0;
        for (int i=0; i< vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf(vect[i] + " ");
                countPairs++;

            }
        }

        //IMPRESSÃO DA QUANTIDADE DE NUMEROS PARES INSERIDOS PELO USUARIO
        System.out.println("QUANTIDADE DE PARES = " + countPairs);

        sc.close();
    }
}
