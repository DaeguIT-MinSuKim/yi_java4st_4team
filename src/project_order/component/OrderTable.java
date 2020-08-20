package project_order.component;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class OrderTable extends JTable {
	public OrderTable() {
		initComponents();
	}
	private void initComponents() {
		setModel(new DefaultTableModel(
			new Object[][] {
				{"갈비탕", 9000, 1, 9000},
				{"육개장", 7000, 1, 7000},
				{"콜라", 4000, 2, 8000},
				{"갈비탕", 9000, 1, 9000},
				{"육개장", 7000, 1, 7000},
				{"콜라", 4000, 2, 8000},
				{"갈비탕", 9000, 1, 9000},
				{"육개장", 7000, 1, 7000},
				{"콜라", 4000, 2, 8000}
			},
			new String[] {
				"메뉴명", "단가", "수량", "금액"
			}
		));
		setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
	}
	
	private class CustomModel extends DefaultTableModel{

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
	}

}
