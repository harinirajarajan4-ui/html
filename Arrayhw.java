 import java.util.Scanner;
 class Array {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);

    int n=5;
  

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            int arr = a[i];

            if (arr== 90) {
                System.out.println(arr + " -> Excellent");
            } else if (arr >= 75) {
                System.out.println(arr + " -> Good");
            } else if (arr >= 50) {
                System.out.println(arr + " -> Average");
            } else {
                System.out.println(arr + " -> Fail");
            }
        }
    }
}

       

