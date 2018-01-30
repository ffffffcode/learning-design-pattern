package ex.aaronfae.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class TimeHandler implements InvocationHandler {

	private Object obj;

	public TimeHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = new Date().getTime();
		System.out.println("��ʼ��¼ʱ��...");
		method.invoke(obj);
		long endTime = new Date().getTime();
		System.out.println("��¼ʱ�����...");
		System.out.println("��ʻʱ�䣺" + (endTime - startTime) + "����");
		return null;
	}

}
