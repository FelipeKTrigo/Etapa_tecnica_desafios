package br.com.salarios_e_bonificacoes;

public class Gerente extends Funcionario{

    @Override
    public Double bonificacao() {
        return this.salario + 10000.00;
    }
}
