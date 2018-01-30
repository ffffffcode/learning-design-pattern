package ex.aaronfae.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import ex.aaronfae.pattern.proxy.cglib.Bus;
import ex.aaronfae.pattern.proxy.cglib.CglibProxy;
import ex.aaronfae.pattern.proxy.dynamic.TimeHandler;
import ex.aaronfae.pattern.proxy.dynamic.Train;

/**
 * 霞編窃
 * 
 * @author AaronFae
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		// 床蓑旗尖
		System.out.println("！！！！！！！！！！床蓑旗尖！！！！！！！！！！");
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
		System.out.println("！！！！！！！！！！床蓑旗尖！！！！！！！！！！\n");

		// 強蓑旗尖
		System.out.println("！！！！！！！！！！強蓑旗尖！！！！！！！！！！");
		System.out.println("！！！！！！！！廿概！！！！！！！！");
		InvocationHandler h1 = new TimeHandler(car);
		Moveable m1 = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),
				h1);
		m1.move();
		System.out.println("！！！！！！！！廿概！！！！！！！！\n");
		System.out.println("！！！！！！！！諮概！！！！！！！！");
		Train train = new Train();
		Class<?> cls = train.getClass();
		InvocationHandler h2 = new TimeHandler(train);
		Moveable m2 = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h2);
		m2.move();
		System.out.println("！！！！！！！！諮概！！！！！！！！");
		System.out.println("！！！！！！！！！！強蓑旗尖！！！！！！！！！！\n");

		// Cglib旗尖
		System.out.println("！！！！！！！！！！Cglib旗尖！！！！！！！！！！");
		CglibProxy cglibProxy = new CglibProxy();
		Bus bus = (Bus) cglibProxy.getCglibProxyInstance(Bus.class);
		bus.move();
		System.out.println("！！！！！！！！！！Cglib旗尖！！！！！！！！！！");
	}
}
