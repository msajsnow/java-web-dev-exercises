package org.launchcode.java.demos.lsn7interfaces;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);
        System.out.println(flavors);
//        System.out.println(cone1, cone2);
// can also combine lines 11 and 13 to a single statement
        // flavors.sort(new FlavorComparator());
    }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        public class ConeComparator implements Comparator<Cone> {
            @Override
            public int compare(Cone cone1, Cone cone2) {
                if (cone1.getCost() - cone2.getCost() < 0){
                    return -1;
                } else if (cone1.getCost() - cone2.getCost() > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

}


