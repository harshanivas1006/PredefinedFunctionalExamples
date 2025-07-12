package PreDefinedFunctional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<LocalDateTime> s1=()->LocalDateTime.now();
		System.out.println(s1.get());
		Thread.dumpStack();
	}

}
