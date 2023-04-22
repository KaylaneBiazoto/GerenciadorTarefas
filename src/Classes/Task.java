package Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel{
	
	JLabel index;
	JTextField taskName;
	JButton done;
	
	private boolean checked;
	
	Task()
	{
		this.setOpaque( false );

		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(Color.red);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel("");
		index.setForeground(Colors.INSTANCE.secondaryColor());
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
	
		taskName = new JTextField("Nome da Tarefa...");
		taskName.setForeground(Colors.INSTANCE.textColor());
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Colors.INSTANCE.primaryLightColor());

		
		this.add(taskName,BorderLayout.CENTER);
		
		done = new JButton("Completo");
		done.setPreferredSize(new Dimension(70,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(Colors.INSTANCE.secondaryColor());
		done.setForeground(Colors.INSTANCE.textColor());
		done.setOpaque(true);
		
		this.add(done,BorderLayout.EAST);
		
	}
	
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}
	
	
	public JButton getDone()
	{
		return done;
	}
	
	public boolean getState()
	{
		return checked;
	}
	
	public void changeState()
	{
		this.setBackground(Colors.INSTANCE.secondaryColor());
		taskName.setBackground(Colors.INSTANCE.secondaryColor());
		
		checked = true;
		revalidate();
	}
}