class Class6{
    public static void main(String[] args) {
        State s1= new State("china");
      //  System.out.println(s1.population);
        System.out.println(s1.country);
        System.out.println(s1.getPopulation());

    }
}
class State{
    public final String country = "india";
    private final int population = 2000;
    State (String country){
      // this.country = country;
    }
//    void setPopulation(){
//        this.population = 3000;
//    }
     int getPopulation() {
        return population;
    }

}