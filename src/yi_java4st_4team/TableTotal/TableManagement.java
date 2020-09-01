package yi_java4st_4team.TableTotal;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import yi_java4st_4team.menuTable.dao.Impl.ui.content.FramePos;

public class TableManagement extends JPanel {
	private TableStructure pTable;
	private TableStructure pTable1;
	private TableStructure pTable2;
	private TableStructure pTable3;
	private TableStructure pTable4;
	private TableStructure pTable5;
	private TableStructure pTable6;
	private TableStructure pTable7;
	private TableStructure pTable8;
	private int res;
	
	private HashMap<Integer, FramePos> map = new HashMap<>();
	
	public TableManagement() {

		initComponents();
		
		for(int i=1; i<9; i++) {
			map.put(i, new FramePos());
		}
	}

	private void initComponents() {
		setBorder(new EmptyBorder(50, 30, 50, 30));
		setLayout(new GridLayout(0, 2, 30, 20));

		pTable1 = new TableStructure();
		add(pTable1);
		pTable1.setTableNo("No1");
		pTable1.addMouseListener(addMouseAction());

		pTable2 = new TableStructure();
		add(pTable2);
		pTable2.setTableNo("No2");
		pTable2.addMouseListener(addMouseAction());

		pTable3 = new TableStructure();
		add(pTable3);
		pTable3.setTableNo("No3");
		pTable3.addMouseListener(addMouseAction());

		pTable4 = new TableStructure();
		add(pTable4);
		pTable4.setTableNo("No4");
		pTable4.addMouseListener(addMouseAction());

		pTable5 = new TableStructure();
		add(pTable5);
		pTable5.setTableNo("No5");
		pTable5.addMouseListener(addMouseAction());

		pTable6 = new TableStructure();
		add(pTable6);
		pTable6.setTableNo("No6");
		pTable6.addMouseListener(addMouseAction());

		pTable7 = new TableStructure();
		add(pTable7);
		pTable7.setTableNo("No7");
		pTable7.addMouseListener(addMouseAction());

		pTable8 = new TableStructure();
		add(pTable8);
		pTable8.setTableNo("No8");
		pTable8.addMouseListener(addMouseAction());
		
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