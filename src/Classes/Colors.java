package Classes;

import java.awt.Color;

public class Colors {
	
	public static final Colors INSTANCE = new Colors();
	
	public Color primaryColor() {
		
		return new Color (35, 43, 42);
		
	}
	
	public Color primaryLightColor() {
		
		return new Color (32, 41, 40);
		
	}
	
	public Color secondaryColor() {
		
		return new Color(17, 122, 101);
	}
	
	public Color textColor() {
		
		return Color.WHITE;
	}
	
}
