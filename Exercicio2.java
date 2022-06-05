//2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, 
//negativo ou zero

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		if (num > 0){
			System.out.println("Maior que zero");
		} else if (num < 0 ) {
			System.out.println("Menor que zero");
		} else {
			System.out.println("é igual a zero");
		}
		
		entrada.close();
	}
}