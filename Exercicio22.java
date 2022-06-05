//22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 
//e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas 
//que deseja pagar e exiba o valor de cada parcela.

import java.util.Scanner;
public class Exercicio22
{
	public static void main(String[] args) {

	    Scanner entrada = new Scanner(System.in);
            System.out.println(" O capacete de tartaruga custa 18.230, em quantas parcelas vc deseja pagar? ");
            int parcelas = entrada.nextInt();
            double conta = (18.230 * parcelas);

             System.out.println(" O valor das parcelas vai ficar em : " + conta );
            entrada.close();
	}
}