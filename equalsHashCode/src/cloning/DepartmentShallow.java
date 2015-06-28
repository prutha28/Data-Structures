package cloning;

public class DepartmentShallow {

	private int id ;
	private String name ;
	
	public DepartmentShallow(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Department Name : " + this.name + "\n" +
				"Department Id : " + this.id;
		
	}
	
}
