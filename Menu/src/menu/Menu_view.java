package menu;

import java.awt.*;
import java.awt.event.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Menu_view extends Frame implements ActionListener, WindowListener{
	private MenuBar mb;
	private Menu graph;
	private MenuItem graph1, graph2;
	private Panel cardPanel, card1, card2;
	
	public Menu_view() {
		super();
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("Menu");
		mb = new MenuBar();
		graph = mb.add(new Menu("Graph"));
		graph1 = graph.add(new MenuItem("Graph1"));
		graph2 = graph.add(new MenuItem("Graph2"));
		setMenuBar(mb);
		graph1.addActionListener(this);
		graph2.addActionListener(this);
		
		cardPanel = new Panel();
		cardPanel.setLayout(new CardLayout());
		add(cardPanel);
		
		card1 = new Panel();
		DefaultCategoryDataset data1 = new DefaultCategoryDataset();
		data1.addValue(300, "USA", "2015");
		data1.addValue(100, "USA", "2016");
		data1.addValue(200, "USA", "2017");
		JFreeChart chart1 =
			ChartFactory.createLineChart(
					"Import Volume",
					"Year",
					"Ton",
					data1,
					PlotOrientation.VERTICAL,
					true,
					false,
					false
		);
		ChartPanel cpanel1 = new ChartPanel(chart1);
		card1.add(cpanel1, BorderLayout.CENTER);
		
		card2 = new Panel();
		DefaultCategoryDataset data2 = new DefaultCategoryDataset();
		data2.addValue(100, "China", "2015");
		data2.addValue(300, "China", "2016");
		data2.addValue(150, "China", "2017");
		JFreeChart chart2 =
			ChartFactory.createLineChart(
					"Import Volume",
					"Year",
					"Ton",
					data2,
					PlotOrientation.VERTICAL,
					true,
					false,
					false
		);
		ChartPanel cpanel2 = new ChartPanel(chart2);
		card2.add(cpanel2, BorderLayout.CENTER);
		
		cardPanel.add(card1, "Card1");
		cardPanel.add(card2, "Card2");
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
		// TODO Auto-generated method stub
		CardLayout cardlayout = (CardLayout)(cardPanel.getLayout());
		if (e.getSource() == graph1) {
			setBackground(Color.red);
			cardlayout.show(cardPanel, "Card1");
		}
		if (e.getSource() == graph2) {
			setBackground(Color.blue);
			cardlayout.show(cardPanel, "Card2");
		}
	}

}
