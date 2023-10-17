package tictactoc_sincronizadoGruposVersionA;

import tictactoc_sincronizadoGruposVersionA.listadoblecircular.ListaDobleCircular;


/**
 * Sistema para sincronizar hilos y grupos haciendo que se distribuyan los turnos de trabajo asignando el turno cada vez a un grupo en el orden de registro
 * y cuando es el turno de un grupo hace que le toque a un hilo de ese grupo siguiendo el orden de registro.
 * 
 * Se sirve de dos niveles de lista circular. La lista cicular principal rota entre los grupos y en cada nodo de esa lista hay una lista
 * circular que contiene los hilos de ese grupo.
 * 
 * Cada vez que pasa un turno avanza en la lista de grupos y tambien en la lista de hilos de ese nuevo grupo 
 * 
 * 
 */
public class Reloj {
	
	/**
	 * Hilo al que pertenece actualmente el turno
	 */
	private static Thread turno=null;
	
	/**
	 * Lista circular que contiene un sincronizador de turnos de hilo para cada grupo
	 */
	private static ListaDobleCircular<RelojHilosDeGrupo> grupos = new ListaDobleCircular<RelojHilosDeGrupo>();
	
	
	/**
	 * Devuelve el nombre del hilo que tiene el turno
	 * 
	 * @return El nombre del hilo o cadena vacia si el turno es nulo
	 */
	public static String getNombreTurno() {
		return (turno==null)?"":turno.getName();
	}

	/**
	 * Pasa el turno avanzando al siguiente grupo de hilos y dentro de ese grupo avanza al siguiente hilo de ese grupo
	 */
	public static void siguiente() {
		turno = grupos.getNext().getNext();
	}
	
	/**
	 * Registra un grupo en el listado de grupos de hilos a sincronizar
	 * 
	 * @param grupo El grupo a registrar
	 */
	public static void registrarGrupo(ThreadGroup grupo) {
		grupos.addLast(new RelojHilosDeGrupo(grupo));
		grupos.getLast();
	}

	/**
	 * Registra un hilo dentro del sincronizador de hilos de su grupo
	 * 
	 * @param hilo El hilo a registrar
	 * 
	 * @return True si lo ha registrado, False si no lo ha registrado
	 */
	public static boolean registrarHilo(Thread hilo) {
		//grupo del hilo
		ThreadGroup grupo = hilo.getThreadGroup();
		//busca el sincronizador que pertenece al grupo del hilo entre los grupos registrados y si lo encuentra lo agrega
		for (int i=0;i<grupos.size();i++) {
			RelojHilosDeGrupo sActual = grupos.getAt(i);
			if (sActual.getGrupo().equals(grupo)) {
				sActual.registrarHilo(hilo);
				return true;
			}
		}
		return false;
	}
}