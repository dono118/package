package cn.dono.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.dono.util.Constant;
import cn.dono.util.GameUtil;
import cn.dono.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author Administrator
 *
 */
public class SolarFrame extends MyFrame {
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/Sun.png", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet mercury = new Planet(sun,"images/Mercury.png", 60, 50, 0.3);
	Planet venus = new Planet(sun,"images/Venus.png", 108, 90, 0.2);
	Planet earth = new Planet(sun,"images/Earth.png", 180, 150, 0.1);
	Planet moon = new Planet(earth,"images/moon.png", 30, 20, 0.8,true);
	Planet mars = new Planet(sun,"images/Mars.png", 220*1.2, 220, 0.06);
	Planet jupiter = new Planet(sun,"images/Jupiter.png", 280*1.2, 280, 0.04);
	Planet saturn = new Planet(sun,"images/Saturn.png", 350*1.2, 350, 0.02);
	
	
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		moon.draw(g);
		mars.draw(g);
		jupiter.draw(g);
		saturn.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}
}
