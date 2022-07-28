abstract class Marks
{
	float perc;
	abstract void getPercentage();
}
class A extends Marks
{
	
	A(float maths, float science, float english)
	{
		
		perc = (maths+science+english)/3;
	}
	
	public void getPercentage()
	{
		System.out.println("Percentage of student A = " + perc); 
	}
}
class B extends Marks
{
	B(float maths, float science, float english, float SST)
	{
		perc = (science+english+science+SST)/4;
	}
	void getPercentage()
	{
		System.out.println("Percentage of student B = " + perc);
	}
}
class result
{
	public static void main(String []args)
	{
		A stu1 = new A(75, 80, 68);
		stu1.getPercentage();
		B stu2 = new B(88, 96, 70, 90);
		stu2.getPercentage();
	}
}