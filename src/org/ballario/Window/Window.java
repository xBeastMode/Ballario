package org.ballario.Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Window extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String resPath;
	
	public Window(){
		this.resPath = (new File(this.getClass().getClassLoader().getResource("").getPath())).getParent();
		this.resPath = this.resPath.replace("%20", " ");
	}
	
	public void start(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension D = Toolkit.getDefaultToolkit().getScreenSize();
		setExtendedState(MAXIMIZED_BOTH);
		setMaximumSize(D);
		getContentPane().setBackground(Color.WHITE);
		ImageIcon icon = new ImageIcon(this.resPath + "\\res\\icon\\virus.png");
		setIconImage(icon.getImage());
		setTitle("Ballario");
		pack();
		setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public void repaint(){
		super.repaint();
	}
}
