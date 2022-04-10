public abstract class Animal {
    String NameEmma57062;
    int ageEmma57062,weightEmma57062;

    public Animal(String name,int age , int weight){
        this.NameEmma57062=name;
        this.ageEmma57062=age;
        this.weightEmma57062=weight;
    }
    public Animal(int age) {
        this.ageEmma57062=age;
    }

    public void eatEmma57062(String meal){};
    abstract void getVoiceEmma57062();
    public Animal(){
        ageEmma57062 = weightEmma57062=0;
        NameEmma57062="None";
    }

    public String getNameEmma()
    {return this.NameEmma57062;};
    public void setNameEmma57062(String m)
    {this.NameEmma57062=m;};
    public int getAgeEmma57062()
    {return this.ageEmma57062;};
    public void setAgeEmma57062(int m)
    {this.ageEmma57062=m;};
    public int getWeightEmma57062()
    {return this.weightEmma57062;};
    public void setWeightEmma57062(int m)
    {this.weightEmma57062=m;};
}
