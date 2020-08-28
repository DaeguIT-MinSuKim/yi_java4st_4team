package project_main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project_SalesCondition.document.SalesCondition;
import project_SeatCondition.SeatTotal;

import java.awt.GridLayout;

public class Main extends JPanel implements ActionListener {

	private JPanel panel;
	private JLabel lblMainTitle;
	private JButton btnSeatControl;
	private JButton btnCellControl;
	private JButton btnExit;
	private SeatTotal seatTotal;
	private SalesCondition salesCondition;

	public Main() {

		initComponents();
	}

	private void initComponents() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		lblMainTitle = new JLabel("음식점 관리 프로그램");
		lblMainTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMainTitle.setForeground(Color.BLACK);
		lblMainTitle.setBorder(new EmptyBorder(30, 0, 30, 0));
		lblMainTitle.setFont(new Font("굴림", Font.BOLD, 30));

		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMainTitle);

		panel = new JPanel();
		panel.setBorder(new EmptyBorder(100, 100, 100, 100));
		add(panel);

		btnSeatControl = new JButton("좌석관리");
		btnSeatControl.setBackground(Color.WHITE);
		btnSeatControl.setMinimumSize(new Dimension(200, 70));
		btnSeatControl.setMaximumSize(new Dimension(200, 70));
		btnSeatControl.addActionListener(this);
		panel.setLayout(new GridLayout(0, 1, 0, 30));
		btnSeatControl.setFont(new Font("굴림", Font.PLAIN, 20));
		btnSeatControl.setSize(new Dimension(200, 70));
		panel.add(btnSeatControl);

		btnCellControl = new JButton("매출관리");
		btnCellControl.setBackground(Color.WHITE);
		btnCellControl.setMinimumSize(new Dimension(200, 70));
		btnCellControl.setMaximumSize(new Dimension(200, 70));
		btnCellControl.addActionListener(this);
		btnCellControl.setFont(new Font("굴림", Font.PLAIN, 20));
		btnCellControl.setSize(new Dimension(200, 70));
		panel.add(btnCellControl);

		btnExit = new JButton("프로그램 종료");
		btnExit.setBackground(Color.WHITE);
		btnExit.setMinimumSize(new Dimension(200, 70));
		btnExit.setMaximumSize(new Dimension(200, 70));
		btnExit.addActionListener(this);
		btnExit.setFont(new Font("굴림", Font.PLAIN, 20));
		btnExit.setSize(new Dimension(200, 70));
		panel.add(btnExit);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExit) {
			actionPerformedBtnExit(e);
		}
		if (e.getSource() == btnCellControl) {
			actionPerformedBtnCellControl(e);
		}
		if (e.getSource() == btnSeatControl) {
			actionPerformedBtnSeatControl(e);
		}
	}

	protected void actionPerformedBtnSeatControl(ActionEvent e) {
		if (seatTotal == null) {
			seatTotal = new SeatTotal();
		}
		seatTotal.setVisible(true);
	}

	protected void actionPerformedBtnCellControl(ActionEvent e) {
		if (salesCondition == null) {
			salesCondition = new SalesCondition();
		}
		salesCondition.setVisible(true);
	}

	protected void actionPerformedBtnExit(ActionEvent e) {
		int closeCorfirm = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "EXIT", JOptionPane.YES_NO_OPTION);
		if (closeCorfirm == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}