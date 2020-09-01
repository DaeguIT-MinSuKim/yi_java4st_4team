package yi_java4st_4team.menuTable.dto;

import java.util.Date;

public class MenuOrder {
	private TableInfo tno;
	private Menu mCode;
	private Menu mName;
	private int price;
	private Date orderday;
	private int cnt;
	private int isPayment;

	public MenuOrder() {
	}

	public MenuOrder(TableInfo tno, Menu mCode) {
		super();
		this.tno = tno;
		this.mCode = mCode;
	}

	
	public MenuOrder(TableInfo tno, Menu mName, int price, int cnt, int isPayment) {
		super();
		this.tno = tno;
		this.mName = mName;
		this.price = price;
		this.cnt = cnt;
		this.isPayment = isPayment;
	}

	public Menu getmName() {
		return mName;
	}

	public void setmName(Menu mName) {
		this.mName = mName;
	}

	public TableInfo getTno() {
		return tno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTno(TableInfo tno) {
		this.tno = tno;
	}

	public Menu getmCode() {
		return mCode;
	}

	public void setmCode(Menu mCode) {
		this.mCode = mCode;
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

	@Override
	public String toString() {
		return String.format("MenuOrder [tno=%s, mName=%s, price=%s, cnt=%s, isPayment=%s]", tno, mName, price,
				cnt, isPayment);
	}

}
