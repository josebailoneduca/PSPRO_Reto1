package tictactoc_sincronizadoGruposVersionB;
 

/**
 * Version de TicTacToc sincronizado con competicion entre hebras del mismo grupo.
 */
public class MainTicTacTocSincronizadoGruposVersionB {
	
	public static void main(String[] args) {
		System.out.println("Inicio de main TIC-TAC-TOC SICRONIZADO GRUPOS");
		
		//hebras que participaran
		Tic ti1 = new Tic(0);
		Tic ti2 = new Tic(1);
		Tac ta1 = new Tac(0);
		Tac ta2 = new Tac(1);
		Toc to1 = new Toc(0);
		Toc to2 = new Toc(1);
		
		//inclusion de las hebras en grupos 
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		ThreadGroup grupoToc = new ThreadGroup("grupoToc");
		
		Thread tic1=new Thread(grupoTic, ti1);
		Thread tic2=new Thread(grupoTic, ti2);
		Thread tac1=new Thread(grupoTac, ta1);
		Thread tac2=new Thread(grupoTac, ta2);
		Thread toc1=new Thread(grupoToc, to1);
		Thread toc2=new Thread(grupoToc, to2);
		
		//inicio de las hebras
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();
		toc1.start();
		toc2.start();
		
		System.out.println("Fin de main");
	}

}
