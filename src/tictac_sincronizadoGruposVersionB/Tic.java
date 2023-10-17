package tictac_sincronizadoGruposVersionB;

public class Tic  extends Thread{
	private static boolean[] banderas=new boolean[2];
	int id=0;
	int grupo=0;
	public Tic(int id) {
		this.id=id;
	}
	@Override
	public void run() {
		while (true) {
 				banderas[id] = true;
				while (Tic.banderas[(id==0)?1:0] || Reloj.getTurno()!=grupo) {
					banderas[id]=false;
					Thread.yield();
					banderas[id]=true;
				}
				System.out.println("Tiic");
				Reloj.avanzaEstado();
				banderas[id] = false;
				
		}
	}
}
