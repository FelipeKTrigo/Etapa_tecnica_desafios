package br.com.salarios_e_bonificacoes;

import java.util.Scanner;

public class teste2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        double count = 0;
        System.out.println("se voce deseja ser um gerente aperte 1," +
                " se você deseja ser um supervisor aperte 2," +
                " se você deseja ser um vendedor aperte 3");
        count = sc.nextDouble();
        if(count == 1) {
            System.out.println("informe o nome do gerente");
            Funcionario g = new Gerente();
            g.nome = sc.next();
            System.out.println("informe a sua idade sr." + g.nome);
            g.idade = sc.nextInt();
            System.out.println("informe seu salario");
            g.salario = sc.nextDouble();
            System.out.println("essa será sua bonificação " + g.bonificacao());
        }else if(count == 2) {
            Funcionario s = new supervisor();
            System.out.println("informe o nome do supervisor");
            s.nome = sc.next();
            System.out.println("informe a sua idade sr." + s.nome);
            s.idade = sc.nextInt();
            System.out.println("informe seu salario");
            s.salario = sc.nextDouble();
            System.out.println("essa será sua bonificação " + s.bonificacao());
        }else if(count == 3) {
            Funcionario v = new Vendedor();
            System.out.println("informe o nome do vendedor");
            v.nome = sc.next();
            System.out.println("informe a sua idade sr." + v.nome);
            v.idade = sc.nextInt();
            System.out.println("informe seu salario");
            v.salario = sc.nextDouble();
            System.out.println("essa será sua bonificação " + v.bonificacao());
        }else if(count >= 4){
            System.out.println("ops opção invalida");
        }
    }
}
