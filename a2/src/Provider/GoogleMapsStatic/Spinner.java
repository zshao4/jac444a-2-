package Provider.GoogleMapsStatic;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.event.*;

public class Spinner extends JPanel
implements
WindowListener,ChangeListener{
		
	Integer value = new Integer(512);            //current value
	Integer min = new Integer(0);                //minimum
	Integer max = new Integer(512);              //maximum
	Integer step =new Integer(1);               //step
	JTextField temp = new JTextField("14");
	private String curVal;
	
	public Spinner(){
		super(new SpringLayout());
				SpinnerNumberModel model = new SpinnerNumberModel(value,min,max,step);
		curVal = model.getValue().toString();
		/*ChangeListener listener = new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				SpinnerModel source = (SpinnerModel)e.getSource();
				System.out.print(source.getValue());
			}
		};
		model.addChangeListener(listener);*/
		JSpinner js = new JSpinner(model);
		js.addChangeListener(this);
		
	add(js);
	add(temp);
	
		validate();
		
		
	}
	
		
	
	
	
	

	
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JSpinnerDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(400,300);
		
		Spinner spin = new Spinner();
		frame.add(spin,BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(300,400));
		frame.pack();
		frame.setVisible(true);
		
		
	}









	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		JSpinner source = (JSpinner)e.getSource();
		curVal= source.getValue().toString();
		
	}









	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}









	public String getValue() {
		// TODO Auto-generated method stub
		return curVal;
	}
}
