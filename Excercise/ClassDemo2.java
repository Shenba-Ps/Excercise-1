class ClassDemo2{
    public static void main(String[] args) {
        Showroom S = new Showroom("fz");
        System.out.println(S.getV_Name());
        System.out.println(S.M_Name);
        S.setV_Name();
        System.out.println(S.getV_Name());

    }
}
class Showroom{
    private String V_Name = "yamaha";
    String M_Name ;
    Showroom(String N){
        this.M_Name = N;
    }
    void setV_Name(){
        this.V_Name = "Suzuki";
    }
    String getV_Name(){
        return this.V_Name;
    }

}