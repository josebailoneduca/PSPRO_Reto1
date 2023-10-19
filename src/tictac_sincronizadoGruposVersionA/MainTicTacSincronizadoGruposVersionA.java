package tictac_sincronizadoGruposVersionA;
 

/**
 * Sincronizacion con turnos estrictos establecidos mediante la clase Reloj.
 * Para ver una solucion en la que los hijos de cada grupo compiten entre si 
 * sin turnos estrictos ver la version: tictac_sincronizadoGruposVersionB
 */
public class MainTicTacSincronizadoGruposVersionA{
	
	public static void main(String[] args) {
		System.out.println("Inicio de main TIC-TAC SICRONIZADO GRUPOS");
		Tic tic = new Tic();
		Tac tac = new Tac();
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		Thread tic1=new Thread(grupoTic, tic, "Tic1");
		Thread tic2=new Thread(grupoTic, tic, "Tic2");
		Thread tac1=new Thread(grupoTac, tac, "Tac1");
		Thread tac2=new Thread(grupoTac, tac, "Tac2");
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();
		System.out.println("Fin de main");
	}

}
