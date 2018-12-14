package projetofinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acabou = false;
        boolean achou = false;
        int numero = 0;
        int opcao = 0;
        ArrayList<Conta> contas = new ArrayList<>();
        do {
            System.out.println("1. Cadastrar uma Conta");
            System.out.println("2. Listar Todas as Contas");
            System.out.println("3. Efetuar Débito");
            System.out.println("4. Efetuar Crédito");
            System.out.println("5. Listar Lançamentos de uma conta");
            System.out.println("6. Sair");
            System.out.printf("Opção: ");
            try {
                opcao = input.nextInt();

                while (opcao < 0 || opcao > 7) {
                    System.out.println("Opção inválida!");
                    System.out.printf("Opção: ");
                    opcao = input.nextInt();
                }
            } catch (InputMismatchException ex) {
                System.err.println("Exceção: Formato da opção inválido.");
            }
            switch (opcao) {
                case 1: {
                    Conta c = new Conta();
                    c.criarConta();
                    contas.add(c);
                    break;
                }
                case 2: {
                    System.out.println();
                    for (Conta c : contas) {
                        System.out.println(c.toString());
                    }
                    break;
                }
                case 3: {
                    achou = false;
                    if (contas.isEmpty()) {
                        System.err.println("Não há contas cadastradas!");
                        break;
                    }
                    System.out.printf("Qual número da conta: ");
                    try {
                        numero = input.nextInt();
                    } catch (InputMismatchException ex) {
                        System.err.println("Exceção: Formato do número inválido.");
                    }
                    for (int i = 0; i < contas.size(); i++) {
                        Conta c = contas.get(i);
                        if (numero == c.getNumero()) {
                            achou = true;
                            try {
                                System.out.printf("Entre com valor debitado: ");
                                float valor = input.nextFloat();
                                if (contas.get(i).debito(valor)) {
                                    System.out.println();
                                    System.out.println("Valor debitado com sucesso!");
                                }
                                break;
                            } catch (InputMismatchException ex) {
                                System.out.println("Não foi possivel concluir a operação de débito.");
                                System.err.println("Exceção: Formato do valor inválido.");
                            }
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.printf("A conta %s não foi encontrada.\n", numero);
                    }
                    break;
                }
                case 4: {
                    achou = false;
                    if (contas.isEmpty()) {
                        System.err.println("Não há contas cadastradas!");
                        break;
                    }
                    System.out.printf("Qual número da conta: ");
                    try {
                        numero = input.nextInt();
                    } catch (InputMismatchException ex) {
                        System.err.println("Exceção: Formato do número inválido.");
                    }
                    for (int i = 0; i < contas.size(); i++) {
                        Conta c = contas.get(i);
                        if (numero == c.getNumero()) {
                            achou = true;
                            try {
                                System.out.printf("Entre com valor creditado: ");
                                float valor = input.nextFloat();
                                if (contas.get(i).credito(valor)) {
                                    System.out.println();
                                    System.out.println("Valor creditado com sucesso!");
                                } else {
                                    System.out.println("Não foi possivel concluir a operação de crédito.");
                                }
                                break;
                            } catch (InputMismatchException ex) {
                                System.err.println("Exceção: Formato do valor inválido.");
                            }
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.printf("A conta %s não foi encontrada.\n", numero);
                    }
                    break;
                }
                case 5: {
                    achou = false;
                    if (contas.isEmpty()) {
                        System.err.println("Não há contas cadastradas!");
                        break;
                    }
                    System.out.printf("Qual número da conta: ");
                    try {
                        numero = input.nextInt();
                    } catch (InputMismatchException ex) {
                        System.err.println("Exceção: Formato do número inválido.");
                    }
                    for (int i = 0; i < contas.size(); i++) {
                        Conta c = contas.get(i);
                        if (numero == c.getNumero()) {
                            achou = true;
                            c.listarOperacoes();
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.printf("A conta %s não foi encontrada.\n", numero);
                    }
                    break;
                }
                case 6: {
                    acabou = true;
                    System.out.println("Fim do programa!");
                    break;
                }
            }
            System.out.println();
            input.nextLine();
        } while (!acabou);
    }

}
