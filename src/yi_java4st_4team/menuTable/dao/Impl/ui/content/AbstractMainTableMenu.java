package yi_java4st_4team.menuTable.dao.Impl.ui.content;

import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

@SuppressWarnings("serial")
public abstract class AbstractMainTableMenu<T> extends JTable {
	private CustomModel model;
	private ArrayList<T> itemList;

	public AbstractMainTableMenu() {
		initComponents();
	}

	private void initComponents() {
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	void loadData(ArrayList<T> itemList) {
		model = new CustomModel(getRows(itemList), getColName());
		setModel(model);

		// 컬럼의 폭(width)설정
		TableColumnModel tcm = getColumnModel();
		tcm.getColumn(0).setPreferredWidth(200);
		tcm.getColumn(1).setPreferredWidth(300);

		// 컬럼의 내용 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		tcm.getColumn(0).setCellRenderer(dtcr);
		tcm.getColumn(1).setCellRenderer(dtcr);

		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		setRowSorter(sorter);

	}

	abstract Object[] getColName();

	Object[][] getRows(ArrayList<T> itemList) {
		Object[][] rows = new Object[itemList.size()][];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = toArray(itemList.get(i));
		}
		return rows;
	}

	abstract Object[] toArray(T item);

	public void setItems(ArrayList<T> itemList) {
		this.itemList = itemList;
		loadData(itemList);

		setWidthAndAlign();

		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		setRowSorter(sorter);
	}

	abstract void setWidthAndAlign();

	void tableCellAlign(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);

		TableColumnModel tcm = getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	void tableSetWidth(int... width) {
		TableColumnModel tcm = getColumnModel();
		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
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


	public void addRow(T item) {
		itemList.add(item);
		model.addRow(toArray(item));
	}

	public void removeRow(int idx) {
		itemList.remove(idx);
		model.removeRow(idx);
	}

	public void updateRow(int idx, T updateItem) {
		itemList.set(idx, updateItem);
		model.removeRow(idx);
		model.insertRow(idx, toArray(updateItem));
	}
	
	public ArrayList<T> getItemList() {
		return itemList;
	}

	
}
