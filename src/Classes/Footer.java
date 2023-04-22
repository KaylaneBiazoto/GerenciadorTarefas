package Classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	JButton clear;
	
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer(){
		
		this.setOpaque( false );
		
		this.setPreferredSize(new Dimension(400,60));
		
		addTask = new JButton("Adicionar tarefa");
		addTask.setMargin(new Insets(1,1,1,1));
		addTask.setBackground(Colors.INSTANCE.secondaryColor());
		addTask.setForeground(Colors.INSTANCE.textColor());
		addTask.setOpaque(true);
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		addTask.setVerticalAlignment(JButton.BOTTOM);
		
		
		this.add(addTask);
		
		
		this.add(Box.createHorizontalStrut(20));//Space between buttons
		clear = new JButton("Remover");
		clear.setBackground(Colors.INSTANCE.secondaryColor());
		clear.setForeground(Colors.INSTANCE.textColor());
		clear.setOpaque(true);
		clear.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		clear.setBorder(emptyBorder);
		this.add(clear);
		
		
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}