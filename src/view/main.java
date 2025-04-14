package view;
import javax.swing.JOptionPane;

import controller.DgtController;

public class main {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		if (num<0) {
			num = num * -1;
		}
		int res = DgtController.RecursividadeDigitos(num,0);
		JOptionPane.showMessageDialog(null, res);
	}
}
