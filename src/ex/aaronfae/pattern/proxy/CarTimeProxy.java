package ex.aaronfae.pattern.proxy;

import java.util.Date;

public class CarTimeProxy implements Moveable {

	private Moveable m;

	public CarTimeProxy(Moveable m) {
		this.m = m;
	}

	@Override
	public void move() {
		long startTime = new Date().getTime();
		System.out.println("开始记录时间...");
		m.move();
		long endTime = new Date().getTime();
		System.out.println("记录时间结束...");
		System.out.println("行驶时间：" + (endTime - startTime) + "毫秒");

	}

}
