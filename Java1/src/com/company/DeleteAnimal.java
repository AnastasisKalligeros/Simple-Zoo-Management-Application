package com.company;

import com.company.animals.*;
import com.company.methods.FindAnimalByCode;
import com.company.methods.FindSpeciesByCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteAnimal extends JFrame {

    private JPanel deleteAnimal;
    private JTextField code;
    private JButton deleteButton;

    DeleteAnimal() {

        setTitle("Προσθήκη ζώου"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(400, 300)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(deleteAnimal);
        setDefaultCloseOperation(HIDE_ON_CLOSE); // Χρησιμοποιείται για την απόκρυψη της φόρμας.
        pack();
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    int code2 = Integer.parseInt(code.getText());
                    int pos = FindAnimalByCode.findPosition(code2);

                    if(pos != -1) {

                        String species2 = FindSpeciesByCode.findSpecies(code2, pos);

                        switch(species2) {

                            case "αμφίβια":
                                Amphibia.deleteAnimal(pos);
                                break;

                            case "πτηνά":
                                Birds.deleteAnimal(pos);
                                break;

                            case "ψάρια":
                                Fish.deleteAnimal(pos);
                                break;

                            case "θηλαστικά":
                                Mammals.deleteAnimal(pos);;
                                break;

                            default: // Εφόσον δεν ειναι τίποτα από τα πιο πάνω, θα είναι σίγουρα στην ομοταξία ερπετών.
                                Reptiles.deleteAnimal(pos);

                        }

                        JOptionPane.showMessageDialog(DeleteAnimal.this, "Η διαγραφή ήταν επιτυχής.");

                    } else // Εάν ο κωδικός δεν υπάρχει, εμφανίζεται το πιο κάτω μήνυμα στην οθόνη.
                        JOptionPane.showMessageDialog(DeleteAnimal.this, "Ο κωδικός που ψάχνετε δεν υπάρχει.");

                } catch(Exception d) {

                    JOptionPane.showMessageDialog(DeleteAnimal.this, "Η μορφή του κωδικού που δώσατε δεν είναι έγκυρη,\nδοκιμάστε ξανά.");

                }

            }

        });

    }

}
