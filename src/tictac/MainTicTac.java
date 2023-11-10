package tictac;

import java.util.Scanner;

/**
 * Tic tac sincronizado mediante una variable en la clase Reloj que es accedida desde cada 
 * hilo para establecer el turno de trabajo
 */
public class MainTicTac {
	
	public static void main(String[] args) {
		//cantidad de impresiones (-1 para infinito)
		Scanner s = new Scanner(System.in);
		System.out.println("Defina el numero de impresiones a realizar (-1 para infinitas):");
		String impresiones=s.nextLine();
		try {
		Reloj.setImpresiones(Long.parseLong(impresiones));
		}catch (NumberFormatException e) {
			System.out.println("Debe escribir un numero entero");
			System.exit(0);
		}
		
		//inicio de tic,tac
		System.out.println("Inicio de main");
		PasoDeReloj tic = new PasoDeReloj("Tic",0,1);
		PasoDeReloj tac = new PasoDeReloj("Tac",1,0);
		tic.start();
		tac.start();
		System.out.println("Fin de main");
	}

}
