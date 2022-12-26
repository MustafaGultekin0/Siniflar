public class Courses {
    Teacher courseTeacher;
    int courseId, note, verbalNote;
    String courseName, prefix;


    Courses(int courseId, String courseName, String prefix) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.note = 0;
        this.verbalNote = 0;

    }


    public void courseInfo() {
        System.out.println(this.courseId + this.courseName + this.courseTeacher);
    }

    public void addTeacher(Teacher teacher) {

        if (this.courseId == teacher.teacherId) {
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı. ");
        } else {
            System.out.println(teacher.teacherName + "Akademisyen bu dersi veremez. ");
        }

    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.courseName + "dersinin akademisyeni: " + courseTeacher.teacherName);
        } else {
            System.out.println(this.courseName + "dersine akademsiyon atanmamıştır");
        }
    }

}