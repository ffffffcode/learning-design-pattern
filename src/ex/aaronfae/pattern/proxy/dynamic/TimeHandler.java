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
		System.out.println("开始记录时间...");
		method.invoke(obj);
		long endTime = new Date().getTime();
		System.out.println("记录时间结束...");
		System.out.println("行驶时间：" + (endTime - startTime) + "毫秒");
		return null;
	}

}
