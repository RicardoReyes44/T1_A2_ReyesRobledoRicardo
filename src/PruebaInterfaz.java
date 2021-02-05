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
