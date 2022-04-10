public class Pigeon extends Bird {
    private int noSpecies;
    Pigeon(){
        super();
        noSpecies=351;
    }
    public Pigeon(String name,int age , int weight , String order, int noSpecies){
        super(name,age,weight,order);
        this.noSpecies=noSpecies;
    }
    public Pigeon(int age , String order, int noSpecies){
        super(age,order);
        this.noSpecies=noSpecies;
    }
    public void danceEmma(){System.out.println("I'm dancing");}

    @Override
    public void Fly(){System.out.println("The Pigeon is flying ");}

    @Override
    void getVoiceEmma57062() {
        System.out.println("PAk PAk PAk");
    }

    @Override
    public void eatEmma57062(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public int getNoSpeciesEmma()
    {return this.noSpecies;};
    public void setNoSpeciesEmma(int m)
    {this.noSpecies=m;};
    public String ToString(){
        return "Pigeon :\n "+"Number of Species : "+noSpecies;
    }
}
