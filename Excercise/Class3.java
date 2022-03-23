class Class3{
    public static void main(String[] args) {
        Animal a1= new Animal("wild animal",20);
        System.out.println(a1.getName());
        a1.setName();
        System.out.println(a1.getName());

        Animal a2= new Animal("wild animal",22);
        System.out.println(a2.getChange());
        a2.setChange();
        System.out.println(a2.getChange());


    }
}
class Animal {
    private String name = "lion";
    String type;
    int age;

    Animal(String type, int age) {

        this.type = type;
        this.age = age;
    }

    void setName() {
        this.name = "tiger";
    }

    String getName() {
        return this.name;
    }

    void setChange(){
        this.name = "puma";
    }

    String getChange() {
        return this.name;
    }
}
