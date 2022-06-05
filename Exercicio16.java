//16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas 
//(considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra

import java.util.Scanner;
public class Exercicio16
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Quantas maças vc deseja comprar?");
	    int maças = entrada.nextInt();
	    
	    
	    if( maças > 12){
	        System.out.println(" Cada maça ficou 0.25 ");
	        maças = entrada.nextInt();
	    }

         if( maça < 12){
	        System.out.println(" Cada maça ficou 0,30 ");
	        maças = entrada.nextInt();
	    }

	    entrada.close();
	}
}