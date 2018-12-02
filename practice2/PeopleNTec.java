package practice2;

public class PeopleNTec {
private String StName;
private int StId;
private char sex;
private boolean permanent;

public PeopleNTec() {}

public PeopleNTec(String stName, int stId, char sex, boolean permanent) {
	super();
	StName = stName;
	StId = stId;
	this.sex = sex;
	this.permanent = permanent;
}





public String getStName() {
	return StName;
}
public void setStName(String stName) {
	StName = stName;
}
public int getStId() {
	return StId;
}
public void setStId(int stId) {
	StId = stId;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public boolean isPermanent() {
	return permanent;
}
public void setPermanent(boolean permanent) {
	this.permanent = permanent;
}



}
