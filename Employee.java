
public class Employee {
	private String empName;
	private int empID;
	private char sex;
	private boolean usaCitizen;
	
	public Employee() {}//we make this constractor to have access for 2nd employee (but we mad it in next step)
	public Employee(String empName, int empID, char sex, boolean usaCitizen) {
		this.empName = empName;
		this.empID = empID;
		this.sex = sex;
		this.usaCitizen = usaCitizen;
	}
	
public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsaCitizen() {
		return usaCitizen;
	}
	public void setUsaCitizen(boolean usaCitizen) {
		this.usaCitizen = usaCitizen;
	}


}
