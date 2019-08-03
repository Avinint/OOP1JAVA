package com.brunoa;

public class VipCustomer {
   private String name;
   private double creditLimit;
   private String emailAddress;

   public VipCustomer() {
       this("no name", 0, "no email address");
   }

    public VipCustomer(String name, String emailAddress) {
       this(name, 100, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
