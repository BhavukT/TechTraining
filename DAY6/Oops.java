import java.util.*;

public class Oops {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setVehicles(List.of(new Bike()));
    }

    class Car implements Vehicle {
        private String name;
        private String model;
        private String color;
        final private int tyre = 4;

        Car() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getTyre() {
            return tyre;
        }

        public void run() {
            System.out.println("Runs fast");
        }

        Car(String name, String color, String model) {
            this.name = name;
            this.color = color;
            this.model = model;
        }
    }

    interface Vehicle {
        public void run();
    }

    class Person {
        String name;
        String age;
        List<Vehicle> vehicles;

        Person() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public Person(String name, String age, List<Vehicle> vehicles) {
            this.name = name;
            this.age = age;
            this.vehicles = vehicles;
        }

        public List<Vehicle> getVehicles() {
            return vehicles;
        }

        public void setVehicles(List<Vehicle> vehicles) {
            this.vehicles = vehicles;
        }
    }

    class Bike implements Vehicle {
        private String name;
        private String model;
        private String color;
        final private int tyre = 2;

        Bike() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getTyre() {
            return tyre;
        }

        public void run() {
            System.out.println("Runs fast");
        }

        Bike(String name, String color, String model) {
            this.name = name;
            this.color = color;
            this.model = model;
        }
    }
}