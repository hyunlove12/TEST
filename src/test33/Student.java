package test33;

public class Student extends People{

	
	
	

	public Student(String name, String ssn) {
		super(name, ssn);
		super.name = "@2";
		System.out.println(super.name);
	}
	
	
	

}
