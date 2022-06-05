//19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo 
//Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE

import java.util.Scanner;
public class Exercicio19
{
	public static void main(String[] args) {

	    Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o numero de gols marcados pelo Gremio: ");
            int gremio = entrada.nextInt();
            System.out.println("Digite o numero de gols marcados pelo Inter: ");
            int inter = entrada.nextInt();

            if (gremio > inter) {
             System.out.println(" Gremio ganhou a partida");
            }

            if (inter > gremio) {
            System.out.println( "Inter ganhou a partida");
            }

            if (inter == gremio) {
            System.out.println(" empate kk ");
            }

            entrada.close();
	}
}