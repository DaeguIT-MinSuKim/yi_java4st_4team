package project_order.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import project_order.component.OrderTable;
import project_sell_cal.dto.CardFrame;
import project_sell_cal.dto.CashFrame;
import java.awt.Font;

public class OrderList extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblTableNo;
	private JButton btnCancelAll;
	private JButton btnCancel;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnComplete;
	private JPanel panel_5;
	private JButton btnCash;
	private JButton btnCard;
	private JScrollPane scrollPane;
	private OrderTable table;
	private CardFrame cardFrame;
	private CashFrame cashFrame;
	private JPanel panel_6;
	private JLabel lblNewLabel_1;

	public OrderList() {

		initComponents();
	}

	private void initComponents() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBorder(new EmptyBorder(10, 15, 10, 30));
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		lblTableNo = new JLabel("");
		panel.add(lblTableNo);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "<\uC8FC\uBB38 \uBAA9\uB85D>", TitledBorder.LEADING, TitledBorder.TOP,
				null, Color.BLACK));
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane, BorderLayout.CENTER);

		table = new OrderTable();
		scrollPane.setViewportView(table);

		panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		add(panel_2);

		btnCancelAll = new JButton("\uC804\uCCB4 \uCDE8\uC18C");
		btnCancelAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		panel_2.add(btnCancelAll);

		btnCancel = new JButton("\uC120\uD0DD \uCDE8\uC18C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_1(e);
			}
		});
		panel_2.add(btnCancel);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_2(e);
			}
		});
		panel_2.add(btnPlus);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_3(e);
			}
		});
		panel_2.add(btnMinus);

		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		add(panel_3);

		btnComplete = new JButton("\uC8FC\uBB38 \uC644\uB8CC");
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_4(e);
			}
		});
		panel_3.add(btnComplete);

		panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_4.add(panel_6);
		
		lblNewLabel_1 = new JLabel("결 제 방 식");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 15));
		panel_6.add(lblNewLabel_1);

		panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setHgap(30);
		panel_5.setBorder(null);
		panel_4.add(panel_5);

		btnCash = new JButton("\uD604\uAE08");
		btnCash.setFont(new Font("굴림", Font.BOLD, 15));
		btnCash.setBackground(Color.WHITE);
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_5(e);
			}
		});
		panel_5.add(btnCash);

		btnCard = new JButton("\uCE74\uB4DC");
		btnCard.setFont(new Font("굴림", Font.BOLD, 15));
		btnCard.setBackground(Color.WHITE);
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnNewButton_6(e);
			}
		});
		panel_5.add(btnCard);
	}

// 전체 취소
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		System.out.println("전체 취소~~");
	}

//	선택 취소
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		System.out.println("선택 취소~~");
	}

//	+ 버튼
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		System.out.println("수량 1 증가");
	}

//	- 버튼
	protected void actionPerformedBtnNewButton_3(ActionEvent e) {
		System.out.println("수량 1 감소");
	}

//	주문 완료 버튼
	protected void actionPerformedBtnNewButton_4(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "주문을 완료하시겠습니까?", "주문목록", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			((Window) getRootPane().getParent()).dispose();
		}
	}

//	현금 버튼
	protected void actionPerformedBtnNewButton_5(ActionEvent e) {
		if (cashFrame == null) {
			cashFrame = new CashFrame();
		}
		cashFrame.setVisible(true);
	}

//	카드 버튼
	protected void actionPerformedBtnNewButton_6(ActionEvent e) {
		if (cardFrame == null) {
			cardFrame = new CardFrame();
		}
		cardFrame.setVisible(true);
	}
}
