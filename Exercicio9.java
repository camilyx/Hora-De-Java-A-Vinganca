//9. Faça um programa que leia 6 números que o usuário vai informar. 
//Todos os números lidos com valor inferior a 72 devem ser somados. 
//Escreva o valor final da soma efetuada e também todos valores que o usuário informou

import java.util.Scanner;
public class Exercicio9
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
	    int num1 = entrada.nextInt();
	    System.out.println("Digite um numero");
	    int num2 = entrada.nextInt();
        System.out.println("Digite um numero");
	    int num3 = entrada.nextInt();
	    System.out.println("Digite um numero");
	    int num4 = entrada.nextInt();
        System.out.println("Digite um numero");
	    int num5 = entrada.nextInt();
	    System.out.println("Digite um numero");
	    int num6 = entrada.nextInt();

        int zero = 0;

        System.out.println("Os numeros informados foram:" + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6);
    

        if(num1 < 72 ){
	        System.out.println(num1);
	    }
        if (num1 > 72) {
            System.out.println(zero);
        }

         if(num2 < 72 ){
	        System.out.println(num2);
	    }
        if (num2 > 72) {
            System.out.println(zero);
        }

        if(num3 > 72 ){
	        System.out.println(num3);
	    }
        if (num3 < 72) {
            System.out.println(zero);
        }

         if(num4 > 72 ){
	        System.out.println(num4);
	    }
        if (num4 < 72) {
            System.out.println(zero);
        }

         if(num5 > 72 ){
	        System.out.println(num5);
	    }
        if (num5 < 72) {
            System.out.println(zero);
        }

         if(num6 > 72 ){
	        System.out.println(num6);
	    }
        if (num6 < 72) {
            System.out.println(zero);
        }

        int soma = num1 + num2 + num3 + num4 + num5 + num6;

        System.out.println(" A soma de todos os numeros eh: " + soma);
         

        entrada.close();
	}
}