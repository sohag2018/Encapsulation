package practice2;

public class TestPeopleNTec {

	public static void main(String[] args) {
		PeopleNTec st1 = new PeopleNTec();// cant be accessed private varibale by ref variable. need covertion
		st1.setStName("Hafiz");
		st1.setStId(3786);
		st1.setSex('M');
		st1.setPermanent(false);
		
		System.out.println("Employee info:" + st1.getStName()+" "+st1.getStId()+" "+st1.getSex()+" "+st1.isPermanent());
		
		PeopleNTec st2 = new PeopleNTec();//we can call variable by refference variable for st2 too
		st2.setStName("Sohag");
		st2.setStId(3815);
		st2.setSex('M');
		st2.setPermanent(true);
		
		System.out.println("Employee info:" + st2.getStName()+" "+st2.getStId()+" "+st2.getSex()+" "+st2.isPermanent());
		
		PeopleNTec st3 = new PeopleNTec("Tofayel", 3015, 'M', false);//we can also call for st3 but we will create constractor under class to call
		System.out.println("Employee info:"+ st3.getStName()+" "+st3.getStId()+" "+st3.getSex()+" "+st3.isPermanent());

	}

}
