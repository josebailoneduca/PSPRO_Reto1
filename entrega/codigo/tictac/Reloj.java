package tictac;

/**
 * Almacen compartido del turno
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class Reloj {
	/**
	 * Turno actual
	 */
	private static int turno = 0;
	
	/**
	 * Numero de impresiones a realizar
	 */
	private static long impresiones=-1;

	/**
	 * Devuelve el turno actual
	 * @return El turno
	 */
	public static int getTurno() {
		Thread.currentThread().yield();
		return turno;
	}

	/**
	 * Define el turno actual e incrementa la cantidad de impresiones restantes
	 * @param turno El turno a definir
	 */
	public static void setTurno(int turno) {
		Reloj.turno = turno;
		
		//decrementar impresiones restantes
		if (impresiones>0)
			Reloj.impresiones--;
		
		//si no quedan impresiones el programa termina
		if (impresiones==0)
			System.exit(0);
		
		Thread.yield();
	}

	/**
	 * Define cuantas impresiones va a realizar el rejoj
	 * @param n Numero de impresiones
	 */
	public static void setImpresiones(long n) {
		impresiones=n;
	}
}
