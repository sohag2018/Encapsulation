
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();//we can not access private variable by reference variabl, we need set&geter
		emp1.setEmpName("Muhammad Sohag");// now we can get accessed variabl as it has been converted
		emp1.setEmpID(3815);
		emp1.setSex('M');
		emp1.setUsaCitizen(false);
		
		System.out.println(emp1.getEmpName() +"  " +emp1.getEmpID()+"  "  +emp1.getSex()+"  "+emp1.isUsaCitizen());
        Employee emp2 = new Employee("Hafizur Rahman", 3855, 'M', true);
        		System.out.println(emp2.getEmpName()+" "+emp2.getEmpID()+" "+emp2.getSex()+" "+emp2.isUsaCitizen());
	}

}
