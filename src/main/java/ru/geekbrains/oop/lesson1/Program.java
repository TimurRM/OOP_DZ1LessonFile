package ru.geekbrains.oop.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        // Product  product1 = new Product("Вимм-Билль-Данн", "Domik", 310);
        // System.out.println(product1.displayInfo());

        // product1.setPrice(-1400);
        // product1.setName("Domik");
        // System.out.println(product1.displayInfo());



        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("CocaCola", "MineralAqua", 210, 0.5);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Вимм-Билль-Данн", "Domik", 310, 0.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk2.displayInfo());
        
        Chocolate chocolate1 = new Chocolate("Red October", "Avrora", 900, 223);
        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Amiri", "Vecher", 210, 333);
        System.out.println(chocolate2.displayInfo());



        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(chocolate1);
        list.add(chocolate2);

        list.add(new Chocolate("Amiri", "Vecher", 210, 333));

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes =  vendingMachine.getBottleOfWater("MineralAqua", 0.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
        VendingMachine vendingMachine1 = new VendingMachine(list);
        Chocolate chocolateRes =  vendingMachine1.getChocolate("Vecher", 333);
        if (chocolateRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }




    }

}
