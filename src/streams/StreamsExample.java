package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streamshelperclasses.Students;

public class StreamsExample {
public static void main(String[] args) {
	Students student= new Students();

	List<Students> slist= 	student.getAllStudents();

	//Convert list to map of sid and activities
	
	Map<Integer,List<String>> hm= slist.stream().collect(
			Collectors.toMap(Students::getSid, Students::getActivities));
	
	for(Map.Entry ent: hm.entrySet()) {
		System.out.println(ent);
	}
	
}
}
