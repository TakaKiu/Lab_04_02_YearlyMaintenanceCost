import java.util.Scanner;

class YearlyMaintenanceCosts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the maintenance cost for Spring: $");
        double springCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Summer: $");
        double summerCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Autumn: $");
        double autumnCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Winter: $");
        double winterCost = scanner.nextDouble();


        double totalCost = springCost + summerCost + autumnCost + winterCost;


        System.out.println("Spring cost: $" + springCost);
        System.out.println("Summer cost: $" + summerCost);
        System.out.println("Autumn cost: $" + autumnCost);
        System.out.println("Winter cost: $" + winterCost);
        System.out.println("Total yearly maintenance costs: $" + totalCost);


        scanner.close();
    }
}






