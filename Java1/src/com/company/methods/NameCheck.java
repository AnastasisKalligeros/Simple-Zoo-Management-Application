package com.company.methods;

import com.company.animals.*;
import java.util.List;

public class NameCheck { // Εδώ γίνεται ο έλεγχος των ονομάτων έτσι ώστε να είναι μοναδικά κατά την προσθήκη ενός ζώου.

    public static boolean nameCheck(String name) { // Η συνάρτηση επιστρέφει true αν υπάρχει ήδη το όνομα που έδωσε ο χρήστης,
                                                   // αλλιώς είναι μοναδικό και επιστρέφει false.
        List<String> name1 = Amphibia.getName();
        List<String> name2 = Birds.getName();
        List<String> name3 = Fish.getName();
        List<String> name4 = Mammals.getName();
        List<String> name5 = Reptiles.getName();

        for(String x : name1)
            if (name.equals(x))
                return true;

        for(String x : name2)
            if (name.equals(x))
                return true;

        for(String x : name3)
            if (name.equals(x))
                return true;

        for(String x : name4)
            if(name.equals(x))
                return true;

        for(String x : name5)
            if(name.equals(x))
                return true;

        return false;

    }

}
