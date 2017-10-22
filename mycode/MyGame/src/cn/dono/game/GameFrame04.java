package cn.dono.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ�������������Բ�켣����
 * ���ʵ��һ��С��̨����Ϸ
 * @author Administrator
 *
 */
public class GameFrame04 extends Frame {    //GUI���:AWT,swing��
	
	Image img = GameUtil.getImage("images/a.jpg");
	
	/**
	 * ���ش���
	 */
	public void launchFrame() {
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();    //�����ػ��߳�
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	private double x=100,y=100;
	private double degree=3.14/3;    //[0,2pi]
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		
		x = 100 + 100*Math.cos(degree);
		y = 200 + 50*Math.sin(degree);
		
		degree += 0.1;
	}
	
	/**
	 * ����һ���ػ����ڵ��߳���,��һ���ڲ���
	 * @author Administrator
	 *
	 */
	
	class PaintThread extends Thread {
		
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		GameFrame04 gf = new GameFrame04();
		gf.launchFrame();
	}
}
