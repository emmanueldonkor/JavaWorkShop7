import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        //Write your codes here
        //Task 2
        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("Man",9,15,"Security");
        animal[1]= new Dog("Bob",12,10,"Polska","white");
        animal[2]= new Bird("Blue bird",5,4,"peaker");
        animal[3]= new Fish("Gold Fish",3,2,"Jawless");
        animal[4]= new BlowFish("Blow Fish",7,11,"Greenland","Blow");
        animal[5]= new Pigeon("MyPigeon",60,30,"Atlantic",351);


        // Bird
        animal[1].getVoiceEmma57062();
        animal[2].getVoiceEmma57062();

        //Task1
        Staff st= new Staff();
        st.Initialize1();
         st.Print();
    }

}
