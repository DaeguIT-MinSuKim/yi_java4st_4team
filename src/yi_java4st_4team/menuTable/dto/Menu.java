package yi_java4st_4team.menuTable.dto;

public class Menu {
	private String code;
	private String name;
	private int price;

	public Menu() {
	}

	public Menu(String code) {
		super();
		this.code = code;
	}

	public Menu(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Menu(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Menu other = (Menu) obj;
		if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s", name);
	}

}
