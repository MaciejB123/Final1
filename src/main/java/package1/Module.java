package package1;

import java.util.ArrayList;

public class Module {

	private String moduleName;
	private String ID;
	private ArrayList<Student> listofStudents = new ArrayList<Student>();
	
	public Module(String x, String y, ArrayList<Student> z){
		this.moduleName = x;
		this.ID = y;
		this.listofStudents = z;
	}
	
	public ArrayList<Student> getListStudent(){
		return listofStudents;
	}
	
	public String toString(){
		return("\n Students in module: " + moduleName + " " + ID + " " + listofStudents +"\n ");
	}
	
}
