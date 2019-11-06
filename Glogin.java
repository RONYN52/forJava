package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Glogin {
	public static void creatGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame loginform = new JFrame("Please, sign in or sign up");
		loginform.setDefaultCloseOperation(loginform.EXIT_ON_CLOSE);
		String[] items = new String[]{
			"Login",
			"Empty"
		};
		JComboBox combo = new JComboBox(items);
		JButton butLog = new JButton("Sign in");
		JButton butReg = new JButton("Sign up...");
		JPanel panTop = new JPanel(new GridLayout(2,1));
		JPanel panBot = new JPanel(new BorderLayout());
		loginform.add(panTop,BorderLayout.NORTH);
		loginform.add(panBot,BorderLayout.SOUTH);
		panTop.add(combo);
		panBot.add(butLog, BorderLayout.WEST);
		panBot.add(butReg, BorderLayout.EAST);
		
		class MyAL implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Sign in")) {
				Gcalcutta.createGUI();	
				loginform.setVisible(false);
				
			}
			if (e.getActionCommand().equals("Sign up...")) {
				Gadd.createGUI();
				loginform.setVisible(false);
			}
				
			}
			
		}
		
		ActionListener al = new MyAL();
		butLog.addActionListener(al);
		butReg.addActionListener(al);
		
		
		loginform.setPreferredSize(new Dimension(250,150));
		loginform.setLocation(500, 200);
		loginform.pack();
		loginform.setVisible(true);
	}

}
