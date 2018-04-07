import javax.swing.*;
import java.awt.*;
public class SecondWindow extends JFrame{
	public static final int  WIDTH =200;
	public static final int HEIGHT = 200;
	
	public SecondWindow(){
		super();
		setSize(WIDTH,HEIGHT);
		Container contentpane = getContentPane();
		JLabel label =new JLabel("now available in color!");
		contentpane.add(label);
		setTitle("second window");
		contentpane.setBackground(Color.BLUE);
		addWindowListener(new WindowDestroyer());
	}
	public SecondWindow(Color customColor){
		super();
		setSize(WIDTH,HEIGHT);
		Container contentpane = getContentPane();
		JLabel label = new JLabel("now avilable in color");
		contentpane.add(label);
		
		setTitle("Second Window");
		contentpane.setBackground(customColor);
		
		addWindowListener(new WindowDestroyer());
		
	}
}
