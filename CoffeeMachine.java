package machine;


import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner input = new Scanner(System.in);
        int water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int bean = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int total = input.nextInt();
        int cupByWater = water / 200;
        int cupByMilk = milk / 50;
        int cupByBean = bean / 15;
        int minCup = Math.min(cupByBean, cupByMilk);
        minCup = Math.min(minCup, cupByWater);
        if (minCup == total) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minCup > total) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (minCup - total) + " more than that)");
        } else {
            System.out.println("No, I can make only " + minCup + " cup(s) of coffee");
        }
    }
}
