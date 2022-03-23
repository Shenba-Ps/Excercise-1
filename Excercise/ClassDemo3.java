class ClassDemo3{
    public static void main(String[] args) {
        System.out.println(State.country);
        State SS = new State("AUS");
        System.out.println(SS.country);


    }
}
class State{
    public   static String country = "india";
   State(String n){
  this.country = n;
   }
}