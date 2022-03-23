class Class1{
    public static void main(String[] args) {
        Student Student1=new Student("raja",22);

        System.out.println(Student1.name);
        System.out.println(Student1.roll_no);

        System.out.println(Student1.getAttendence());
        Student1.setAttendence();
        System.out.println(Student1.getAttendence());



    }
}
class Student{
    String name;
    int roll_no;
    private boolean status=false;
    Student(String n, int r){
        this.name=n;
        this.roll_no=r;
    }
      void setAttendence(){
        this.status=true;
    }
    boolean getAttendence(){
        return this.status ;
    }
}