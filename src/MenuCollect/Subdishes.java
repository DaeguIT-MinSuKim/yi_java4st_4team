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

public class Subdishes extends JPanel implements MouseListener{
	private JButton Sbtn01;
	private JButton Sbtn02;
	private JButton Sbtn03;
	private JButton Sbtn04;
	private JButton Sbtn05;
	private JButton Sbtn06;
	private JButton Sbtn07;
	private JButton Sbtn08;
	private JButton Sbtn09;
	private JButton Sbtn10;
	private JButton Sbtn11;
	private JButton Sbtn12;
	private JButton Sbtn13;
	private JButton Sbtn14;
	private JButton Sbtn15;
	private JButton Sbtn16;
	/**
	 * Create the panel.
	 */
	public Subdishes() {

		initComponents();
	}
	private void initComponents() {
		setMinimumSize(new Dimension(200, 400));		
		setLayout(new GridLayout(0, 4, 0, 0));	
		
		BevelBorder b = new BevelBorder (BevelBorder.RAISED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
		
		
		Sbtn01 = new JButton("<html>공깃밥<br>1,000<html>");
		Sbtn01.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn01.setSelected(true);
		Sbtn01.addMouseListener(this);
		Sbtn01.setBackground(Color.LIGHT_GRAY);
		Sbtn01.setBorder(b);
		add(Sbtn01);
		
		Sbtn02 = new JButton("<html>계란찜<br>3,000<html>");
		Sbtn02.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn02.addMouseListener(this);
		Sbtn02.setBackground(Color.LIGHT_GRAY);
		Sbtn02.setBorder(b);
		add(Sbtn02);
		
		Sbtn03 = new JButton("<html>꽁치구이<br>5,000</html>");
		Sbtn03.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn03.addMouseListener(this);
		Sbtn03.setBackground(Color.LIGHT_GRAY);
		Sbtn03.setBorder(b);
		add(Sbtn03);
		
		Sbtn04 = new JButton("<html>계란후라이<br>1,000</html>");
		Sbtn04.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn04.addMouseListener(this);
		Sbtn04.setBackground(Color.LIGHT_GRAY);
		Sbtn04.setBorder(b);
		add(Sbtn04);
		
		Sbtn05 = new JButton("");
		Sbtn05.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn05.setBackground(Color.LIGHT_GRAY);
		Sbtn05.setBorder(b);
		add(Sbtn05);
		
		Sbtn06 = new JButton("");
		Sbtn06.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn06.setBackground(Color.LIGHT_GRAY);
		Sbtn06.setBorder(b);
		add(Sbtn06);
		
		Sbtn07 = new JButton("");
		Sbtn07.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn07.setBackground(Color.LIGHT_GRAY);
		Sbtn07.setBorder(b);
		add(Sbtn07);
		
		Sbtn08 = new JButton("");
		Sbtn08.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn08.setBackground(Color.LIGHT_GRAY);
		Sbtn08.setBorder(b);
		add(Sbtn08);
		
		Sbtn09 = new JButton("");
		Sbtn09.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn09.setBackground(Color.LIGHT_GRAY);
		Sbtn09.setBorder(b);
		add(Sbtn09);
		
		Sbtn10 = new JButton("");
		Sbtn10.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn10.setBackground(Color.LIGHT_GRAY);
		Sbtn10.setBorder(b);
		add(Sbtn10);
		
		Sbtn11 = new JButton("");
		Sbtn11.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn11.setBackground(Color.LIGHT_GRAY);
		Sbtn11.setBorder(b);
		add(Sbtn11);
		
		Sbtn12 = new JButton("");
		Sbtn12.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn12.setBackground(Color.LIGHT_GRAY);
		Sbtn12.setBorder(b);
		add(Sbtn12);
		
		Sbtn13 = new JButton("");
		Sbtn13.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn13.setBackground(Color.LIGHT_GRAY);
		Sbtn13.setBorder(b);
		add(Sbtn13);
		
		Sbtn14 = new JButton("");
		Sbtn14.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn14.setBackground(Color.LIGHT_GRAY);
		Sbtn14.setBorder(b);
		add(Sbtn14);
		
		Sbtn15 = new JButton("");
		Sbtn15.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn15.setBackground(Color.LIGHT_GRAY);
		Sbtn15.setBorder(b);
		add(Sbtn15);
		
		Sbtn16 = new JButton("");
		Sbtn16.setFont(new Font("굴림", Font.BOLD, 20));
		Sbtn16.setBackground(Color.LIGHT_GRAY);
		Sbtn16.setBorder(b);
		add(Sbtn16);
	}
	

	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == Sbtn04) {
			mousePressedMbtn04(e);
		}
		if (e.getSource() == Sbtn03) {
			mousePressedMbtn03(e);
		}
		if (e.getSource() == Sbtn02) {
			mousePressedMbtn02(e);
		}
		if (e.getSource() == Sbtn01) {
			mousePressedMbtn01(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mousePressedMbtn01(MouseEvent e) {
		System.out.println("공깃밥");
	}
	protected void mousePressedMbtn02(MouseEvent e) {
		System.out.println("계란찜");
	}
	protected void mousePressedMbtn03(MouseEvent e) {
		System.out.println("꽁치구이");
	}
	protected void mousePressedMbtn04(MouseEvent e) {
		System.out.println("계란후라이");
	}
}
