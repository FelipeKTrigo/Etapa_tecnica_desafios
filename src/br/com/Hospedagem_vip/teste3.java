package br.com.Hospedagem_vip;

import java.util.Scanner;

public class teste3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("o valor da Hospedagem comum é esse");
        Hospedagem hc = new Hospedagem();
        hc.printValor();
        System.out.println("o valor da Hospedagem VIP é esse");
        Hospedagem hVIP = new HospedagemVip();
        hVIP.printValor();

        System.out.println("a diferença entre eles é igual a " + (((HospedagemVip) hVIP).valorVIP - hc.valor ));
    }
}
