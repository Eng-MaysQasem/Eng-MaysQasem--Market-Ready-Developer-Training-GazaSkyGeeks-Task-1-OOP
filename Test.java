
package test;


public class Test {
     public static void main(String[] args) {
//Create some Building
        Building apartment1 = new Apartment("123 Main St", " Apartment", 120.5);
        Building house1 = new House("456 west St", " House", 950.0);
        Building shop1 = new Shop("789 south St", " Shop", 975.0);

        //Create a Customer
        Customer customer1 = new Customer("Mays Qasem");

        // rentBuilding from customer
        customer1.rentBuilding(apartment1);
        customer1.rentBuilding(house1);
        customer1.rentBuilding(shop1);

        // choose way of pay
        Payment paymentMethod = new PayPalPayment("mbqasem7@gmail.com");

        // make contract
        Contract contract1 = new Contract(customer1, apartment1, 12, 1200.0, paymentMethod);
        Contract contract2 = new Contract(customer1, house1, 6, 1800.0, paymentMethod);
        Contract contract3 = new Contract(customer1, shop1, 24, 1500.0, paymentMethod);

        // to print a details of contract
        contract1.generateContract();
        contract2.generateContract();
        contract3.generateContract();
    }
}
/*
Simple explanations:
Inheritance:
The classes Apartment, House, and Shop inherit from the Building class.
Abstraction:
Abstraction involves hiding the complex implementation details and showing only the essential features of the object. In the code:
The Building class and the Payment class are defined as abstract to hide details and provide a base structure for the derived classes.
Polymorphism:
The Payment class uses polymorphism. Different payment methods (PayPalPayment and CreditCardPayment) are treated as Payment.
Aggregation:
Aggregation is a special form of association where one class contains a collection of another class. It represents a "has-a" relationship. In the code:
The Customer class has a list of Building objects, which signifies that a customer can rent multiple buildings.
بمعنى لو حذفت العميل المباني حتضل والعكس صحيح.
Composition
Composition is a stronger form of aggregation where the contained objects do not exist independently of the container object. In the code:
The Contract class contains instances of Customer, Building, and Payment, which are essential parts of a contract. The Contract cannot exist without these components.
بمعني لو فقدت البناية او الدفع ما حيتم العقد.



*/
    
