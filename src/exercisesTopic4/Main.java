package exercisesTopic4;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        final int numeroIf=10;
        int numberWhile=0;
        if(numeroIf>0){
            System.out.println(numeroIf+" Is a Positive Number");
        } else if (numeroIf<0) {
            System.out.println(numeroIf+" Is a Negative Number");
        }else{
            System.out.println(numeroIf+" Is 0 Number");
        }


        while (numberWhile < 3){
            System.out.println("WHILE: "+numberWhile);
            numberWhile++;
        }

        do {
            System.out.println("DO WHILE: "+numberWhile);
            numberWhile+=3;
        }while (numberWhile<3);

        for (int numberFor=0; numberFor<=3; numberFor++) System.out.println("FOR: "+numberFor);

        String stationWorld= "Invierno";

        switch (stationWorld){
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("otoño");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Invierno");
        }
    }



}