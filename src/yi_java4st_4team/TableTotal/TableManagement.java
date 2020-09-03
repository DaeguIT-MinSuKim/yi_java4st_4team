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
			TableStructure pTable = new TableStructure(t);
			add(pTable);
			pTable.addMouseListener(addMouseAction());
			
		}
		
	}

	private MouseAdapter addMouseAction() {
		return new MouseAdapter() {

			private FramePos framePos;

			@Override
			public void mouseClicked(MouseEvent e) {
				framePos = new FramePos();
				if (framePos == null) {
					framePos = new FramePos();
				}
				framePos.setVisible(true);
			}
			
			

		};
	}
	
}