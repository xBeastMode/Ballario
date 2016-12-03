package org.ballario;

import javax.swing.*;
import org.ballario.Entity.Cell;
import java.awt.*;
import java.io.File;
@SuppressWarnings("serial")
public class Ballario extends JFrame {
	
	public String resPath;
	
	public Ballario() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension D = Toolkit.getDefaultToolkit().getScreenSize();
		setExtendedState(MAXIMIZED_BOTH);
		setMaximumSize(D);
		getContentPane().setBackground(Color.WHITE);
		this.resPath = (new File(this.getClass().getClassLoader().getResource("").getPath())).getParent();
		this.resPath = this.resPath.replace("%20", " ");
		ImageIcon icon = new ImageIcon(this.resPath + "\\res\\icon\\virus.png");
		setIconImage(icon.getImage());
		setTitle("Ballario");
		pack();
		setVisible(true);
	}

	public void paint(Graphics g) {
//		Dimension D = Toolkit.getDefaultToolkit().getScreenSize();
//		Cell c = new Cell(null, 20, D.width / 2, D.height / 2, false, new Color(255, 0, 0));
//		c.render(g);
	}

	public static void main(String[] args) {
		Ballario game = new Ballario();
	}
}