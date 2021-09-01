package StudentInformationSystem;

public class Course {
    Teacher teacher;
    String courseName;
    String courseCode;
    String prefix;
    int note;
    int verbalNote = 0;

    Course(String courseName, String courseCode, String prefix) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("Teacher and Course branch are not equal");
        }

    }

    void printTeacher() {
        this.teacher.print();
    }


}
