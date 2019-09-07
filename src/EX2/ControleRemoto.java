package EX2;

public class ControleRemoto {
	
	private int canal;
	private int volume;
	
	
	public void AumentarVolume() {
		volume = 10;
		if (volume < 10) {
			volume ++; 
		}
		else {
			System.out.println("Volume esta no maximo");
		}
	}
	
	
	public void DiminuirVolume() {
		volume = 10;
		if (volume == 10) {
			volume = - 1;			
		} else {
			System.out.println("Volume zerado");

		}
	}

	public void AumentarCanal() {
		canal = 10;
			if (canal == 0) {
					canal = canal + 1;	
						System.out.println(canal);
		} 
	}
	
	public void DiminuirCanal() {
		canal = 10;
			if (canal == 10) {
				canal = canal - 1;		
				System.out.println(canal);
		}
	
	}
	
	public void TrocarCanal() {
		System.out.println("O canal foi mudado");
		
	}
	
	 public Integer getVolume() {
	        return volume;
	    }

	    public void setVolume(int volume) {
	        this.volume = volume;
	    }

	    public Integer getCanal() {
	        return canal;
	    }

	    public void setCanal(int canal) {
	        this.canal = canal;
	    }	
}
