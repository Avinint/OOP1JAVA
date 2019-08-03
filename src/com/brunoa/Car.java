package com.brunoa;

public class Car {
    private int doors;
    private int wheel;

    private String model;
    private String engine;
    private String colour;

    private static int count = 0;

    public static void sayHello() {

        System.out.println("Hello");
    }

    public static int getCount() {
        return count;
    }

    public Car(){
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}
