package somadora.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class somar {
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;
	
	public somar(
			JTextField txtValor1,
			JTextField txtValor2,
			JTextField txtResultado
			) {
		
		this.txtValor1 = txtValor1;
		this.txtValor2 = txtValor2;
		this.txtResultado = txtResultado;
	}
	public ActionListener Somar() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				float Valor1 = Float.parseFloat( txtValor1.getText());
				float Valor2 = Float.parseFloat( txtValor2.getText());
				float soma = (Valor1 + Valor2);
				String result = String.valueOf(soma);
				txtResultado.setText(result);
			}

		};
	}
	
	
	
	
}
