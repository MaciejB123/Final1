package package1;

public class Student{
	private int age;
	private String dob;
	private String name;
	private String username;
	
	public Student(int x, String y, String z){
		this.age = x;
		this.dob = y;
		this.name = z;
		this.username = z+x;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String toString(){
		return("\n Student: " + name + " " + age + " " + dob + " " + username + "\n ");
	}
	
}
