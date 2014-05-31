package org.polytech.unice.facebookrmi.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mortadha on 30/05/14.
 */
public class Main extends JFrame {

    private String name;
    private Navigation navigation;
    private JList friends;

    private JPanel view;


    public Main(String name){
        this.name = name;
        initComponents();
    }

    private void initComponents() {
        setTitle(name + "- Profil FacebookRMI");
        setLayout(null);
        navigation =  new Navigation();
        navigation.mainWindow = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        List<String> ls = new ArrayList<String>();
        for(int i =0;i<100;i++)
            ls.add("Strong "+i);
        friends = new JList(ls.toArray());
        JScrollPane scrollFriends = new JScrollPane(friends);
        JLabel friendsLabel =  new JLabel("Amis :");

        friendsLabel.setBounds(0,210,200,40);
        scrollFriends.setBounds(0,250,200,510);

        add(scrollFriends);
        add(friendsLabel);
        add(navigation);
        friends.setBounds(0,200,200,510);
        navigation.setBounds(0,0,200,400);


        view = new Profile();

        add(view);
        view.setBounds(210,0,570,760);


        setPreferredSize(new Dimension(800, 800));
        repaint();
        pack();
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        String name = null;
        if(args.length<1){
           name = JOptionPane.showInputDialog("Veuillez Saisir Votre Nom :");
        }else{
            name = args[0];
        }
        Main profile = new Main(name);
    }


    public void setViewAsWall(){
        getContentPane().remove(view);
        view =  new Wall();
        view.setBounds(210,0,570,760);
        getContentPane().add(view);
        getContentPane().validate();
        getContentPane().repaint();

    }

    public void setViewAsProfile(){
        getContentPane().remove(view);
        view =  new Profile();
        view.setBounds(210,0,570,760);
        getContentPane().add(view);
        getContentPane().validate();
        getContentPane().repaint();
    }
}
