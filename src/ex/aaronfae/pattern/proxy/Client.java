package ex.aaronfae.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import ex.aaronfae.pattern.proxy.cglib.Bus;
import ex.aaronfae.pattern.proxy.cglib.CglibProxy;
import ex.aaronfae.pattern.proxy.dynamic.TimeHandler;
import ex.aaronfae.pattern.proxy.dynamic.Train;

/**
 * ������
 * 
 * @author AaronFae
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		// ��̬����
		System.out.println("����������������������̬����������������������");
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
		System.out.println("����������������������̬����������������������\n");

		// ��̬����
		System.out.println("����������������������̬����������������������");
		System.out.println("������������������������������������");
		InvocationHandler h1 = new TimeHandler(car);
		Moveable m1 = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
				h1);
		m1.move();
		System.out.println("������������������������������������\n");
		System.out.println("�����������������𳵡���������������");
		Train train = new Train();
		Class<?> cls = train.getClass();
		InvocationHandler h2 = new TimeHandler(train);
		Moveable m2 = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h2);
		m2.move();
		System.out.println("�����������������𳵡���������������");
		System.out.println("����������������������̬����������������������\n");

		// Cglib����
		System.out.println("��������������������Cglib����������������������");
		CglibProxy cglibProxy = new CglibProxy();
		Bus bus = (Bus) cglibProxy.getCglibProxyInstance(Bus.class);
		bus.move();
		System.out.println("��������������������Cglib����������������������");
	}
}
