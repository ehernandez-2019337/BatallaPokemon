import java.util.Random;

public class Stado{
 	Randal vd = new Randal();
	int min = 50;
	int max = 100;

	Random rand = new Random();

	public void estado(){
	int vida = rand.nextInt(max - min) + min;

	if (vida <= 0 ) {
		System.out.println("El pokemon esta muerto");
		
	}
	if (vida > 0) {
				System.out.println("El pokemon esta vivo");
			}

	}
	public void estadoPoke(){
		int vidapok = rand.nextInt(max - min) +min;
		
		if (vidapok <= 0 ) {
			System.out.println("EL pokemon esta muerto ");
				
			}	

	}

	}




