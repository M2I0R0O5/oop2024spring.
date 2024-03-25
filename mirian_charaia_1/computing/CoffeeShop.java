package oop2024spring.quizes.q2.mirian_charaia_1.computing;

public class CoffeeShop {
    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int tax = 34; // lari
        int water = 31; // tetri
        int gas = 288; // tetri
        int electricity = 79; // lari
        int parking = 26; // lari

        int otherExpenses = tax*100 + water + gas + electricity*100 + parking*100;

        double profitInLaris = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println("Profit in lari: " + profitInLaris/100);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        double totalIncome = pricePerCoffee * numCoffeeSold ; // Convert price to lari
        double totalCost = (totalCostOfBeans + otherExpenses); // Convert cost of beans to lari

        double profitInLaris = totalIncome - totalCost;
        return profitInLaris;
    }
}
