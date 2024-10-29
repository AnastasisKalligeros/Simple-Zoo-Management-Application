package com.company;

import com.company.animals.*;
import com.company.methods.FIndSpeciesByName;
import com.company.methods.FindAnimalByName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindByName extends JFrame {

    private JPanel findByName;
    private JTextField name;
    private JLabel code;
    private JLabel species;
    private JLabel weight;
    private JLabel age;
    private JButton searchButton;
    private String name2; // Στη μεταβλητή αυτή θα αποθηκευτεί το όνομα του ζώου που δίνει ο χρήστης προς αναζήτηση.
    private int pos; // Στη μεταβλητή pos θα αποθηκευτεί η θέση στην οποία βρίσκεται το ζώο που αναζητείται.

    public FindByName() {

        setTitle("Αναζήτηση ζώου βάσει ονόματος"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(600, 500)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(findByName);
        setDefaultCloseOperation(HIDE_ON_CLOSE); // // Χρησιμοποιείται για την απόκρυψη της φόρμας.
        pack();
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                name2 = name.getText(); // Παίρνω από το πεδίο της φόρμας το όνομα που έδωσε ο χρήστης.
                pos = FindAnimalByName.findPosition(name2); // Αποθηκεύω τη θέση στην οποία βρέθηκε το ζώο, αν δεν βρέθηκε θα αποθηκευτεί η τιμή -1.

                if(pos != -1) {

                    String species2 = FIndSpeciesByName.findSpecies(name2, pos); // Σε αυτή την μεταβλητή αποθηκεύεται η ομοταξία του ζώου.

                    switch(species2) { // Ανάλογα με την ομοταξία του ζώου, τα πεδία παίρνουν τις αντίστοιχες τιμές.

                        case "αμφίβια":
                            code.setText(Amphibia.getCode(pos));
                            species.setText(species2);
                            weight.setText(Amphibia.getWeight(pos));
                            age.setText(Amphibia.getAge(pos));
                            break;

                        case "πτηνά":
                            code.setText(Birds.getCode(pos));
                            species.setText(species2);
                            weight.setText(Birds.getWeight(pos));
                            age.setText(Birds.getAge(pos));
                            break;

                        case "ψάρια":
                            code.setText(Fish.getCode(pos));
                            species.setText(species2);
                            weight.setText(Fish.getWeight(pos));
                            age.setText(Fish.getAge(pos));
                            break;

                        case "θηλαστικά":
                            code.setText(Mammals.getCode(pos));
                            species.setText(species2);
                            weight.setText(Mammals.getWeight(pos));
                            age.setText(Mammals.getAge(pos));
                            break;

                        default: // Εφόσον δεν ειναι τίποτα από τα πιο πάνω, θα είναι σίγουρα στην ομοταξία ερπετών.
                            code.setText(Reptiles.getCode(pos));
                            species.setText(species2);
                            weight.setText(Reptiles.getWeight(pos));
                            age.setText(Reptiles.getAge(pos));

                    }

                } else {
                    // Εάν το όνομα δεν υπάρχει, σβήνω το περιεχόμενο τον πεδιών και εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                    code.setText(null);
                    species.setText(null);
                    weight.setText(null);
                    age.setText(null);

                    JOptionPane.showMessageDialog(FindByName.this, "Το ζώο που ψάχνετε δεν υπάρχει.");

                }

            }

        });

    }

}
