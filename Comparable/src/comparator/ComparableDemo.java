package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main( String[] args){
		Student s1 = new Student("prutha", 25, "111") ;
		Student s2 = new Student("savinay", 25, "222") ;
		Student s3 = new Student("sparsh", 20, "333") ;


		List<Student> students = new ArrayList<Student>() ;
		students.add(s1) ;
		students.add(s2) ;
		students.add(s3) ;

		System.out.println("Sorting list in reverse order of names\n");
		Collections.sort(students, new NameComparator()) ;
		System.out.println("Sorted list is " + students);

		System.out.println("\nSorting list in reverse order of ages\n");
		Collections.sort(students, new AgeComparator()) ;
		System.out.println("Sorted list is " + students);
	}


}
