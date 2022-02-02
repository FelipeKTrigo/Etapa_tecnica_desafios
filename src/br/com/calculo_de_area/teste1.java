package br.com.calculo_de_area;

import java.util.Scanner;

public class teste1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("para calcular a area do quadrado insira o comprimento do lado");
        double lado = sc.nextDouble();
        quadrado q = new quadrado(lado);
        System.out.println(q.calculaarea());

        System.out.println("para calcular a area do circulo insira o comprimento do raio");
        double raio = sc.nextDouble();
        circulo c = new circulo(raio);
        System.out.println(c.calculaarea());

        //apos colocar a altura de um enter e coloque a largura
        System.out.println("para calcular a area do retangulo insira o comprimento da altura e largura");
        double altura = sc.nextDouble();
        double largura = sc.nextDouble();
        retangulo re = new retangulo(largura, altura);
        System.out.println(q.calculaarea());


    }
}
