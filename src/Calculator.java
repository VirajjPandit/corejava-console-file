
public class Calculator {
	public static void main (String []args) {
		//add
		int s=add(12,56);
		System.out.println("Addition is: "+s);
		//subtract
		int d=subtract(33,4);
		System.out.println("Substraction is :"+d);
		//multiplication
		int u=multiply(35,8);
		System.out.println("Multiplication is: "+u);
		//Division
		int a=Division(51,89);
		System.out.println("Division is:"+a);
		
	}
	public static int add(int c,int d) 
	{
		int a=c+d;
		return a;
	}
	public static int subtract(int q,int p) 
	{
		int d=q-p;
		return d;
	}
	public static int multiply(int s,int w) 
	{
		int v=s*w;
		return v;
	}
	public static int Division(int h,int a) 
	{
		int x=h/a;
		return x;

}
}
