package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacherOne = new Teacher("Alan Turing", "MATH", "999");
        Teacher teacherTwo = new Teacher("Nikola Tesla", "PHY", "998");
        Teacher teacherThree = new Teacher("İlber Ortaylı", "HS", "997");

        Course mathematics = new Course("Mathematics ", "101", "MATH");
        Course physical = new Course("Physical", "102", "PHY");
        Course history = new Course("History", "103", "HS");

        mathematics.addTeacher(teacherOne);
        physical.addTeacher(teacherTwo);
        history.addTeacher(teacherThree);


        Student studentOne = new Student("Student X", "001", "1", mathematics, physical, history);
        studentOne.addBulkExamNote(100, 90, 80);
        studentOne.addBulkVerbalNote(70, 60, 50);
        studentOne.isPass();
    }
}
