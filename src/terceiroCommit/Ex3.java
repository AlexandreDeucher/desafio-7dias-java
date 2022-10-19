package terceiroCommit;
/**
 * @author Alexandre Deucher
 * @date	18/10/2022
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {

		teste();
	}
		//metodo
		public static Integer teste() {
		
		String operador;
		
		operador = JOptionPane.showInputDialog("escreva um operador");
		
		//Le o primeiro numero
		String n1 = JOptionPane.showInputDialog("escreva um numero");
		
		
		//Le o segundo numero
		String n2 = JOptionPane.showInputDialog("escreva um numero");
		
		//conversões de tipo
		Integer numero1 = Integer.valueOf(n1);
		Integer numero2 = Integer.valueOf(n2);
		
		//inicializando a variavel 
		Integer calc = 0;
		
			/**
			 * condições para ver se o programa vai somar, diminuir, multiplicar ou dividr
			 */
			if(operador.equals("+")) {
				calc=numero1+numero2;
				
			}else if(operador.equals("-")) {
				calc=numero1-numero2;
				
			}else if(operador.equals("*")) {
				calc=numero1*numero2;
				
			}else if(operador.equals("/")) {
				calc=numero1/numero2;
			}
			
			
			JOptionPane.showMessageDialog(null,calc);
			return calc;
	}
		
		
		

}