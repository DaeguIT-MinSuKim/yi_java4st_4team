package yi_java4st_4team.TableTotal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.MenuOrderService;
import yi_java4st_4team.menuTable.dao.Impl.service.TableInfoService;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class TableStructure extends JPanel {
	private TableInfo tInfo;
	private JLabel lblTableNo;
	private JLabel lblMenuPrice;
	private MenuOrderService service;
//	private TableInfoService tService;
	private List<MenuOrder> orderList;

	public TableStructure(TableInfo tInfo) {
		service = new MenuOrderService();
		this.tInfo = tInfo;
		orderList = service.selectOrderByTableNo(tInfo);
//		orderList = new ArrayList<MenuOrder>();
//		orderList.add(new MenuOrder(tInfo, new Menu("M01", "뼈해장국", 6000), new Date(), 3, 0));
//		orderList.add(new MenuOrder(tInfo, new Menu("M02", "갈비탕", 9000), new Date(), 1, 0));
//		orderList.add(new MenuOrder(tInfo, new Menu("M03", "제육볶음", 7000), new Date(), 2, 0));
//		orderList.add(new MenuOrder(tInfo, new Menu("M04", "김치", 8000), new Date(), 1, 0));
		//////////////////////////////////////////////////////
		initComponents();
	}

	private void initComponents() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTableNo = new JPanel();
		pTableNo.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(pTableNo, BorderLayout.WEST);
		pTableNo.setLayout(new BorderLayout(0, 0));
		
		lblTableNo = new JLabel(tInfo.getNo()+"번 테이블");
		lblTableNo.setHorizontalAlignment(SwingConstants.CENTER);
		pTableNo.add(lblTableNo, BorderLayout.CENTER);
		
		JPanel pTableInfo = new JPanel();
		pTableInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(pTableInfo, BorderLayout.CENTER);
		pTableInfo.setLayout(new BorderLayout(0, 0));
		
		JPanel pTableText = new JPanel();
		pTableText.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pTableInfo.add(pTableText, BorderLayout.CENTER);
		pTableText.setLayout(new BorderLayout(0, 0));
		
		JPanel pMenuText = new JPanel();
		pMenuText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pTableText.add(pMenuText, BorderLayout.CENTER);
		pMenuText.setLayout(new GridLayout(0, 1, 0, 0));
		
		menuDp(pMenuText);
		
		
		JPanel pMenuPrice = new JPanel();
		pTableText.add(pMenuPrice, BorderLayout.SOUTH);
		pMenuPrice.setLayout(new BorderLayout(0, 0));
		
		int sum = 0;
		for(int i = 0; i < orderList.size(); i++) {
			MenuOrder m = orderList.get(i);
			sum += m.getMenu().getPrice() * m.getCnt();
		}
		String priceText = sum + "";
		lblMenuPrice = new JLabel(priceText );
		lblMenuPrice.setHorizontalAlignment(SwingConstants.CENTER);
		pMenuPrice.add(lblMenuPrice);
		
//		lblMenu1 = new JLabel("메뉴명 + 수량");
//		lblMenu1.setHorizontalAlignment(SwingConstants.CENTER);
//		pMenuText.add(lblMenu1);
//		
//		lblMenu2 = new JLabel("New label");
//		lblMenu2.setHorizontalAlignment(SwingConstants.CENTER);
//		pMenuText.add(lblMenu2);
//		
//		lblMenu3 = new JLabel("New label");
//		lblMenu3.setHorizontalAlignment(SwingConstants.CENTER);
//		pMenuText.add(lblMenu3);
	
	}

	private void menuDp(JPanel pMenuText) {
		for(int i = 0; i < 3; i++) {
			try {
				MenuOrder m = orderList.get(i);
				String text = String.format("%s : %d개", m.getMenu().getName(), m.getCnt());
				JLabel lbl = new JLabel(text);
				lbl.setHorizontalAlignment(SwingConstants.CENTER);
				pMenuText.add(lbl);
			} catch(IndexOutOfBoundsException e) {
				
			}
		}
	}

	public TableInfo gettInfo() {
		return tInfo;
	}

	public void settInfo(TableInfo tInfo) {
		this.tInfo = tInfo;

	}

//	public void setTableNo(String string) {
//		lblTableNo.setText(string);
//	}
//
//	public int getTableNo() {
//		return tInfo.getNo();
//	}

}
