package yi_java4st_4team.payTotal.dto;

import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;

public class PayTotal {
	private int rank;
	private int cntAll;
	private Menu menu;
	private MenuOrder unitPrice;
	private double percentage;

	public PayTotal() {}

	public PayTotal(int rank, int cntAll, Menu menu, MenuOrder unitPrice, double percentage) {
		super();
		this.rank = rank;
		this.cntAll = cntAll;
		this.menu = menu;
		this.unitPrice = unitPrice;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return String.format("PayTotal [rank=%s, cntAll=%s, menu=%s, unitPrice=%s, percentage=%s]", rank, cntAll, menu,
				unitPrice, percentage);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getCntAll() {
		return cntAll;
	}

	public void setCntAll(int cntAll) {
		this.cntAll = cntAll;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public MenuOrder getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(MenuOrder unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
