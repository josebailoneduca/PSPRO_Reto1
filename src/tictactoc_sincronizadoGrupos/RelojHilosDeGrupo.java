package tictactoc_sincronizadoGrupos;

import tictactoc_sincronizadoGrupos.listadoblecircular.ListaDobleCircular;

/**
 * Sincroniza el hilo el del grupo al que le corresponde el turno asignado al
 * grupo
 */
public class RelojHilosDeGrupo extends ListaDobleCircular<Thread> {

	/**
	 * Grupo al que se refiere el sincronizador
	 */
	private ThreadGroup grupo;

	/**
	 * Constructor
	 * 
	 * @param grupo El grupo al que se refiere el sincronizador
	 */
	public RelojHilosDeGrupo(ThreadGroup grupo) {
		this.grupo = grupo;
	}

	/**
	 * Registra un hilo en el sincronizador
	 * 
	 * @param hilo a registrar
	 */
	public void registrarHilo(Thread hilo) {
		super.addLast(hilo);
	}

	/**
	 * Devuelve el proximo hilo
	 */
	public Thread getNext() {
		Thread salida = null;
		if ((salida = super.getNext()) == null)
			salida = this.getFirst();
		return salida;
	}

	/**
	 * Devuelve el grupo al que pertenece el sincronizador
	 * 
	 * @return El grupo
	 */
	public ThreadGroup getGrupo() {
		return grupo;
	}

}
