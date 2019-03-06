package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double remainigMoney = 0;
        double moneySpend = 0;
        boolean gameInMotion = true;
        while(gameInMotion == true){
            String command = scanner.nextLine();
            double price;
            boolean outOfMoney = false;
            while(currentBalance > 0 && gameInMotion == true) {
                //!command.equals("Game Time")
                switch (command) {
                    case "OutFall 4":
                        price = 39.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            command = scanner.nextLine();
                        }
                        break;
                    case "CS: OG":
                        price = 15.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            command = scanner.nextLine();
                        }
                        break;
                    case "Zplinter Zell":
                        price = 19.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            if (currentBalance == 0.0){
                                outOfMoney = true;
                                continue;
                            }
                            command = scanner.nextLine();
                        }
                        break;
                    case "Honored 2":
                        price = 59.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            command = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch":
                        price = 29.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            command = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        price = 39.99;
                        if (currentBalance < price){
                            System.out.println("Too Expensive");
                            command = scanner.nextLine();
                            continue;
                        } else {
                            currentBalance -= price;
                            moneySpend += price;
                            System.out.printf("Bought %s%n", command);
                            price *= 0;
                            command = scanner.nextLine();
                        }
                        break;
                    case "Game Time":
                        //Total spent: $89.98. Remaining: $30.02
                        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",moneySpend, currentBalance);
                        gameInMotion = false;
                        continue;
                    default:
                        System.out.println("Not Found");
                        command = scanner.nextLine();
                        break;

                }
            }
            if (currentBalance == 0.0){
                System.out.println("Out of mo-ney!");
                break;
            }
        }
    }
}
