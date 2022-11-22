package COLLEGE1;

import java.util.ArrayList;

public class College {
	private String name;
	private ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
	private ArrayList<Department> departments = new ArrayList<Department>();
	private ArrayList<Student> students = new ArrayList<Student>(500);

//	students.ensureCapacity(500);
	public College(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", lecturers=" + lecturers + ", departments=" + departments + "]";
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

	public void setLecturers(ArrayList<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public void displayStudents() {
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public void displayStudentsByDepID(int id) {
		for (Department d : departments) {
			if (d.getId() == id) {
				System.out.println(d.getStudents());
			}
		}
	}

	// Student
	public void addStudent(String name, String id) {
		students.add(new Student(name, id));
	}

	// Lecturer
	// הוספת מרצה חדש למכללה
	public void addLecturer(String name) {
		lecturers.add(new Lecturer(name));
	}

	// הוספתך מרצה חדש למכללה עם שכר מראש
	public void addLecturerAndSalaryPerHour(String name, int salaryPerHour) {
		lecturers.add(new Lecturer(name, salaryPerHour));
	}

	// העלאת משכורת של מרצה קיים
	public void salaryRaiseLecturer(int idLecturer, int salaryPerHour) {
		if (getLecturerById(idLecturer) == null) {
			System.out.println("Lecturer id not found...");
			return;
		}
		getLecturerById(idLecturer).setSalaryPerHour(salaryPerHour);
	}
	// חיפוש סטודנט מצוך המכללה לפי תעודת זהות

	public Student getStudentById(String id) {
		for (Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}

		return null;
	}
	// חיפוש סטודנט מצוך המכללה לפי שם

	public Student getStudentByName(String name) {
		for (Student s : students) {
			if (s.getName() == name) {
				return s;
			}
		}

		return null;
	}

	// חיפוש מרצה מצוך המכללה לפי תעודת זהות
	public Lecturer getLecturerById(int id) {
		for (Lecturer l : lecturers) {
			if (l.getId() == id) {
				return l;
			}
		}

		return null;
	}

	// חיפוש מרצה מתוך מכללה לפי שם מלא
	public Lecturer getLecturerByName(String name) {
		for (Lecturer l : lecturers) {
			if (l.getName() == name) {
				return l;
			}
		}

		return null;
	}

	// Departments
	// חיפוש מחלקת לימוד לפי מספר מזהה של מחלקת לימוד
	public Department getDepartmentById(int id) {
		for (Department d : departments) {
			if (d.getId() == id) {
				return d;
			}
		}

		return null;
	}

	// יצירת מחלקת לימוד במכללה
	public void createDepartment(String name) {
		Department d = new Department(name);
		departments.add(d);
	}

	// שיבוץ מרצה לפי תעודת זהות ולפי מספר מזהה מחלקה במחלקת לימוד
	public void addLecturerToDepartment(int idLecturer, int idDepartment) {
		// חיפוש והשמה של מרצה בעזרת מתודה שמחזירה (כתובת בזיכרון) מרצה לפי תז
		Department d = getDepartmentById(idDepartment);
		// יחזיר הודעה בהתאם אם מחלקת לימוד לא נמצאה
		if (d == null) {
			System.out.println("Department id not found...");
			return;
		}
		// חיפוש והשמה של מחלקת לימוד בעזרת מתודה שמחזירה (כתובת בזיכרון) מחלקת לימוד
		// לפי מזהה

		Lecturer l = getLecturerById(idLecturer);

		// יחזיר הודעה בהתאם אם מרצה לא נמצא
		if (l == null) {
			System.out.println("Lecturer id not found...");
			return;
		}
		// שימוש במתודה ממחלקת דיפרטמנט להוספת מרצה במחלקת לימוד
		d.addLecturer(l);
	}

	public void addStudentToDepartment(String idStudent, int idDepartment) {
		// חיפוש והשמה של סטודנט בעזרת מתודה שמחזירה (כתובת בזיכרון) סטודנט לפי תז
		Department d = getDepartmentById(idDepartment);
		// יחזיר הודעה בהתאם אם מחלקת לימוד לא נמצאה
		if (d == null) {
			System.out.println("Department id not found...");
			return;
		}
		// חיפוש והשמה של מחלקת לימוד בעזרת מתודה שמחזירה (כתובת בזיכרון) מחלקת לימוד
		// לפי מזהה

		Student s = getStudentById(idStudent);

		// יחזיר הודעה בהתאם אם מרצה לא נמצא
		if (s == null) {
			System.out.println("Student id not found...");
			return;
		}
		// שימוש במתודה ממחלקת דיפרטמנט להוספת סטודנט במחלקת לימוד
		d.addStudent(s);
	}

	public void MaxStudentDepartment() {
		int max = 0;
		Department dmax=null;
		for (Department d : departments) {
			if (max < d.getStudents().size()) {
				max = d.getStudents().size();
				 dmax = d;
			}
			
		}
		if(dmax!=null)
			System.out.println(dmax.getStudents());
	}
}
