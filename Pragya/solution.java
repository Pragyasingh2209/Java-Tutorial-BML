public class K
{
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student("Ram","789CD","EEE");

		System.out.println("The name of the student is: "+s1.name);
		
	}
}

class Student
{
	String name = new String();
	String rollNumber = new String();
	String course = new String();

	Student(String a,String b,String c)
	{
		name = a;
		rollNumber = b;
		course = c;
	}
		
		
}