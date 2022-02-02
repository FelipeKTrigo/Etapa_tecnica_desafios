package br.com.salarios_e_bonificacoes;

public class supervisor extends Funcionario{

    @Override
    public Double bonificacao() {
        return this.salario + 5000.00;
    }

}
