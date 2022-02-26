
public class Student {
	
	static String name;
	static int rollno;
	static double attendance;
	static float marks;
	
	Student(String name,float marks,double attendance)
	
	{
		Student.name=name;
		Student.marks=marks;
		Student.attendance=attendance;
		if(marks<0)
			marks=0;
		
	}
	public void setName(String name) {
        Student.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttendance(double attendance) {
        Student.attendance = attendance;
    }

    public double getAttendance() {
        return attendance;
    }
    public void setMarks(float marks) {
        Student.marks = marks;
    }

    public float getMarks() {
        return marks;
    }
	

	public static void main(String[] args) 
	
	{
		
		Student stud1 = new Student("Dhruv",50,76);
		
		if(stud1.getAttendance()>75)
			stud1.setMarks(stud1.getMarks()*(float)1.1);
		System.out.println(name + " got " + stud1.getMarks());
		
		Student stud2 = new Student("Milind",87,66);
		
		if(stud2.getAttendance()>75)
			stud2.setMarks(stud2.getMarks()*(float)1.1);
		System.out.println(name + " got " + stud2.getMarks());
	}
}