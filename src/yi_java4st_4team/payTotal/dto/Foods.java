package yi_java4st_4team.payTotal.dto;

public class Foods {
	private int no;
	private String name;
	private int count;
	private int sell;
	private double percent;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSell() {
		return sell;
	}

	public void setSell(int sell) {
		this.sell = sell;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return String.format("%3d, %s, %3d, %3d, %.2f]", no, name, count, sell, percent);
	}

	public Foods(int no, String name, int count, int sell, double percent) {
		super();
		this.no = no;
		this.name = name;
		this.count = count;
		this.sell = sell;
		this.percent = percent;
	}

	public Foods() {}

}
