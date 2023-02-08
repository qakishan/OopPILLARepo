package poly;

public class Morphism {
	public void samsung()
	{
		System.out.println("galaxy s20");
	}
	public void samsung(int a)
	{
		System.out.println("iphone 14 pro max");
	}
	public void samsung(float a)
	{
		System.out.println(" oneplus 9r");
	}
	public void samsung(double a)
	{
		System.out.println("  one plus pro");
	}
	public static void main(String [] args) 
	{
		Morphism  x = new Morphism();
		x.samsung(1);
		x.samsung();
		x.samsung(1.1f);
		x.samsung(1.233d);
	}
	
	

}
