package com.john_pank.chapter14.task22;

import java.lang.reflect.*;
import java.util.Date;

interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface{
	int a;

	@Override
	public void doSomething(){
		System.out.println("doSomething");
		for (int i = 0; i<100000; i++){
			a=0;
			a=i;
			//System.out.println(i);
		}

	}

	@Override
	public void somethingElse(String arg){
		System.out.println("somethingElse " + arg);
		for (int i = 0; i<100000; i++){
			a=0;
			a=i;
			//System.out.println(i);
		}
	}
}

class DynamicProxyHandler implements InvocationHandler {
	
	private Object proxied;
	
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		Object result;
		long timeStart;
		long timeEnd;

		System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
		if(args != null)
			for(Object arg : args)
				System.out.println(" " + arg);

		timeStart = new Date().getTime();
		result = method.invoke(proxied, args);
		timeEnd = new Date().getTime();
		System.out.println("Time:" + (timeEnd-timeStart) + "ms");
		//System.out.println("---------------------");
		//System.out.println(proxy.toString());

		
		return result;
	}
}

public class SimpleDynamicProxy{
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("hihi");
	}
	
	public static void main(String[] args){
		RealObject real = new RealObject();
		consumer(real);
		
		//insert a proxy and call again
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}
} 