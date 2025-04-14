package view;
import javax.swing.JOptionPane;

import controller.DgtController;

public class main {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int res = DgtController.RecursividadeDigitos(num,0);
		JOptionPane.showMessageDialog(null, res);
	}
}
