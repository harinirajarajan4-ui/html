class classwork {
    public static void main(String[] args) {
        
        
        int quantity = 3;
        int pricePerBook = 275;
        int discountPercent = 10;

        
        double totalAmount = (double) (quantity * pricePerBook);

        double discount = (double) discountPercent;

        double discountAmount = totalAmount * (discount / 100);

    
        double finalAmount = totalAmount - discountAmount;

       
        System.out.println("Number of Books   : " + quantity);
        System.out.println("Price per Book    : " + pricePerBook);
        System.out.println("Total Amount      : " + totalAmount);
        System.out.println("Discount (%)      : " + discount);
        System.out.println("Discount Amount   : " + discountAmount);
        System.out.println("Final Bill Amount : " + finalAmount);
    }
}
