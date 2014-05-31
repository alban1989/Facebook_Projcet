package org.polytech.unice.facebookrmi.gui;

import javax.swing.*;

/**
 * Created by Mortadha on 31/05/14.
 */
public class Profile extends JPanel {

    private JLabel profil;

    private JLabel nameLb;
    private JLabel statusLb;
    private JLabel lastNameLb;

    private JTextField name;
    private JComboBox<String> status;
    private JTextField lastName;

    public Profile(){
        initComponents();
    }

    private void initComponents() {
        nameLb = new JLabel("Prénom :");
        lastNameLb = new JLabel("Nom :");
        statusLb = new JLabel("Votre Status :");

        name = new JTextField();
        String[] listStatus = new String[3];

        listStatus[0] = "Célibataire";
        listStatus[1] = "En Couple";
        listStatus[2] = "Compliqué";

        status = new JComboBox<String>(listStatus);

        lastName = new JTextField();

        add(name);
        add(nameLb);

        add(lastName);
        add(lastNameLb);

        add(status);
        add(statusLb);
        setLayout(null);

        nameLb.setBounds(10,10,100,30);
        name.setBounds(110,10,200,30);

        lastName.setBounds(110, 70, 200, 30);
        lastNameLb.setBounds(10, 70, 200, 30);

        status.setBounds(110,130,200,30);
        statusLb.setBounds(10, 130, 200, 30);

    }
}
