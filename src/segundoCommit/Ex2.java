package segundoCommit;
/**
 * @author Alexandre Deucher
 * @date	17/10/2022
 * @version 1.0
 */
import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		comparação();
	}		
	
	public static void comparação() {
		String numero1=JOptionPane.showInputDialog("escreva um numero");
		String numero2=JOptionPane.showInputDialog("escreva um numero");
		
		Integer n1=Integer.valueOf(numero1);
		Integer n2=Integer.valueOf(numero2);
		
		if(n1>n2) {
			JOptionPane.showMessageDialog(null, (n1+n2));
		}if(n1<n2) {
			JOptionPane.showMessageDialog(null, (n2-n1));
		}
	}
		

}



