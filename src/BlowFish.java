 class BlowFish extends Fish {
    private String typeEmma57062;
    public BlowFish(){
        super();
        typeEmma57062="Tetraodontidae ";
    }
    public BlowFish(String name,int age , int weight , String order, String Type){
        super(name,age,weight,order);
        this.typeEmma57062=Type;
    }
    public BlowFish(int age , String order, String Type){
        super(age,order);
        this.typeEmma57062=Type;
    }
    public void travel(){System.out.println("Im going  _");}

    @Override
    public void searchForFood() {
        System.out.println("The Blowfish is searching for something to eat ");
    }

    @Override
    void getVoiceEmma57062() {
        System.out.println("Blu Blu BLu");
    }

    @Override
    public void eatEmma57062(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public String getType()
    {return this.typeEmma57062;};

    public void setType(String m)
    {this.typeEmma57062=m;};

    public String ToString(){
        return "BlowFish :\n "+"Type : "+typeEmma57062;
    }
}
