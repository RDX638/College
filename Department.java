package COLLEGE1;

import java.util.ArrayList;

public class Department {
private int id;
private String name;
private ArrayList<Lecturer> lecturers= new ArrayList<Lecturer>();
private ArrayList<Student> students = new ArrayList<Student>() ;
private static int _id =0;

public Department(String name) {
	this.id = ++_id;
	this.name = name;
}

public Department(Department d) {
	this.id = ++_id;
	this.name = d.name;
	this.lecturers = d.lecturers;
	this.students = d.students;
	
	//not by reference
//	for(Lecturer l:d.lecturers) {
//		this.lecturers.add(new Lecturer(l));
//	}
	
}



@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", lecturers=" + lecturers + ", students=" + students + "]";
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

public ArrayList<Lecturer> getLecturers() {
	return lecturers;
}
//הוספת מרצה למחלקת לימוד
public void addLecturer(Lecturer l) {
	lecturers.add(l);
}
//הסרת מרצה ממחלקת לימוד לפי תעודת זהות
public void removeLecturerById(int id) {
	boolean flag = false;

	for(Lecturer l:lecturers) {
		if(l.getId()==id) {
			String name = l.getName();
			flag = lecturers.remove(l);
			if(flag) {
				System.out.println(name +" remove from "+this.name+" department");
			}else {
				System.out.println(id + " not found...");
			}
		}
	}
}
//students
public ArrayList<Student> getStudents() {
	return students;
}
//הוספת מרצה למחלקת לימוד
public void addStudent(Student s) {
	students.add(s);
}
//הסרת מרצה ממחלקת לימוד לפי תעודת זהות
public void removeStudentById(String id) {
	boolean flag = false;

	for(Student s:students) {
		if(s.getId()==id) {
			String name = s.getName();
			flag = students.remove(s);
			if(flag) {
				System.out.println(name +" remove from "+this.name+" department");
			}else {
				System.out.println(id + " not found...");
			}
		}
	}
}



}
