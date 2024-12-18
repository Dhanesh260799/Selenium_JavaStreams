import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
	// Count the number of names starting with alphabet A in list

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajesh");
		names.add("rajesh");
		names.add("vijay");
		names.add("abi");
		names.add("aravind");
		// java Stream
		// So instead of creating collection, list you can directly invoke those values
		// in stream

		Long value = names.stream().filter(s -> s.startsWith("A")).count();
		// there is no life for intermediate OP if there is no terminal OP
		// terminal OP will execute only if inter OP (Filter) returns true
		// We can create stream
		// how to use filter in Stream API

		System.out.println(value);

		long c = Stream.of("Ajesh", "rajesh", "vijay", "Avi", "aravind").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(c);
		Stream<String> val2 =  Stream.of("Ajesh", "rajesh", "vijay", "Avi", "aravind");
		/*
		 * int count=0; for(int i=0;i<names.size();i++) { String OG=names.get(i);
		 * if(OG.startsWith("A")) { count++; } } System.out.println(count);
		 */
		// print all the names of Arraylist
	///	names.stream().filter(s -> s.length() < 4).forEach(s -> System.out.println(s));
		// printing all names
	//	names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// printing the first value of the values by limiting
	//	names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		// printing the names with Uppercase
		// here we using map terminal op
		names.stream().filter(s -> s.endsWith("h")).map(s -> s.toUpperCase()).forEach(s -> System.out.println());

		// converting to sorted by uppercase
		// convert array into list

	//	List<String> Crush = Arrays.asList("Ash", "Why", "are", "you", "So", "Cute", "Blahhh", "Blahhhhh");
	//	Crush.stream().filter(s -> s.length() < 5).forEach(s -> System.out.println(s));
		List<String> name = Arrays.asList("Anbu", "arivu","gopal","alex","aanad");
		name.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// merging two streams and sorting
		List <String> val1 = Arrays.asList("babu","Avinac","ashwitha","lakshman","salman");
		Stream<String> ex_Names = Stream.concat( name.stream(), val1.stream());
		
		boolean f = ex_Names.anyMatch(s->s.equalsIgnoreCase("babu"));
	//	Assert.asserTrue();
		System.out.println(f);
		List<Integer> num = Stream.of(2,3,4,5,6,2,7,9).distinct().sorted().collect(Collectors.toList());
		
		List<Integer> num1 = Arrays.asList(1,3,2,45,234,112,112);
		num1.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		num.forEach(s->System.out.println(s));
	}

}
