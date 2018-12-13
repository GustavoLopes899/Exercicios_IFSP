package projetofinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acabou = false;
        int opcao;
        ArrayList<Conta> contas = new ArrayList<>();
        do {
            System.out.println("1. Cadastrar uma Conta");
            System.out.println("2. Listar Todas as Contas");
            System.out.println("3. Efetuar Débito");
            System.out.println("4. Efetuar Crédito");
            System.out.println("5. Listar Lançamentos de uma conta");
            System.out.println("6. Sair");
            System.out.printf("Opção: ");
            opcao = input.nextInt();
            while (opcao < 0 || opcao > 7) {
                System.out.println("Opção inválida!");
                System.out.printf("Opção: ");
                opcao = input.nextInt();
            }
            switch (opcao) {

                case 1: {
                    Conta c = new Conta();
                    c.criarConta();
                    contas.add(c);
                    break;
                }
                case 2: {
                    for (Conta c : contas) {
                        System.out.println(c.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.printf("Qual número da conta: ");
                    int numero = input.nextInt();
                    for (int i = 0; i < contas.size(); i++) {
                        Conta c = new Conta();
                        if (numero == c.getNumero()) {
                            try {
                                System.out.printf("Entre com valor debitado: ");
                                float valor = input.nextFloat();
                                if (contas.get(i).debito(valor)) {
                                    System.out.println();
                                    System.out.println("Valor debitado com sucesso!");
                                }
                                System.out.println();
                                break;
                            } catch (InputMismatchException ex) {
                                System.err.println("Valor inválido!");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    if (contas.isEmpty()) {
                        System.err.println("Não há contas cadastradas!");
                        break;
                    }
                    System.out.printf("Qual número da conta: ");
                    int numero = input.nextInt();
                    for (int i = 0; i < contas.size(); i++) {
                        Conta c = new Conta();
                        if (numero == c.getNumero()) {
                            try {
                                System.out.printf("Entre com valor creditado: ");
                                float valor = input.nextFloat();
                                if (contas.get(i).credito(valor)) {
                                    System.out.println();
                                    System.out.println("Valor creditado com sucesso!");
                                } else {
                                    System.err.println("Operação não concluida!");
                                }
                                System.out.println();
                                break;
                            } catch (InputMismatchException ex) {
                                System.err.println("Valor inválido!");
                            }
                            break;
                        }
                    }
                    // adicionar caso não encontre a conta //
                    break;
                }
                case 5: {

                    break;
                }
                case 6: {
                    acabou = true;
                    break;
                }
            }

        } while (!acabou);
    }

}
