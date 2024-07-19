package test;
//we create abstract to hide details && to pervent make object from Building

public abstract class Building {
    
        private String address;
        private String name;
        private double size;
//Defualt constructor to give proparites for children

        public Building(String address, String name, double size) {
            this.address = address;
            this.name = name;
            this.size = size;
}
         // Getters and Setters
        public String getAddress() {
            return address;
        }

        public String getName() {
            return name;
        }

        public double getSize() {
            return size;
        }
}