package yi_java4st_4team.menuTable.dto;

import java.util.Date;

public class MenuOrder {
	private TableInfo tableInfo;
	private Menu menu;
	private Date orderday;
	private int cnt;
	private int isPayment;
	private int unitPrice;		// 한 메뉴의 개수에 따른 가격
	
	public MenuOrder() {
	}

	public MenuOrder(TableInfo tableInfo, Menu menu) {
		super();
		this.tableInfo = tableInfo;
		this.menu = menu;
	}

	public MenuOrder(TableInfo tableInfo, Menu menu, Date orderday, int cnt, int isPayment) {
		super();
		this.tableInfo = tableInfo;
		this.menu = menu;
		this.orderday = orderday;
		this.cnt = cnt;
		this.isPayment = isPayment;
		this.unitPrice = this.cnt * this.menu.getPrice();
	}

	public TableInfo getTableInfo() {
		return tableInfo;
	}

	public void setTableInfo(TableInfo tableInfo) {
		this.tableInfo = tableInfo;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Date getOrderday() {
		return orderday;
	}

	public void setOrderday(Date orderday) {
		this.orderday = orderday;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(int isPayment) {
		this.isPayment = isPayment;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return String.format("MenuOrder [tableInfo=%s, menu=%s, orderday=%s, cnt=%s, isPayment=%s, unitPrice=%s]",
				tableInfo, menu, orderday, cnt, isPayment, unitPrice);
	}


}
