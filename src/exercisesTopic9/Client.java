package exercisesTopic9;

public class Client extends Person {
    int credit;
    Client(int credit, int age, String name, int phoneNumber){
        super(age,name,phoneNumber);
        this.credit=credit;
    }
}
