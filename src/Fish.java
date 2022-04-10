 class Fish extends Animal {
    private String generalTypeEmma57062;
    public Fish(){
        super();
        generalTypeEmma57062=" ";
    }
    public Fish(String name,int age , int weight , String generalType){
        super(name,age,weight);
        this.generalTypeEmma57062=generalType;
    }
    public Fish(int age , String generalType){
        super(age);
        this.generalTypeEmma57062=generalType;
    }

    public void searchForFood(){System.out.println("im looking for food ");}

    @Override
    void getVoiceEmma57062() {
        System.out.println("Blu Blu BLu");
    }
    @Override
    public void eatEmma57062(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getGTypeEmma57062(){return this.generalTypeEmma57062;};
    public void setGTypeEmma57072(String m){this.generalTypeEmma57062=m;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+generalTypeEmma57062;
    }
}
