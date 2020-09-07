package yi_java4st_4team.payment.dto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.menuTable.dao.Impl.ui.content.SelectedMenuOrderTable;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.payment.control.PaymentPanel;

public class CashFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pHead;
	private PaymentPanel pBills;
	private JPanel pBtns;
	private JButton btnOk;
	private JButton btnCancel;
	private JLabel lblHead;
	private SelectedMenuOrderTable table ;
	private MenuOrderService moService;
	
	public CashFrame() {
		moService = new MenuOrderService();
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pHead = new JPanel();
		contentPane.add(pHead, BorderLayout.NORTH);
		
		lblHead = new JLabel("현금결제");
		lblHead.setFont(new Font("함초롬돋움", Font.BOLD, 35));
		pHead.add(lblHead);
		
		pBills = new PaymentPanel();
		contentPane.add(pBills, BorderLayout.CENTER);
		
		pBtns = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pBtns.getLayout();
		flowLayout.setHgap(60);
		pBtns.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.add(pBtns, BorderLayout.SOUTH);
		
		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		btnOk.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		btnOk.setPreferredSize(new Dimension(95, 40));
		btnOk.setBackground(Color.WHITE);
		btnOk.setForeground(Color.BLACK);
		pBtns.add(btnOk);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		btnCancel.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		btnCancel.setPreferredSize(new Dimension(95, 40));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(Color.BLACK);
		pBtns.add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
	}
	
	public void totalPrice(int totalPrice) {
		pBills.setMoney(totalPrice);
	}
	
	public void setTable(SelectedMenuOrderTable table) {
		this.table = table;
	}
	
	protected void actionPerformedBtnCancel(ActionEvent e) {
		System.out.println("취소");
		dispose();
	}
	
	protected void actionPerformedBtnOk(ActionEvent e) {
		System.out.println("확인");
		JOptionPane.showMessageDialog(null, "결제완료 되었습니다.");
		ArrayList<MenuOrder> insertMenuOrder =  table.getItemList();
		insertMenuOrder.stream().forEach(System.out::println);
		Date newDate = new Date();
		for(MenuOrder mo : insertMenuOrder) {
			System.out.println("CashFrame mo : " + mo + " tableInfo : " + mo.getTableInfo().getNo());	
			mo.setOrderday(newDate);
			mo.setIsPayment(1);
			insertMenuOrder.stream().forEach(System.out::println);
			moService.updateMenuOrder(mo);
		}
		dispose();
		
	}

	
}
