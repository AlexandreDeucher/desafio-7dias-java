package quartoCommit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtN2;
	private JButton Subtração;
	private JButton Multiplicação;
	private JButton Divisão;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 frame = new Ex4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN = new JTextField();
		txtN.setBounds(87, 11, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(87, 41, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JButton Soma = new JButton("+");
		Soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										

				String txt=txtN.getText();
				String txt2=txtN2.getText();
				
				if(!txt.isEmpty() && !txt2.isEmpty()) {
					Double n1=Double.valueOf(txt);
					Double n2=Double.valueOf(txt2);
					JOptionPane.showMessageDialog(null,"resultado da soma é: "+(n1+n2));
				}
				
			}

		});
		Soma.setBounds(30, 72, 41, 23);
		contentPane.add(Soma);
		
		Subtração = new JButton("-");
		Subtração.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt=txtN.getText();
				String txt2=txtN2.getText();
				
				if(!txt.isEmpty() && !txt2.isEmpty()) {
					Double n1=Double.valueOf(txt);
					Double n2=Double.valueOf(txt2);
					JOptionPane.showMessageDialog(null,"resultado da subtração é : "+(n1-n2));
				}
			}
		});
		Subtração.setBounds(81, 72, 41, 23);
		contentPane.add(Subtração);
		//
		
		Multiplicação = new JButton("*");
		Multiplicação.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt=txtN.getText();
				String txt2=txtN2.getText();
				
				if(!txt.isEmpty() && !txt2.isEmpty()) {
					Double n1=Double.valueOf(txt);
					Double n2=Double.valueOf(txt2);
					JOptionPane.showMessageDialog(null,"resultado da multiplicação é : "+n1 * n2);
				}
			}
		});
		Multiplicação.setBounds(132, 72, 41, 23);
		contentPane.add(Multiplicação);
		
		Divisão = new JButton("/");
		Divisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt=txtN.getText();
				String txt2=txtN2.getText();
				
				if(!txt.isEmpty() && !txt2.isEmpty()) {
					Double n1=Double.valueOf(txt);
					Double n2=Double.valueOf(txt2);
					JOptionPane.showMessageDialog(null,"resultado da divisao é : "+n1 / n2);
				}
				
			}
		});
		Divisão.setBounds(183, 72, 41, 23);
		contentPane.add(Divisão);
	}
}

			