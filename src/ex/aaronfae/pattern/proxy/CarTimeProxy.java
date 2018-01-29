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
		System.out.println("��ʼ��¼ʱ��...");
		m.move();
		long endTime = new Date().getTime();
		System.out.println("��¼ʱ�����...");
		System.out.println("��ʻʱ�䣺" + (endTime - startTime) + "����");

	}

}
