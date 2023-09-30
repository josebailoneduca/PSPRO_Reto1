package tictac_sincronizadoGrupos;

import tictac_sincronizado.Tac;
import tictac_sincronizado.Tic;

public class MainTicTacSincronizadoGrupos {
	
	public static void main(String[] args) {
		System.out.println("Inicio de main TIC-TAC SICRONIZADO GRUPOS");
		Tic tic = new Tic();
		Tac tac = new Tac();
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		Thread tic1=new Thread(grupoTic, tic, "Tick1");
		Thread tic2=new Thread(grupoTic, tic, "Tick2");
		Thread tac1=new Thread(grupoTac, tac, "Tack1");
		Thread tac2=new Thread(grupoTac, tac, "Tack2");
		tic.start();
		tac.start();
		System.out.println("Fin de main");
	}

}
