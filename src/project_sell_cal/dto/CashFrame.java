package project_sell_cal.dto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project_sell_cal.control.CashPanel;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CashFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pHead;
	private CashPanel pBills;
	private JPanel pBtns;
	private JButton btnOk;
	private JButton btnCancel;
	private JLabel lblHead;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashFrame frame = new CashFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public CashFrame() {
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
		
		pBills = new CashPanel();
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
	
	protected void actionPerformedBtnCancel(ActionEvent e) {
		dispose();
	}
	
	protected void actionPerformedBtnOk(ActionEvent e) {
		System.out.println("확인");
		dispose();
	}
}
