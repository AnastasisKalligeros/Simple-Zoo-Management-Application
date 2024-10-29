package com.company;

import com.company.animals.*;
import com.company.methods.CodeCheck;
import com.company.methods.NameCheck;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAnimal extends JFrame {

    private JPanel addAnimal;
    private JTextField code;
    private JTextField species;
    private JTextField weight;
    private JTextField age;
    private JTextField name;
    private JButton addButton;

    public AddAnimal() { // Η κλάση αυτή χρησιμοποιείται για την προσθήκη νέου ζώου.

        setTitle("Προσθήκη ζώου"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(325, 300)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(addAnimal);
        setDefaultCloseOperation(HIDE_ON_CLOSE); // Χρησιμοποιείται για την απόκρυψη της φόρμας.
        pack();
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String species_ = species.getText(); // Παίρνω το είδος(π.χ θηλαστικό) του ζώου που έδωσε ο χρήστης.
                    String name_ = name.getText(); // Παίρνω το όνομα του ζώου που έδωσε ο χρήστης.
                    int code_ = Integer.parseInt(code.getText()); // Παίρνω τον κωδικό του ζώου και τον μετατρέπω σε integer.
                    int weight_ = Integer.parseInt(weight.getText()); // Παίρνω το βάρος του ζώου και τον μετατρέπω σε integer.
                    int age_ = Integer.parseInt(age.getText()); // Παίρνω την ηλικία του ζώου και τον μετατρέπω σε integer.


                    if(NameCheck.nameCheck(name_) || CodeCheck.codeCheck(code_)) // Αν το όνομα ή ο κωδικός υπάρχουν ήδη δεν τα αποθηκεύω.
                        JOptionPane.showMessageDialog(AddAnimal.this, "Τα στοιχεία που δώσατε υπάρχουν ήδη.");

                    else {

                        switch(species_) { // Ελέγχω το είδος του ζώου.

                            case "θηλαστικά":
                                Mammals.setName(name_);
                                Mammals.setCode(code_);
                                Mammals.setWeight(weight_);
                                Mammals.setAge(age_);
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η προσθήκη του ζώου ήταν επιτυχής.");
                                break;

                            case "ερπετά":
                                Reptiles.setName(name_);
                                Reptiles.setCode(code_);
                                Reptiles.setWeight(weight_);
                                Reptiles.setAge(age_);
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η προσθήκη του ζώου ήταν επιτυχής.");
                                break;

                            case "ψάρια":
                                Fish.setName(name_);
                                Fish.setCode(code_);
                                Fish.setWeight(weight_);
                                Fish.setAge(age_);
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η προσθήκη του ζώου ήταν επιτυχής.");
                                break;

                            case "πτηνά":
                                Birds.setName(name_);
                                Birds.setCode(code_);
                                Birds.setWeight(weight_);
                                Birds.setAge(age_);
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η προσθήκη του ζώου ήταν επιτυχής.");
                                break;

                            case "αμφίβια":
                                Amphibia.setName(name_);
                                Amphibia.setCode(code_);
                                Amphibia.setWeight(weight_);
                                Amphibia.setAge(age_);
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η προσθήκη του ζώου ήταν επιτυχής.");
                                break;

                            default:
                                JOptionPane.showMessageDialog(AddAnimal.this, "Η ομοταξία του ζώου που δώσατε είναι λάθος.\n(επιλογές: θηλαστικά, ερπετά, πτηνά, αμφίβια, ψάρια)");

                        }

                    }

                } catch(Exception d) {

                    JOptionPane.showMessageDialog(AddAnimal.this, "Τα στοιχεία που δώσατε δεν είναι έγκυρα, δοκιμάστε ξανά.");

                }

            }

        });

    }

}
