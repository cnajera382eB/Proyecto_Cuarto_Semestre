package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.html.HTML.Tag;

public class Ventana extends JFrame{

	public Ventana() {
		this.setVisible(true);
		//this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,200,500,500);
		this.setTitle("Hola");
		this.setLayout(null);
		
		//
		
		JLabel tag_tittle = new JLabel();
		tag_tittle.setText("Bienbenido");
		tag_tittle.setBackground(Color.white);
		tag_tittle.setOpaque(true);
		tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
		tag_tittle.setVerticalAlignment(JLabel.CENTER);
		tag_tittle.setHorizontalAlignment(JLabel.CENTER);
		this.add(tag_tittle);
		
	}

}
