package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVector {
	
	public static void main(String[] args) {
		
		String position = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		
		double[] scores = new double[Integer.parseInt(position)];
		double[] scoreApproved = {8.5, 9, 7.8, 7.2};
		double[] scoreRetake = {4, 8, 6.5, 6};
		double[] scoreFailed = {4.2, 5, 3.8, 2.8};
		
		for (int pos = 0; pos < scores.length; pos++) {
			String value = JOptionPane.showInputDialog("Qual o valor da posição " + (pos + 1) + "?");
			scores[pos] = Double.valueOf(value);
		}
		
		for (int pos = 0; pos < scores.length; pos++) {
			System.out.println(scores[pos]);
		}
		
	}
}
