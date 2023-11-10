package tictac_grupos;

import java.util.Scanner;


/**
 * Version de TicTac sincronizado con competicion entre hebras del mismo grupo.
 */
public class MainTicTacGrupos {
	
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

		
		System.out.println("Inicio de main TIC-TAC SICRONIZADO GRUPOS");
		//hebras que participaran
		boolean[]banedrasTic=new boolean[2];
		PasoDeReloj ti1 = new PasoDeReloj(0,banedrasTic,"Tic");
		PasoDeReloj ti2 = new PasoDeReloj(1,banedrasTic,"Tic");
		
		boolean[]banedrasTac=new boolean[2];
		PasoDeReloj ta1 = new PasoDeReloj(0,banedrasTac,"Tac");
		PasoDeReloj ta2 = new PasoDeReloj(1,banedrasTac,"Tac");


		//inclusion de las hebras en grupos 
		ThreadGroup grupoTic = new ThreadGroup("grupoTic");
		Thread tic1=new Thread(grupoTic, ti1);
		Thread tic2=new Thread(grupoTic, ti2);

		ThreadGroup grupoTac = new ThreadGroup("grupoTac");
		Thread tac1=new Thread(grupoTac, ta1);
		Thread tac2=new Thread(grupoTac, ta2);

		
		//inicio de las hebras
		tic1.start();
		tic2.start();
		tac1.start();
		tac2.start();

		
		System.out.println("Fin de main");
	}

}
