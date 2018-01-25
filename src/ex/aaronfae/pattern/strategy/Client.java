package ex.aaronfae.pattern.strategy;

public class Client {
	public static void main(String[] args) {
		Duck duck = null;
		// duck = new RadheadDuck();
		// duck = new MallardDuck();
		// duck = new RubberDuck();
		// duck = new BigYellowDuck();
		duck = new SpaceDuck();
		duck.display();
		duck.quack();
		duck.fly();
	}
}
