package cn.dono.game;

import java.awt.Image;
import java.awt.Toolkit;

public class GameUtil {
	
	private GameUtil() {}    //工具类最好将构造器私有了
	
	public static Image getImage(String path) {
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	
	}
}
