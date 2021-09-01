package StudentInformationSystem;

public class Teacher {
    String teacherName;
    String branch;
    String mobilePhoneNo;

    Teacher(String teacherName, String branch, String mobilePhoneNo) {
        this.teacherName = teacherName;
        this.branch = branch;
        this.mobilePhoneNo = mobilePhoneNo;
    }

    void print() {
        System.out.println("Teacher Name: " + this.teacherName
                + "\nBranch: " + this.branch
                + "\nMobile Phone: " + this.mobilePhoneNo);
    }

}
