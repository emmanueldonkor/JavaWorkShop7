 class Bird extends Animal {
    private String typeBirdEmma57062;
    public Bird(){
        super();
        typeBirdEmma57062=" ";
    }
    public Bird(String name,int age , int weight , String typesOfBird){
        super(name,age,weight);
        this.typeBirdEmma57062= typesOfBird;
    }
    public Bird(int age , String typesOfBird){
        super(age);
        this.typeBirdEmma57062= typesOfBird;
    }

    public void Fly(){System.out.println("I'm flying ");}

    @Override
    void getVoiceEmma57062() {
        System.out.println("Quack Quack Quack");
    }
    @Override
    public void eatEmma57062(String meal) {
        System.out.println("Bird is eating a "+ meal);
    }
    public String getTypeEmma57062()
    {return this.typeBirdEmma57062;};
    public void setTypeEmma57062(String m)
    {this.typeBirdEmma57062=m;};
    public String ToString(){
        return "Bird :\n "+"Type of Bird : "+typeBirdEmma57062;
    }
}
