package yumo.game;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {

	public static String input = "1.gif"; //gif图片路径，推荐使用像素在400*400以内的
	public static String output = "charGif//"; //gif图片生成路径，这里没有整合AnimatedGifEncoder包
												   //所以生成的是一些jpg图片，需要自己借助其他工具整个成gif
												   //如果有条件可以继续改进，直接生成一个gif文件
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame mainFrame = new MainFrame();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
	}
}

class MainFrame extends JFrame {
	private int x;
	private int y;
	public static int WIDTH = 0;
	public static int HEIGHT = 0;
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		int screen_width = kit.getScreenSize().width;
		int screen_height = kit.getScreenSize().height;
		x = (screen_width-WIDTH)/2;
		y = (screen_height-HEIGHT)/2;
	}
	public MainFrame() {
		setTitle("CharacterGIF_1.0  by YuMo");
		initBounds();
		createGIF();
		setBounds(x, y, WIDTH, HEIGHT);
		setResizable(false);
		setIconImage(null);
		
		JPanel panel = new GamePanel();
		Container container = getContentPane();
		container.add(panel);
	}
	//将字符图片输出到指定目录
	public void createGIF() {
		BufferedImage[] charImgs = ImgToCharacter.getCharImgs();
			try {
				for (int i=0; i<charImgs.length; i++) {
					File file = new File(Client.output+i+".jpg");
					ImageIO.write(charImgs[i], "jpg", file);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("图片输出完成！");
	}
	public void initBounds() {
		ImgToCharacter.readGiF();
		ImgToCharacter.draw();
		BufferedImage[] charImgs = ImgToCharacter.getCharImgs();
		int max_width = 0;
		int max_height = 0;
		for (BufferedImage img : charImgs) {
			if(img.getWidth() > max_width)
				max_width = img.getWidth();
			if(img.getHeight() > max_height)
				max_height = img.getHeight();
		}
		WIDTH = max_width;
		HEIGHT = max_height;
	}
}
