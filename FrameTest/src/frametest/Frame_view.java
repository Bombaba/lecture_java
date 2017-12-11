package frametest;

import java.awt.*;
import java.awt.event.*;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener, WindowListener {

	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private TextField text1 = new TextField("0", 10);
	private TextField text2 = new TextField("0", 10);
	private TextField text3 = new TextField("0", 10);
	private Label operator = new Label("+");
	private Button button_plus = new Button("+");
	private Button button_sub = new Button("-");
	private Button button_mul = new Button("*");
	private Button button_div = new Button("/");
	
	public Frame_view() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameTest");
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(new GridLayout(2, 1));
		add(p1);
		add(p2);
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(text1);
		p1.add(operator);
		p1.add(text2);
		p1.add(new Label("="));
		p1.add(text3);
		
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(button_plus);
		p2.add(button_sub);
		p2.add(button_mul);
		p2.add(button_div);
		button_plus.addActionListener(this);
		button_sub.addActionListener(this);
		button_mul.addActionListener(this);
		button_div.addActionListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		Calculation_lib clib = new Calculation_lib(val1, val2);
		String op = " ";
		if (e.getSource() == button_plus) {
			text3.setText(String.valueOf(clib.getPlus()));
			op = "+";
		}
		else if (e.getSource() == button_sub) {
			text3.setText(String.valueOf(clib.getMinus()));
			op = "-";
		}
		else if (e.getSource() == button_mul) {
			text3.setText(String.valueOf(clib.getTime()));
			op = "*";
		}
		else if (e.getSource() == button_div) {
			text3.setText(String.valueOf(clib.getDivide()));
			op = "/";
		}
		operator.setText(op);
	}

}
