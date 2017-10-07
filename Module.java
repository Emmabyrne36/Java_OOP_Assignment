public class Module {
	private String code;
	private String title;
	private Instructor instructor;
	private final int MAX_NUMBER_STUDENTS = 80;
	private Student[] students = new Student[MAX_NUMBER_STUDENTS];
	private int number_students = 0;

	public Module(String code, String title){
		this.code = code;
		this.title = title;
	}

	// use this.code??
	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public boolean addStudent(Student s){
		// Start counter at 0, add student at that index, increase counter
		if (this.number_students < MAX_NUMBER_STUDENTS) {
			students[this.number_students] = s;
			this.number_students ++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		// Create a string builder to add the relevant information to
		StringBuilder sb = new StringBuilder("");
		sb.append("code: " + code + "\ntitle: " + title + "\ninstructor: ");
		if (this.instructor == null) {
			sb.append("not set");
		} else {
			sb.append(instructor.getName());
		}
		sb.append("\nstudents: \n");
		// if the student array is empty, append "null", else iterate through the array and add the names of the students to the array
		if (students[0] == null){
			sb.append("\tnone \n");
		} else {
			for (Student s: students) {
				if (s == null){
					break;
				} else {
				sb.append("\t" + s.getName() + "\n");
				}
			}
		}
		return sb.toString();
	}
}
