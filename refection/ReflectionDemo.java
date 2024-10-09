package refection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test
{
	private String s;
	
	public Test()
	{
		s="Hello World";
	}
	
	public void method1()
	{
		System.out.println("String : "+s);
	}
	
	public void method2(int n)
	{
		System.out.println("Number : "+n);
	}
	
	private void method3()
	{
		System.out.println("Invoke Method");
	}
}

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		
		Test obj = new Test();
		Class cls = obj.getClass();
		
		System.out.println("The Name of Class : "+cls.getName());
		
		Constructor constructor = cls.getConstructor();
		
		System.out.println("The Name of Constructor : "+constructor.getName());
		
		System.out.println("--------------------------------------------");
		
		Method[] methods = cls.getMethods();
		
		for(Method a : methods)
		{
			System.out.println(a.getName());
		}
		
		System.out.println("--------------------------------------------");
		
		Method method11 = cls.getDeclaredMethod("method2",int.class);
		method11.invoke(obj,22);
		
		Field field = cls.getDeclaredField("s");
		field.setAccessible(true);
		field.set(obj,"Java");
		
		Method method12 = cls.getDeclaredMethod("method1");
		method12.invoke(obj);
		
		Method method13 = cls.getDeclaredMethod("method3");
		method13.setAccessible(true);
		method13.invoke(obj);
		
	}

}
