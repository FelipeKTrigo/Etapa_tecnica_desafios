package br.com.salarios_e_bonificacoes;

public class Vendedor extends Funcionario{

    @Override
    public Double bonificacao() {
        return this.salario + 3000.00;
    }
}
