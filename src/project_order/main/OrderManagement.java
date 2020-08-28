package project_order.main;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project_order.content.OrderList;
import java.awt.BorderLayout;
import MenuCollect.MainPanel;

public class OrderManagement extends JFrame {

	private JPanel contentPane;
	private OrderList panel;
	private MainPanel panel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderManagement frame = new OrderManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OrderManagement() {
		
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1105, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		panel = new OrderList();
		contentPane.add(panel);
		
		panel_1 = new MainPanel();
		contentPane.add(panel_1);
	}
}
