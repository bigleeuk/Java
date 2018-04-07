import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
	public static final int WIDTH=200;	
	public static final int HEIGHT=200;
	JButton btn1= new JButton("BLUE");
	JButton btn2= new JButton("RED");
	JButton btn3= new JButton("DONE");
	JPanel gridPane = new JPanel();
	//FlowLayout flow= new FlowLayout ();
//	JPanel gridPane = new JPanel();
    public static void main(String[] args) {
    	MyFrame f= new MyFrame();
    	f.setVisible(true);
    }
    public MyFrame(){
        //JFrame win = new JFrame("MyLayoutDemo");
        setSize(WIDTH, HEIGHT);
        Container content = getContentPane();
   
        content.setLayout(new BorderLayout());
        content.add(new JLabel("Four Layout Managers:"), 
            BorderLayout.NORTH);
        
        gridPane.setLayout(new GridLayout(2,2));
        gridPane.add(new JLabel("BorderLayout"));
        gridPane.add(new JLabel("FlowLayout"));
        gridPane.add(new JLabel("GridLayout"));
        gridPane.add(new JLabel("BoxLayout"));
        content.add(gridPane, BorderLayout.CENTER);
        
        
        JPanel buttonPane = new JPanel();
        //buttonPane.setLayout(new FlowLayout());
        btn1.addActionListener(this);
        buttonPane.add(btn1);
        btn2.addActionListener(this);
        buttonPane.add(btn2);
        btn3.addActionListener(this);
        buttonPane.add(btn3);
        content.add(buttonPane, BorderLayout.SOUTH);
 
//        btn1.setOnClickListner(this);
//        
//        if (getActionCommend().equals("BLUE"))
//            win.setBackground(Color.BLUE);
//        if (btn2.equals("RED"))
//            win.setBackground(Color.RED);
        //win.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
 
        if (e.getActionCommand().equals("BLUE"))
            gridPane.setBackground(Color.BLUE);
        if (e.getActionCommand().equals("RED"))
            gridPane.setBackground(Color.RED);
        if(e.getActionCommand().equals("DONE"))
        	System.exit(0);
    }


}
