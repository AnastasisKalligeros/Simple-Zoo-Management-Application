package com.company.methods;

import com.company.animals.*;
import java.util.List;

public class FindAnimalByName { // Αυτή η κλάση χρησιμοποιείται για την αναζήτηση ζώου βάσει ονόματος.

    public static int findPosition(String name) { // Η συνάρτηση επιστρέφει τη θέση που βρέθηκε το όνομα,
                                                  // αλλιώς επιστρέφει -1 εάν δεν υπάρχει.
        List<String> name1, name2, name3, name4, name5;

        name1 = Amphibia.getName();
        name2 = Birds.getName();
        name3 = Fish.getName();
        name4 = Mammals.getName();
        name5 = Reptiles.getName();

        for(int i=0; i<name1.size(); i++)
            if(name1.get(i).equals(name))
                return i;

        for(int i=0; i<name2.size(); i++)
            if(name2.get(i).equals(name))
                return i;

        for(int i=0; i<name3.size(); i++)
            if(name3.get(i).equals(name))
                return i;

        for(int i=0; i<name4.size(); i++)
            if(name4.get(i).equals(name))
                return i;

        for(int i=0; i<name5.size(); i++)
            if(name5.get(i).equals(name))
                return i;

        return -1;

    }

}
