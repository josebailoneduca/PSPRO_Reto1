package tictac_sincronizadoGruposVersionB;


public class Reloj {
	private static int turno=0;
	
	public static int getTurno() {
		return turno;
	}

	public static void avanzaEstado() {
		switch (turno) {
		case 0:
			turno=1;
			break;
		default :
			turno=0;
			}		
	}

}
