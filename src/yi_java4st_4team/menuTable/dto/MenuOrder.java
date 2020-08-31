package yi_java4st_4team.menuTable.dto;

import java.util.Date;

public class MenuOrder {
	private int no;
	private String code;
	private Date orderday;
	private int cnt;
	private int isPayment;
	
	public MenuOrder() {}

	public MenuOrder(int no) {
		super();
		this.no = no;
	}

	public MenuOrder(String code) {
		super();
		this.code = code;
	}

	public MenuOrder(int no, String code) {
		super();
		this.no = no;
		this.code = code;
	}

	public MenuOrder(int no, String code, Date orderday, int cnt, int isPayment) {
		super();
		this.no = no;
		this.code = code;
		this.orderday = orderday;
		this.cnt = cnt;
		this.isPayment = isPayment;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
		return String.format("MenuOrder [no=%s, code=%s, orderday=%s, cnt=%s, isPayment=%s]", no, code, orderday, cnt,
				isPayment);
	}
	
	
	
}
