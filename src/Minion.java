
public class Minion {
	String name;
	int numeye;
	String color;
	String Master;
	public Minion(String name, int numeye, String color, String Master){
	this.name=name;
	this.numeye=numeye;
	this.color=color;
	this.Master=Master;
	}
	public String getMaster() {
		return Master;
	}
	public String getColor() {
		return color;
	}
public String getName() {
	return name;
}
public int getNumeye() {
	return numeye;
}
public void setColor(String color) {
	this.color = color;
}

}
