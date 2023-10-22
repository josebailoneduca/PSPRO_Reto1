package tictac_sincronizadoGruposVersionB;

/**
 * Escribe Tac en pantalla cuando le toca el turno a su grupo.
 * Compite entre las dos hebras del mismo grupo usando una version
 * simplifica de Dekker sin contemplar el turno de hebra
 * ya que eso supondria alternancia estricta entre ambas hebras del grupo
 */
public class Tac  extends Thread{
	/**
	 * Variable estatica con un array de banderas para la implementacion de una version
	 * simplificada de Dekker
	 */
	private static boolean[] banderas=new boolean[2];
	
	/**
	 * Id de su bandera
	 */
	int id=0;
	
	/**
	 * Constructor
	 * @param id Indice de bandera
	 */
	public Tac(int id) {
		this.id=id;
	}
	
	/**
	 * Carrera de la hebra
	 */
	@Override
	public void run() {
		
		//bucle infinito
		while (true) {
				
				//implementacion simplificada de Dekker para gestionar el acceso a la seccion critica	
			
				//subir bandera propia
 				banderas[id] = true;
 				
 				//Espera ocupada si la bandera del otro esta levantada o el grupo que tiene turno no es el propio
				while (Tac.banderas[(id==0)?1:0] || !Reloj.getTurno().equals(Thread.currentThread().getThreadGroup().getName())) {
					
					//bajar la bandera propia
					banderas[id]=false;
					//salir del procesador
					Thread.yield();
					//subir la bandera propia
					banderas[id]=true;
				}
				
				//inicio seccioncritica>>
				
				//imprimir
				System.out.println("Tac");
				//cambiar el turno de reloj
				Reloj.avanzaTurno();
				
				//<<fin de seccion critica
				
				//bajar bandera propia
				banderas[id] = false;
				
		}//fin de bucle infinito
	}//fin de run
}//fin de clase