public class Teacher {
    String teacherName, teacherBranch, phoneNumber;
    int teacherId;


    public Teacher(String teacherName, String teacherBranch, String phoneNumber, int teacherId) {
        this.teacherName = teacherName;
        this.teacherBranch = teacherBranch;
        this.phoneNumber = phoneNumber;
        this.teacherId = teacherId;
    }

    public void print() {
        System.out.println(this.teacherName + this.teacherBranch + this.phoneNumber + teacherId);
    }

}