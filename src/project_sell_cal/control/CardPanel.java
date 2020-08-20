package project_sell_cal.control;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class CardPanel extends JPanel {
	private JLabel lblBill;
	private JLabel lblBillNum;
	private JLabel lbl10per;
	private JLabel lbl10perNum;
	private JLabel lblTotal;
	private JLabel lblTotalNum;

	public CardPanel() {

		initComponents();
	}
	private void initComponents() {
		setBorder(new EmptyBorder(20, 50, 20, 50));
		setLayout(new GridLayout(0, 2, 0, 20));
		
		lblBill = new JLabel("총 금 액");
		lblBill.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblBill.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		add(lblBill);
		
		lblBillNum = new JLabel("");
		lblBillNum.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblBillNum.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblBillNum);
		
		lbl10per = new JLabel("부 가 세");
		lbl10per.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lbl10per.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		add(lbl10per);
		
		lbl10perNum = new JLabel("");
		lbl10perNum.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lbl10perNum.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbl10perNum);
		
		lblTotal = new JLabel("받을 금액");
		lblTotal.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblTotal.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		add(lblTotal);
		
		lblTotalNum = new JLabel("");
		lblTotalNum.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblTotalNum.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblTotalNum);
	}

}
