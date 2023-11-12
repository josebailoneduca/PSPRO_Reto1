package tictac;

/**
 * Clase encargada de imprimir en pantalla el paso de reloj.
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class PasoDeReloj  extends Thread{
	/**
	 * Sonido a imprimir
	 */
	private String sonido;
	
	/**
	 * id del turno propio
	 */
	int turnoPropio;
	
	/**
	 * id del turno siguiente
	 */
	int siguienteTurno;
	
	/**
	 * Constructor
	 * 
	 * @param sonido Sonido a imprimir
	 * @param turnoPropio Id del turno propio
	 * @param siguienteTurno Id del turno siguiente
	 */
	public PasoDeReloj(String sonido, int turnoPropio, int siguienteTurno){
		this.sonido=sonido;
		this.turnoPropio=turnoPropio;
		this.siguienteTurno=siguienteTurno;
	}
	
	@Override
	public void run() {
		while (true) {
			//comprobar turno
			if (Reloj.getTurno()==turnoPropio) {
				//imprimir
				System.out.println(this.sonido);
				//cambiar turno
				Reloj.setTurno(siguienteTurno);
			}
		}
	}
}
