public class Employee {
    String name;
    int salary;//maas
    int workHours;//Calisma Saati
    int hireYear;//Ise baslama yili
    int tax1;
    int bonus;
    int raiseSalary1;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    void tax(){
        if(this.salary<=1000){
            System.out.println("Vergi uygulanmayacaktir . ");
        }else{
            this.tax1= this.salary*3/100;
        }

    }
    void bonus(){
        if(workHours>40){
            this.bonus=(workHours-40)*30;
        }
    }
    void raiseSalary(){
        if(2021-hireYear<10){
            this.raiseSalary1=salary*5/100;
        } else if (2021-hireYear>9 && 2021-hireYear<20) {
            this.raiseSalary1=salary*10/100;
        } else if (2021-hireYear>19) {
            this.raiseSalary1=salary*15/100;
        }
    }

    void EmployeeKnowledge(){
        System.out.println("Isim : "+this.name + "\n"+
        "Maasi : " + this.salary + "\n"+
        "Calisma Saati : "+this.workHours+"\n"+
        "Baslangic Yili : "+this.hireYear+"\n"+
        "Vergi : "+this.tax1+"\n"+
        "Bonus : "+this.bonus+"\n"+
        "Maas artisi : "+this.raiseSalary1+"\n"+
        "Vergiler ve bonuslar ile birlikte maas : "+(this.salary-this.tax1+this.bonus)+"\n"+
        "Toplam maas : "+(this.salary+this.raiseSalary1)
        );
    }

}
