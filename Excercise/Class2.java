class Class2{
    public static void main(String[] args) {
        Employee Employee1=new Employee("rajan",101,20000);


      //  System.out.println(Employee1.setIs_working());
        System.out.println(Employee1.name);
        System.out.println(Employee1.id);
        System.out.println(Employee1.salary);
        System.out.println(Employee1.getStatus());
        Employee1.setStatus();
        System.out.println(Employee1.getStatus());





    }
}
class Employee{
    String name;
    int id;
    double salary;
    boolean is_working=true;
    Employee(String n,int id,double amount){
        this.name=n;
        this.id=id;
        this.salary=amount;
    }
    void setStatus(){
        this.is_working=false;
    }
    boolean getStatus (){
        return this.is_working;
    }
}