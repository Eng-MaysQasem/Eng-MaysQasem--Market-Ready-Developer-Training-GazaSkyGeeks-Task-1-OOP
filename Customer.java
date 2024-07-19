
package test;
import java.util.*;

//I use list to let customer rente more than one building

   public class Customer {

        private String name;
        private List<Building> rentedBuildings;

        public Customer(String name) {
            this.name = name;
            //intalizeing list
            this.rentedBuildings = new ArrayList<>();
        }

        public void rentBuilding(Building building) {
            rentedBuildings.add(building);
        }
//to return the name of customer
        public String getName() {
            return name;
        }

        public List<Building> getRentedBuildings() {
            return rentedBuildings;
        }
    }
