package tictac_sincronizadoGruposVersionA;
 

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
