package com.company;

import com.company.animals.*;
import com.company.methods.FindAnimalByCode;
import com.company.methods.FindSpeciesByCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditAnimal extends JFrame {

    private JPanel editAnimal;
    private JTextField code;
    private JButton searchButton;
    private JLabel name;
    private JLabel species;
    private JLabel weight;
    private JLabel age;
    private JTextField newWeight;
    private JTextField newAge;
    private JButton SaveButton;
    private int code2; // Στη μεταβλητή αυτή θα αποθηκευτεί ο κωδικός του ζώου που δίνει ο χρήστης προς επεξεργασία.
    private int pos; // Στη μεταβλητή pos θα αποθηκευτεί η θέση στην οποία βρίσκεται ο κωδικός που αναζητείται.
    private String species2; // Σε αυτή την μεταβλητή αποθηκεύεται η ομοταξία που ανήκει ο κωδικός.

    public EditAnimal() {

        setTitle("Επεξεργασία ζώου βάσει κωδικού"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(600, 500)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(editAnimal);
        setDefaultCloseOperation(HIDE_ON_CLOSE); // // Χρησιμοποιείται για την απόκρυψη της φόρμας.
        pack();
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                name.setText(null);         // Σε κάθε νέα αναζήτηση διαγράφω τα πρηγούμενα στοιχεία
                species.setText(null);      // που εμφανίστηκαν και επεξεργάστηκε ο χρήστης.
                weight.setText(null);
                age.setText(null);
                newAge.setText(null);
                newWeight.setText(null);

                try {

                    code2 = Integer.parseInt(code.getText()); // Παίρνω από το πεδίο της φόρμας τον κωδικό που έδωσε ο χρήστης.
                    pos = FindAnimalByCode.findPosition(code2); // Αποθηκεύω τη θέση στην οποία βρέθηκε ο κωδικός, αν δεν βρέθηκε θα αποθηκευτεί η τιμή -1.

                    if (pos != -1) {

                        species2 = FindSpeciesByCode.findSpecies(code2, pos);

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

                    } else // Εάν ο κωδικός δεν υπάρχει, εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                        JOptionPane.showMessageDialog(EditAnimal.this, "Ο κωδικός που ψάχνετε δεν υπάρχει.");

                } catch (Exception d) {
                    // Εάν ο κωδικός δεν είναι ακέραιος αριθμός, εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                    JOptionPane.showMessageDialog(EditAnimal.this, "Η μορφή του κωδικού που δώσατε δεν είναι έγκυρη,\nδοκιμάστε ξανά.");

                }

            }

        });

        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int weight_ = Integer.parseInt(newWeight.getText()); // Στη μεταβλητή αυτή εκχωρείται το νέο βάρος του ζώου που δίνει ο χρήστης.
                    int age_ = Integer.parseInt(newAge.getText()); // Στη μεταβλητή αυτή εκχωρείται η νέα μέγιστη ηλικία του ζώου που δίνει ο χρήστης.

                    switch(species2) {

                        case "αμφίβια":
                            Amphibia.changeWeight(weight_, pos);
                            Amphibia.changeAge(age_, pos);
                            break;

                        case "πτηνά":
                            Birds.changeWeight(weight_, pos);
                            Birds.changeAge(age_, pos);
                            break;

                        case "ψάρια":
                            Fish.changeWeight(weight_, pos);
                            Fish.changeAge(age_, pos);
                            break;

                        case "θηλαστικά":
                            Mammals.changeWeight(weight_, pos);
                            Mammals.changeAge(age_, pos);
                            break;

                        default: // Εφόσον δεν ειναι τίποτα από τα πιο πάνω, θα είναι σίγουρα στην ομοταξία ερπετών.
                            Reptiles.changeWeight(weight_, pos);
                            Reptiles.changeAge(age_, pos);

                    }

                    JOptionPane.showMessageDialog(EditAnimal.this, "Η αποθήκευση ήταν επιτυχής.");

                } catch(Exception d) {

                    JOptionPane.showMessageDialog(EditAnimal.this, "Τα νέα στοιχεία που πληκτρολογήσατε δεν είναι έγκυρα,\nπληκτρολογήστε μόνο ακέραιους αριθμούς.");

                }

            }

        });

    }

}
