package tictac_sincronizadoGruposVersionB;

/**
 * Se encarga de imprimir en pantalla "Tac". Se sincroniza dentro del grupo usando 
 */
public class Tac  extends Thread{
	private static boolean[] banderas=new boolean[2];
	int id=0;
	int grupo=1;
	public Tac(int id) {
		this.id=id;
	}
	@Override
	public void run() {
		while (true) {
 				banderas[id] = true;
				while (Tac.banderas[(id==0)?1:0] || !Reloj.getTurno().equals(Thread.currentThread().getThreadGroup().getName())) {
					banderas[id]=false;
					Thread.yield();
					banderas[id]=true;
				}
				System.out.println("Tac");
				Reloj.avanzaTurno();
				banderas[id] = false;
		}
	}
}