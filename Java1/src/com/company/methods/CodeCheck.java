package com.company.methods;

import com.company.animals.*;
import java.util.List;

public class CodeCheck { // Εδώ γίνεται ο έλεγχος των κωδικών έτσι ώστε να είναι μοναδικοί κατά την προσθήκη ενός ζώου.

    public static boolean codeCheck(int code) { // Η συνάρτηση επιστρέφει true αν υπάρχει ήδη ο κωδικός που έδωσε ο χρήστης,
                                                // αλλιώς είναι μοναδικός και επιστρέφει false.
        List<Integer> code1 = Amphibia.getCode();
        List<Integer> code2 = Birds.getCode();
        List<Integer> code3 = Fish.getCode();
        List<Integer> code4 = Mammals.getCode();
        List<Integer> code5 = Reptiles.getCode();

        for(int x : code1)
            if (code == x)
                return true;

        for(int x : code2)
            if (code == x)
                return true;

        for(int x : code3)
            if (code == x)
                return true;

        for(int x : code4)
            if(code == x)
                return true;

        for(int x : code5)
            if(code == x)
                return true;
            
        return false;
    
    }
    

}