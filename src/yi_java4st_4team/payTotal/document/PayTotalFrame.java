package yi_java4st_4team.payTotal.document;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.payTotal.control.PayTotalBtns;
import yi_java4st_4team.payTotal.control.PayTotalHome;
import yi_java4st_4team.payTotal.control.PayTotalTable;
import yi_java4st_4team.payTotal.dto.PayTotal;

public class PayTotalFrame extends JFrame {

	private JPanel contentPane;
	private PayTotalHome pHome;
	private PayTotalBtns pBtns;
	private JPanel pTable;
	private JScrollPane scrollPane;
	private PayTotalTable table;
	
	private ArrayList<PayTotal> fdsList = new ArrayList<PayTotal>();
	private JPanel panel;
	private JPanel panel_1;
	private MenuOrderService service;

	public PayTotalFrame() {
		service = new MenuOrderService();
		table.setItems((ArrayList)service.getMenuOrderList());
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pHome = new PayTotalHome();
		pHome.setMaximumSize(new Dimension(2147483647, 200));
		contentPane.add(pHome);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		
		pBtns = new PayTotalBtns();
		pBtns.setMinimumSize(new Dimension(150, 30));
		pBtns.setMaximumSize(new Dimension(2147483647, 200));
		contentPane.add(pBtns);
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		pTable = new JPanel();
		contentPane.add(pTable);
		pTable.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		pTable.add(scrollPane, BorderLayout.CENTER);
		
		table = new PayTotalTable();
		scrollPane.setViewportView(table);
	}

}
