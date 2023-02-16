package git;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        int salari = 50;
        int dies;
        int PcPrice;
        Scanner key = new Scanner(System.in);

        System.out.print("Preu del Pc que vol comprar: ");
        PcPrice = key.nextInt();

        while (PcPrice <= 0) {
            System.out.println("Numero no Valid");
        }
        dies = PcPrice/salari;
        System.out.println("El preu del pc que vols comprar costa: "+">> "+PcPrice+" <<");
        System.out.println("Cal estalvia >> "+dies+" << "+" dies per podre comprar el Pc amb el preu de >> "+ PcPrice+" <<");
    }
}
