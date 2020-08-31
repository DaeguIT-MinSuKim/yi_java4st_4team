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

import yi_java4st_4team.payTotal.control.PayTotalBtns;
import yi_java4st_4team.payTotal.control.PayTotalHome;
import yi_java4st_4team.payTotal.control.PayTotalTable;
import yi_java4st_4team.payTotal.dto.Foods;

public class PayTotalFrame extends JFrame {

	private JPanel contentPane;
	private PayTotalHome pHome;
	private PayTotalBtns pBtns;
	private JPanel pTable;
	private JScrollPane scrollPane;
	private PayTotalTable table;
	
	private ArrayList<Foods> fdsList = new ArrayList<Foods>();
	private JPanel panel;
	private JPanel panel_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayTotalFrame frame = new PayTotalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PayTotalFrame() {
		fdsList.add(new Foods(1, "갈비탕", 15, 135000, 17.4));
		fdsList.add(new Foods(2, "뼈해장국", 20, 120000, 15.5));
		fdsList.add(new Foods(3, "꽁치구이", 18, 90000, 11.6));
		fdsList.add(new Foods(4, "소주", 20, 80000, 10.3));
		fdsList.add(new Foods(5, "사이다", 17, 68000, 8.8));
		fdsList.add(new Foods(6, "콜라", 14, 56000, 7.2));
		fdsList.add(new Foods(7, "제육덮밥", 9, 54000, 7.0));
		fdsList.add(new Foods(8, "맥주", 13, 52000, 6.7));
		fdsList.add(new Foods(9, "육개장", 7, 49000, 6.3));
		fdsList.add(new Foods(10, "계란찜", 13, 39000, 5.0));
		fdsList.add(new Foods(11, "계란후라이", 21, 21000, 2.7));
		fdsList.add(new Foods(12, "공기밥", 12, 12000, 1.5));
		
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
		table.setItems(fdsList);
	}

}
