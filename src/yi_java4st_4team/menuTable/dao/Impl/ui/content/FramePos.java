package yi_java4st_4team.menuTable.dao.Impl.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.menuTable.dao.Impl.service.MenuService;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

import java.awt.FlowLayout;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class FramePos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panel;
	private JPanel panelList;
	private JTabbedPane tabbedPane;
	private JScrollPane scrollPane;
	private ArrayList<MenuOrder> moList = new ArrayList<MenuOrder>();
	private MenuService menuService;
	private MenuOrderService moService;
	private JPanel panelBtns;
	private JPanel panelCal;
	private JPanel panelCompl;
	private JPanel panelPayMethod;
	private SelectedMenuOrderTable table;
	private JButton btnTotalCancel;
	private JButton btnSelectedCancel;
	private JButton btnMinus;
	private JButton btnOrder;
	private JLabel lblPayMethod;
	private JPanel panelCashCard;
	private JButton btnCash;
	private JButton btnCard;
	private JButton btnPlus;
	private JPanel panelMain;
	private JPanel panelSub;
	private JPanel panelBev;
	private List<Menu> mList;
	private List<Menu> sList;
	private List<Menu> bList;
	private JButton btn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePos frame = new FramePos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FramePos() {
		moService = new MenuOrderService(); // DB 테이블 셋팅
//		moList = (ArrayList<MenuOrder>) moService.getMenuOrderList();	//DB 테이블 목록 배열로 선언
		menuService = new MenuService();
		mList = menuService.getMenuList("M");
		sList = menuService.getMenuList("S");
		bList = menuService.getMenuList("B");
		moList.add(new MenuOrder(new TableInfo(1), new Menu("뼈해장국"), 6000, 1, 0));
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 914, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));

		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panelList = new JPanel();
		panelList.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelList);
		panelList.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		panelList.add(scrollPane, BorderLayout.CENTER);

		table = new SelectedMenuOrderTable();
		table.setItems(moList);
		scrollPane.setViewportView(table);

//		table = new SelectedMenuOrderTable(); // 테이블 세팅
//		table.setItems(moList); // DB에 있는 값 불러오기
//		scrollPane.setViewportView(table);

		panelBtns = new JPanel();
		panel.add(panelBtns);
		panelBtns.setLayout(new BoxLayout(panelBtns, BoxLayout.Y_AXIS));

		panelCal = new JPanel();
		panelBtns.add(panelCal);
		panelCal.setLayout(new GridLayout(1, 0, 0, 0));

		btnTotalCancel = new JButton("전체취소");
		panelCal.add(btnTotalCancel);

		btnSelectedCancel = new JButton("선택취소");
		panelCal.add(btnSelectedCancel);

		btnPlus = new JButton("+");
		panelCal.add(btnPlus);

		btnMinus = new JButton("-");
		panelCal.add(btnMinus);

		panelCompl = new JPanel();
		panelBtns.add(panelCompl);
		panelCompl.setLayout(new GridLayout(0, 1, 0, 0));

		btnOrder = new JButton("주문완료");
		btnOrder.addActionListener(this);
		panelCompl.add(btnOrder);

		panelPayMethod = new JPanel();
		panelBtns.add(panelPayMethod);
		panelPayMethod.setLayout(new GridLayout(0, 1, 0, 0));

		lblPayMethod = new JLabel("결제방식");
		lblPayMethod.setHorizontalAlignment(SwingConstants.CENTER);
		panelPayMethod.add(lblPayMethod);

		panelCashCard = new JPanel();

		panelPayMethod.add(panelCashCard);
		panelCashCard.setLayout(new GridLayout(0, 2, 0, 0));

		btnCash = new JButton("현금");
		panelCashCard.add(btnCash);

		btnCard = new JButton("카드");
		panelCashCard.add(btnCard);
		panelMenu = new JPanel();
		contentPane.add(panelMenu);
		panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
		// 결제방식버튼, 테이블

		// 버튼 시작
		BevelBorder b = new BevelBorder(BevelBorder.RAISED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Dialog", Font.BOLD, 14));
		panelMenu.add(tabbedPane);

		// tab setting
		panelMain = new JPanel();
		tabbedPane.addTab("주메뉴", null, panelMain, null);
		panelMain.setLayout(new GridLayout(0, 4, 0, 0));

		// 서브메뉴
		panelSub = new JPanel();
		tabbedPane.addTab("부메뉴", null, panelSub, null);
		panelSub.setLayout(new GridLayout(0, 4, 0, 0));

		// 음료
		panelBev = new JPanel();
		tabbedPane.addTab("음료", null, panelBev, null);
		panelBev.setLayout(new GridLayout(0, 4, 0, 0));

		makeBtns(mList, panelMain);
		makeBtns(sList, panelSub);
		makeBtns(bList, panelBev);

//		btnBev16 = new JButton("<html><br></html>");
//		panelBev.add(btnBev16);
//		btnBev16.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev16.setSelected(true);
//		btnBev16.setBackground(Color.LIGHT_GRAY);
//		btnBev16.setBorder(b);
//		btnBev16.setName("B16");

	}

	private void makeBtns(List<Menu> mList, JPanel menuPanel) {
		for (int i = 0; i < mList.size(); i++) {
			Menu m = mList.get(i);
			String btnText = String.format("<html>%s<br>%d<html>", m.getName(), m.getPrice());
			btn = new JButton(btnText);
			btn.addActionListener(this);
//			btn.setName(name);
			menuPanel.add(btn);
			btn.setName(String.format("%s", i));
		}

		for (int i = 0; i < 16 - mList.size(); i++) {
			menuPanel.add(new JButton());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOrder) {
			actionPerformedBtnOrder(e);
		}
		
		if (e.getSource() == btn) {
			System.out.println(e);
			table.setItems(moList);
			moList.add(new MenuOrder(new TableInfo(1), new Menu("뼈해장국"), 6000, 1, 0));
			moList.stream().forEach(System.out::println);
		}
	}

	protected void actionPerformedBtnOrder(ActionEvent e) {
		moList.stream().forEach(System.out::println);
		moService.addMenuOrder(getMenuList(moList));
	}
	
	public MenuOrder getMenuList(ArrayList<MenuOrder> moList) {
		moList.stream().forEach(System.out::println);
		System.out.println(moList.get(0));
		TableInfo tno = moList.get(0).getTno();
		Menu mName = moList.get(0).getmName();
		int price = moList.get(0).getPrice();
		int cnt = moList.get(0).getCnt();
		int isPayment = moList.get(0).getIsPayment();
		return new MenuOrder(tno, mName, price, cnt, isPayment);
	}

}
