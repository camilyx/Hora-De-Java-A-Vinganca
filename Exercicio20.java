//20 - Escreva um programa para ler o número de lados de um poligono regular e a medida do lado (em cm).
//Calcular e imprimir o seguinte: 
//Se o numero de lados for igual a 3 escrever TRIANGULO e o valor do seu perímetro. 
//Se o numero de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//Se o numero de lados for igual a 5 escrever PENTAGONO. 
//Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 
//Caso o numero de lados seja inferior a 3 escrever NAO É UM POLIGONO. 
//Caso o número de lados seja superior a 5 escrever POLIGONO NAO IDENTIFICADO


import java.util.Scanner;
public class Exercicio20
{
	public static void main(String[] args) {

	    Scanner entrada = new Scanner(System.in);
            System.out.println("Escreva o numero de lados de um poligono regular ");
            int lados = entrada.nextInt();
            
            if (lados == 3) {
             System.out.println(" Isso eh um triangulo");
            }

            if (lados == 4) {
             System.out.println(" Isso eh um quadrado");
            }

            if (lados == 5) {
             System.out.println(" Isso eh um pentagono");
            }

            if (lados < 3) {
             System.out.println(" Nao eh um poligono");
            }

            if (lados < 3) {
             System.out.println(" Poligono nao identificado");
            }

            entrada.close();
	}
}