class Class5{
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("EEE","DSP",75);
        System.out.println(s1.Department);
        System.out.println(s1.Subject);
        System.out.println(s1.Department);
        System.out.println(s1.getStudent_name());

        ClassRoom s2 = new ClassRoom("EEE","DSP",80);
        System.out.println(s2.Department);
        System.out.println(s2.Subject);
        System.out.println(s2.Mark);
   //    s2.ChangeNamee();
      s2.ChangeName();
        System.out.println(s2.ChangeNamee());





    }
}
class ClassRoom{
   private String Student_name = "shenba";
   String Department;
    String Subject;
    int Mark;
    ClassRoom(String D,String S,int M){
        this.Department= D;
        this.Subject= S;
        this.Mark= M;

    }
    void setStudent_name (){
        this.Student_name = "rajan";

    }
    String getStudent_name(){
        return this.Student_name;
    }
    void ChangeName(){
        this.Student_name = "thivakar";
    }
    String ChangeNamee(){
        return this.Student_name;
    }

}