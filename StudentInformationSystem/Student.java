package StudentInformationSystem;

public class Student {
    private Course c1;
    private Course c2;
    private Course c3;

    private String studentName;
    private String studentNo;
    private String classes;
    private double average;
    private boolean isPass;

    Student(String studentName, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        average = 0.0;
        isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }

    }

    void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            c1.verbalNote = verbalNote1;
        }

        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            c2.verbalNote = verbalNote2;
        }

        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            c3.verbalNote = verbalNote3;
        }
    }

    void isPass() {
        average = ((c1.note * 0.8 + c1.verbalNote * 0.2) + (c2.note * 0.8 + c2.verbalNote * 0.2)
                + (c3.note * 0.8 + c3.verbalNote * 0.2)) / 3.0;
        System.out.println((c1.note * 0.8 + "/" + c1.verbalNote * 0.2));
        System.out.println((c2.note * 0.8 + "/" + c2.verbalNote * 0.2));
        System.out.println((c3.note * 0.8 + "/" + c3.verbalNote * 0.2));


        if (average >= 60) {
            System.out.println(studentName + " passed the courses successfully");
            isPass = true;
        } else {
            System.out.println(studentName + " not passed the courses successfully");
            isPass = false;
        }

        printNote();
    }

    void printNote() {
        System.out.println(c1.courseName + " Note: " + c1.note + " \tVerbal Note: " + c1.verbalNote);
        System.out.println(c2.courseName + " Note: " + c2.note + " \tVerbal Note: " + c2.verbalNote);
        System.out.println(c3.courseName + " Note: " + c3.note + " \tVerbal Note: " + c3.verbalNote);
        System.out.println("Average: " + this.average);

    }
}

