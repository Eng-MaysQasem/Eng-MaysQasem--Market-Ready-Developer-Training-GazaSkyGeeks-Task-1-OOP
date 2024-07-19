
package test;

public class Contract {
      private Customer customer;
        private Building building;
        private int rentalPeriod; // in months
        private double price;
        private Payment paymentMethod;

        public Contract(Customer customer, Building building, int rentalPeriod, double price, Payment paymentMethod) {
            this.customer = customer;
            this.building = building;
            this.rentalPeriod = rentalPeriod;
            this.price = price;
            this.paymentMethod = paymentMethod;
        }

        public void generateContract() {
            System.out.println("Contract Details:");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Building: " + building.getName() + " at " + building.getAddress());
            System.out.println("Rental Period: " + rentalPeriod + " months");
            System.out.println("Price: $" + price);
            paymentMethod.pay(price);
        }
    
}
