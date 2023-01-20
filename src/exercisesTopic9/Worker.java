package exercisesTopic9;

public class Worker extends Person {
    float salary;

    Worker(int age, String name, int phoneNumber, float salary) {
        super(age, name, phoneNumber);
        this.salary = salary;
    }
}
