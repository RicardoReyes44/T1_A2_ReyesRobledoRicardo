import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;


class Interfaz extends JFrame{
	
	public Interfaz() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 630);
    	setTitle("Primera tarea");
    	setLocationRelativeTo(null);

    	JLabel label1 = new JLabel("The Classic Form include all visible fiels for");
    	label1.setBounds(5, 0, 270, 30);
    	add(label1);
    	
    	JLabel label2 = new JLabel("this list");
    	label2.setBounds(5, 20, 270, 25);
    	add(label2);
    	
    	JLabel label3 = new JLabel("FORM OPTIONS");
    	label3.setBounds(5, 50, 270, 30);
    	add(label3);
    	
    	JLabel label4 = new JLabel("Include he following:");
    	label4.setBounds(5, 65, 150, 35);
    	add(label4);
    	
    	JCheckBox chkPrimero = new JCheckBox("a little for you form");
    	chkPrimero.setBounds(5, 90, 150, 30);
    	add(chkPrimero);
    	
    	JCheckBox chkSegundo = new JCheckBox("interest group fields");
    	chkSegundo.setBounds(5, 280, 150, 30);
    	add(chkSegundo);
    	
    	JCheckBox chkTercero = new JCheckBox("required field indicators");
    	chkTercero.setBounds(5, 305, 190, 30);
    	add(chkTercero);
    	
    	JLabel label6 = new JLabel("Set form width");
    	label6.setBounds(5, 350, 240, 35);
    	add(label6);
    	
    	JTextField txtPrimero = new JTextField();
    	txtPrimero.setBounds(5, 380, 240, 30);
    	add(txtPrimero);
    	
    	JLabel label7 = new JLabel("Enhance your form");
    	label7.setBounds(5, 310, 240, 35);
    	add(label7);
    	
        JLabel label8 = new JLabel("enable evil popup mode");
    	label8.setBounds(5, 440, 240, 35);
    	add(label8);

    	setVisible(true);
	}
	
}


public class PruebaInterfaz extends JFrame{

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Interfaz();
				}
		});

	}

}
