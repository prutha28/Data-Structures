package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main( String[] args){
		Student s1 = new Student("prutha", 25, "111") ;
		Student s2 = new Student("janedoe", 25, "222") ;
		Student s3 = new Student("sparsh", 20, "333") ;
		Student s4 = new Student("anar" , 25, "444" );

		int value =  s1.compareTo(s3) ;
		if( value == 0)
			System.out.println(s1.getName() + " is same age as " + s3.getName());
		else if( value < 0) {
			System.out.println(s1.getName() + " is younger than " + s3.getName());
		}else{
			System.out.println(s1.getName() + " is older than " + s3.getName());
		}

		value =  s1.compareTo(s2) ;
		if( value == 0)
			System.out.println(s1.getName() + " is same age as " + s2.getName());
		else if( value < 0) {
			System.out.println(s1.getName() + " is younger than " + s2.getName());
		}else{
			System.out.println(s1.getName() + " is older than " + s2.getName());
		}

		value = s1.compareTo(s4) ;


		if( value == 0)
			System.out.println(s1.getName() + " is same age as " + s4.getName());
		else if( value < 0) {
			System.out.println(s1.getName() + " is younger than " + s4.getName());
		}else{
			System.out.println(s1.getName() + " is older than " + s4.getName());
		}


		List<Student> students = new ArrayList<Student>() ;
		students.add(s1) ;
		students.add(s2) ;
		students.add(s3) ;
		students.add(s4) ;

		Collections.sort(students) ;
		System.out.println();
		System.out.println();
		System.out.println("Sorted list is " + students);

	}


}
