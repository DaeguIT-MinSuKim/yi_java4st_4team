package yi_java4st_4team.dao.Impl.ui.content;

import javax.swing.SwingConstants;

import yi_java4st_4team.dto.MenuOrder;

@SuppressWarnings("serial")
public class SelectedMenuOrderTable extends AbstractMainTableMenu<MenuOrder> {
	
	public SelectedMenuOrderTable() {
	}

	@Override
	Object[] getColName() {		
		return new String[] {"테이블번호", "메뉴코드", "주문날짜", "수량", "결제여부"};
	}

	@Override
	Object[] toArray(MenuOrder mo) {		
		return new Object[] {
				mo.getNo(),
				mo.getCode(),
				mo.getOrderday(),
				mo.getCnt(),
				mo.getIsPayment()};
	}

	@Override
	void setWidthAndAlign() {
		
		//column width
		tableSetWidth(200,200,200,100,100);
		//column alingnment
		tableCellAlign(SwingConstants.CENTER, 0,1);
		tableCellAlign(SwingConstants.RIGHT, 2,3,4);
		
	}
	

}

