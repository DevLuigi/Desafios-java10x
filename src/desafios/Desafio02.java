package desafios;

import java.util.Scanner;

public class Desafio02 {
    static int insertedNinjas = 0;
    static String[] ninjas = new String[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("========================");

            System.out.print("Escolha uma opção: ");
            int choice = input.nextInt();
            input.nextLine(); // consumindo o \n do buffer

            switch (choice) {
                case 1:
                    insertNinja();
                    break;
                case 2:
                    listAllNinjas();
                    break;
                case 3:
                    limpar();
                    System.out.println("========================");
                    System.out.println("Programa encerrado! Até breve :D");
                    System.out.println("========================");
                    isRunning = false;
                    break;
                default:
                    limpar();
                    System.out.println("========================");
                    System.out.println("Opção inválida, escolha novamente...");
                    System.out.println("========================");
                    delay(2);
                    limpar();
            }
        }
    }

    public static void insertNinja() {
        if (insertedNinjas >= 10) {
            System.out.println("========================");
            System.out.println("Limite máximo de ninjas atingido");
            System.out.println("========================");
            delay(2);
            limpar();
            return;
        }

        System.out.println("========================");
        System.out.print("Digite o nome do ninja: ");

        String ninjaName = input.nextLine();
        ninjas[insertedNinjas] = ninjaName;
        insertedNinjas++;

        System.out.println("========================");
        System.out.println("Ninja inserido com sucesso");
        System.out.println("========================");
        delay(2);
        limpar();
    }

    public static void listAllNinjas() {
        if (insertedNinjas == 0) {
            System.out.println("========================");
            System.out.println("Não há nenhum ninja a ser listado");
            System.out.println("========================");
            delay(2);
            limpar();
            return;
        }

        System.out.println("========================");
        for (int i = 0; i < insertedNinjas; i++) {
            System.out.println("Ninja " + (i + 1) + ": " + ninjas[i]);
        }
        System.out.println("========================");
        delay(8);
        limpar();
    }

    public static void limpar() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    public static void delay(int segundos) {
        try {
            Thread.sleep(segundos * 1000L); // pausa em milissegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
