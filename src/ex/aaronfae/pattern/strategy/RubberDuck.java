package ex.aaronfae.pattern.strategy;

import ex.aaronfae.pattern.strategy.impl.FlyNoWay;
import ex.aaronfae.pattern.strategy.impl.QuackSesese;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		this.setFlyingStrategy(new FlyNoWay());
		this.setQuackStrategy(new QuackSesese());
	}

	@Override
	public void display() {
		System.out.println("Ïð½ºÑ¼£ºÎÒÈ«Éí·¢»Æ£¬×ì°Íºìºì");
	}

}
