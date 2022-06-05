//13 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre,
// calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! 
//somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas)

import java.util.Scanner;
public class Exercicio13
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println(" Informe uma nota ");
	    double nota1 = entrada.nextDouble();
	    System.out.println(" Informe outra nota ");
	    double nota2 = entrada.nextDouble();
        System.out.println(" Informa outra nota!!!!! ");
	    double nota3 = entrada.nextDouble();
        System.out.println(" Informe mais uma ");
	    double nota4 = entrada.nextDouble();

        double media  = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    if(media > 6.0 ){
	        System.out.println(" Parabéns, voce foi aprovado! ");
	        nota1 = entrada.nextDouble();
	    }

        if(media < 6.0 ){
	        System.out.println(" Meh, voce foi reprovado ");
	        nota1 = entrada.nextDouble();
	    }


	    entrada.close();
	}
}