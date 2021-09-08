package cursojava.executavel;

import javax.swing.JOptionPane;

public class primeiraClasseJava {
    
	/* main é um método auto executável em java */
	public static void main(String[] args) {
		
		
		String textos = JOptionPane.showInputDialog("Informe o número do carro.");
		
		double carroNumero = Double.parseDouble(textos);
		
		double preçoCarro = carroNumero * 20000;
		
		
		JOptionPane.showMessageDialog(null, "O preço do carro:(R$) " + preçoCarro);
		
	}
}
