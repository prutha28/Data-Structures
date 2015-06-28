package comparable;

public class Student implements Comparable<Student>{

	String name ;
	Integer age ;
	String id ;

	
	public Student(String name, Integer age, String id) {
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

	@Override
	public int compareTo(Student o) {
		if ( this.age > o.getAge())
			return 1 ; 
		else if ( this.age < o.getAge())
			return -1;
		else {
			if ( this.id.compareTo(o.getId() )> 0)
				return 1;
			else if ( this.getId().compareTo(o.getId()) < 0 )
				return -1;
			else
				return 0 ;
		}
		
	}
	
	public String toString(){
		return "\n" + getName() + "  " +  getId() + "  " + getAge() ;
	}
	
}
