package cloning;

public class EmployeeDeep implements Cloneable {

	private int employeeId ;
	private String employeeName ; 
	private DepartmentDeep department ;

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
	public DepartmentDeep getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDeep department) {
		this.department = department;
	}
	
	public EmployeeDeep(int employeeId, String employeeName, DepartmentDeep department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + this.employeeName + "\n" +
			   "Id: " + this.employeeId + "\n" +
			   this.department ;		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmployeeDeep employeeClone = (EmployeeDeep)super.clone() ;
		employeeClone.setDepartment((DepartmentDeep)employeeClone.getDepartment().clone()) ;
		return employeeClone;
				
	}
}
