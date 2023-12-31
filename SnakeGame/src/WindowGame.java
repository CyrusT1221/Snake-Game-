import javax.swing.JFrame;

public class WindowGame {
	public static final int WIDTH = 600, HEIGHT = 440;
	
	private Board board;
	private JFrame window;
	
	
	public WindowGame() {
		window = new JFrame("SnakeGame");
		window.setSize(WIDTH,HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		board = new Board();
		window.add(board);
		window.addKeyListener(board);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowGame();
	}
}
