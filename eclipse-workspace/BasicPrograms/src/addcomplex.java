//add two complex numbers
public class addcomplex {
	int real,imaginary;
	public static void main(String args[])
	{
		addcomplex c1=new addcomplex(4,5);
		addcomplex c2=new addcomplex(5,8);
		System.out.println("Fisrt complex number is");c1.display();
		System.out.println("Second complex number is");c2.display();
	    addcomplex ob1=add(c1, c2);
	    System.out.println("Addtion is");ob1.display();
		
	}
	public addcomplex(int r, int i)  //constructor to initialize class variables real and imaginary
	{
		this.real=r;
		this.imaginary=i;
	}
	public void display()
	{
		System.out.println(this.real+"+"+"i"+this.imaginary);
	}
	public static addcomplex add(addcomplex n1,addcomplex n2)
	{
		//creating blank object to store result
		addcomplex ob= new addcomplex(0,0);
		ob.real= n1.real +n2.real;
		ob.imaginary=n1.imaginary+n2.imaginary;
		return ob;
	}
	
	
    
}
