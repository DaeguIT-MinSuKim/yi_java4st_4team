package yi_java4st_4team.dao.Impl.ui.content;

import javax.swing.SwingConstants;

import yi_java4st_4team.dto.Menu;

@SuppressWarnings("serial")
public class TableMenu extends AbstractMainTableMenu<Menu>  {

	public TableMenu() {}

	@Override
	Object[] getColName() {
		
		return new String[] {"코드", "메뉴명", "음식가격"};
		
	}

	@Override
	Object[] toArray(Menu mf) {
		System.out.println(mf);				//DB에서 불러온 데이터 출력
		return new Object[] {mf.getCode(), mf.getName(), mf.getPrice()};
	}

	@Override
	void setWidthAndAlign() {
		 // column width
        tableSetWidth(200, 300);
        // column alignment
        tableCellAlign(SwingConstants.CENTER, 0, 1);		
	}
	
}
