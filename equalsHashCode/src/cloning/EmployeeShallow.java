package cloning;

public class EmployeeShallow implements Cloneable {

	private int employeeId ;
	private String employeeName ; 
	private DepartmentShallow department ;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public DepartmentShallow getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentShallow department) {
		this.department = department;
	}
	
	public EmployeeShallow(int employeeId, String employeeName, DepartmentShallow department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		
		return "Name: " + this.employeeName + "\n" +
			   "Id: " + this.employeeId + "\n" +
			   this.department ;		
	}
}
