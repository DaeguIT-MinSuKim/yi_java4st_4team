package yi_java4st_4team.TableTotal;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Dimension;

public class TableStructure extends JPanel {
	private JLabel lblTableNo;
	private JLabel lblMenuPrice;
	private JLabel lblMenu1;
	private JLabel lblMenu2;
	private JLabel lblMenu3;

	public TableStructure() {

		initComponents();
	}
	
	private void initComponents() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTableNo = new JPanel();
		pTableNo.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		add(pTableNo, BorderLayout.WEST);
		pTableNo.setLayout(new BorderLayout(0, 0));
		
		lblTableNo = new JLabel("NewTable");
		lblTableNo.setHorizontalAlignment(SwingConstants.CENTER);
		pTableNo.add(lblTableNo, BorderLayout.CENTER);
		
		JPanel pTableInfo = new JPanel();
		pTableInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(pTableInfo, BorderLayout.CENTER);
		pTableInfo.setLayout(new BorderLayout(0, 0));
		
		JPanel pTableText = new JPanel();
		pTableText.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pTableInfo.add(pTableText, BorderLayout.CENTER);
		pTableText.setLayout(new BoxLayout(pTableText, BoxLayout.Y_AXIS));
		
		JPanel pMenuText = new JPanel();
		pMenuText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pTableText.add(pMenuText);
		pMenuText.setLayout(new BorderLayout(0, 0));
		
		lblMenu1 = new JLabel("New label");
		lblMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		pMenuText.add(lblMenu1, BorderLayout.NORTH);
		
		lblMenu2 = new JLabel("New label");
		lblMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		pMenuText.add(lblMenu2, BorderLayout.CENTER);
		
		lblMenu3 = new JLabel("New label");
		lblMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		pMenuText.add(lblMenu3, BorderLayout.SOUTH);
		
		JPanel pMenuPrice = new JPanel();
		pTableText.add(pMenuPrice);
		pMenuPrice.setLayout(new BorderLayout(0, 0));
		
		lblMenuPrice = new JLabel("New label");
		lblMenuPrice.setHorizontalAlignment(SwingConstants.CENTER);
		pMenuPrice.add(lblMenuPrice);
	}

	public void setTableNo(String string) {
		lblTableNo.setText(string);
	}	
	
	public int getTableNo(){
		return Integer.parseInt(lblTableNo.getText().substring(2));
	}

}
