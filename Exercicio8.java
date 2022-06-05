//8. Faça um programa que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos

import java.util.Scanner;
public class Exercicio8
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num3 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num4 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num5 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num6 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num7 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num8 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num9 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num10 = entrada.nextDouble();
	    
        double soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
	  
	        System.out.println(" A soma de todos os numeros eh: " + soma );
	        num1 = entrada.nextDouble();

	    entrada.close();
	}
}