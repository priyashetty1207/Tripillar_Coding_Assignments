package Module4;

class Student {
    static String college = "SNPSU";
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.displayCollege();

        Student s1 = new Student(1, "Priyanka");
        Student s2 = new Student(2, "Balaji");

        s1.display();
        s2.display();
    }
}