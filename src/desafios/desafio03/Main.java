package desafios.desafio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Cadastrar Uchiha");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Sair");
            System.out.println("========================");

            System.out.print("Escolha uma opção: ");
            int choice = input.nextInt();
            input.nextLine(); // consumindo o \n do buffer

            switch (choice) {
                case 1:
                    insertNinja("NINJA");
                    break;
                case 2:
                    insertNinja("UCHIHA");
                    break;
                case 3:
                    listAllNinjas();
                    break;
                case 4:
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

    public static void insertNinja(String typeOfNinja) {
        System.out.println("========================");
        System.out.print("Digite o nome do ninja: ");
        String ninjaName = input.nextLine();

        System.out.println("========================");
        System.out.print("Digite a idade do ninja: ");
        int ninjaAge = input.nextInt();
        input.nextLine(); // consumindo o \n do buffer

        System.out.println("========================");
        System.out.print("Digite a missão do ninja: ");
        String ninjaMission = input.nextLine();

        System.out.println("========================");
        System.out.print("Digite o nível da missão do ninja: ");
        String ninjaMissionLevel = input.nextLine();

        System.out.println("========================");
        System.out.print("Digite o status da missão do ninja: ");
        String ninjaMissionStatus = input.nextLine();

        if (typeOfNinja.equals("NINJA")) {
            ninjas.add(new Ninja(ninjaName, ninjaAge, ninjaMission, ninjaMissionLevel, ninjaMissionStatus));
        } else {
            System.out.println("========================");
            System.out.print("Digite a habilidade do ninja: ");
            String ninjaHability = input.nextLine();
            delay(1);
            limpar();

            ninjas.add(new Uchiha(ninjaName, ninjaAge, ninjaMission, ninjaMissionLevel, ninjaMissionStatus, ninjaHability));
        }
        delay(1);
        limpar();

        System.out.println("========================");
        System.out.println("Ninja inserido com sucesso");
        System.out.println("========================");

        delay(2);
        limpar();
    }

    public static void listAllNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("========================");
            System.out.println("Não há nenhum ninja a ser listado");
            System.out.println("========================");
            delay(2);
            limpar();
            return;
        }

        System.out.println("========================");
        for (int i = 0; i < ninjas.size(); i++) {
            ninjas.get(i).showNinja();
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
