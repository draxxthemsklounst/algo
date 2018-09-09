package algo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;




public class GUI extends JFrame{
	private JLabel item1;
	private JLabel item2;
	
	public GUI(){
        super("Algorithm Visual");
        setLayout(new FlowLayout());
        
        item1=new javax.swing.JLabel("This is item1");
        item1.setToolTipText("This shows on hover");
        add(item1);
        
        item2 =  new JLabel("This beith item2");
        item2.setToolTipText("This is another tool tip text");
        add(item2);
    }
}
