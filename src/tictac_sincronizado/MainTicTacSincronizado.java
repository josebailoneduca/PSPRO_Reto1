package tictac_sincronizado;

/**
 * Tic tac sincronizado mediante una variable en la clase Reloj que es accedida desde cada 
 * hilo para establecer el turno de trabajo
 */
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
