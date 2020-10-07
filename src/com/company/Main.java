package com.company;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        /*Floor f = new Floor("Дерево","Коричневий",true,true);
        System.out.println(f);*/
        Scanner s1 = new Scanner(System.in);
        System.out.println("  Hello, enter information about floоr: \n" );
        System.out.println(" 1)Enter length: ");
        int length = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println(" 2)Enter width: ");
        int width = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println(" 3)Enter first coating material: ");
        String first_coating_material = s3.nextLine();

        Scanner s4 = new Scanner(System.in);
        System.out.println(" 4)Enter type of floor covering: ");
        String type_of_floor_covering = s4.nextLine();

        Scanner s5 = new Scanner(System.in);
        System.out.println(" 5)Enter color: ");
        String color = s5.nextLine();

        Scanner s6 = new Scanner(System.in);
        System.out.println(" 6)Enter, do you have a floor heating function?(true/false): ");
        boolean underfloor_heating_function = s6.nextBoolean();

        Scanner s7 = new Scanner(System.in);
        System.out.println(" 7)Enter, do you have a noise isolation function?(true/false): ");
        boolean noise_isolation_function = s7.nextBoolean();

        Scanner s8 = new Scanner(System.in);
        System.out.println(" 8)Enter, how much is the floor in dollars: ");
        int price = s8.nextInt();

        System.out.println('\n' + " Your information: ");

        Floor f1 = new Floor(length, width, first_coating_material, type_of_floor_covering, color, underfloor_heating_function, noise_isolation_function, price);
        double floorArea = f1.Area();
        System.out.println(" FloorArea = " + floorArea + " (квадратних метрів)." + '\n' + f1);
    }
}
