package tictac_sincronizadoGruposVersionB;
 

public class MainTicTacSincronizadoGruposVersionB {
	
	public static void main(String[] args) {
		System.out.println("Inicio de main TIC-TAC SICRONIZADO GRUPOS");
		Tic ti1 = new Tic(0);
		Tic ti2 = new Tic(1);
		Tac ta1 = new Tac(0);
		Tac ta2 = new Tac(1);
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		Thread tic1=new Thread(grupoTic, ti1);
		Thread tic2=new Thread(grupoTic, ti2);
		Thread tac1=new Thread(grupoTac, ta1);
		Thread tac2=new Thread(grupoTac, ta2);
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();
		System.out.println("Fin de main");
	}

}
