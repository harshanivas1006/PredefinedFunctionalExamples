package PreDefinedFunctional;

import java.util.function.Predicate;

import javaeightexamples.predictae;


public interface PredicateExamples {
	public static void main(String[] args) {
		Predicate<Integer> agecheck=a->a>=18;
		System.out.println(agecheck.test(19));
		System.out.println(agecheck.test(17));
		
		if (agecheck.test(26)) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
//		Employee objectEmployee:Find Out Salary>25000
		Employee e1=new Employee();
		e1.setId(101);
		e1.setSalary(26000);
		
		Predicate<Employee> empsalarycheck=emp->emp.getSalary()>25000;
		
		if (empsalarycheck.test(e1)) {
			System.out.println("Above 25000");
			
		}
		else {
			System.out.println("Below 25000");
		}
//		 We have to check salary >25000 AND gender is female
		Predicate<Employee> genderCheck=emp->emp.getGender().equalsIgnoreCase("female");
		e1.setGender("female"); 
		System.out.println(empsalarycheck.and(genderCheck).test(e1));
		
//		 We have to check salary >25000 OR gender is female
		System.out.println(empsalarycheck.or(genderCheck).test(e1));
		
//		negate()
		
		System.out.println(genderCheck.negate().test(e1));
		
		//Employee Object Find Salary>25000
		Predicate<Employee> empbase=Predicate.isEqual(e1);
		Employee e2=new Employee();
		e2.setId(101);
		e2.setSalary(26000);
		System.out.println(empbase.test(e2));
	}

}
