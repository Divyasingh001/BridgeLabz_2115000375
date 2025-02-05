import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this); 
        }
    }

    public void showCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
        System.out.println("-----------------------------");
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); 
        }
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName() + " (Professor: " + course.getProfessorName() + ")");
        }
        System.out.println("-----------------------------");
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessorName() {
        return (professor != null) ? professor.getName() : "No Professor Assigned";
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
        System.out.println("-----------------------------");
    }
}

public class UniversityManagement2{
    public static void main(String[] args) {
     
        Professor profSmith = new Professor("Dr. Smith");
        Professor profJohnson = new Professor("Dr. Johnson");

        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

       
        profSmith.assignCourse(math);
        profJohnson.assignCourse(cs);

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.enrollCourse(math);
        alice.enrollCourse(cs);
        bob.enrollCourse(cs);

        alice.showEnrolledCourses();
        bob.showEnrolledCourses();
        profSmith.showCourses();
        profJohnson.showCourses();
        math.showStudents();
        cs.showStudents();
    }
}
