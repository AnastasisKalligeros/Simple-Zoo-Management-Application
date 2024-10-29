package com.company;

import com.company.methods.ShowAnimals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private JPanel mainForm;
    private JButton showAnimals;
    private JButton addAnimal;
    private JButton editAnimal;
    private JButton deleteAnimal;
    private JButton findByCode;
    private JButton findByName;
    private JButton ExitButton;

    public MainForm() {

        new Data("1"); // Deserialization for Amphibia
        new Data("2"); // Deserialization for Birds
        new Data("3"); // Deserialization for Fish
        new Data("4"); // Deserialization for Mammals
        new Data("5"); // Deserialization for Reptiles

        setTitle("Εργασία - Ζωολογικός κήπος"); // Δίνω τίτλο στη φόρμα.
        setPreferredSize(new Dimension(600, 500)); // Ορίζω το μέγεθος(διαστάσεις) της φόρμας.
        setContentPane(mainForm);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // ο μόνος τρόπος για τον τερματισμό του προγράμματος
        pack();                                        // θα είναι μέσω του κουμπιού εξόδου.
        setLocationRelativeTo(null); // Τοποθετώ στο κέντρο της οθόνης τη φόρμα.
        setVisible(true); // Κάνω ορατή τη φόρμα.

        showAnimals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(MainForm.this, ShowAnimals.getAnimals().toString());
                // μετατρέπω σε string το περιεχόμενο του builder.
            }

        });

        addAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new AddAnimal();

            }

        });

        findByName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new FindByName();

            }

        });

        findByCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new FindByCode();

            }

        });

        editAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new EditAnimal();

            }

        });

        deleteAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new DeleteAnimal();

            }

        });

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Data(1); // Serialization for Amphibia
                new Data(2); // Serialization for Birds
                new Data(3); // Serialization for Fish
                new Data(4); // Serialization for Mammals
                new Data(5); // Serialization for Reptiles

                System.exit(0); // Με το πάτημα του κουμπιού τερματίζεται και το πρόγραμμα.

            }

        });

    }

}
