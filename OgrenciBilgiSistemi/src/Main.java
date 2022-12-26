public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Zeki Hoca \t", "TRH\t", "189 \t", 1);
        Teacher teacher2 = new Teacher("Kamile Hoca \t", "FZK\t", "256\t", 2);
        Teacher teacher3 = new Teacher("Eren Hoca \t", "MAT\t", "898\t", 3);
        teacher1.print();
        teacher2.print();
        teacher3.print();
        Courses tarih = new Courses(1, "Tarih", "TRH");
        Courses fizik = new Courses(2, "Fizik", "FZK");
        Courses matematik = new Courses(3, "Matematik", "MAT");
        tarih.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        matematik.addTeacher(teacher3);

        Student s1 = new Student("Ali", "123456", 4, tarih, fizik, matematik);
        s1.addBulkExamNote(50, 50, 0);
        s1.addVerbalNote(100, 85);
        s1.printNote();
    }

}