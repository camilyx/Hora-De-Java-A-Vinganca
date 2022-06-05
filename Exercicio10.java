//10. Escreva um programa que calcule a média de quatro números informados pelo usuário,
// mas somente se esses números forem maiores que 0 e menores que 10. No final, 
//se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". 
//Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

import java.util.Scanner;
public class Exercicio10
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

        System.out.println(" Insira numeros de 0 a 10 ");

        System.out.println("Digite um numero");
	    int num1 = entrada.nextInt();
	    System.out.println("Digite um numero");
	    int num2 = entrada.nextInt();
        System.out.println("Digite um numero");
	    int num3 = entrada.nextInt();
	    System.out.println("Digite um numero");
	    int num4 = entrada.nextInt();

        int zero = 0;

            if (num1 < 10 && num1 > 0) {
                System.out.println(num1);
                
            }
            else if (num1 > 10 || num1 < 0) {
                System.out.println(zero);
            }
            

             if (num2 < 10 && num2 > 0) {
                System.out.println(num2);
                
            }
            else if (num2 > 10 || num2 < 0) {
                System.out.println(zero);
            }


           if (num3 < 10 && num3 > 0) {
                System.out.println(num2);
                
            }
            else if (num3 > 10 || num3 < 0) {
                System.out.println(zero);
            }

            if (num4 < 10 && num4 > 0) {
                System.out.println(num2);
                
            }
            else if (num4 > 10 || num4 < 0) {
                System.out.println(zero);
            }

            if (((num1+num2+num3+num4) / 4) >= 5) {
                System.out.println("vc passou no teste");
            }

            if (((num1+num2+num3+num4) / 4) < 5) {
               System.out.println("tente novamente");
            }
         

        entrada.close();
	}
}