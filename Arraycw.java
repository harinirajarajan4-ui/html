import java.util.Scanner;

class Storetracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = 5;
        int products = 3;

        int[][] sales = new int[days][products];

       
        System.out.println("Enter sales for 5 days (3 products each day):");
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + ":");
            for (int j = 0; j < products; j++) {
                sales[i][j] = sc.nextInt();
            }
        }

        
        for (int j = 0; j < products; j++) {
            int total = 0;

            for (int i = 0; i < days; i++) {
                total += sales[i][j];
            }

            
            System.out.print("Product " + (j + 1) + " Total Sales = " + total + " -> ");

            if (total >= 500) {
                System.out.println("Target Achieved");
            } else if (total >= 300) {
                System.out.println("Average Performance");
            } else {
                System.out.println("Needs Improvement");
            }
        }
    }
}
