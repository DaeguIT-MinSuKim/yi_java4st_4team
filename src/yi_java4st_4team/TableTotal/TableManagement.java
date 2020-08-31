package yi_java4st_4team.TableTotal;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import yi_java4st_4team.menuTable.dao.Impl.ui.content.FramePos;

public class TableManagement extends JPanel {

	private FramePos framePos;

	public TableManagement() {

		initComponents();
	}

	private void initComponents() {
		setBorder(new EmptyBorder(50, 30, 50, 30));
		setLayout(new GridLayout(0, 2, 30, 20));

		TableStructure pTable1 = new TableStructure();
		add(pTable1);
		pTable1.setTableNo("No1");
		pTable1.addMouseListener(addMouseAction());

		TableStructure pTable2 = new TableStructure();
		add(pTable2);
		pTable2.setTableNo("No2");
		pTable2.addMouseListener(addMouseAction());

		TableStructure pTable3 = new TableStructure();
		add(pTable3);
		pTable3.setTableNo("No3");
		pTable3.addMouseListener(addMouseAction());

		TableStructure pTable4 = new TableStructure();
		add(pTable4);
		pTable4.setTableNo("No4");
		pTable4.addMouseListener(addMouseAction());

		TableStructure pTable5 = new TableStructure();
		add(pTable5);
		pTable5.setTableNo("No5");
		pTable5.addMouseListener(addMouseAction());

		TableStructure pTable6 = new TableStructure();
		add(pTable6);
		pTable6.setTableNo("No6");
		pTable6.addMouseListener(addMouseAction());

		TableStructure pTable7 = new TableStructure();
		add(pTable7);
		pTable7.setTableNo("No7");
		pTable7.addMouseListener(addMouseAction());

		TableStructure pTable8 = new TableStructure();
		add(pTable8);
		pTable8.setTableNo("No8");
		pTable8.addMouseListener(addMouseAction());
	}

	private MouseAdapter addMouseAction() {
		return new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (framePos == null) {
					framePos = new FramePos();
				}
				framePos.setVisible(true);
			}

		};
	}

}