package cn.dono.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���Դ���������������Ƕȷ���
 * ���ʵ��һ��С��̨����Ϸ
 * @author Administrator
 *
 */
public class GameFrame03 extends Frame {    //GUI���:AWT,swing��
	
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
	private double speed = 10;
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		
		if(speed>0) {
			speed -= 0.05;
		}else {
			speed = 0;
		}
		
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		if(y>500-35||y<30) {
			degree = -degree;
		}
		
		if(x<5||x>500-35) {
			degree = Math.PI-degree;
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
		GameFrame03 gf = new GameFrame03();
		gf.launchFrame();
	}
}
