package ex.aaronfae.pattern.proxy.cglib;

import java.lang.reflect.Method;
import java.util.Date;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	public Object getCglibProxyInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method m, Object[] arg, MethodProxy proxy) throws Throwable {
		long startTime = new Date().getTime();
		System.out.println("��ʼ��¼ʱ��...");
		proxy.invokeSuper(obj, arg);
		long endTime = new Date().getTime();
		System.out.println("��¼ʱ�����...");
		System.out.println("��ʻʱ�䣺" + (endTime - startTime) + "����");
		return null;
	}

}
