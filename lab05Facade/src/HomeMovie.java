public class HomeMovie {
	
	public static void main(String[] args) {
		/*
		 * we wish to make coffee, select movie on BluRay, turn on amplifier, display
		 * screen and then watch the movie
		 */

		ChillTime ct = new ChillTime();
		ct.prepareCoffee("black");
		ct.prepareHomeCinema("Bluray", "Men in Black", 10);
		ct.turnOffAll();
	}
}
