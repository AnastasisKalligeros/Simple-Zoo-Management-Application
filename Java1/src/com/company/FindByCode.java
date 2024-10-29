package com.company;

import com.company.animals.*;
import com.company.methods.FindAnimalByCode;
import com.company.methods.FindSpeciesByCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindByCode extends JFrame {

    private JPanel findByCode;
    private JButton searchButton;
    private JTextField code;
    private JLabel name;
    private JLabel species;
    private JLabel weight;
    private JLabel age;

    public FindByCode() {

        setTitle("Αναζήτηση ζώου βάσει κωδικού"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(600, 500)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(findByCode);
        setDefaultCloseOperation(HIDE_ON_CLOSE); // // Χρησιμοποιείται για την απόκρυψη της φόρμας.
        pack();
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int code2 = Integer.parseInt(code.getText()); // Παίρνω από το πεδίο της φόρμας τον κωδικό που έδωσε ο χρήστης.
                    int pos = FindAnimalByCode.findPosition(code2); // Αποθηκεύω τη θέση στην οποία βρέθηκε ο κωδικός, αν δεν βρέθηκε θα αποθηκευτεί η τιμή -1.

                    if (pos != -1) {

                        String species2 = FindSpeciesByCode.findSpecies(code2, pos); // Σε αυτή την μεταβλητή αποθηκεύεται η ομοταξία που ανήκει ο κωδικός.

                        switch(species2) { // Ανάλογα με την ομοταξία που ανήκει ο κωδικός, τα πεδία παίρνουν τις αντίστοιχες τιμές.

                            case "αμφίβια":
                                name.setText(Amphibia.getName(pos));
                                species.setText(species2);
                                weight.setText(Amphibia.getWeight(pos));
                                age.setText(Amphibia.getAge(pos));
                                break;

                            case "πτηνά":
                                name.setText(Birds.getName(pos));
                                species.setText(species2);
                                weight.setText(Birds.getWeight(pos));
                                age.setText(Birds.getAge(pos));
                                break;

                            case "ψάρια":
                                name.setText(Fish.getName(pos));
                                species.setText(species2);
                                weight.setText(Fish.getWeight(pos));
                                age.setText(Fish.getAge(pos));
                                break;

                            case "θηλαστικά":
                                name.setText(Mammals.getName(pos));
                                species.setText(species2);
                                weight.setText(Mammals.getWeight(pos));
                                age.setText(Mammals.getAge(pos));
                                break;

                            default: // Εφόσον δεν ειναι τίποτα από τα πιο πάνω, θα είναι σίγουρα στην ομοταξία ερπετών.
                                name.setText(Reptiles.getName(pos));
                                species.setText(species2);
                                weight.setText(Reptiles.getWeight(pos));
                                age.setText(Reptiles.getAge(pos));

                        }

                    } else {
                        // Εάν ο κωδικός δεν υπάρχει, σβήνω το περιεχόμενο τον πεδιών και εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                        name.setText(null);
                        species.setText(null);
                        weight.setText(null);
                        age.setText(null);

                        JOptionPane.showMessageDialog(FindByCode.this, "Ο κωδικός που ψάχνετε δεν υπάρχει.");

                    }

                } catch (Exception d) {
                    // Εάν ο κωδικός δεν είναι ακέραιος αριθμός, σβήνω το περιεχόμενο τον πεδιών και εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                    name.setText(null);
                    species.setText(null);
                    weight.setText(null);
                    age.setText(null);

                    JOptionPane.showMessageDialog(FindByCode.this, "Η μορφή του κωδικού που δώσατε δεν είναι έγκυρη,\nδοκιμάστε ξανά.");

                }

            }

        });

    }

}
