package PreDefinedFunctional;

import java.util.function.Function;

public interface FunctionDemo {
	public static void main(String[]args) {
		
		Function<Integer, String> function= t->{if(t>0) 
			return "positive";
		else 
			return "negative";
		};
		System.out.println(function.apply(10));
	}
}

//	Using Terrinary Operator

//package PreDefinedFunctional;
//
//import java.util.function.Function;
//
//public class FunctionDemo {
//    public static void main(String[] args) {
//        
//        Function<Integer, String> function = t -> t > 0 ? "positive" : "negative";
//
//        System.out.println(function.apply(10));
//    }
//}

