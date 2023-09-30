package tictac_sincronizado;

public class MainTicTacSincronizado {
	
	public static void main(String[] args) {
		Tic tic = new Tic();
		Tac tac = new Tac();
		tic.start();
		tac.start();
	}

}
