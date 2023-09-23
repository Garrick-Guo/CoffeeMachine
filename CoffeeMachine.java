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
    private void buyCoffee(int number) {
        switch (number) {
            case 1:
                water -= 250;
                bean -= 16;
                cup -= 1;
                money += 4;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                bean -= 20;
                cup -= 1;
                money += 7;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                bean -= 12;
                cup -= 1;
                money += 6;
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
        obj.print();
        System.out.println("Write action (buy, fill, take):");
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        switch (operation) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int numberOfCup = input.nextInt();
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
        obj.print();
    }
}
