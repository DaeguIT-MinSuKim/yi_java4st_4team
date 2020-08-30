package project_SeatCondition;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

public class SeatManagement extends JPanel{

   public SeatManagement() {

      initComponents();
   }
   private void initComponents() {
	  setBorder(new EmptyBorder(50, 30, 50, 30));
   	setLayout(new GridLayout(0, 2, 30, 20));
   	
   	TableStructure pTable1 = new TableStructure();
   	add(pTable1);
   	pTable1.addMouseListener(new MouseAdapter() {
	});
   	
   	TableStructure pTable2 = new TableStructure();
   	add(pTable2);
   	
   	JPanel pTable3 = new TableStructure();
   	add(pTable3);
   	
   	JPanel pTable4 = new TableStructure();
   	add(pTable4);
   	
   	JPanel pTable5 = new TableStructure();
   	add(pTable5);
   	
   	JPanel pTable6 = new TableStructure();
   	add(pTable6);
   	
   	JPanel pTable7 = new TableStructure();
   	add(pTable7);
   	
   	JPanel pTable8 = new TableStructure();
   	add(pTable8);
   }
   
}