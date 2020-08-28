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

public class Bev extends JPanel implements MouseListener{
	private JButton Bbtn01;
	private JButton Bbtn02;
	private JButton Bbtn03;
	private JButton Bbtn04;
	private JButton Bbtn05;
	private JButton Bbtn06;
	private JButton Bbtn07;
	private JButton Bbtn08;
	private JButton Bbtn09;
	private JButton Bbtn10;
	private JButton Bbtn11;
	private JButton Bbtn12;
	private JButton Bbtn13;
	private JButton Bbtn14;
	private JButton Bbtn15;
	private JButton Bbtn16;
	/**
	 * Create the panel.
	 */
	public Bev() {

		initComponents();
	}
	private void initComponents() {
		setMinimumSize(new Dimension(200, 400));		
		setLayout(new GridLayout(0, 4, 0, 0));	
		
		BevelBorder b = new BevelBorder (BevelBorder.RAISED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY);
		
		
		Bbtn01 = new JButton("<html>소주<br>4,000<html>");
		Bbtn01.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn01.setSelected(true);
		Bbtn01.addMouseListener(this);
		Bbtn01.setBackground(Color.LIGHT_GRAY);
		Bbtn01.setBorder(b);
		add(Bbtn01);
		
		Bbtn02 = new JButton("<html>맥주<br>4,000<html>");
		Bbtn02.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn02.addMouseListener(this);
		Bbtn02.setBackground(Color.LIGHT_GRAY);
		Bbtn02.setBorder(b);
		add(Bbtn02);
		
		Bbtn03 = new JButton("<html>콜라<br>1,000</html>");
		Bbtn03.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn03.addMouseListener(this);
		Bbtn03.setBackground(Color.LIGHT_GRAY);
		Bbtn03.setBorder(b);
		add(Bbtn03);
		
		Bbtn04 = new JButton("<html>사이다<br>1,000</html>");
		Bbtn04.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn04.addMouseListener(this);
		Bbtn04.setBackground(Color.LIGHT_GRAY);
		Bbtn04.setBorder(b);
		add(Bbtn04);
		
		Bbtn05 = new JButton("");
		Bbtn05.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn05.setBackground(Color.LIGHT_GRAY);
		Bbtn05.setBorder(b);
		add(Bbtn05);
		
		Bbtn06 = new JButton("");
		Bbtn06.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn06.setBackground(Color.LIGHT_GRAY);
		Bbtn06.setBorder(b);
		add(Bbtn06);
		
		Bbtn07 = new JButton("");
		Bbtn07.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn07.setBackground(Color.LIGHT_GRAY);
		Bbtn07.setBorder(b);
		add(Bbtn07);
		
		Bbtn08 = new JButton("");
		Bbtn08.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn08.setBackground(Color.LIGHT_GRAY);
		Bbtn08.setBorder(b);
		add(Bbtn08);
		
		Bbtn09 = new JButton("");
		Bbtn09.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn09.setBackground(Color.LIGHT_GRAY);
		Bbtn09.setBorder(b);
		add(Bbtn09);
		
		Bbtn10 = new JButton("");
		Bbtn10.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn10.setBackground(Color.LIGHT_GRAY);
		Bbtn10.setBorder(b);
		add(Bbtn10);
		
		Bbtn11 = new JButton("");
		Bbtn11.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn11.setBackground(Color.LIGHT_GRAY);
		Bbtn11.setBorder(b);
		add(Bbtn11);
		
		Bbtn12 = new JButton("");
		Bbtn12.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn12.setBackground(Color.LIGHT_GRAY);
		Bbtn12.setBorder(b);
		add(Bbtn12);
		
		Bbtn13 = new JButton("");
		Bbtn13.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn13.setBackground(Color.LIGHT_GRAY);
		Bbtn13.setBorder(b);
		add(Bbtn13);
		
		Bbtn14 = new JButton("");
		Bbtn14.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn14.setBackground(Color.LIGHT_GRAY);
		Bbtn14.setBorder(b);
		add(Bbtn14);
		
		Bbtn15 = new JButton("");
		Bbtn15.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn15.setBackground(Color.LIGHT_GRAY);
		Bbtn15.setBorder(b);
		add(Bbtn15);
		
		Bbtn16 = new JButton("");
		Bbtn16.setFont(new Font("굴림", Font.BOLD, 20));
		Bbtn16.setBackground(Color.LIGHT_GRAY);
		Bbtn16.setBorder(b);
		add(Bbtn16);
	}
	

	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == Bbtn04) {
			mousePressedMbtn04(e);
		}
		if (e.getSource() == Bbtn03) {
			mousePressedMbtn03(e);
		}
		if (e.getSource() == Bbtn02) {
			mousePressedMbtn02(e);
		}
		if (e.getSource() == Bbtn01) {
			mousePressedMbtn01(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mousePressedMbtn01(MouseEvent e) {
		System.out.println("소주");
	}
	protected void mousePressedMbtn02(MouseEvent e) {
		System.out.println("맥주");
	}
	protected void mousePressedMbtn03(MouseEvent e) {
		System.out.println("콜라");
	}
	protected void mousePressedMbtn04(MouseEvent e) {
		System.out.println("사이다");
	}
}
