package tictac;

/**
 * Clase encargada de imprimir en pantalla el paso de reloj. Usando 
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
				//seccion critica>>
				System.out.println(this.sonido);
				//cambiar turno
				Reloj.setTurno(siguienteTurno);
				//<<fin seccion critica
			}
		}
	}
}
