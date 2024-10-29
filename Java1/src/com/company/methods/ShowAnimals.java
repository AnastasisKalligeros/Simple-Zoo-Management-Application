package com.company.methods;

import com.company.animals.*;
import java.util.ArrayList;
import java.util.List;

public class ShowAnimals { // Η κλάση αυτή χρησιμοποιείται για την προβολή όλων των διαθέσιμων ζώων.

    public static StringBuilder getAnimals() { // Η συνάρτηση αυτή επιστρέφει τα διαθέσιμα ζώα.

        List<List<String>> animals = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int reps = 0;

        animals.add(Amphibia.getName());
        animals.add(Birds.getName());
        animals.add(Fish.getName());
        animals.add(Mammals.getName());
        animals.add(Reptiles.getName());

        for(List<String> x : animals)
            for (String y : x) {

                builder.append(y).append("      ");

                if(reps == 2) {

                    builder.append("\n");
                    reps = 0;

                } else reps++;

            }

        return builder;

    }

}
