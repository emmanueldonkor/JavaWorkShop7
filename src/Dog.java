public class Dog extends Mammal{
    private String favColorEmma57062;
    Dog(){
        super();
        favColorEmma57062="Yellow";
    }
    public Dog(String name,int age , int weight , String order, String favColor){
        super(name,age,weight,order);
        this.favColorEmma57062=favColor;
    }
    public Dog(int age , String order, String favColor){
        super(age,order);
        this.favColorEmma57062=favColor;
    }
    public void WakeUp(){System.out.println("I Just Woke Up ");}

    @Override
    public void SleepEmma57062() {
        System.out.println("The Dog Is Sleeping");
    }

    @Override
    void getVoiceEmma57062() {
        System.out.println("Haw Haw");
    }

    @Override
    public void eatEmma57062(String meal) {
        System.out.println("I am Eating my meat");
    }
    public String getFavColorEmma57062()
    {return this.favColorEmma57062;};

    public void setFavColorEmma57062(String w)
    {this.favColorEmma57062=w;};

    public String ToString(){
        return "Dog :\n "+"Favorite Color : "+favColorEmma57062;
    }
}
