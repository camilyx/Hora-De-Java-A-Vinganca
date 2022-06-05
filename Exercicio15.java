//15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga 
//se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu)

import java.util.Scanner;
public class Exercicio15
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Em qual ano vc nasceu?");
	    int idade = entrada.nextInt();
	    
	    
	    if( idade > 2006){
	        System.out.println(" Vc ainda n pode votar esse ano ");
	        idade = entrada.nextInt();
	    }

         if( idade <= 2006){
	        System.out.println(" Vc pode votar esse ano!! ");
	        idade = entrada.nextInt();
	    }

	    entrada.close();
	}
}