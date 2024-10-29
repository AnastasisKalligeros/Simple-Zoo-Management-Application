package com.company.methods;

import com.company.animals.Amphibia;
import com.company.animals.Birds;
import com.company.animals.Fish;
import com.company.animals.Mammals;
import java.util.List;

public class FIndSpeciesByName {

    public static String findSpecies(String name2, int pos) { // Η συνάρτηση αυτή επιστρέφει την ομοταξία του ζώου.

        // Η λίστα αυτή θα χρησιμοποιηθεί για την εύρεση της ομοταξίας που ανήκει το ζώο.
        List<String> animals = Amphibia.getName(); // Παίρνω από τα αμφίβια όλα τα διαθέσιμα ζώα.

        if(!animals.isEmpty() && pos < animals.size() && animals.get(pos).equals(name2))
            return "αμφίβια"; // Εάν δεν υπάρχουν διαθέσιμα αμφίβια ή η θέση που βρέθηκε το ζώο είναι μεγαλύτερη(ή ίση)
        // από το μέγεθος της λίστας ή το ζώο δεν ανήκει στα αμφίβια, τότε ψάχνω στην επόμενη ομοταξία.

        animals = Birds.getName(); // Παίρνω από τα πτηνά όλα τα διαθέσιμα ζώα.

        if(!animals.isEmpty() && pos < animals.size() && animals.get(pos).equals(name2))
            return "πτηνά"; // Εάν δεν υπάρχουν διαθέσιμα πτηνά ή η θέση που βρέθηκε το ζώο είναι μεγαλύτερη(ή ίση)
        // από το μέγεθος της λίστας ή το ζώο δεν ανήκει στα πτηνά, τότε ψάχνω στην επόμενη ομοταξία.

        animals = Fish.getName(); // Παίρνω από τα ψάρια όλα τα διαθέσιμα ζώα.

        if(!animals.isEmpty() && pos < animals.size() && animals.get(pos).equals(name2))
            return "ψάρια"; // Εάν δεν υπάρχουν διαθέσιμα ψάρια ή η θέση που βρέθηκε το ζώο είναι μεγαλύτερη(ή ίση)
        // από το μέγεθος της λίστας ή το ζώο δεν ανήκει στα ψάρια, τότε ψάχνω στην επόμενη ομοταξία.

        animals = Mammals.getName(); // Παίρνω από τα θηλαστικά όλα τα διαθέσιμα ζώα.

        if(!animals.isEmpty() && pos < animals.size() && animals.get(pos).equals(name2))
            return "θηλαστικά"; // Εάν δεν υπάρχουν διαθέσιμα θηλαστικά ή η θέση που βρέθηκε το ζώο είναι μεγαλύτερη(ή ίση)
        // από το μέγεθος της λίστας ή το ζώο δεν ανήκει στα θηλαστικά, τότε ψάχνω στην επόμενη ομοταξία.

        return "ερπετά"; // Εφόσον δεν ειναι τίποτα από τα πιο πάνω, θα είναι σίγουρα στην ομοταξία ερπετών.

    }

}
