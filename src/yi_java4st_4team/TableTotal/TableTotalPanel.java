package yi_java4st_4team.TableTotal;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTotalPanel extends JPanel implements ActionListener {
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;

	public TableTotalPanel() {

		initComponents();
	}

	private void initComponents() {

		lblNewLabel = new JLabel("좌석 현황");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel.setVerticalAlignment(JLabel.CENTER);

		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setMaximumSize(new Dimension(100, 70));
		btnNewButton_1.addActionListener(this);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(508, Short.MAX_VALUE))
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(17)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(16, Short.MAX_VALUE))
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE));
		setLayout(groupLayout);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}

	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "메인메뉴로 이동하시겠습니까?", "메인메뉴", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			((Window) getRootPane().getParent()).dispose();
		}
	}
}
