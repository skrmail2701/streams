package streamshelperclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

public class Students {
 private Integer sid;
 private List<String> activities;
 
	public Students(Integer sid, List<String> activities) {
	super();
	this.sid = sid;
	this.activities = activities;
}

	public Students() {
	super();
	// TODO Auto-generated constructor stub
}

	public Integer getSid() {
	return sid;
}

public void setSid(Integer sid) {
	this.sid = sid;
}

public List<String> getActivities() {
	return activities;
}

public void setActivities(List<String> activities) {
	this.activities = activities;
}

	public static List<Students> getAllStudents(){
			List<Students> studentList= new ArrayList<>();
		
				studentList.add(new Students(1,Arrays.asList(new String[]{"Swimming","Dancing"})));
				studentList.add(new Students(2,Arrays.asList(new String[]{"sndf",",sjnf"})));
				studentList.add(new Students(3,Arrays.asList(new String[]{",mnsdfjall","njsfdj"})));
				studentList.add(new Students(4,Arrays.asList(new String[]{"Ssankfdjajnwioping","jsnfdjn"})));
				studentList.add(new Students(5,Arrays.asList(new String[]{"fsalkjfa","Danfasnfjscing"})));
				studentList.add(new Students(6,Arrays.asList(new String[]{"jiewo","ahsih"})));
				studentList.add(new Students(7,Arrays.asList(new String[]{"kjasfh","sdna"})));
				studentList.add(new Students(8,Arrays.asList(new String[]{"jahdfih","jsnfdjn"})));
				
				return studentList;
	}
}
