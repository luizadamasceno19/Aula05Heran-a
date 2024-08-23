package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Object> lista = new ArrayList<>();
        
        System.out.println("Quantas contas deseja criar?");
        int numeroDeContas = scn.nextInt();
        scn.nextLine();
        
        for (int i = 0; i < numeroDeContas; i++) {
            System.out.println("Informe o nome do titular da conta " + (i + 1) + ": ");
            String titular = scn.nextLine();
            
            System.out.println("Informe o número da conta " + (i + 1) + ": ");
            int numeroConta = scn.nextInt();
            
            System.out.println("Informe o saldo atual da conta " + (i + 1) + ": ");
            double saldo = scn.nextDouble();
            
            System.out.println("Escolha o tipo de conta (1 para Corrente, 2 para Poupança): ");
            int tipoConta = scn.nextInt();
            scn.nextLine();
            
 
            if (tipoConta == 1) {
                System.out.println("Informe o limite da conta corrente: ");
                double limite = scn.nextDouble();
                scn.nextLine();
                ContaCorrente conta = new ContaCorrente(limite, saldo, titular, numeroConta);
                lista.add(conta);
            } else {
            	ContaPoupanca conta = new ContaPoupanca(saldo, titular, numeroConta);
            	lista.add(conta);
            }
            
            
        }
        
        System.out.println("\nInformações das contas criadas:");
        for (Object conta : lista) {
            System.out.println(conta);
        }
        
        scn.close();
    }
}
