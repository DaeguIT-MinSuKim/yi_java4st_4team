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
	private JButton btnTotalCancel;
	private JButton btnSelectedCancel;
	private JButton btnMinus;
	private JButton btnNewButton_4;
	private JLabel lblPayMethod;
	private JPanel panelCashCard;
	private JButton btnCash;
	private JButton btnCard;
	private JButton btnPlus;
	private JPanel panelMain;
	private JPanel panelSub;
	private JPanel panelBev;
	private SelectedMenuOrderTable table;
	private List<Menu> mList;
	private List<Menu> sList;
	private List<Menu> bList;

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
		moList.add(new MenuOrder());
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
		panelCompl.setLayout(new GridLayout(0, 4, 0, 0));

		btnNewButton_4 = new JButton("주문완료");
		panelCompl.add(btnNewButton_4);

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
		
//		for(int i=0; i<mList.size(); i++) {
//			Menu m = mList.get(i);
//			String btnText = String.format("<html>%s<br>%d<html>", m.getName(), m.getPrice());
//			JButton btn = new JButton(btnText);
//			btn.addActionListener(this);
////			btn.setName(name);
//			panelMain.add(btn);
//		}
		
		
//		// button01-start
//		btnMain01 = new JButton("<html>뼈해장국<br>6,000<html>");
//		btnMain01.addActionListener(this);
//		panelMain.add(btnMain01);
//		btnMain01.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain01.setSelected(true);
//		btnMain01.setBackground(Color.LIGHT_GRAY);
//		btnMain01.setBorder(b);
//		btnMain01.setName("M01");
//		// button01-end
//		
//		
//		
//		btnMain02 = new JButton("<html>갈비탕<br>9,000<html>");
//		btnMain02.addActionListener(this);
//		panelMain.add(btnMain02);
//		btnMain02.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain02.setSelected(true);
//		btnMain02.setBackground(Color.LIGHT_GRAY);
//		btnMain02.setBorder(b);
//		btnMain02.setName("M02");
//
//		btnMain03 = new JButton("<html>육계장<br>7,000</html>");
//		btnMain03.addActionListener(this);
//		panelMain.add(btnMain03);
//		btnMain03.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain03.setSelected(true);
//		btnMain03.setBackground(Color.LIGHT_GRAY);
//		btnMain03.setBorder(b);
//		btnMain03.setName("M03");
//
//		btnMain04 = new JButton("<html>제육덮밥<br>6,000</html>");
//		btnMain04.addActionListener(this);
//		panelMain.add(btnMain04);
//		btnMain04.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain04.setSelected(true);
//		btnMain04.setBackground(Color.LIGHT_GRAY);
//		btnMain04.setBorder(b);
//		btnMain04.setName("M04");
//
//		btnMain05 = new JButton("<html><br></html>");
//		btnMain05.addActionListener(this);
//		panelMain.add(btnMain05);
//		btnMain05.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain05.setSelected(true);
//		btnMain05.setBackground(Color.LIGHT_GRAY);
//		btnMain05.setBorder(b);
//		btnMain05.setName("M05");
//
//		btnMain06 = new JButton("<html><br></html>");
//		btnMain06.addActionListener(this);
//		panelMain.add(btnMain06);
//		btnMain06.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain06.setSelected(true);
//		btnMain06.setBackground(Color.LIGHT_GRAY);
//		btnMain06.setBorder(b);
//		btnMain06.setName("M06");
//
//		btnMain07 = new JButton("<html><br></html>");
//		btnMain07.addActionListener(this);
//		panelMain.add(btnMain07);
//		btnMain07.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain07.setSelected(true);
//		btnMain07.setBackground(Color.LIGHT_GRAY);
//		btnMain07.setBorder(b);
//		btnMain07.setName("M07");
//
//		btnMain08 = new JButton("<html><br></html>");
//		btnMain08.addActionListener(this);
//		panelMain.add(btnMain08);
//		btnMain08.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain08.setSelected(true);
//		btnMain08.setBackground(Color.LIGHT_GRAY);
//		btnMain08.setBorder(b);
//		btnMain08.setName("M08");
//
//		btnMain09 = new JButton("<html><br></html>");
//		btnMain09.addActionListener(this);
//		panelMain.add(btnMain09);
//		btnMain09.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain09.setSelected(true);
//		btnMain09.setBackground(Color.LIGHT_GRAY);
//		btnMain09.setBorder(b);
//		btnMain09.setName("M09");
//
//		btnMain10 = new JButton("<html><br></html>");
//		btnMain10.addActionListener(this);
//		panelMain.add(btnMain10);
//		btnMain02.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain10.setSelected(true);
//		btnMain10.setBackground(Color.LIGHT_GRAY);
//		btnMain10.setBorder(b);
//		btnMain10.setName("M10");
//
//		btnMain11 = new JButton("<html><br></html>");
//		btnMain11.addActionListener(this);
//		panelMain.add(btnMain11);
//		btnMain11.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain11.setSelected(true);
//		btnMain11.setBackground(Color.LIGHT_GRAY);
//		btnMain11.setBorder(b);
//		btnMain11.setName("M11");
//
//		btnMain12 = new JButton("<html><br></html>");
//		btnMain12.addActionListener(this);
//		panelMain.add(btnMain12);
//		btnMain12.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain12.setSelected(true);
//		btnMain12.setBackground(Color.LIGHT_GRAY);
//		btnMain12.setBorder(b);
//		btnMain12.setName("M12");
//
//		btnMain13 = new JButton("<html><br></html>");
//		btnMain13.addActionListener(this);
//		panelMain.add(btnMain13);
//		btnMain13.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain13.setSelected(true);
//		btnMain13.setBackground(Color.LIGHT_GRAY);
//		btnMain13.setBorder(b);
//		btnMain13.setName("M13");
//
//		btnMain14 = new JButton("<html><br></html>");
//		btnMain14.addActionListener(this);
//		panelMain.add(btnMain14);
//		btnMain14.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain14.setSelected(true);
//		btnMain14.setBackground(Color.LIGHT_GRAY);
//		btnMain14.setBorder(b);
//		btnMain14.setName("M14");
//
//		btnMain15 = new JButton("<html><br></html>");
//		btnMain15.addActionListener(this);
//		panelMain.add(btnMain15);
//		btnMain15.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain15.setSelected(true);
//		btnMain15.setBackground(Color.LIGHT_GRAY);
//		btnMain15.setBorder(b);
//		btnMain15.setName("M15");
//
//		btnMain16 = new JButton("<html><br></html>");
//		btnMain16.addActionListener(this);
//		panelMain.add(btnMain16);
//		btnMain16.setFont(new Font("굴림", Font.BOLD, 16));
//		btnMain16.setSelected(true);
//		btnMain16.setBackground(Color.LIGHT_GRAY);
//		btnMain16.setBorder(b);
//		btnMain16.setName("M16");
//
//
//		btnSub01 = new JButton("<html>공깃밥<br>1,000</html>");
//		panelSub.add(btnSub01);
//		btnSub01.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub01.setSelected(true);
//		btnSub01.setBackground(Color.LIGHT_GRAY);
//		btnSub01.setBorder(b);
//		btnSub01.setName("S01");
//
//		btnSub02 = new JButton("<html>계란찜<br>3,000</html>");
//		panelSub.add(btnSub02);
//		btnSub02.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub02.setSelected(true);
//		btnSub02.setBackground(Color.LIGHT_GRAY);
//		btnSub02.setBorder(b);
//		btnSub02.setName("S02");
//
//		btnSub03 = new JButton("<html>꽁치구이<br>5,000</html>");
//		panelSub.add(btnSub03);
//		btnSub03.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub03.setSelected(true);
//		btnSub03.setBackground(Color.LIGHT_GRAY);
//		btnSub03.setBorder(b);
//		btnSub03.setName("S03");
//
//		btnSub04 = new JButton("<html>계란후라이<br>1,000</html>");
//		panelSub.add(btnSub04);
//		btnSub04.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub04.setSelected(true);
//		btnSub04.setBackground(Color.LIGHT_GRAY);
//		btnSub04.setBorder(b);
//		btnSub04.setName("S04");
//
//		btnSub05 = new JButton("<html><br></html>");
//		panelSub.add(btnSub05);
//		btnSub05.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub05.setSelected(true);
//		btnSub05.setBackground(Color.LIGHT_GRAY);
//		btnSub05.setBorder(b);
//		btnSub05.setName("S05");
//
//		btnSub06 = new JButton("<html><br></html>");
//		panelSub.add(btnSub06);
//		btnSub06.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub06.setSelected(true);
//		btnSub06.setBackground(Color.LIGHT_GRAY);
//		btnSub06.setBorder(b);
//		btnSub06.setName("S06");
//
//		btnSub07 = new JButton("<html><br></html>");
//		panelSub.add(btnSub07);
//		btnSub07.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub07.setSelected(true);
//		btnSub07.setBackground(Color.LIGHT_GRAY);
//		btnSub07.setBorder(b);
//		btnSub07.setName("S07");
//
//		btnSub08 = new JButton("<html><br></html>");
//		panelSub.add(btnSub08);
//		btnSub08.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub08.setSelected(true);
//		btnSub08.setBackground(Color.LIGHT_GRAY);
//		btnSub08.setBorder(b);
//		btnSub08.setName("S08");
//
//		btnSub09 = new JButton("<html><br></html>");
//		panelSub.add(btnSub09);
//		btnSub09.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub09.setSelected(true);
//		btnSub09.setBackground(Color.LIGHT_GRAY);
//		btnSub09.setBorder(b);
//		btnSub09.setName("S09");
//
//		btnSub10 = new JButton("<html><br></html>");
//		panelSub.add(btnSub10);
//		btnSub10.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub10.setSelected(true);
//		btnSub10.setBackground(Color.LIGHT_GRAY);
//		btnSub10.setBorder(b);
//		btnSub10.setName("S10");
//
//		btnSub11 = new JButton("<html><br></html>");
//		panelSub.add(btnSub11);
//		btnSub11.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub11.setSelected(true);
//		btnSub11.setBackground(Color.LIGHT_GRAY);
//		btnSub11.setBorder(b);
//		btnSub11.setName("S11");
//
//		btnSub12 = new JButton("<html><br></html>");
//		panelSub.add(btnSub12);
//		btnSub12.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub12.setSelected(true);
//		btnSub12.setBackground(Color.LIGHT_GRAY);
//		btnSub12.setBorder(b);
//		btnSub12.setName("S12");
//
//		btnSub13 = new JButton("<html><br></html>");
//		panelSub.add(btnSub13);
//		btnSub13.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub13.setSelected(true);
//		btnSub13.setBackground(Color.LIGHT_GRAY);
//		btnSub13.setBorder(b);
//		btnSub13.setName("S13");
//
//		btnSub14 = new JButton("<html><br></html>");
//		panelSub.add(btnSub14);
//		btnSub14.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub14.setSelected(true);
//		btnSub14.setBackground(Color.LIGHT_GRAY);
//		btnSub14.setBorder(b);
//		btnSub14.setName("S14");
//
//		btnSub15 = new JButton("<html><br></html>");
//		panelSub.add(btnSub15);
//		btnSub15.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub15.setSelected(true);
//		btnSub15.setBackground(Color.LIGHT_GRAY);
//		btnSub15.setBorder(b);
//		btnSub15.setName("S15");
//
//		btnSub16 = new JButton("<html><br></html>");
//		panelSub.add(btnSub16);
//		btnSub16.setFont(new Font("굴림", Font.BOLD, 16));
//		btnSub16.setSelected(true);
//		btnSub16.setBackground(Color.LIGHT_GRAY);
//		btnSub16.setBorder(b);
//		btnSub16.setName("S16");
//
//		btnBev01 = new JButton("<html>소주<br>3,000</html>");
//		panelBev.add(btnBev01);
//		btnBev01.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev01.setSelected(true);
//		btnBev01.setBackground(Color.LIGHT_GRAY);
//		btnBev01.setBorder(b);
//		btnBev01.setName("B01");
//
//		btnBev02 = new JButton("<html>맥주<br>3,000</html>");
//		panelBev.add(btnBev02);
//		btnBev02.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev02.setSelected(true);
//		btnBev02.setBackground(Color.LIGHT_GRAY);
//		btnBev02.setBorder(b);
//		btnBev02.setName("B02");
//
//		btnBev03 = new JButton("<html>콜라<br>1,000</html>");
//		panelBev.add(btnBev03);
//		btnBev03.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev03.setSelected(true);
//		btnBev03.setBackground(Color.LIGHT_GRAY);
//		btnBev03.setBorder(b);
//		btnBev03.setName("B03");
//
//		btnBev04 = new JButton("<html>사이다<br>1,000</html>");
//		panelBev.add(btnBev04);
//		btnBev04.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev04.setSelected(true);
//		btnBev04.setBackground(Color.LIGHT_GRAY);
//		btnBev04.setBorder(b);
//		btnBev04.setName("B04");
//
//		btnBev05 = new JButton("<html><br></html>");
//		panelBev.add(btnBev05);
//		btnBev05.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev05.setSelected(true);
//		btnBev05.setBackground(Color.LIGHT_GRAY);
//		btnBev05.setBorder(b);
//		btnBev05.setName("B05");
//
//		btnBev06 = new JButton("<html><br></html>");
//		panelBev.add(btnBev06);
//		btnBev06.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev06.setSelected(true);
//		btnBev06.setBackground(Color.LIGHT_GRAY);
//		btnBev06.setBorder(b);
//		btnBev06.setName("B06");
//
//		btnBev07 = new JButton("<html><br></html>");
//		panelBev.add(btnBev07);
//		btnBev07.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev07.setSelected(true);
//		btnBev07.setBackground(Color.LIGHT_GRAY);
//		btnBev07.setBorder(b);
//		btnBev07.setName("B07");
//
//		btnBev08 = new JButton("<html><br></html>");
//		panelBev.add(btnBev08);
//		btnBev08.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev08.setSelected(true);
//		btnBev08.setBackground(Color.LIGHT_GRAY);
//		btnBev08.setBorder(b);
//		btnBev08.setName("B08");
//
//		btnBev09 = new JButton("<html><br></html>");
//		panelBev.add(btnBev09);
//		btnBev09.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev09.setSelected(true);
//		btnBev09.setBackground(Color.LIGHT_GRAY);
//		btnBev09.setBorder(b);
//		btnBev09.setName("B09");
//
//		btnBev10 = new JButton("<html><br></html>");
//		panelBev.add(btnBev10);
//		btnBev10.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev10.setSelected(true);
//		btnBev10.setBackground(Color.LIGHT_GRAY);
//		btnBev10.setBorder(b);
//		btnBev10.setName("B10");
//
//		btnBev11 = new JButton("<html><br></html>");
//		panelBev.add(btnBev11);
//		btnBev11.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev11.setSelected(true);
//		btnBev11.setBackground(Color.LIGHT_GRAY);
//		btnBev11.setBorder(b);
//		btnBev11.setName("B11");
//
//		btnBev12 = new JButton("<html><br></html>");
//		panelBev.add(btnBev12);
//		btnBev12.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev12.setSelected(true);
//		btnBev12.setBackground(Color.LIGHT_GRAY);
//		btnBev12.setBorder(b);
//		btnBev12.setName("B12");
//
//		btnBev13 = new JButton("<html><br></html>");
//		panelBev.add(btnBev13);
//		btnBev13.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev13.setSelected(true);
//		btnBev13.setBackground(Color.LIGHT_GRAY);
//		btnBev13.setBorder(b);
//		btnBev13.setName("B13");
//
//		btnBev14 = new JButton("<html><br></html>");
//		panelBev.add(btnBev14);
//		btnBev14.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev14.setSelected(true);
//		btnBev14.setBackground(Color.LIGHT_GRAY);
//		btnBev14.setBorder(b);
//		btnBev14.setName("B14");
//
//		btnBev15 = new JButton("<html><br></html>");
//		panelBev.add(btnBev15);
//		btnBev15.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev15.setSelected(true);
//		btnBev15.setBackground(Color.LIGHT_GRAY);
//		btnBev15.setBorder(b);
//		btnBev15.setName("B15");
//
//		btnBev16 = new JButton("<html><br></html>");
//		panelBev.add(btnBev16);
//		btnBev16.setFont(new Font("굴림", Font.BOLD, 16));
//		btnBev16.setSelected(true);
//		btnBev16.setBackground(Color.LIGHT_GRAY);
//		btnBev16.setBorder(b);
//		btnBev16.setName("B16");

	}

	private void makeBtns(List<Menu> mList, JPanel menuPanel) {
		for(int i=0; i<mList.size(); i++) {
			Menu m = mList.get(i);
			String btnText = String.format("<html>%s<br>%d<html>", m.getName(), m.getPrice());
			JButton btn = new JButton(btnText);
			btn.addActionListener(this);
//			btn.setName(name);
			menuPanel.add(btn);
		}
		
		for(int i = 0; i < 16-mList.size(); i++) {
			menuPanel.add(new JButton());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}


}
