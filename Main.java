package COLLEGE1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College blackOps = new College("Black Ops");
		blackOps.createDepartment("Softwere");
		blackOps.createDepartment("Devops");
		blackOps.addLecturer("Yarin Bukai");
		blackOps.addLecturerToDepartment(1, 1);
		blackOps.salaryRaiseLecturer(1, 50);
		System.out.println(blackOps);
		blackOps.addStudent("natan","213410392");
		blackOps.addStudent("Ido","2323220392");
		blackOps.addStudent("ALEX","343430392");
		blackOps.addStudent("Nava","344330392");
		blackOps.addStudent("Vadim","34231392");
		blackOps.displayStudents();
		blackOps.addStudentToDepartment("213410392", 1);
		blackOps.addStudentToDepartment("2323220392", 1);
		blackOps.addStudentToDepartment("343430392", 2);
		blackOps.addStudentToDepartment("344330392", 2);
		blackOps.addStudentToDepartment("34231392", 2);
		blackOps.displayStudentsByDepID(1);
		blackOps.displayStudentsByDepID(2);
		blackOps.MaxStudentDepartment();
	}

}
