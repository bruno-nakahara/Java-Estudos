package cursojava.executavel;

import javax.swing.JOptionPane;

public class primeiraClasseJava {
    
	/* main � um m�todo auto execut�vel em java */
	public static void main(String[] args) {
		
		
		String textos = JOptionPane.showInputDialog("Informe o n�mero do carro.");
		
		double carroNumero = Double.parseDouble(textos);
		
		double pre�oCarro = carroNumero * 20000;
		
		
		JOptionPane.showMessageDialog(null, "O pre�o do carro:(R$) " + pre�oCarro);
		
	}
}
