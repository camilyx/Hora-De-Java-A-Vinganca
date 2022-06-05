//4. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) 
//e escrever a soma dos 2 maiores.

import java.util.Scanner;
public class Exercicio4
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num3 = entrada.nextDouble();
	    
	    if(num1 > num2 && num3 > num2 ){
            double soma = num1 + num3;
	        System.out.println(" A soma dos dois maiores numeros sao: " + soma );
	        num1 = entrada.nextDouble();
	    }

         else if(num1 > num3 && num2 > num3 ){
            double soma2 = num1 + num2;
	        System.out.println(" A soma dos dois maiores numeros sao: " + soma2 );
	        num2 = entrada.nextDouble();
	    }

         else if(num2 > num3 && num3 > num1 ){
            double soma3 = num2 + num3;
	        System.out.println(" A soma dos dois maiores numeros sao: " + soma3 );
	        num3 = entrada.nextDouble();
	    }

	    entrada.close();
	}
}