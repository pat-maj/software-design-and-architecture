
public class ChillTime {

	private CoffeeMaker cm;
	private Amplifier amp;
	private Screen sc;
	private Player player;
	private Projector proj;
	private BlurayCollection bc;
	
	public ChillTime() {
		cm = new CoffeeMaker();
		amp = new Amplifier();
		sc = new Screen();
		player = new Player();
		proj = new Projector();
		bc = new BlurayCollection();
	}
	
	public void prepareCoffee(String coffeeName) {
		cm.on();
		cm.makeCoffee(coffeeName);
		cm.off();
	}
	
	public void prepareHomeCinema(String format, String movieTitle, int volume) {
		String m = bc.select(movieTitle);
		amp.on();
		amp.changeVolume(volume);
		sc.lower();
		proj.on();
		player.setFormat(format);
		player.play(m);
	}
	
	public void turnOffAll() {
		player.eject();
		player.off();
		proj.off();
		sc.raise();
		amp.off();
		
		System.out.println("goodnight!");
	}
}
