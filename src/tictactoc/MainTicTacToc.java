package tictactoc;

import java.util.Scanner;

/**
 * Version de TicTacToc sincronizado con competicion entre hebras del mismo grupo.
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class MainTicTacToc {
	
	
	public static void main(String[] args) {
		//Pedir cantidad de impresiones (-1 para infinito)
		Scanner s = new Scanner(System.in);
		System.out.println("Defina el numero de impresiones a realizar (-1 para infinitas):");
		String impresiones=s.nextLine();
		try {
		Reloj.setImpresiones(Long.parseLong(impresiones));
		}catch (NumberFormatException e) {
			System.out.println("Debe escribir un numero entero");
			System.exit(0);
		}
		
	
		
		// Creacion de las hebras y los arrays de banderas para mutex
		boolean[]banderasTic=new boolean[2];
		PasoDeReloj ti1 = new PasoDeReloj(0,banderasTic,"Tic");
		PasoDeReloj ti2 = new PasoDeReloj(1,banderasTic,"Tic");
		
		boolean[]banderasTac=new boolean[2];
		PasoDeReloj ta1 = new PasoDeReloj(0,banderasTac,"Tac");
		PasoDeReloj ta2 = new PasoDeReloj(1,banderasTac,"Tac");

		boolean[]banderasToc=new boolean[2];
		PasoDeReloj to1 = new PasoDeReloj(0,banderasToc,"Toc");
		PasoDeReloj to2 = new PasoDeReloj(1,banderasToc,"Toc");

		//inclusion de las hebras en grupos 
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		Thread tic1=new Thread(grupoTic, ti1);
		Thread tic2=new Thread(grupoTic, ti2);

		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		Thread tac1=new Thread(grupoTac, ta1);
		Thread tac2=new Thread(grupoTac, ta2);
		
		ThreadGroup grupoToc = new ThreadGroup("grupoToc");
		Thread toc1=new Thread(grupoToc, to1);
		Thread toc2=new Thread(grupoToc, to2);
		
		//inicio de las hebras
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();
		toc1.start();
		toc2.start();	
	}
}
