import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Person {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String surnameEmma,firstNameEmma57062,street57062,cityEmma57062;
    int zipCode57062;

    void initialize() throws IOException{
        System.out.println("Please enter you First Name: ");
        firstNameEmma57062 = br.readLine();
        System.out.println("Please enter your Surname: ");
        surnameEmma  = br.readLine();
        System.out.println("Please enter your street name: ");
        street57062= br.readLine();
        System.out.println("Please enter your City: ");
        cityEmma57062=br.readLine();
        System.out.println("Please enter your zipCode: ");
        zipCode57062= Integer.parseInt(br.readLine());
    }
//Display data method
    void printData() {
        System.out.println("First Name: "+ firstNameEmma57062 );
        System.out.println("Surname: "+ surnameEmma);
        System.out.println("Street: "+ street57062);
        System.out.println("City: "+ cityEmma57062);
        System.out.println("zipCode: "+ zipCode57062);
    }

}


class Staff extends Person{
    String educationEmma57062, PositionEmma57062;
    void Initialize1() throws IOException{
        initialize();
        System.out.println("Please enter education: ");
        educationEmma57062= br.readLine();
        System.out.println("Please enter Position: ");
        PositionEmma57062=br.readLine();

    }

    void Print(){
        printData();
        System.out.println("Education: "+educationEmma57062);
        System.out.println("Position: "+ PositionEmma57062);
    }

}


