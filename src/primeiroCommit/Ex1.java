package primeiroCommit;

/**
 * @author Alexandre Deucher 
 * @date 16/10/2022
 * @version 1.0
 * 
 */

import javax.swing.JOptionPane;

public class Ex1 {
	public static void main(String[] args) {
		//Chamado do metodo no Main
		maxmin(0);

	}
	//Metodo
	public static void maxmin(Integer maxmin) {

		// declara��o de vetor.
		Integer[] vet = new Integer[6];

		Integer maior = Integer.MIN_VALUE;

		Integer menor = Integer.MAX_VALUE;

		// for array.
		for (int i = 0; i < vet.length; i++) {

			// declara��o da variavel lida
			String numero = JOptionPane.showInputDialog("Digite um numero");

			// convers�o de tipo
			Integer n = Integer.valueOf(numero);

			vet[i] = n;

			//indentifica��o de maior e menor
			if (n > maior) {
				maior = vet[i];
			}
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		//leitura de dados maior menor
		JOptionPane.showMessageDialog(null, "maior = " + maior + " menor = " + menor);

	}
}
