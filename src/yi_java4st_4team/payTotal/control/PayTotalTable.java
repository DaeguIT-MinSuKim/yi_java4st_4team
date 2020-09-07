package yi_java4st_4team.payTotal.control;

import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import yi_java4st_4team.payTotal.dto.Foods;

public class PayTotalTable extends JTable {
	private ArrayList<Foods> items;
	private CustomModel model;
	
	public PayTotalTable() {
		initComponents();
	}
	
	public PayTotalTable(ArrayList<Foods> items) {
		setItems(items);
		initComponents();
	}
	
	public void setItems(ArrayList<Foods> items) {
		this.items = items;
		loadData();
	}
	
	private void initComponents() {
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
	}
	
	private void loadData() {
		model = new CustomModel(getRows(),getColNames());
		setModel(model);
		tableSetWidth(250, 400, 250, 400, 250);
		tableCellAlign(SwingConstants.CENTER, 0, 1);
		tableCellAlign(SwingConstants.CENTER, 2, 3, 4);
	}
	
	private void tableCellAlign(int align, int...idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		TableColumnModel cModel = getColumnModel();
		for ( int i = 0; i < idx.length; i++ ) {
			cModel.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	private void tableSetWidth(int...width) {
		TableColumnModel cModel = getColumnModel();
		for ( int i = 0; i < width.length; i++ ) {
			cModel.getColumn(i).setPreferredWidth(width[i]);
		}
	}

	private Object[] getColNames() {
		return new String[] { "순위", "품목명", "수량", "총매출", "점유율" };
	}

	//ArrayList<Foods> 의 내용을 보여주도록 변경
	private Object[][] getRows() {
		Object[][] rows = new Object[items.size()][];
		for ( int i = 0; i < rows.length; i++ ) {
			rows[i] = toArray(items.get(i));
		}
		return rows;
	}
	
	private Object[] toArray(Foods fds) {
		return new Object[] { fds.getNo(), fds.getName(),
				fds.getCount(), fds.getSell(), fds.getPercent() };
	}

	private class CustomModel extends DefaultTableModel {

		public CustomModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
	}
}
