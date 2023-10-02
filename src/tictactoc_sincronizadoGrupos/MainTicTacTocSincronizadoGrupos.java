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
		Reloj.registrarGrupo(grupoTic);
		Reloj.registrarGrupo(grupoTac);
		Reloj.registrarGrupo(grupoToc);
		
		//registrar los hilos en el sincronizador
		Reloj.registrarHilo(tic1);
		Reloj.registrarHilo(tic2);
		Reloj.registrarHilo(tac1);
		Reloj.registrarHilo(tac2);
		Reloj.registrarHilo(toc1);
		Reloj.registrarHilo(toc2);
		Reloj.registrarHilo(toc3);
		
		//iniciar el sincronizador
		Reloj.siguiente();
		
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
