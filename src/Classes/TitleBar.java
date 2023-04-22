package Classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{

	TitleBar() {
		
		this.setOpaque( false );

		this.setPreferredSize(new Dimension(400,80));
		
		JLabel titleText = new JLabel("Gerenciador de Tarefas");
		titleText.setPreferredSize(new Dimension(350, 60));
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		titleText.setForeground(Colors.INSTANCE.textColor());
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}