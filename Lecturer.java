package COLLEGE1;

public class Lecturer {
private int id;
private String name;
private int salaryPerHour;
private static int _id = 0;

public Lecturer(String name, int salaryPerHour) {
	this.id = ++_id;
	this.name = name;
	this.salaryPerHour = salaryPerHour;
}

public Lecturer(String name) {
	this.id = ++_id;
	this.name = name;
	this.salaryPerHour = 37;
}


public Lecturer(Lecturer l) {
	this.id = ++_id;
	this.name = l.name;
	this.salaryPerHour = l.salaryPerHour;
}

@Override
public String toString() {
	return "Lecturer [id=" + id + ", name=" + name + ", salaryPerHour=" + salaryPerHour + "]";
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalaryPerHour() {
	return salaryPerHour;
}

public void setSalaryPerHour(int salaryPerHour) {
	this.salaryPerHour = salaryPerHour;
}

public static int get_id() {
	return _id;
}










}
