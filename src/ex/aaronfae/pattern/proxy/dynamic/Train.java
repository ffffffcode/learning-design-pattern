package ex.aaronfae.pattern.proxy.dynamic;

import java.util.Random;

import ex.aaronfae.pattern.proxy.Moveable;

public class Train implements Moveable {

	@Override
	public void move() {

		try {
			System.out.println("»ð³µÐÐÊ»ÖÐ...");
			Thread.sleep(new Random().nextInt(5000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
