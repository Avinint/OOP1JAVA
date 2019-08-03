package com.brunoa;

import java.net.SocketOption;

public class Main {

    private void dumpster() {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Person bruno = new Person();
        bruno.setAge(47);
        bruno.setFirstName("Bruno");
        bruno.setLastName("Avinint");
        System.out.println(bruno.getFullName());
        System.out.println(bruno.isTeen());
        Person haitem = new Person();
        System.out.println("\"" + haitem.getFullName() + "\"");
        haitem.setFirstName("Haitem");
        System.out.println("\"" + haitem.getFullName() + "\"");

        // Constructor
        BankAccount account = new BankAccount(5454854, "Bruno Avinint", "brunoavinint@example.com", "03454646", 4000);
        System.out.println(account.getNumber());
        System.out.println(account.getCustomerName());
        account.withdraw(3000);
        account.withdraw(3000);
        account.deposit(2000);

        VipCustomer customer = new VipCustomer("Bob", "bob@example.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,1,1);
        Dog dog = new Dog("Youkie", 10, 10, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

    }
}
