package com.company.methods;

import com.company.animals.*;
import java.util.List;

public class FindAnimalByCode { // Αυτή η κλάση χρησιμοποιείται για την αναζήτηση ζώου βάσει κωδικού.

    public static int findPosition(int code) { // Η συνάρτηση επιστρέφει τη θέση που βρέθηκε ο κωδικός,
                                               // αλλιώς επιστρέφει -1 εάν δεν υπάρχει.
        List<Integer> code1, code2, code3, code4, code5;

        code1 = Amphibia.getCode();
        code2 = Birds.getCode();
        code3 = Fish.getCode();
        code4 = Mammals.getCode();
        code5 = Reptiles.getCode();

        for(int i=0; i<code1.size(); i++)
            if(code1.get(i).equals(code))
                return i;

        for(int i=0; i<code2.size(); i++)
            if(code2.get(i).equals(code))
                return i;

        for(int i=0; i<code3.size(); i++)
            if(code3.get(i).equals(code))
                return i;

        for(int i=0; i<code4.size(); i++)
            if(code4.get(i).equals(code))
                return i;

        for(int i=0; i<code5.size(); i++)
            if(code5.get(i).equals(code))
                return i;

        return -1;

    }

}
