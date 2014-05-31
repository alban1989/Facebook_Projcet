package org.polytech.unice.facebookrmi.gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mortadha on 31/05/14.
 */
public class Wall extends JPanel {
    private static final int WIDTH = 570;
    private static final int HEIGHT = 760;

    private JLabel title;
    private JList posts;
    public Wall(){
        initComponents();
    }

    private void initComponents() {
        title = new JLabel("Votre Mur");
        List<String> postsData =  new ArrayList<String>();
        for(int i=0;i<100;i++){
            postsData.add("<html><div style=\"width:423px;border:solid 1px gray;margin:5px;padding:5px;\"><h4 style=\"padding:5px;background-color:#AAAAAA;\">Posté Par : <span style=\"color:blue;\"> Teffaha"+i+"</span></h4><p> Un Long Post qui sert à rien avec le numero : "+i+"</p></div>");
        }
        posts = new JList(postsData.toArray());

        JScrollPane scroll = new JScrollPane(posts);


        add(scroll);
        add(title);

        setLayout(null);
        title.setBounds(0,0,WIDTH,50);

        scroll.setBounds(0,50,WIDTH,HEIGHT-50);
    }
}
