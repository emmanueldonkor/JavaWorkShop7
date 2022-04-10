public class Mammal  extends Animal{
    private String orderEmma57062;
    public Mammal(){
        super();
        orderEmma57062=" ";
    }
    public Mammal(String name,int age , int weight , String order){
        super(name,age,weight);
        this.orderEmma57062=order;
    }
    public Mammal(int age , String order){
        super(age);
        this.orderEmma57062=order;
    }

    public void SleepEmma57062(){System.out.println("zzz");}

    @Override
    void getVoiceEmma57062() {
        System.out.println("I am Making Sound ---!@#%$$#@#");
    }
    @Override
    public void eatEmma57062(String meal) {
        System.out.println("Mamal is eating a "+ meal);
    }
    public String getOrderEmma57062(){return this.orderEmma57062;};
    public void setOrderEmma57062(String m){this.orderEmma57062=m;};
    public String ToStringEmma57062(){
        return "Mammal :\n "+"Order : "+orderEmma57062;
    }
}
