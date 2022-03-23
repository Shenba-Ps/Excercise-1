class ClassDemo1{
    public static void main(String[] args) {
        ClassRoom c1 = new ClassRoom(11,"rr");
        System.out.println(c1.Name);
        System.out.println(c1.Sub);
      //  c1.setName();
        System.out.println(c1.getName());

    }
}
class ClassRoom{
    public String Name = "rajan";
    public String Sub ;
    public int roll_no;
    ClassRoom(int n,String Sub){
        this.roll_no= n;
        this.Sub = Sub;
    }

//     void setName() {
//       Name = "shenba";
//    }
    String getName(){
        return this.Name;
    }
}