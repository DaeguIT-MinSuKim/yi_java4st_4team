package yi_java4st_4team.menuTable.dao.Impl.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.menuTable.dao.Impl.service.MenuService;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

@SuppressWarnings("serial")
public class FramePos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panel;
	private JPanel panelList;
	private JTabbedPane tabbedPane;
	private JScrollPane scrollPane;
	private ArrayList<MenuOrder> moList;
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
	private TableInfo tInfo;
	private MenuOrder mo;
	private TableInfo tableInfo;

	public FramePos(TableInfo tInfo) {
		this.tInfo = tInfo;
		moService = new MenuOrderService(); // DB 테이블 셋팅
//		moList = (ArrayList<MenuOrder>) moService.getMenuOrderList();	//DB 테이블 목록 배열로 선언
		menuService = new MenuService();
		mList = menuService.getMenuList("M");
		sList = menuService.getMenuList("S");
		bList = menuService.getMenuList("B");
		//// 테스트용 ///////////////////////////////////////////
		moList = new ArrayList<MenuOrder>();
//		moList.add(new MenuOrder(new TableInfo(1), new Menu("M01", "뼈해장국", 6000), new Date(), 2, 0));
		//////////////////////////////////////////////////////
		initComponents();

		System.out.println(tInfo);
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

		ArrayList<MenuOrder> initMenuOrder = new ArrayList<MenuOrder>();
		table = new SelectedMenuOrderTable();

//		table.setItems((ArrayList)moService.selectOrderByTableNo(tInfo));//테이블 뜨는지 db에서 값 불러와서 셋팅
		table.setItems(initMenuOrder);
		scrollPane.setViewportView(table);

		panelBtns = new JPanel();
		panel.add(panelBtns);
		panelBtns.setLayout(new BoxLayout(panelBtns, BoxLayout.Y_AXIS));

		panelCal = new JPanel();
		panelBtns.add(panelCal);
		panelCal.setLayout(new GridLayout(1, 0, 0, 0));

		btnTotalCancel = new JButton("전체취소");
		btnTotalCancel.addActionListener(this);

		panelCal.add(btnTotalCancel);

		btnSelectedCancel = new JButton("선택취소");
		btnSelectedCancel.addActionListener(this);
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
			JButton btn = new JButton(btnText);
			btn.setName(m.getCode());
			btn.addActionListener(this);
//			btn.setName(name);
			menuPanel.add(btn);
//			btn.setName(String.format("%s", i));

		}

		for (int i = 0; i < 16 - mList.size(); i++) {
			menuPanel.add(new JButton());
		}
	}
	/*
	 * 
	 * //걍 시도해봣음.... 안되네..ㅠㅠ private void infoBtns(List<MenuOrder> moList, JPanel
	 * menuPanel) { for(int j=0; j< moList.size(); j++) { ArrayList<MenuOrder> list
	 * = new ArrayList<MenuOrder>(); List<MenuOrder> res =
	 * moService.getMenuOrderList(); for(MenuOrder mo : res) btn.
	 * btn.addActionListener(this); menuPanel.add(btn);
	 * btn.setName(String.format("%s", j)); } }
	 * 
	 * 
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOrder) {
			actionPerformedBtnOrder(e);
		} else if (e.getSource() == btnTotalCancel) {
			actionPerformedbtnTotalCancel(e);
		} else if (e.getSource() == btnSelectedCancel) {
			actionPerformedbtnSelectedBtnCancel(e);
		} else {
			actionPerformedBtn(e);
		}
	}



	protected void actionPerformedBtn(ActionEvent e) {
		System.out.println(e);
		JButton btn = (JButton) e.getSource();
//		System.out.println("aaaaaaaaaaaaa" + btn.getName());
		Menu menu = new Menu(btn.getName());
		Menu addMenu = null;
		if (mList.contains(menu)) {
			addMenu = mList.get(mList.indexOf(menu));
		} else if (sList.contains(menu)) {
			addMenu = sList.get(sList.indexOf(menu));
		} else {
			addMenu = bList.get(bList.indexOf(menu));
		}
		System.out.println("addMenu : " + addMenu);

		ArrayList<MenuOrder> orderedList = table.getItemList();
		orderedList.stream().forEach(System.out::println);

		MenuOrder newOrder = new MenuOrder(tInfo, addMenu, 1, 1, 0);
		if (orderedList.contains(newOrder)) {
			// 같은 메뉴 추가 주문
			MenuOrder beforeOrder = orderedList.get(orderedList.indexOf(newOrder));
			System.out.println("선주문 내역 : " + beforeOrder);
			int cnt = beforeOrder.getCnt() + 1;
			beforeOrder.setCnt(cnt);
			table.updateRow(orderedList.indexOf(newOrder), beforeOrder);

		} else {
			table.addRow(newOrder);
		}

//		System.out.println(" aaaa" + orderedList.contains(newOrder));
		/*
		 * boolean isExist = false; // 이미 추가된 메뉴 여부 for (int i = 0; i <
		 * table.getRowCount(); i++) { // 테이블 행 개수 만큼 반복 String menuName = table.get; if
		 * (Integer.toString(menuId).equals(Integer.toString())) { isExist = true; //
		 * 이미추가된 메뉴 int menuCnt = (int) table.getValueAt(i, 2);
		 * table.setValueAt(++menuCnt, i, 2); break; // } } if(!isExist) {
		 * table.addRow(new MenuOrder(tInfo, addMenu, 1, 1, 0)); }
		 */

		/*
		 * for(int i=0; i< table.getRowCount(); i++) { //테이블 행 개수 만큼 반복 int menuCnt=
		 * (int) table.getValueAt(i, 2); table.setValueAt(++menuCnt, i, 2); }
		 */
//		int cnt = 1;
//		int unitPrice = cnt * addMenu.getPrice();
//		MenuOrder newOrder = new MenuOrder(tInfo, addMenu, 1, 1, 0);
//		MenuOrder newOrder = new MenuOrder(tInfo, addMenu, cnt, menuPrice, 0);
//		System.out.println("new Order " + newOrder);
//		System.out.println("ddddddddddmm" + mList.contains(menu) + mList.indexOf(menu));
//		System.out.println("ddddddddddss" + sList.contains(menu)+ sList.indexOf(menu));
//		System.out.println("ddddddddddbb" + bList.contains(menu)+ bList.indexOf(menu));
//		table.addRow(newOrder);
//		table.setVisible(true);

	}

	protected void actionPerformedBtnOrder(ActionEvent e) {
		int selIdx = table.getSelectedRow();
		if(selIdx == - 1) {
			JOptionPane.showMessageDialog(null, "해당 항목을 선택하세요");
			return;
		}
		ArrayList<MenuOrder>moList = new ArrayList<MenuOrder>();
		MenuOrder mo = moList.get(selIdx);
		
	}

	protected void actionPerformedbtnTotalCancel(ActionEvent e) {
		table.removeOrderAll();
	}
	
	protected void actionPerformedbtnSelectedBtnCancel(ActionEvent e) {
				System.out.println(e);
	}

}
