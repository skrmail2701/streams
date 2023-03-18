package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import streamshelperclasses.Students;

public class Map_Reduce_Example {
	public static void main(String[] args) {
		
		
		practiceConvertingListToMap();
		
		
		
	}

	private static void practiceConvertingListToMap() {
		List <Students> studentList= Students.getAllStudents();
		
		//Map - Transforms data 
		
		Map<Integer,List<String>> studentMap=new HashMap<>();
		//studentMap=  studentList.stream().
			//	collect(Collectors.toMap(Students::getSid, Students::getActivities));
		//
		studentList.stream().forEach(stu-> {
			studentMap.put(stu.getSid(),stu.getActivities());
		});
		System.out.println(studentMap);
	}
}
