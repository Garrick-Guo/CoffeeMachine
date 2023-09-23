package machine;


import java.util.Scanner;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int bean = 120;
    private int cup = 9;
    private int money = 550;

    private void print(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(bean + " g of coffee beans");
        System.out.println(cup + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }
    private void buyCoffee(String number) {
        switch (number) {
            case "1":
                if (water - 250 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (bean - 16 < 0){
                    System.out.println("Sorry, not enough beans!");
                } else if (cup - 1 < 0) {
                    System.out.println("Sorry, not enough cup!");
                } else {
                    water -= 250;
                    bean -= 16;
                    cup -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water - 350 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk - 75 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (bean - 20 < 0) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cup - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else {
                    water -= 350;
                    milk -= 75;
                    bean -= 20;
                    cup -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water - 200 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk - 100 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (bean - 12 < 0) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cup - 1 < 0){
                    System.out.println("Sorry, not enough cups!");
                } else {
                    water -= 200;
                    milk -= 100;
                    bean -= 12;
                    cup -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            default:
                break;
        }
    }

    private void fillInventory(Scanner input) {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = input.nextInt();
        water += addWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = input.nextInt();
        milk += addMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBean = input.nextInt();
        bean += addBean;
        System.out.println("Write how many disposable cups you want to add: ");
        int addCup = input.nextInt();
        cup += addCup;
    }
    public static void main(String[] args) {
        CoffeeMachine obj = new CoffeeMachine();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        while (!operation.equals("exit")){
            switch (operation) {
                case "remaining":
                    obj.print();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String numberOfCup = input.nextLine();
                    obj.buyCoffee(numberOfCup);
                    break;
                case "fill":
                    obj.fillInventory(input);
                    break;
                case "take":
                    System.out.println("I gave you " + obj.money);
                    obj.money = 0;
                    break;
                default:
                    break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            operation = input.nextLine();
        }
    }
}
