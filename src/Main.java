public class Main {
    public static void main(String[] args) {
        Car coche=new Car();
        coche.addDoor();
        System.out.println(coche.numberOfDoors);

        System.out.println(suma(10,20,30));
    }

    public static int suma(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}