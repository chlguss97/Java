import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	int num;
	
	//constructor - 생성자
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 50);
		setVisible(true);
		
		JButton btn= new JButton("button");
		add(btn);	
	}
}
