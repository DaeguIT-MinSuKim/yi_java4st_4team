package yi_java4st_4team.menuTable.dto;

import java.util.Date;

public class MenuOrder {
	private TableInfo tableInfo;
	private Menu menu;
	private Date orderDay;
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
	



	public MenuOrder(TableInfo tableInfo, Menu menu, int cnt, int unitPrice, int isPayment) {
		super();
		this.tableInfo = tableInfo;
		this.menu = menu;
		this.cnt = cnt;
		this.unitPrice = this.cnt * this.menu.getPrice();
		this.isPayment = isPayment;
	}

	//FramePos -> 276line TEST
	public MenuOrder(TableInfo tableInfo, Menu menu, Date orderDay, int cnt, int isPayment) {
		super();
		this.tableInfo = tableInfo;
		this.menu = menu;
		this.orderDay = orderDay;
		this.cnt = cnt;
		this.isPayment = isPayment;
	}

	public MenuOrder(TableInfo tableInfo, Menu menu, Date orderday, int cnt, int unitPraice, int isPayment) {
		super();
		this.tableInfo = tableInfo;
		this.menu = menu;
		this.orderDay = orderday;
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
		return orderDay;
	}

	public void setOrderday(Date orderday) {
		this.orderDay = orderday;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menu == null) ? 0 : menu.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuOrder other = (MenuOrder) obj;
		if (menu == null) {
			if (other.menu != null)
				return false;
		} else if (!menu.equals(other.menu))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("MenuOrder [tableInfo=%s, menu=%s, orderday=%s, cnt=%s, isPayment=%s, unitPrice=%s]",
				tableInfo, menu, orderDay, cnt, isPayment, unitPrice);
	}


}
