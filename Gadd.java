package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.*;
import java.io.IOException;

public class Gadd {
	public static void createGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame addform = new JFrame("User card");
		JPanel topPan = new JPanel(new GridLayout(2,3));
		JPanel botPan = new JPanel(new BorderLayout());
		JTextField nameText = new JTextField("Name");
		JTextField passText = new JTextField("Password");
		JTextField ageText = new JTextField("Age");
		JTextField phoneText = new JTextField("Phone");
		JButton saveBut = new JButton("Save");
		JButton canBut = new JButton("Cancel");
		
		addform.setMinimumSize(new Dimension(500,150));
		addform.add(topPan,BorderLayout.NORTH);
		addform.add(botPan,BorderLayout.SOUTH);
		topPan.add(nameText);
		topPan.add(passText);
		topPan.add(ageText);
		topPan.add(phoneText);
		
		botPan.add(saveBut, BorderLayout.WEST);
		botPan.add(canBut, BorderLayout.EAST);
		
		
		class MyAL implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Save")) {
				File bd = new File("bd.txt");
				
				if (bd.exists()==false) {
					try {
						bd.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				try {
				FileWriter wr = new FileWriter(bd.getName());
				//wr.write(UserBase.userAdd(nameText.getText(), passText.getText(), ageText.getText()));
				wr.write("process...");	
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				gui.Glogin.creatGUI();
				addform.setVisible(false);
			}
			if (e.getActionCommand().equals("Cancel")) {
				gui.Glogin.creatGUI();
			addform.setVisible(false);	
			}
			
			}
			
			
		}
		ActionListener al = new MyAL();	
		saveBut.addActionListener(al);
		canBut.addActionListener(al);
		addform.setLocation(150, 150);
		addform.pack();
		addform.setVisible(true);
		
	}
public static class User{
	public User() {
		String name = new String();
		String pass = new String();
		String age = new String();
		String phone = new String();
		
	}
}
}

