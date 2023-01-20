package exercisesTopic9;


public class Main {

    public static void main(String[] args) {
        Client client = new Client(10, 22, "Michael Rodriguez", 72748384);
        System.out.println("name: " + client.name + ", age: " + client.age + ", phoneNumber: " + client.phoneNumber + ", credit: " + client.credit);
        Worker worker = new Worker(30, "Juan Pedro", 73727372, 500);
        System.out.println("name: " + worker.name + ", age: " + worker.age + ", phoneNumber: " + worker.phoneNumber + ", salary: " + worker.salary);
    }

}
