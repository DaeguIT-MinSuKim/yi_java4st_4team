package project_SalesCondition.control;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class SalesConditionBtns extends JPanel {
	private JPanel panel;
	private JButton btnAbout;
	private JDateChooser dateStart;
	private JDateChooser dateEnd;
	private JLabel lblNewLabel;
	private Date date = new Date();
	/**
	 * Create the panel.
	 */
	public SalesConditionBtns() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		Dimension d = new Dimension(700,150);
		
		panel = new JPanel();
		panel.setMinimumSize(new Dimension(700, 150));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		dateStart = new JDateChooser();
		dateStart.setDateFormatString("yyyy. MM. dd");
		dateStart.setDate(date);
		panel.add(dateStart);
		
		lblNewLabel = new JLabel(" ~ ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		panel.add(lblNewLabel);
		
		dateEnd = new JDateChooser();
		dateEnd.setDateFormatString("yyyy. MM. dd");
		dateEnd.setDate(date);
		panel.add(dateEnd);
		
		btnAbout = new JButton("조회");
		btnAbout.setBackground(Color.WHITE);
		btnAbout.setForeground(Color.BLACK);
		panel.add(btnAbout);
	}

}
