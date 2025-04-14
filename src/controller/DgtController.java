package controller;

public class DgtController {
	public DgtController() {
		// TODO Auto-generated constructor stub
	}
	
	public static int RecursividadeDigitos(int num, int cont) {
		if (num < 10) {
			cont++;
			return cont;
		}
		else {
			num = num/10;
			cont++;
			return RecursividadeDigitos(num,cont);
		}
	}
}
