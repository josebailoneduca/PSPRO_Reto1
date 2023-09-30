package tictactoc_sincronizadoGrupos;
 
/**
 * Clase inicio del programa. 
 * 
 * Genera una salida ordenada TIC, TAC, TOC a partir de varios hilos agrupados segun lo que imprime.
 * 
 */
public class MainTicTacTocSincronizadoGrupos {
	
	public static void main(String[] args) {
		System.out.println("Inicio de main TIC-TAC-TOC EN GRUPOS SICRONIZADO");
		//Runables
		Tic tic = new Tic();
		Tac tac = new Tac();
		Toc toc = new Toc();
		
		//grupos de hilos
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		ThreadGroup grupoToc = new ThreadGroup("grupoToc");
		
		//hilos
		Thread tic1=new Thread(grupoTic, tic, "Tic1");
		Thread tic2=new Thread(grupoTic, tic, "Tic2");
		Thread tac1=new Thread(grupoTac, tac, "Tac1");
		Thread tac2=new Thread(grupoTac, tac, "Tac2");
		Thread toc1=new Thread(grupoToc, toc, "Toc1");
		Thread toc2=new Thread(grupoToc, toc, "Toc2");
		Thread toc3=new Thread(grupoToc, toc, "Toc3");
		
		//registrar los grupos en el sincronizador
		Sincronizador.registrarGrupo(grupoTic);
		Sincronizador.registrarGrupo(grupoTac);
		Sincronizador.registrarGrupo(grupoToc);
		
		//registrar los hilos en el sincronizador
		Sincronizador.registrarHilo(tic1);
		Sincronizador.registrarHilo(tic2);
		Sincronizador.registrarHilo(tac1);
		Sincronizador.registrarHilo(tac2);
		Sincronizador.registrarHilo(toc1);
		Sincronizador.registrarHilo(toc2);
		Sincronizador.registrarHilo(toc3);
		
		//iniciar el sincronizador
		Sincronizador.siguiente();
		
		//iniciar los hilos
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();
		toc1.start();
		toc2.start();
		toc3.start();
		
		System.out.println("Fin de main");
	}

}
