package org.polytech.unice.facebookrmi.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mortadha on 30/05/14.
 */
public class Navigation extends JPanel implements ActionListener{
    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;


    public Main mainWindow;

    private JButton wall;
    private JButton profile;
    private JButton discover;
    private JButton rechercher;
    public Navigation(){
        initComponenets();
    }

    private void initComponenets() {
        setBounds(0, 0, WIDTH, HEIGHT);
        wall = new JButton("Votre Mur");
        profile = new JButton("Votre Profil");
        discover = new JButton("Decouvrir d'autre Amis");
        rechercher = new JButton("Rechercher des amis");

        setLayout(null);

        wall.setBounds(0,0,200,50);
        profile.setBounds(0, 50, 200, 50);
        discover.setBounds(0, 100, 200, 50);
        rechercher.setBounds(0, 150, 200, 50);

        add(wall);
        add(profile);
        add(discover);
        add(rechercher);

        wall.addActionListener(this);
        profile.addActionListener(this);
        discover.addActionListener(this);
        rechercher.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button click");
        if(e.getSource().equals(wall)){
            mainWindow.setViewAsWall();
            System.out.println("Wall is Set");
        }else if(e.getSource().equals(profile)){
            mainWindow.setViewAsProfile();
            System.out.println("Profile is set");
        }
    }
}
