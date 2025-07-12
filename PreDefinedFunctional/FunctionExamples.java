package PreDefinedFunctional;

import java.security.Identity;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface FunctionExamples {
	public static void main(String[] args) {
		
//	Find the half value of given value
		Function<Integer,Double> halfvalue=i->i/2.0;
		System.out.println(halfvalue.apply(10));
		
//		Give n String Is converted to toUpperCase	
		Function<String, String> functiontouppercase=String::toUpperCase;
		System.out.println(functiontouppercase.apply("harsha"));
		
//		Null Check
		Function<String ,String > functionnullcheckFunction=s->s==null? "Enter valid value":s;
		System.out.println(functionnullcheckFunction.andThen(functiontouppercase).apply("harsha nivas"));
		
//		Compose Functionality
		System.out.println(functionnullcheckFunction.compose(functiontouppercase).apply("vamsi muthyala"));
		
//		Static Identity
		Function<Integer, Integer> identityvalue=Function.identity();
		System.out.println(identityvalue.apply(200));
		
//		Stream API
//		Stream Object: From that i have to collect all values to a list.
		
		Stream<String> names=Stream.of("One","Two","Three");
		List<String> result=names.map(Function.identity()).collect(Collectors.toList());
		System.out.println(result);
	}

}
