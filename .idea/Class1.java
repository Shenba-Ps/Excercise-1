class Class1{
    public static void main(String[] args) {
        Student Student1=new Student("raja",22);
        System.out.println(Student1.status);
        System.out.println(Student1.n);
        System.out.println(Student1.r);
        System.out.println(Student1.attendence_status);
        Student Student2=new Student("shenba",23);
        System.out.println(Student2.status);


    }
}
class Student{
    String name;
    int roll_no;
    private boolean status=true;

    Student(String n,int r){
        this.name=n;
        this.roll_no=r;
    }
    void attendence{
        status=false;
    }
    boolean attendence_status{
        return false;
    }
}