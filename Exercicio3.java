//3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
// e escrever o maior deles

import java.util.Scanner;
public class Exercicio3
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
	    double num1 = entrada.nextDouble();
	    System.out.println("Digite um numero");
	    double num2 = entrada.nextDouble();
        System.out.println("Digite um numero");
	    double num3 = entrada.nextDouble();

        if(num1 > num2 && num1 > num3 ){
	        System.out.println(" O maior numero eh " + num1);
	    }

         if(num2 > num1 && num2 > num3){
	        System.out.println(" O maior numero eh " + num2);
	    }

        if(num3 > num1 && num3 > num2 ){
	        System.out.println(" O maior numero eh " + num3);
	    }

        entrada.close();
	}
}