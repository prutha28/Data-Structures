package comparator;

import java.util.Comparator;

public class Student{

	String name ;
	Integer age ;
	String id ;

	
	public Student(String name, Integer age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	} 
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString(){
		return "\n" + getName() + " Id " +  getId() + " Age " + getAge() ;
	}
}
