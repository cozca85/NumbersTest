package basics;

public class classExample {
	
	public void hello()
	{
		System.out.println("Hello method !");
	}
	
	public classExample()
	{
		
	}
	
	public void sum()
	{
		int a = 20;
		int b = 35;
		int sum = a + b;
		System.out.println("Sum of a and b is " + sum);
	}
	
	public static void main(String[] args)
	{
		classExample newClass = new classExample();
		newClass.hello();
		newClass.sum();
	}

}
