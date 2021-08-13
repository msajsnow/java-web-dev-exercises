package org.launchcode.java.studio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate LastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//    Can add and remove MenuItems from Menu
    public void addMenuItem(MenuItem newMenuItem) {
        this.menuItems.add(newMenuItem);
        this.LastUpdated = LocalDate.now();
    }
    public void removeMenuItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
    }
//    Can tell when menu was last updated
    public LocalDate getLastUpdated() {
        return LastUpdated;
    }
    public void setLastUpdated(LocalDate LastUpdated) {
        this.LastUpdated = LastUpdated;
    }
//    Can print out a MenuItem and Menu
    @Override
    public String toString() {
        String returnString = "";
        for(MenuItem menuItem: this.menuItems){
            returnString = returnString + menuItem + "\n";
        }
        returnString = returnString + "Last updated: " + this.LastUpdated;
            return returnString;
    }
}
//public class Menu {
//    fields
//    datatype
//    access level
//    constructor
//}

//    Menu {
//        private ArrayList<MenuItem> allMenuItems = new ArrayList<>();
//        private int LastDayUpdated = new Date().getDay();
//
//        public void printAllMenuItems();
//        addMenuItem() <- last updated
//        removeMenuItem();
//
//
//    }
//
//
//    MenuItem {
//        private String name;
//        private double price;
//        private String des;
//        private String category;
//        private int dateCreated = new Date().getDay();
//
//        public void setName(String userName) {
//            this.name = userName;
//        }
//
//        public void setPrice(Double userPrice) {
//            this.price = userPrice;
//        }
//
//
//
//    }
//
//
//    Main {
//
//
//
//    }
