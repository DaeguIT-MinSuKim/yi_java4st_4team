package project_SeatCondition;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;

public class SeatTotal extends JFrame {

	private JPanel contentPane;
	private OrderTitle panel;
	private SeatManagement panel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatTotal frame = new SeatTotal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SeatTotal() {
		initComponents();
	}
	private void initComponents() {
		setMinimumSize(new Dimension(800, 700));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new OrderTitle();
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel_1 = new SeatManagement();
		contentPane.add(panel_1, BorderLayout.CENTER);
	}

}
