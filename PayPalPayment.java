
package test;


public class PayPalPayment extends Payment {
      private String email;

        public PayPalPayment(String email) {
            this.email = email;
        }

        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
        }
}
