package somadora.main;
import javax.swing.*;

import somadora.main.somar;

public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8662630029645406892L;

	JLabel lblTitulo, lblValor1, lblValor2, lblResultado ;
	JTextField txtValor1, txtValor2, txtResultado;
	JButton btnSomar;
	
	public Main () {
		setTitle("Somador");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lblTitulo = new JLabel("Somador");
		lblTitulo.setBounds(200, 10, 200, 30);
		add(lblTitulo);
		
		lblValor1 = new JLabel("Digite o primeiro valor: ");
		lblValor1.setBounds(30, 50, 200, 25);
		add(lblValor1);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(200, 50, 200, 25);
		add(txtValor1);
		
		lblValor2 = new JLabel("Digite o segundo valor: ");
		lblValor2.setBounds(30, 90, 200, 25);
		add(lblValor2);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(200, 90, 200, 25);
		add(txtValor2);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(30, 130, 200, 25);
		add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(200, 130, 200, 25);
		add(txtResultado);
		
		btnSomar = new JButton("Somar");
		btnSomar.setBounds(130, 220, 200, 30);
		add(btnSomar);
	
	 somar somador = new somar(
	         txtValor1,
	         txtValor2,
	         txtResultado
	 );

	btnSomar.addActionListener(somador.Somar());
	
}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main tela = new Main();
		
		tela.setVisible(true);
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	

}