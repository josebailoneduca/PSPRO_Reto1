package tictac_grupos;

/**
 * Escribe un sonido en pantalla cuando le toca el turno a su grupo.
 * Compite entre hebras del mismo grupo usando una version
 * simplificada de Dekker sin contemplar el turno de hebra
 * ya que eso supondria alternancia estricta entre ambas hebras del grupo
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class PasoDeReloj  extends Thread{
	/**
	 * Array de banderas para la implementacion de una version
	 * simplificada de Dekker.
	 */
	private boolean[] banderas;
	
	/**
	 * Id de su bandera
	 */
	int indice=0;
	
	/**
	 * Palabra que imprimira el hilo cuando le toque imprimir
	 */
	
	String sonido;
	
	
	
	/**
	 * Constructor
	 * @param indice Indice de bandera
	 * @param banderas Array para mutex
	 * @param sonido Palabra a imprimir
	 */
	public PasoDeReloj(int indice,boolean[] banderas,String sonido) {
		this.indice=indice;
		this.banderas=banderas;
		this.sonido=sonido;
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
 				banderas[indice] = true;
 				
 				//Espera ocupada si la bandera del otro esta levantada o el grupo que tiene turno no es el propio
				while (this.banderas[(indice==0)?1:0] || !Reloj.getTurno().equals(Thread.currentThread().getThreadGroup().getName())) {
					
					//bajar la bandera propia
					banderas[indice]=false;
					//salir del procesador
					Thread.yield();
					//subir la bandera propia
					banderas[indice]=true;
				}
				
				//inicio seccioncritica>>
				
				//imprimir
				System.out.println(sonido);
				//cambiar el turno de reloj
				Reloj.avanzaTurno();
				
				//<<fin de seccion critica
				
				//bajar bandera propia
				banderas[indice] = false;
				
		}//fin de bucle infinito
	}//fin de run
	
 
	
	
}//fin de clase