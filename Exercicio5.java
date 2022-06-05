//5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir:
// ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
// ‘Segundo maior’, caso o segundo seja maior que o primeiro

import java.util.Scanner;
public class Exercicio5
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
    

        if(num1 == num2 ){
	        System.out.println(" Os numeros sao iguais ");
	    }

         if(num1 > num2){
	        System.out.println(" O primeiro numero eh maior ");
	    }

        if(num2 > num1 ){
	        System.out.println(" O segundo numero eh maior ");
	    }

        entrada.close();
	}
}