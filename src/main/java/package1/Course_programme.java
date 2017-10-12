package package1;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course_programme {
	
	private String courseName;
	private ArrayList<Module> listofModules = new ArrayList<Module>();
	private DateTime start;
	private DateTime end;
	
	public Course_programme(String w, ArrayList<Module> x, DateTime y, DateTime z){
		this.courseName = w;
		this.listofModules = x;
		this.start = y;
		this.end = z;
	}
	
	public ArrayList<Module> getListModule(){
		return listofModules;
	}
	
	public String toString(){
		return("\n Modules in course: " + courseName + " " + listofModules + " " + start + " " + end + "\n ");
	}
	
}
