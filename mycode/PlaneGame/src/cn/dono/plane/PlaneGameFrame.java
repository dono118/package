package cn.dono.plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import cn.dono.util.GameUtil;
import cn.dono.util.MyFrame;

public class PlaneGameFrame extends MyFrame {
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane p = new Plane("images/plane.png", 50, 50);
	
	ArrayList bulletList = new ArrayList();    //������ʱδѧ�ݲ���,�Ժ�ѧ��ǿ�ҽ������
	
	Date startTime;
	Date endTime;
	Explode boom;
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		p.draw(g);
		
		for(int i=0;i<bulletList.size();i++) {
			Bullet b = (Bullet)bulletList.get(i);
			b.draw(g);
			
			//�����ɻ�����ײ
			boolean peng = b.getRect().intersects(p.getRect());
			if(peng) {
				p.setLive(false);    //�ɻ��ҵ�!
				if(boom==null) {
					endTime = new Date();
					boom = new Explode(p.x,p.y);
				}
				boom.draw(g);
				break;
			}
		}
		
		if(!p.isLive()) {
			int period = (int)(endTime.getTime()-startTime.getTime())/1000;
			printInfo(g,"Time:"+period+"s",20,170,350,Color.white);
			
			switch (period/10) {
			case 0:
			case 1:
				printInfo(g,"����",30,180,300,Color.white);
				break;
			case 2:
				printInfo(g,"����",30,180,300,Color.white);
				break;
			case 3:
				printInfo(g,"����",30,180,300,Color.white);
				break;
			default:
				break;
			}
		}
		
		
//		printInfo(g,"Score:100",10,50,50,Color.red);
	}
	
	/**
	 * �ڴ����ϴ�ӡ��Ϣ
	 * @param g
	 * @param str
	 * @param size
	 */
	public void printInfo(Graphics g,String str,int size,int x,int y,Color color) {
		Color c = g.getColor();
		g.setColor(color);
		Font f = new Font("HELVETICA",Font.BOLD,size);
		g.setFont(f);
		g.drawString(str, x, y);
		g.setColor(c);
	}
	
	public static void main(String[] args) {
		new PlaneGameFrame().launchFrame();
	}
	
	public void launchFrame() {
		super.launchFrame();
		//���Ӽ��̵ļ���
		addKeyListener(new KeyMonitor());
		
		//����һ���ӵ�
		for(int i=0;i<30;i++) {
			Bullet b = new Bullet();
			bulletList.add(b);
		}
		
		startTime = new Date();
	}
	
	//����Ϊ�ڲ���,���Է���ʹ���ⲿ�����ͨ����
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("����:"+e.getKeyCode());
			p.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("�ͷ�:"+e.getKeyCode());
			p.minusDirection(e);
		}
		
	}
}
