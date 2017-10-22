package cn.dono.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ�����������ˮƽ�ʹ�ֱ�ƶ�
 * @author Administrator
 *
 */
public class GameFrame02 extends Frame {    //GUI���:AWT,swing��
	
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
	private boolean left;
	private boolean up;
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		/*if(left) {
			x -= 3;
		}else {
			x += 3;
		}
		if(x>500-30) {
			left = true;
		}
		if(x<0) {
			left = false;
		}*/
		
		if(up) {
			y -= 10;
		}else {
			y += 10;
		}
		if(y>500-35) {
			up = true;
		}
		if(y<30) {
			up = false;
		}

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
		GameFrame02 gf = new GameFrame02();
		gf.launchFrame();
	}
}
