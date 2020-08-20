package MenuCollect;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;

public class MainPanel extends JPanel {
	private JTabbedPane tabbedPane;
	private Maindishes panel;
	private Subdishes panel_1;
	private Bev panel_2;

	/**
	 * Create the panel.
	 */
	public MainPanel() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);
		
		panel = new Maindishes();
		tabbedPane.addTab("<html><body marginwidth=80 marginheight=20>주메뉴</body></html>", null, panel, null);
		
		panel_1 = new Subdishes();
		tabbedPane.addTab("<html><body marginwidth=80 marginheight=20>부메뉴</body></html>", null, panel_1, null);
		
		panel_2 = new Bev();
		tabbedPane.addTab("<html><body marginwidth=80 marginheight=20>음료</body></html>", null, panel_2, null);
	}

}
