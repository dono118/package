package cn.dono.plane;

import java.awt.Graphics;
import java.awt.Image;

import cn.dono.util.GameUtil;

/**
 * ±¨’®¿‡
 * @author Administrator
 *
 */
public class Explode {
	double x, y;
	static Image[] imgs = new Image[17];
	static {
		for(int i=0;i<17;i++) {
			imgs[i] = GameUtil.getImage("images/explode/e"+(i+1)+".gif");
			imgs[i].getWidth(null);
		}
	}
	
	int count;
	
	public void draw(Graphics g) {
		if(count<=16) {
			g.drawImage(imgs[count], (int)x, (int)y, null);
			count++;
		}
	}
	
	public Explode(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
