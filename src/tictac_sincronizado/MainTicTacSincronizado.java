package tictac_sincronizado;

public class MainTicTacSincronizado {
	
	public static void main(String[] args) {
		System.out.println("Inicio de main");
		Tic tic = new Tic();
		Tac tac = new Tac();
		tic.start();
		tac.start();
		System.out.println("Fin de main");
	}

}
