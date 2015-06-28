package cloning;

public class ShallowCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		DepartmentShallow dept = new DepartmentShallow(01, "Starks") ;
		EmployeeShallow originalEmployee = new EmployeeShallow(44, "Jon Snow", dept) ;
		
		EmployeeShallow clonedEmployee = (EmployeeShallow) originalEmployee.clone() ;
		
		System.out.println("Verifying the rules of JDK :");
		
		// true
		System.out.println(originalEmployee != clonedEmployee);
			
		// true
		System.out.println("originalEmployee.getClass() == clonedEmployee.getClass()   " 
		+ originalEmployee.getClass().equals(clonedEmployee.getClass()));
		
		//false
		System.out.println("originalEmployee.equals(clonedEmployee)   " 
		+ originalEmployee.equals(clonedEmployee));
		
		System.out.println("Original Employee is : " + originalEmployee);
		System.out.println("\n\n");
		System.out.println("Cloned Employee is : " + clonedEmployee);
		
		System.out.println("Changing department name in the clone");
		clonedEmployee.getDepartment().setName("Targayryan") ;
		
		System.out.println("Department Name of the original employee :: " + originalEmployee.getDepartment().getName());
		
	}

}
