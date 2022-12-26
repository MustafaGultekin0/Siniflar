public class Student {
    String name, studentNo;
    Courses matematik, fizik, tarih;
    int classes;
    double avarage;
    boolean isPass;

    public Student(String name, String studentNo, int classes, Courses tarih, Courses fizik, Courses matematik) {

        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.matematik = matematik;
        this.tarih = tarih;
        this.fizik = fizik;

        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int tarih, int fizik) {
        if (mat >= 0 && mat <= 100) {
            this.matematik.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;
        }
    }

    public void addVerbalNote(int tarih, int fizik) {

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }
        if (tarih >= 0 && tarih <= 100) {
            this.tarih.verbalNote = tarih;
        }
    }


    public void calcAvarage() {
        this.avarage = (((this.fizik.verbalNote * 0.20) + (this.fizik.note * 0.80)) +
                ((this.tarih.verbalNote * 0.35) + (this.tarih.note * 0.65)) + this.matematik.note) / 3.0;
    }


    public void isPass() {
        calcAvarage();
        if (this.matematik.note == 0 || this.fizik.note == 0 || this.tarih.note == 0) {
            System.out.print("Notlar tam olarak girilmedi.");
        }
        if (this.avarage >= 60) {
            this.isPass = true;
            System.out.println("Sınıfı geçti! Ortalama: " + this.avarage);
        } else if (this.avarage <= 59) {
            System.out.print("Sınıfta kaldı! Ortalama: " + this.avarage);
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matematik.note);

        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu: " + this.fizik.verbalNote);
        System.out.println("Tarih Notu : " + this.tarih.note);
        System.out.println("Tarih Sözlü Notu: " + this.tarih.verbalNote);
        isPass();
    }
}