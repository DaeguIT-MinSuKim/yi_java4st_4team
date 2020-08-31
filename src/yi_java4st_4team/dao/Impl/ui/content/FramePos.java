package yi_java4st_4team.dao.Impl.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.menuTable.dao.Impl.ui.content.SelectedMenuOrderTable;
import yi_java4st_4team.menuTable.dto.MenuOrder;

@SuppressWarnings("serial")
public class FramePos extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JPanel panelMenu;
	private JPanel panel;
	private JPanel panelList;
	private JTabbedPane tabbedPane;
	private JScrollPane scrollPane;
	private ArrayList<MenuOrder> moList = new ArrayList<MenuOrder>();
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
	private JButton btnMain01;
	private JButton btnMain02;
	private JButton btnMain03;
	private JButton btnMain04;
	private JButton btnMain05;
	private JButton btnMain06;
	private JButton btnMain07;
	private JButton btnMain08;
	private JButton btnMain09;
	private JButton btnMain10;
	private JButton btnMain11;
	private JButton btnMain12;
	private JButton btnMain13;
	private JButton btnMain14;
	private JButton btnMain15;
	private JButton btnMain16;
	private JButton btnSub01;
	private JButton btnSub02;
	private JButton btnSub03;
	private JButton btnSub04;
	private JButton btnSub05;
	private JButton btnSub06;
	private JButton btnSub07;
	private JButton btnSub08;
	private JButton btnSub09;
	private JButton btnSub10;
	private JButton btnSub11;
	private JButton btnSub12;
	private JButton btnSub13;
	private JButton btnSub14;
	private JButton btnSub15;
	private JButton btnSub16;
	private JButton btnBev01;
	private JButton btnBev02;
	private JButton btnBev03;
	private JButton btnBev04;
	private JButton btnBev05;
	private JButton btnBev06;
	private JButton btnBev07;
	private JButton btnBev08;
	private JButton btnBev09;
	private JButton btnBev10;
	private JButton btnBev11;
	private JButton btnBev12;
	private JButton btnBev13;
	private JButton btnBev14;
	private JButton btnBev15;
	private JButton btnBev16;
	private SelectedMenuOrderTable table;

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

		table = new SelectedMenuOrderTable(); // 테이블 세팅
		table.setItems(moList); // DB에 있는 값 불러오기
		scrollPane.setViewportView(table);

		panelBtns = new JPanel();
		panel.add(panelBtns);
		panelBtns.setLayout(new BoxLayout(panelBtns, BoxLayout.Y_AXIS));

		panelCal = new JPanel();
		panelBtns.add(panelCal);
		panelCal.setLayout(new GridLayout(0, 4, 0, 0));

		btnTotalCancel = new JButton("전체취소");
		btnTotalCancel.addActionListener(this);
		panelCal.add(btnTotalCancel);

		btnSelectedCancel = new JButton("선택취소");
		btnSelectedCancel.addActionListener(this);
		panelCal.add(btnSelectedCancel);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(this);
		panelCal.add(btnPlus);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(this);
		panelCal.add(btnMinus);

		panelCompl = new JPanel();
		panelBtns.add(panelCompl);
		panelCompl.setLayout(new GridLayout(1, 0, 0, 0));

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

		// button01-start
		btnMain01 = new JButton("<html>뼈해장국<br>6,000<html>");
		panelMain.add(btnMain01);
		btnMain01.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain01.setSelected(true);
		btnMain01.addMouseListener(this);
		btnMain01.setBackground(Color.LIGHT_GRAY);
		btnMain01.setBorder(b);
		btnMain01.setName("M01");
		// button01-end

		btnMain02 = new JButton("<html>갈비탕<br>9,000<html>");
		panelMain.add(btnMain02);
		btnMain02.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain02.setSelected(true);
		btnMain02.addMouseListener(this);
		btnMain02.setBackground(Color.LIGHT_GRAY);
		btnMain02.setBorder(b);
		btnMain02.setName("M02");

		btnMain03 = new JButton("<html>육계장<br>7,000</html>");
		panelMain.add(btnMain03);
		btnMain03.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain03.setSelected(true);
		btnMain03.addMouseListener(this);
		btnMain03.setBackground(Color.LIGHT_GRAY);
		btnMain03.setBorder(b);
		btnMain03.setName("M03");

		btnMain04 = new JButton("<html>제육덮밥<br>6,000</html>");
		panelMain.add(btnMain04);
		btnMain04.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain04.setSelected(true);
		btnMain04.addMouseListener(this);
		btnMain04.setBackground(Color.LIGHT_GRAY);
		btnMain04.setBorder(b);
		btnMain04.setName("M04");

		btnMain05 = new JButton("<html><br></html>");
		panelMain.add(btnMain05);
		btnMain05.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain05.setSelected(true);
		btnMain05.addMouseListener(this);
		btnMain05.setBackground(Color.LIGHT_GRAY);
		btnMain05.setBorder(b);
		btnMain05.setName("M05");

		btnMain06 = new JButton("<html><br></html>");
		panelMain.add(btnMain06);
		btnMain06.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain06.setSelected(true);
		btnMain06.addMouseListener(this);
		btnMain06.setBackground(Color.LIGHT_GRAY);
		btnMain06.setBorder(b);
		btnMain06.setName("M06");

		btnMain07 = new JButton("<html><br></html>");
		panelMain.add(btnMain07);
		btnMain07.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain07.setSelected(true);
		btnMain07.addMouseListener(this);
		btnMain07.setBackground(Color.LIGHT_GRAY);
		btnMain07.setBorder(b);
		btnMain07.setName("M07");

		btnMain08 = new JButton("<html><br></html>");
		panelMain.add(btnMain08);
		btnMain08.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain08.setSelected(true);
		btnMain08.addMouseListener(this);
		btnMain08.setBackground(Color.LIGHT_GRAY);
		btnMain08.setBorder(b);
		btnMain08.setName("M08");

		btnMain09 = new JButton("<html><br></html>");
		panelMain.add(btnMain09);
		btnMain09.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain09.setSelected(true);
		btnMain09.addMouseListener(this);
		btnMain09.setBackground(Color.LIGHT_GRAY);
		btnMain09.setBorder(b);
		btnMain09.setName("M09");

		btnMain10 = new JButton("<html><br></html>");
		panelMain.add(btnMain10);
		btnMain02.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain10.setSelected(true);
		btnMain10.addMouseListener(this);
		btnMain10.setBackground(Color.LIGHT_GRAY);
		btnMain10.setBorder(b);
		btnMain10.setName("M10");

		btnMain11 = new JButton("<html><br></html>");
		panelMain.add(btnMain11);
		btnMain11.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain11.setSelected(true);
		btnMain11.addMouseListener(this);
		btnMain11.setBackground(Color.LIGHT_GRAY);
		btnMain11.setBorder(b);
		btnMain11.setName("M11");

		btnMain12 = new JButton("<html><br></html>");
		panelMain.add(btnMain12);
		btnMain12.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain12.setSelected(true);
		btnMain12.addMouseListener(this);
		btnMain12.setBackground(Color.LIGHT_GRAY);
		btnMain12.setBorder(b);
		btnMain12.setName("M12");

		btnMain13 = new JButton("<html><br></html>");
		panelMain.add(btnMain13);
		btnMain13.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain13.setSelected(true);
		btnMain13.addMouseListener(this);
		btnMain13.setBackground(Color.LIGHT_GRAY);
		btnMain13.setBorder(b);
		btnMain13.setName("M13");

		btnMain14 = new JButton("<html><br></html>");
		panelMain.add(btnMain14);
		btnMain14.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain14.setSelected(true);
		btnMain14.addMouseListener(this);
		btnMain14.setBackground(Color.LIGHT_GRAY);
		btnMain14.setBorder(b);
		btnMain14.setName("M14");

		btnMain15 = new JButton("<html><br></html>");
		panelMain.add(btnMain15);
		btnMain15.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain15.setSelected(true);
		btnMain15.addMouseListener(this);
		btnMain15.setBackground(Color.LIGHT_GRAY);
		btnMain15.setBorder(b);
		btnMain15.setName("M15");

		btnMain16 = new JButton("<html><br></html>");
		panelMain.add(btnMain16);
		btnMain16.setFont(new Font("굴림", Font.BOLD, 16));
		btnMain16.setSelected(true);
		btnMain16.addMouseListener(this);
		btnMain16.setBackground(Color.LIGHT_GRAY);
		btnMain16.setBorder(b);
		btnMain16.setName("M16");

		// 서브메뉴
		panelSub = new JPanel();
		tabbedPane.addTab("부메뉴", null, panelSub, null);
		panelSub.setLayout(new GridLayout(0, 4, 0, 0));

		btnSub01 = new JButton("<html>공깃밥<br>1,000</html>");
		panelSub.add(btnSub01);
		btnSub01.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub01.setSelected(true);
		btnSub01.addMouseListener(this);
		btnSub01.setBackground(Color.LIGHT_GRAY);
		btnSub01.setBorder(b);
		btnSub01.setName("S01");

		btnSub02 = new JButton("<html>계란찜<br>3,000</html>");
		panelSub.add(btnSub02);
		btnSub02.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub02.setSelected(true);
		btnSub02.addMouseListener(this);
		btnSub02.setBackground(Color.LIGHT_GRAY);
		btnSub02.setBorder(b);
		btnSub02.setName("S02");

		btnSub03 = new JButton("<html>꽁치구이<br>5,000</html>");
		panelSub.add(btnSub03);
		btnSub03.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub03.setSelected(true);
		btnSub03.addMouseListener(this);
		btnSub03.setBackground(Color.LIGHT_GRAY);
		btnSub03.setBorder(b);
		btnSub03.setName("S03");

		btnSub04 = new JButton("<html>계란후라이<br>1,000</html>");
		panelSub.add(btnSub04);
		btnSub04.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub04.setSelected(true);
		btnSub04.addMouseListener(this);
		btnSub04.setBackground(Color.LIGHT_GRAY);
		btnSub04.setBorder(b);
		btnSub04.setName("S04");

		btnSub05 = new JButton("<html><br></html>");
		panelSub.add(btnSub05);
		btnSub05.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub05.setSelected(true);
		btnSub05.addMouseListener(this);
		btnSub05.setBackground(Color.LIGHT_GRAY);
		btnSub05.setBorder(b);
		btnSub05.setName("S05");

		btnSub06 = new JButton("<html><br></html>");
		panelSub.add(btnSub06);
		btnSub06.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub06.setSelected(true);
		btnSub06.addMouseListener(this);
		btnSub06.setBackground(Color.LIGHT_GRAY);
		btnSub06.setBorder(b);
		btnSub06.setName("S06");

		btnSub07 = new JButton("<html><br></html>");
		panelSub.add(btnSub07);
		btnSub07.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub07.setSelected(true);
		btnSub07.addMouseListener(this);
		btnSub07.setBackground(Color.LIGHT_GRAY);
		btnSub07.setBorder(b);
		btnSub07.setName("S07");

		btnSub08 = new JButton("<html><br></html>");
		panelSub.add(btnSub08);
		btnSub08.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub08.setSelected(true);
		btnSub08.addMouseListener(this);
		btnSub08.setBackground(Color.LIGHT_GRAY);
		btnSub08.setBorder(b);
		btnSub08.setName("S08");

		btnSub09 = new JButton("<html><br></html>");
		panelSub.add(btnSub09);
		btnSub09.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub09.setSelected(true);
		btnSub09.addMouseListener(this);
		btnSub09.setBackground(Color.LIGHT_GRAY);
		btnSub09.setBorder(b);
		btnSub09.setName("S09");

		btnSub10 = new JButton("<html><br></html>");
		panelSub.add(btnSub10);
		btnSub10.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub10.setSelected(true);
		btnSub10.addMouseListener(this);
		btnSub10.setBackground(Color.LIGHT_GRAY);
		btnSub10.setBorder(b);
		btnSub10.setName("S10");

		btnSub11 = new JButton("<html><br></html>");
		panelSub.add(btnSub11);
		btnSub11.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub11.setSelected(true);
		btnSub11.addMouseListener(this);
		btnSub11.setBackground(Color.LIGHT_GRAY);
		btnSub11.setBorder(b);
		btnSub11.setName("S11");

		btnSub12 = new JButton("<html><br></html>");
		panelSub.add(btnSub12);
		btnSub12.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub12.setSelected(true);
		btnSub12.addMouseListener(this);
		btnSub12.setBackground(Color.LIGHT_GRAY);
		btnSub12.setBorder(b);
		btnSub12.setName("S12");

		btnSub13 = new JButton("<html><br></html>");
		panelSub.add(btnSub13);
		btnSub13.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub13.setSelected(true);
		btnSub13.addMouseListener(this);
		btnSub13.setBackground(Color.LIGHT_GRAY);
		btnSub13.setBorder(b);
		btnSub13.setName("S13");

		btnSub14 = new JButton("<html><br></html>");
		panelSub.add(btnSub14);
		btnSub14.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub14.setSelected(true);
		btnSub14.addMouseListener(this);
		btnSub14.setBackground(Color.LIGHT_GRAY);
		btnSub14.setBorder(b);
		btnSub14.setName("S14");

		btnSub15 = new JButton("<html><br></html>");
		panelSub.add(btnSub15);
		btnSub15.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub15.setSelected(true);
		btnSub15.addMouseListener(this);
		btnSub15.setBackground(Color.LIGHT_GRAY);
		btnSub15.setBorder(b);
		btnSub15.setName("S15");

		btnSub16 = new JButton("<html><br></html>");
		panelSub.add(btnSub16);
		btnSub16.setFont(new Font("굴림", Font.BOLD, 16));
		btnSub16.setSelected(true);
		btnSub16.addMouseListener(this);
		btnSub16.setBackground(Color.LIGHT_GRAY);
		btnSub16.setBorder(b);
		btnSub16.setName("S16");

		// 음료
		panelBev = new JPanel();
		tabbedPane.addTab("음료", null, panelBev, null);
		panelBev.setLayout(new GridLayout(0, 4, 0, 0));

		btnBev01 = new JButton("<html>소주<br>3,000</html>");
		panelBev.add(btnBev01);
		btnBev01.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev01.setSelected(true);
		btnBev01.addMouseListener(this);
		btnBev01.setBackground(Color.LIGHT_GRAY);
		btnBev01.setBorder(b);
		btnBev01.setName("B01");

		btnBev02 = new JButton("<html>맥주<br>3,000</html>");
		panelBev.add(btnBev02);
		btnBev02.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev02.setSelected(true);
		btnBev02.addMouseListener(this);
		btnBev02.setBackground(Color.LIGHT_GRAY);
		btnBev02.setBorder(b);
		btnBev02.setName("B02");

		btnBev03 = new JButton("<html>콜라<br>1,000</html>");
		panelBev.add(btnBev03);
		btnBev03.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev03.setSelected(true);
		btnBev03.addMouseListener(this);
		btnBev03.setBackground(Color.LIGHT_GRAY);
		btnBev03.setBorder(b);
		btnBev03.setName("B03");

		btnBev04 = new JButton("<html>사이다<br>1,000</html>");
		panelBev.add(btnBev04);
		btnBev04.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev04.setSelected(true);
		btnBev04.addMouseListener(this);
		btnBev04.setBackground(Color.LIGHT_GRAY);
		btnBev04.setBorder(b);
		btnBev04.setName("B04");

		btnBev05 = new JButton("<html><br></html>");
		panelBev.add(btnBev05);
		btnBev05.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev05.setSelected(true);
		btnBev05.addMouseListener(this);
		btnBev05.setBackground(Color.LIGHT_GRAY);
		btnBev05.setBorder(b);
		btnBev05.setName("B05");

		btnBev06 = new JButton("<html><br></html>");
		panelBev.add(btnBev06);
		btnBev06.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev06.setSelected(true);
		btnBev06.addMouseListener(this);
		btnBev06.setBackground(Color.LIGHT_GRAY);
		btnBev06.setBorder(b);
		btnBev06.setName("B06");

		btnBev07 = new JButton("<html><br></html>");
		panelBev.add(btnBev07);
		btnBev07.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev07.setSelected(true);
		btnBev07.addMouseListener(this);
		btnBev07.setBackground(Color.LIGHT_GRAY);
		btnBev07.setBorder(b);
		btnBev07.setName("B07");

		btnBev08 = new JButton("<html><br></html>");
		panelBev.add(btnBev08);
		btnBev08.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev08.setSelected(true);
		btnBev08.addMouseListener(this);
		btnBev08.setBackground(Color.LIGHT_GRAY);
		btnBev08.setBorder(b);
		btnBev08.setName("B08");

		btnBev09 = new JButton("<html><br></html>");
		panelBev.add(btnBev09);
		btnBev09.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev09.setSelected(true);
		btnBev09.addMouseListener(this);
		btnBev09.setBackground(Color.LIGHT_GRAY);
		btnBev09.setBorder(b);
		btnBev09.setName("B09");

		btnBev10 = new JButton("<html><br></html>");
		panelBev.add(btnBev10);
		btnBev10.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev10.setSelected(true);
		btnBev10.addMouseListener(this);
		btnBev10.setBackground(Color.LIGHT_GRAY);
		btnBev10.setBorder(b);
		btnBev10.setName("B10");

		btnBev11 = new JButton("<html><br></html>");
		panelBev.add(btnBev11);
		btnBev11.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev11.setSelected(true);
		btnBev11.addMouseListener(this);
		btnBev11.setBackground(Color.LIGHT_GRAY);
		btnBev11.setBorder(b);
		btnBev11.setName("B11");

		btnBev12 = new JButton("<html><br></html>");
		panelBev.add(btnBev12);
		btnBev12.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev12.setSelected(true);
		btnBev12.addMouseListener(this);
		btnBev12.setBackground(Color.LIGHT_GRAY);
		btnBev12.setBorder(b);
		btnBev12.setName("B12");

		btnBev13 = new JButton("<html><br></html>");
		panelBev.add(btnBev13);
		btnBev13.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev13.setSelected(true);
		btnBev13.addMouseListener(this);
		btnBev13.setBackground(Color.LIGHT_GRAY);
		btnBev13.setBorder(b);
		btnBev13.setName("B13");

		btnBev14 = new JButton("<html><br></html>");
		panelBev.add(btnBev14);
		btnBev14.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev14.setSelected(true);
		btnBev14.addMouseListener(this);
		btnBev14.setBackground(Color.LIGHT_GRAY);
		btnBev14.setBorder(b);
		btnBev14.setName("B14");

		btnBev15 = new JButton("<html><br></html>");
		panelBev.add(btnBev15);
		btnBev15.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev15.setSelected(true);
		btnBev15.addMouseListener(this);
		btnBev15.setBackground(Color.LIGHT_GRAY);
		btnBev15.setBorder(b);
		btnBev15.setName("B15");

		btnBev16 = new JButton("<html><br></html>");
		panelBev.add(btnBev16);
		btnBev16.setFont(new Font("굴림", Font.BOLD, 16));
		btnBev16.setSelected(true);
		btnBev16.addMouseListener(this);
		btnBev16.setBackground(Color.LIGHT_GRAY);
		btnBev16.setBorder(b);
		btnBev16.setName("B16");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSelectedCancel) {
			actionPerformedBtnSelectedCancel(e);
		}
		if (e.getSource() == btnTotalCancel) {
			actionPerformedBtnTotalCancel(e);
		}
		if (e.getSource() == btnMinus) {
			actionPerformedBtnMinus(e);
		}
		if (e.getSource() == btnPlus) {
			actionPerformedBtnPlus(e);
		}
	}

	protected void actionPerformedBtnPlus(ActionEvent e) {
		/*
		 * int selIdx = tableMainFood.getSelectedRow(); System.out.println(selIdx);
		 * if(selIdx == -1) { JOptionPane.showMessageDialog(null, "해당 항목을 선택해주세요");
		 * return; }
		 * 
		 * Menu addMainFood = mofList.get(selIdx); moService.addMenu(addMainFood);
		 * 
		 * // Assert.assertNotNull(mfList); //담긴 배열 확인 //
		 * mfList.stream().forEach(System.out::println); //하나씩 출력
		 * 
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 * 
		 * 
		 * JOptionPane.showMessageDialog(null, "추가완료");
		 */
	}

	protected void actionPerformedBtnMinus(ActionEvent e) {
		/*
		 * int selIdx = tableMainFood.getSelectedRow(); System.out.println(selIdx);
		 * if(selIdx == -1) { JOptionPane.showMessageDialog(null, "해당 항목을 선택해주세요");
		 * return; } Menu deleteMainFood = mofList.get(selIdx);
		 * moService.removeMainFood(deleteMainFood);
		 * 
		 * // Assert.assertNotNull(mfList); //담긴 배열 확인 //
		 * mfList.stream().forEach(System.out::println); //하나씩 출력
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 * 
		 * 
		 * JOptionPane.showMessageDialog(null, "삭제완료");
		 */

	}

	protected void actionPerformedBtnTotalCancel(ActionEvent e) {
		/*
		 * moService.editMainFood(new Menu()); mofList = (ArrayList<Menu>)
		 * moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 * 
		 * JOptionPane.showMessageDialog(null, "전체취소 완료");
		 */

	}

	protected void actionPerformedBtnSelectedCancel(ActionEvent e) {
		/*
		 * int selIdx = tableMainFood.getSelectedRow(); System.out.println(selIdx);
		 * if(selIdx == -1) { JOptionPane.showMessageDialog(null, "해당 항목을 선택해주세요");
		 * return; } Menu selecteDeleteMainFood = mofList.get(selIdx);
		 * moService.removeMainFood(selecteDeleteMainFood); mofList = (ArrayList<Menu>)
		 * moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 * JOptionPane.showMessageDialog(null, "선택취소 완료");
		 */
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == btnMain04) {
			mousePressedMbtn04(e);
		}
		if (e.getSource() == btnMain03) {
			mousePressedMbtn03(e);
		}
		if (e.getSource() == btnMain02) {
			mousePressedMbtn02(e);
		}
		if (e.getSource() == btnMain01) {
			mousePressedMbtn01(e);
		}
		if (e.getSource() == btnSub01) {
			mousePressedbtnSub01(e);
		}
		if (e.getSource() == btnSub02) {
			mousePressedbtnSub02(e);
		}
		if (e.getSource() == btnSub03) {
			mousePressedbtnSub03(e);
		}
		if (e.getSource() == btnSub04) {
			mousePressedbtnSub04(e);
		}
		if (e.getSource() == btnBev01) {
			mousePressedbtnBev01(e);
		}
		if (e.getSource() == btnBev02) {
			mousePressedbtnBev02(e);
		}
		if (e.getSource() == btnBev03) {
			mousePressedbtnBev03(e);
		}
		if (e.getSource() == btnBev04) {
			mousePressedbtnBev04(e);
		}
	}

	public void mouseReleased(MouseEvent e) {
	}

	// 메인메뉴에 대한 버튼기능
	protected void mousePressedMbtn01(MouseEvent e) {
		System.out.println("뼈해장국"); // 콘솔창에서 확인
		moService = new MenuOrderService(); // 기능쓰겟다고 선언
		moService.addMenuOrder(new MenuOrder(btnMain01.getName()));
		
		
		
		JOptionPane.showMessageDialog(null, "뼈해장국 추가완료");

		moList = (ArrayList<MenuOrder>) moService.getMenuOrderList();

	}

	protected void mousePressedMbtn02(MouseEvent e) {
		/*
		 * System.out.println("갈비탕"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnMain02.getName()));
		 * JOptionPane.showMessageDialog(null, "갈비탕 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	protected void mousePressedMbtn03(MouseEvent e) {
		/*
		 * System.out.println("육개장"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnMain03.getName()));
		 * JOptionPane.showMessageDialog(null, "육개장 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	protected void mousePressedMbtn04(MouseEvent e) {
		/*
		 * System.out.println("제육덮밥"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnMain04.getName()));
		 * JOptionPane.showMessageDialog(null, "제육덮밥 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */ }

	private void mousePressedbtnSub01(MouseEvent e) {
		/*
		 * System.out.println("공깃밥"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnSub01.getName()));
		 * JOptionPane.showMessageDialog(null, "공깃밥 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	private void mousePressedbtnSub02(MouseEvent e) {
		/*
		 * System.out.println("계란찜"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnSub02.getName()));
		 * JOptionPane.showMessageDialog(null, "계란찜 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	private void mousePressedbtnSub03(MouseEvent e) {
		/*
		 * System.out.println("꽁치구이"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnSub03.getName()));
		 * JOptionPane.showMessageDialog(null, "꽁치구이 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	private void mousePressedbtnSub04(MouseEvent e) {
		/*
		 * System.out.println("계란후라이"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnSub04.getName()));
		 * JOptionPane.showMessageDialog(null, "계란후라이 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	private void mousePressedbtnBev01(MouseEvent e) {
		/*
		 * System.out.println("소주"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnBev01.getName()));
		 * JOptionPane.showMessageDialog(null, "소주 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */

	}

	private void mousePressedbtnBev02(MouseEvent e) {
		/*
		 * System.out.println("맥주"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnBev02.getName()));
		 * JOptionPane.showMessageDialog(null, "맥주 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList);
		 */
		// DB 테이블에 저장

	}

	private void mousePressedbtnBev03(MouseEvent e) {
		/*
		 * System.out.println("콜라"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnBev03.getName()));
		 * JOptionPane.showMessageDialog(null, "콜라주 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

	private void mousePressedbtnBev04(MouseEvent e) {
		/*
		 * System.out.println("사이다"); moService = new MenuService();
		 * moService.addMenu(new Menu(btnBev04.getName()));
		 * JOptionPane.showMessageDialog(null, "사이다 추가완료");
		 * 
		 * mofList = (ArrayList<Menu>) moService.getMainFoodList(); //DB 테이블 목록 배열로 선언
		 * tableMainFood.setItems(mofList); //DB 테이블에 저장
		 */
	}

}
