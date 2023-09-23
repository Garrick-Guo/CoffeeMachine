package machine;


import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int water = number * 200;
        int milk = number * 50;
        int bean = number * 15;
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(bean + " g of coffee beans");
    }
}
