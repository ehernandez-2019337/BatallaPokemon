import java.util.Random;

public class Randal {
  	
  

    	public void vida(){
		int min = 50;
		int max = 100;

		Random rand = new Random();

		int vida = rand.nextInt(max - min) + min;
		System.out.println("la vida es de " + vida);
		}
		public void ataque(){
		int min = 5;
		int max = 20;

		Random rand = new Random();

		int ataque = rand.nextInt(max - min) + min;
		System.out.println("el ataque es de " + ataque);
		}

}

