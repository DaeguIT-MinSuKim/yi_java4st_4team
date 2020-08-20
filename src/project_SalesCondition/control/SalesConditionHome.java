package project_SalesCondition.control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import project_SalesCondition.document.SalesCondition;

public class SalesConditionHome extends JPanel implements ActionListener {
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private SalesCondition salesCondition;

	public SalesConditionHome() {

		initComponents();
	}

	private void initComponents() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));

		btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		btnNewButton.setSize(new Dimension(110, 100));
		add(btnNewButton, BorderLayout.WEST);

		lblNewLabel = new JLabel("매출 현황       ");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "메인메뉴로 이동하시겠습니까?", "메인메뉴", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			((Window) getRootPane().getParent()).dispose();
		}
	}

}
