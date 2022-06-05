//17 - Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
//A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens:
// "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida

import java.util.Scanner;
public class Exercicio16
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Qual a senha?");
	    int senha = entrada.nextInt();
	    
	    
	    if( senha == 1234){
	        System.out.println(" Acesso permitido ");
	        senha = entrada.nextInt();
	    }

         if( senha != 1234){
	        System.out.println(" Acesso negado ");
	        senha = entrada.nextInt();
	    }

	    entrada.close();
	}
}