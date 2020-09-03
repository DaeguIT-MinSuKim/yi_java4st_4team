package yi_java4st_4team.TableTotal;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import yi_java4st_4team.menuTable.dao.Impl.service.TableInfoService;
import yi_java4st_4team.menuTable.dao.Impl.ui.content.FramePos;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class TableManagement extends JPanel {
	private int res;
	private TableInfoService service;
	
	private HashMap<Integer, FramePos> map = new HashMap<>();
	private List<TableInfo> list;
	
	public TableManagement() {
		service = new TableInfoService();
		list = service.selectTableInfoAll();
		initComponents();
	}

	private void initComponents() {
		setBorder(new EmptyBorder(50, 30, 50, 30));
		setLayout(new GridLayout(0, 2, 30, 20));

		
		for(int i = 0; i < list.size(); i++) {
			TableInfo t = list.get(i);
			TableStructure ts = new TableStructure(t);
			add(ts);
		}
//		pTable1 = new TableStructure();
//		add(pTable1);
//		pTable1.setTableNo("No1");
//		pTable1.addMouseListener(addMouseAction());
//
//		pTable2 = new TableStructure();
//		add(pTable2);
//		pTable2.setTableNo("No2");
//		pTable2.addMouseListener(addMouseAction());
//
//		pTable3 = new TableStructure();
//		add(pTable3);
//		pTable3.setTableNo("No3");
//		pTable3.addMouseListener(addMouseAction());
//
//		pTable4 = new TableStructure();
//		add(pTable4);
//		pTable4.setTableNo("No4");
//		pTable4.addMouseListener(addMouseAction());
//
//		pTable5 = new TableStructure();
//		add(pTable5);
//		pTable5.setTableNo("No5");
//		pTable5.addMouseListener(addMouseAction());
//
//		pTable6 = new TableStructure();
//		add(pTable6);
//		pTable6.setTableNo("No6");
//		pTable6.addMouseListener(addMouseAction());
//
//		pTable7 = new TableStructure();
//		add(pTable7);
//		pTable7.setTableNo("No7");
//		pTable7.addMouseListener(addMouseAction());
//
//		pTable8 = new TableStructure();
//		add(pTable8);
//		pTable8.setTableNo("No8");
//		pTable8.addMouseListener(addMouseAction());
		
	}

	private MouseAdapter addMouseAction() {
		return new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				res = (((TableStructure)e.getComponent()).getTableNo());
				System.out.println(res);
				FramePos framePos = map.get(res);
//				if (framePos == null) {
//					framePos = new FramePos();
//				}
				framePos.setVisible(true);
			}
			
			

		};
	}
	
}