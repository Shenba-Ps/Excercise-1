class Class4{
    public static void main(String[] args) {
        Showroom a1=new Showroom("yamaha","ray");
        System.out.println(a1.getCount());
        a1.setCount();
        System.out.println(a1.getCount());
        System.out.println(a1.name);
        System.out.println(a1.Brand);

        Showroom a2 = new Showroom("hero","splendor");
        System.out.println(a2.name);
        System.out.println(a2.Brand);

        a2.getChangecount();
        a2.setChangecount();
        System.out.println(a2.getChangecount());

    }
}
class Showroom{
    String name;
    String Brand;
   private int count = 20;
    Showroom(String n,String b){
        this.name=n;
        this.Brand=b;

    }
    void setCount() {
        this.count = 30;
    }
    int getCount(){
        return this.count;
    }
    void setChangecount() {
        this.count = 22;
    }
    int getChangecount(){
        return this.count;
    }
}