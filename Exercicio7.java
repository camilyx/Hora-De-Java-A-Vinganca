//7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
// o último e o maior de todos eles (considere que todos os números informados serão diferentes)

import java.util.Scanner;
public class Exercicio7
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
    

        if(num1 > num2 && num1 > num3 && num1 > num4 ){
	        System.out.println(num1 + "," + num4 + "," + num1);
	    }

         if(num2 > num1 && num2 > num3 && num2 > num4){
	        System.out.println(num1 + "," + num4 +  "," + num2);
	    }

        if(num3 > num1 && num3 > num2 && num3 > num4){
	        System.out.println(num1 + "," + num4 + "," + num3);
	    }

        if(num4 > num1 && num4 > num2 && num4 > num3){
	        System.out.println(num1 + "," + num4 + "," + num4);
	    }

        entrada.close();
	}
}