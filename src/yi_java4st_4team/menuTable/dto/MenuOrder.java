package yi_java4st_4team.menuTable.dto;

import java.util.Date;

public class MenuOrder {
	private TableInfo tno;
	private Menu mCode;
	private Date orderday;
	private int cnt;
	private int isPayment;

	public MenuOrder() {}

	public MenuOrder(TableInfo tno, Menu mCode) {
		super();
		this.tno = tno;
		this.mCode = mCode;
	}

	public MenuOrder(TableInfo tno, Menu mCode, Date orderday, int cnt, int isPayment) {
		super();
		this.tno = tno;
		this.mCode = mCode;
		this.orderday = orderday;
		this.cnt = cnt;
		this.isPayment = isPayment;
	}

	public TableInfo getTno() {
		return tno;
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
		return String.format("MenuOrder [tno=%s, mCode=%s, orderday=%s, cnt=%s, isPayment=%s]", tno, mCode, orderday,
				cnt, isPayment);
	}

}
