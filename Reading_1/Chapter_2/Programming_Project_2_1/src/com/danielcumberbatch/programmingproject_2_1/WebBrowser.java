package com.danielcumberbatch.programmingproject_2_1;

import java.awt.*;
import javax.swing.*;

class BrowserButton extends JButton
{
	public BrowserButton(String s, Color c)
	{
		super(s);
		this.setPreferredSize(new Dimension(80, 30));
		this.setForeground(c);
	}
}

public class WebBrowser 
{
	JButton jbtnBkPg, jbtnFdPg, jbtnHmPg, jbtnSearch;
	JTextField jtfSearch;
	JTextPane jtp;
	
	public WebBrowser()
	{
		JFrame jfrm = new JFrame("Programming Exercise 2.1");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.getContentPane().setLayout(new FlowLayout());
		jfrm.setSize(700, 500);
		jfrm.setLocation(150, 250);
		
		jbtnBkPg = new BrowserButton("<==", Color.RED);
		jbtnFdPg = new BrowserButton(">==", Color.RED);
		jbtnHmPg = new BrowserButton("Home", Color.GREEN);
		jbtnSearch = new BrowserButton("Search", Color.RED);
		
		jtfSearch = new JTextField(50);
		
		jtp = new JTextPane();
		JScrollPane jscrlpn = new JScrollPane(jtp);
				
		jfrm.getContentPane().add(jbtnBkPg);
		jfrm.getContentPane().add(jbtnFdPg);
		jfrm.getContentPane().add(jbtnHmPg);
		jfrm.getContentPane().add(jbtnSearch);
		jfrm.getContentPane().add(jtfSearch);
		jfrm.getContentPane().add(jscrlpn);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new WebBrowser();
	}
}
