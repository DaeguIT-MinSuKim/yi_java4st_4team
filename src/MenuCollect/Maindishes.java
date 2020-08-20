package MenuCollect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Maindishes extends JPanel implements MouseListener{
	private JButton Mbtn01;
	private JButton Mbtn02;
	private JButton Mbtn03;
	private JButton Mbtn04;
	private JButton Mbtn05;
	private JButton Mbtn06;
	private JButton Mbtn07;
	private JButton Mbtn08;
	private JButton Mbtn09;
	private JButton Mbtn10;
	private JButton Mbtn11;
	private JButton Mbtn12;
	private JButton Mbtn13;
	private JButton Mbtn14;
	private JButton Mbtn15;
	private JButton Mbtn16;
	/**
	 * Create the panel.
	 */
	public Maindishes() {

		initComponents();
	}
	private void initComponents() {
		setMinimumSize(new Dimension(200, 400));		
		setLayout(new GridLayout(0, 4, 0, 0));	
		
		BevelBorder b = new BevelBorder (BevelBorder.RAISED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
		
		
		Mbtn01 = new JButton("<html>뼈해장국<br>6,000<html>");
		Mbtn01.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn01.setSelected(true);
		Mbtn01.addMouseListener(this);
		Mbtn01.setBackground(Color.LIGHT_GRAY);
		Mbtn01.setBorder(b);
		add(Mbtn01);
		
		Mbtn02 = new JButton("<html>갈비탕<br>9,000<html>");
		Mbtn02.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn02.addMouseListener(this);
		Mbtn02.setBackground(Color.LIGHT_GRAY);
		Mbtn02.setBorder(b);
		add(Mbtn02);
		
		Mbtn03 = new JButton("<html>육계장<br>7,000</html>");
		Mbtn03.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn03.addMouseListener(this);
		Mbtn03.setBackground(Color.LIGHT_GRAY);
		Mbtn03.setBorder(b);
		add(Mbtn03);
		
		Mbtn04 = new JButton("<html>제육덮밥<br>6,000</html>");
		Mbtn04.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn04.addMouseListener(this);
		Mbtn04.setBackground(Color.LIGHT_GRAY);
		Mbtn04.setBorder(b);
		add(Mbtn04);
		
		Mbtn05 = new JButton("");
		Mbtn05.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn05.setBackground(Color.LIGHT_GRAY);
		Mbtn05.setBorder(b);
		add(Mbtn05);
		
		Mbtn06 = new JButton("");
		Mbtn06.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn06.setBackground(Color.LIGHT_GRAY);
		Mbtn06.setBorder(b);
		add(Mbtn06);
		
		Mbtn07 = new JButton("");
		Mbtn07.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn07.setBackground(Color.LIGHT_GRAY);
		Mbtn07.setBorder(b);
		add(Mbtn07);
		
		Mbtn08 = new JButton("");
		Mbtn08.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn08.setBackground(Color.LIGHT_GRAY);
		Mbtn08.setBorder(b);
		add(Mbtn08);
		
		Mbtn09 = new JButton("");
		Mbtn09.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn09.setBackground(Color.LIGHT_GRAY);
		Mbtn09.setBorder(b);
		add(Mbtn09);
		
		Mbtn10 = new JButton("");
		Mbtn10.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn10.setBackground(Color.LIGHT_GRAY);
		Mbtn10.setBorder(b);
		add(Mbtn10);
		
		Mbtn11 = new JButton("");
		Mbtn11.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn11.setBackground(Color.LIGHT_GRAY);
		Mbtn11.setBorder(b);
		add(Mbtn11);
		
		Mbtn12 = new JButton("");
		Mbtn12.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn12.setBackground(Color.LIGHT_GRAY);
		Mbtn12.setBorder(b);
		add(Mbtn12);
		
		Mbtn13 = new JButton("");
		Mbtn13.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn13.setBackground(Color.LIGHT_GRAY);
		Mbtn13.setBorder(b);
		add(Mbtn13);
		
		Mbtn14 = new JButton("");
		Mbtn14.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn14.setBackground(Color.LIGHT_GRAY);
		Mbtn14.setBorder(b);
		add(Mbtn14);
		
		Mbtn15 = new JButton("");
		Mbtn15.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn15.setBackground(Color.LIGHT_GRAY);
		Mbtn15.setBorder(b);
		add(Mbtn15);
		
		Mbtn16 = new JButton("");
		Mbtn16.setFont(new Font("굴림", Font.BOLD, 20));
		Mbtn16.setBackground(Color.LIGHT_GRAY);
		Mbtn16.setBorder(b);
		add(Mbtn16);
	}
	

	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == Mbtn04) {
			mousePressedMbtn04(e);
		}
		if (e.getSource() == Mbtn03) {
			mousePressedMbtn03(e);
		}
		if (e.getSource() == Mbtn02) {
			mousePressedMbtn02(e);
		}
		if (e.getSource() == Mbtn01) {
			mousePressedMbtn01(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mousePressedMbtn01(MouseEvent e) {
		System.out.println("뼈해장국");
	}
	protected void mousePressedMbtn02(MouseEvent e) {
		System.out.println("갈비탕");
	}
	protected void mousePressedMbtn03(MouseEvent e) {
		System.out.println("육개장");
	}
	protected void mousePressedMbtn04(MouseEvent e) {
		System.out.println("제육덮밥");
	}
}
