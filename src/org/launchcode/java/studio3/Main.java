package org.launchcode.java.studio3;

public class Main {

    public static void main(String[] args) {
        Menu ourMenu = new Menu();
        MenuItem taco = new MenuItem("Taco", 3.49, "Tasty Taco", "Main", true);
        MenuItem iceCream = new MenuItem("Ice Cream", .24, "Yummy Ice Cream", "Whatever", false);

        ourMenu.addMenuItem(taco);
        ourMenu.addMenuItem(iceCream);

        System.out.println(ourMenu);

    }
}

