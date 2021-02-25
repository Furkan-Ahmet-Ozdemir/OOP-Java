abstract class human {
    protected String name;
    protected String old;

    void olustu() {
        System.out.println("human olşturuldu");
    }

}

class teacher extends human {
    private String dal;
    private String yandal;

    @Override
    void olustu() {
        System.out.println("teacher oluştu");
    }

    public teacher(String dal, String yandal, String name, String old) {
        this.dal = dal;
        this.yandal = yandal;
        this.name = name;
        this.old = old;
    }

    public teacher() {
        this.dal = "Sınıf Öğretmeni";
        this.yandal = "Beden";
        this.name = "Furkan";
        this.old = "45";
    }

    public void showteacher() {
        System.out.println("Teachers name is " + this.name + "," + this.old + "main lesson is" + this.dal);
    }

    public String getDal() {
        return dal;
    }

    public String getYandal() {
        return yandal;
    }
}

class student extends human {
    private int number;
    private String desk;

    void olustu() {
        System.out.println("student oluştu");
    }

    public student(int number, String desk, String name, String old) {
        this.desk = desk;
        this.number = number;
        this.name = name;
        this.old = old;
    }

    public student() {
        this.desk = "10.Sıra";
        this.number = 86184132;
        this.name = "memet";
        this.old = "15";
    }

    public void showstudent() {
        System.out.println("Teachers name is " + this.name + "," + this.old + "Student number is" + this.number);
    }

    public int getNumber() {
        return number;
    }

    public String getDesk() {
        return desk;
    }
}

abstract class lesson {
    protected String lesson_name;
    protected int lesson_time;
    protected int lesson_count;

    void olustu2() {
        System.out.println("lesson olşturuldu");
    }


}

class Math extends lesson {
    private String sayilar;
    private String geometri;

    @Override
    void olustu2() {
        System.out.println("Math oluştu");
    }

    public Math(String sayilar, String geometri, String lesson_name, int lesson_time, int lesson_count) {
        this.sayilar = sayilar;
        this.geometri = geometri;
        this.lesson_count = lesson_count;
        this.lesson_name = lesson_name;
        this.lesson_time = lesson_time;
    }

    public Math() {
        this.sayilar = "1 2 3 4 5 6";
        this.geometri = "Üçgenler";
        this.lesson_count = 4;
        this.lesson_name = "matematik";
        this.lesson_time = 36;
    }

    public void showlesson() {
        System.out.println("Lesson minute is" + this.lesson_time + "Sayilar is" + this.sayilar);
    }

    public String getGeometri() {
        return geometri;
    }

    public String getSayilar() {
        return sayilar;
    }

}

class livelesson {
    public void start_live_lesson(teacher a, student asgfd, Math ondalık) {
        System.out.println(a.name + " adlı öğremen ile ve " + asgfd.name + "adlı öğrenci ile" + ondalık.lesson_name + "adlı ders başladı" + "Dersin süres" + ondalık.lesson_time);
    }

    public void ens_live_lesson() {
        System.out.println("Bitti şimdi analarınıza koşup ağlayın");
    }

}

public class Main {
    public static void main(String[] args) {
        teacher t1 = new teacher();   // öğretmen oluştu
        student s2 = new student();  // öğrenci oluştu
        Math M3 = new Math(); // ders oluştu
        livelesson le1 = new livelesson(); // canlı deres oluşturldu
        le1.start_live_lesson(t1, s2, M3); // canlı deres başlatıldı
        le1.ens_live_lesson();// canlı deres bitirldi
    }
}
