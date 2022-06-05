//1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". 
//Então escreva em tela o maior deles.

import java.util.Scanner;
public class Exercicio1
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();

        if(num1 > num2 ){
	        System.out.println(" O maior numero eh " + num1);
	    }

         if(num2 > num1 ){
	        System.out.println(" O maior numero eh " + num2);
	    }

        entrada.close();
	}
}