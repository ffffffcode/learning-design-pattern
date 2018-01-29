package ex.aaronfae.pattern.proxy;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {

		try {
			System.out.println("Æû³µÐÐÊ»ÖÐ...");
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
