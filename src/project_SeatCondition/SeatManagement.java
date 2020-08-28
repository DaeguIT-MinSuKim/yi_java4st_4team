package project_SeatCondition;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import project_order.main.OrderManagement;

public class SeatManagement extends JPanel{
	
	private JPanel pTable1;
	private JPanel pTable8;
	private JPanel pTable7;
	private JPanel pTable6;
	private JPanel pTable5;
	private JPanel pTable4;
	private JPanel pTable3;
	private JPanel pTable2;
	private OrderManagement orderManagement;
	private OrderManagement orderManagement2;
	private OrderManagement orderManagement3;
	

   public SeatManagement() {

      initComponents();
   }
   private void initComponents() {
	  setBorder(new EmptyBorder(20, 50, 20, 50));
      setLayout(new GridLayout(0, 2, 10, 30));
      
      
      pTable1 = new JPanel();
      pTable1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable1);
      pTable1.setLayout(new BoxLayout(pTable1, BoxLayout.X_AXIS));
      pTable1.addMouseListener(new MouseAdapter() {
    	  
		@Override
		public void mouseClicked(MouseEvent e) {
			if ( orderManagement == null ) {
				orderManagement = new OrderManagement();
			}
			orderManagement.setVisible(true);
		}
	});
      
      JLabel lblTableNo1 = new JLabel("no.01");      
      lblTableNo1.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable1.add(lblTableNo1);
      
      JPanel panel = new JPanel();
      panel.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable1.add(panel);
      panel.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_01 = new JPanel();
      panel_01.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel.add(panel_01);
      panel_01.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu1 = new JLabel("");
      lblMenu1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu1.setPreferredSize(new Dimension(100, 50));
      panel_01.add(lblMenu1, BorderLayout.CENTER);
      
      JLabel lblTotal1 = new JLabel("");
      lblTotal1.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal1.setPreferredSize(new Dimension(100, 20));
      panel_01.add(lblTotal1, BorderLayout.SOUTH);
      
      
      pTable2 = new JPanel();
      pTable2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable2);
      pTable2.setLayout(new BoxLayout(pTable2, BoxLayout.X_AXIS));
      pTable2.addMouseListener(new MouseAdapter() {
    	  
  		@Override
  		public void mouseClicked(MouseEvent e) {
  			if ( orderManagement2 == null ) {
  				orderManagement2 = new OrderManagement();
  			}
  			orderManagement2.setVisible(true);
  		}
  	});
      
      JLabel lblTableNo2 = new JLabel("no.02");      
      lblTableNo2.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable2.add(lblTableNo2);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable2.add(panel_1);
      panel_1.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_02 = new JPanel();
      panel_02.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_1.add(panel_02);
      panel_02.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu2 = new JLabel("");
      lblMenu2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu2.setPreferredSize(new Dimension(100, 50));
      panel_02.add(lblMenu2, BorderLayout.CENTER);
      
      JLabel lblTotal2 = new JLabel("");
      lblTotal2.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal2.setPreferredSize(new Dimension(100, 20));
      panel_02.add(lblTotal2, BorderLayout.SOUTH);
      
      
      pTable3 = new JPanel();
      pTable3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable3);
      pTable3.setLayout(new BoxLayout(pTable3, BoxLayout.X_AXIS));
      pTable3.addMouseListener(new MouseAdapter() {
    	  
  		@Override
  		public void mouseClicked(MouseEvent e) {
  			if ( orderManagement3 == null ) {
  				orderManagement3 = new OrderManagement();
  			}
  			orderManagement3.setVisible(true);
  		}
  	});
      
      JLabel lblTableNo3 = new JLabel("no.03");      
      lblTableNo3.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable3.add(lblTableNo3);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable3.add(panel_2);
      panel_2.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_03 = new JPanel();
      panel_03.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_2.add(panel_03);
      panel_03.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu3 = new JLabel("");
      lblMenu3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu3.setPreferredSize(new Dimension(100, 50));
      panel_03.add(lblMenu3, BorderLayout.CENTER);
      
      JLabel lblTotal3 = new JLabel("");
      lblTotal3.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal3.setPreferredSize(new Dimension(100, 20));
      panel_03.add(lblTotal3, BorderLayout.SOUTH);
      
      
      pTable4 = new JPanel();
      pTable4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable4);
      pTable4.setLayout(new BoxLayout(pTable4, BoxLayout.X_AXIS));
      
      JLabel lblTableNo4 = new JLabel("no.04");      
      lblTableNo4.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable4.add(lblTableNo4);
      
      JPanel panel_7 = new JPanel();
      panel_7.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable4.add(panel_7);
      panel_7.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_04 = new JPanel();
      panel_04.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_7.add(panel_04);
      panel_04.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu4 = new JLabel("");
      lblMenu4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu4.setPreferredSize(new Dimension(100, 50));
      panel_04.add(lblMenu4, BorderLayout.CENTER);
      
      JLabel lblTotal4 = new JLabel("");
      lblTotal4.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal4.setPreferredSize(new Dimension(100, 20));
      panel_04.add(lblTotal4, BorderLayout.SOUTH);
      
      
      pTable5 = new JPanel();
      pTable5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable5);
      pTable5.setLayout(new BoxLayout(pTable5, BoxLayout.X_AXIS));
      
      JLabel lblTableNo5 = new JLabel("no.05");      
      lblTableNo5.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable5.add(lblTableNo5);
      
      JPanel panel_6 = new JPanel();
      panel_6.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable5.add(panel_6);
      panel_6.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_05_1 = new JPanel();
      panel_05_1.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_6.add(panel_05_1);
      panel_05_1.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu5 = new JLabel("");
      lblMenu5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu5.setPreferredSize(new Dimension(100, 50));
      panel_05_1.add(lblMenu5, BorderLayout.CENTER);
      
      JLabel lblTotal5 = new JLabel("");
      lblTotal5.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal5.setPreferredSize(new Dimension(100, 20));
      panel_05_1.add(lblTotal5, BorderLayout.SOUTH);
      
      
      pTable6 = new JPanel();
      pTable6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable6);
      pTable6.setLayout(new BoxLayout(pTable6, BoxLayout.X_AXIS));
      
      JLabel lblTableNo6 = new JLabel("no.06");      
      lblTableNo6.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable6.add(lblTableNo6);
      
      JPanel panel_5 = new JPanel();
      panel_5.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable6.add(panel_5);
      panel_5.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_06 = new JPanel();
      panel_06.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_5.add(panel_06);
      panel_06.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu6 = new JLabel("");
      lblMenu6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu6.setPreferredSize(new Dimension(100, 50));
      panel_06.add(lblMenu6, BorderLayout.CENTER);
      
      JLabel lblTotal6 = new JLabel("");
      lblTotal6.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal6.setPreferredSize(new Dimension(100, 20));
      panel_06.add(lblTotal6, BorderLayout.SOUTH);
      
      
      pTable7 = new JPanel();
      pTable7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable7);
      pTable7.setLayout(new BoxLayout(pTable7, BoxLayout.X_AXIS));
      
      JLabel lblTableNo7 = new JLabel("no.07");      
      lblTableNo7.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable7.add(lblTableNo7);
      
      JPanel panel_4 = new JPanel();
      panel_4.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable7.add(panel_4);
      panel_4.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_07 = new JPanel();
      panel_07.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_4.add(panel_07);
      panel_07.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu7 = new JLabel("");
      lblMenu7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu7.setPreferredSize(new Dimension(100, 50));
      panel_07.add(lblMenu7, BorderLayout.CENTER);
      
      JLabel lblTotal7 = new JLabel("");
      lblTotal7.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal7.setPreferredSize(new Dimension(100, 20));
      panel_07.add(lblTotal7, BorderLayout.SOUTH);
      
      
      pTable8 = new JPanel();
      pTable8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      add(pTable8);
      pTable8.setLayout(new BoxLayout(pTable8, BoxLayout.X_AXIS));
      
      JLabel lblTableNo8 = new JLabel("no.08");      
      lblTableNo8.setFont(new Font("굴림", Font.PLAIN, 15));
      pTable8.add(lblTableNo8);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
      pTable8.add(panel_3);
      panel_3.setLayout(new GridLayout(0, 1, 0, 0));
      
      JPanel panel_08 = new JPanel();
      panel_08.setBorder(new EmptyBorder(10, 10, 10, 10));
      panel_3.add(panel_08);
      panel_08.setLayout(new BorderLayout(0, 0));
      
      JLabel lblMenu8 = new JLabel("");
      lblMenu8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblMenu8.setPreferredSize(new Dimension(100, 50));
      panel_08.add(lblMenu8, BorderLayout.CENTER);
      
      JLabel lblTotal8 = new JLabel("");
      lblTotal8.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
      lblTotal8.setPreferredSize(new Dimension(100, 20));
      panel_08.add(lblTotal8, BorderLayout.SOUTH);
      
   }

	
}