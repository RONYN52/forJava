package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hm.*;

public class Gcalcutta {
	

	public static void createGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainform = new JFrame("Calc v.1.1.1.0");
		mainform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panTop = new JPanel();
		JPanel panMain = new JPanel();
		JPanel grid = new JPanel();
		JPanel panBot = new JPanel();
		JPanel gridBot = new JPanel();
		panTop.setLayout(new BorderLayout());
		mainform.add(panTop,BorderLayout.NORTH);
		panMain.setLayout(new BorderLayout());
		mainform.add(panMain, BorderLayout.CENTER);
		grid.setLayout(new GridLayout(3,3));
		panMain.add(grid);
		JTextField text = new JTextField("0",30);
		panMain.add(panBot,BorderLayout.SOUTH);
		gridBot.setLayout(new FlowLayout());
		panBot.add(gridBot);
		panTop.add(text);
	

		JButton buts[] = new JButton[19];
		 class MyAL implements ActionListener {
				public   void actionPerformed(ActionEvent e) {
					
					if (text.getText().equals("0"))  text.setText(null);
					text.setText(text.getText()+(e.getActionCommand()));
					if (e.getActionCommand().equals("=")) {
						
						hm.Calcutta.prim=text.getText();
						String[] mas = new String[1];
						mas[0]=text.getText();
						hm.Calcutta.start(mas[0]);
					
						//text.setText(null);
						text.setText(hm.Priority.tot);
					}
				}	
				}
		ActionListener al = new MyAL();
		for (int i=1;i<19;i++) {
			 buts[i] = new JButton();
			 if (i<10) {
			 buts[i].setText(Integer.toString(i));
			grid.add( buts[i]); 
			buts[i].addActionListener(al);
			}
			 else {
				if (i==10) { buts[i].setText("0");		    gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==11) { buts[i].setText("+");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==12) { buts[i].setText("-");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==13) { buts[i].setText("*");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==14) { buts[i].setText("/");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==15) { buts[i].setText("(");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==16) { buts[i].setText(")");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==17) { buts[i].setText(".");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				if (i==18) { buts[i].setText("=");			gridBot.add( buts[i]);  buts[i].addActionListener(al);}
				
			 }
		}
		
		
		mainform.setPreferredSize(new Dimension(450,550));
		mainform.setLocation(750, 150);
		mainform.pack();
		mainform.setVisible(true);
	
		
	}
	
}
