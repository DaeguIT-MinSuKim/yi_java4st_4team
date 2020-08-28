package yi_java4st_4team.dto;

public class TableInfo {
	private int no;
	private String name;
	
	public TableInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public TableInfo(int no) {
		super();
		this.no = no;
	}


	public TableInfo(int no, String name) {		
		this.no = no;
		this.name = name;
	}


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


	@Override
	public String toString() {
		return String.format("TableInfo [no=%s, name=%s]", no, name);
	}
	
	
}