package cloning;

public class DepartmentDeep implements Cloneable{

	private int id ;
	private String name ;
	
	public DepartmentDeep(int id, String name) {
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
