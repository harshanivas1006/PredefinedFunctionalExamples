package PreDefinedFunctional;

import java.util.List;
import java.util.function.Consumer;

public interface ConsumerExamples {
	public static void main(String[] args) {
		List<String> l1=List.of("pqr","xyz","abc","mno");
		Consumer<String> toUppercase=str->System.out.println(str.toUpperCase());
		toUppercase.accept("harsha nivas");  //HARSHA NIVAS
		l1.forEach(toUppercase);   //PQR,XYZ,ABC,MNO
	}

}
