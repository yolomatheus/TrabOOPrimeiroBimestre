package EX2;

public class Televisao extends ControleRemoto {

	public static void main(String[] args) {
		
		ControleRemoto C = new ControleRemoto ();
		
		C.AumentarVolume();
		C.DiminuirVolume();
		C.AumentarCanal();
		C.DiminuirCanal();
		C.TrocarCanal();
		C.getCanal();
		C.getVolume();
		
	}

}
