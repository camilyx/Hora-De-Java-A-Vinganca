//18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) 
//de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:

import java.util.Scanner;
public class Exercicio18
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	System.out.println(" Digite 1 para feminino e 2 para masculino " );
    int sexo = entrada.nextInt();
    System.out.println(" Digite a sua altura: " );
    double altura = entrada.nextDouble(); 

    int mulher = 1;
    int homem = 2;
       
        
        if (sexo == 1) {
            System.out.println("O peso ideal para voce eh: " + ((72.7 * altura) - 58) + "Kg" ); 
        
        }

        if (sexo == 2) {
            System.out.println("O peso ideal para voce eh: " + ((72.7 * altura) - 58) + "Kg"); 
        
        }
	    entrada.close();
	}
}