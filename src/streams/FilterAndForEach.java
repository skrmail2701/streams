package streams;

import java.util.Arrays;
import java.util.List;

public class FilterAndForEach {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Sanjeev","Sam","Greg","Ryan");
	names.stream().filter(n-> n.startsWith("S")).forEach(System.out::println);
}
}
