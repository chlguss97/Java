import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGameFrame extends JFrame{
	
	// 화면을 구성하는 컴포넌트객체들의 참조변수는 가급적 멤버변수로..
	JTextField tf;
	JButton btn;
	JLabel label;
	
	// 맞춰야할 정답 숫자를 가진 변수
	int com;
	
	//constructor
	public NumberGameFrame() {
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("숫자 맞추기 게임");
		setLocation(600,  150);
		
		setLayout(new FlowLayout());
		
		
		tf= new JTextField(15);
		tf.setHorizontalAlignment(JTextField.CENTER);
		
		btn= new JButton("확인");
		label= new JLabel("0~99 중 랜덤한 숫자를 맞춰보세요.");
		
		add(tf);
		add(btn);
		add(label);
		
		//컴퓨터가 만들 랜덤한 정답숫자
		Random rnd= new Random();
		com= rnd.nextInt(100); //0~99
		
		// "확인"버튼이 클릭될 때 TextField에 써있는 글씨(숫자)를 읽어와서
		// 컴퓨터의 랜덤한 정답값(com변수) 와 비교하여 결과를 알려줘야함
		ActionListener listener= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// TextField 에 써있는 글씨(숫자) 얻어오기
				String s= tf.getText();
				// String-->int 변환
				int user= Integer.parseInt(s);
				
				// 얻어온 숫자와 정답 숫자를 비교..
				if( user>com ) {
					label.setText(user+"보다 작습니다.");				
				}else if( user<com) {
					label.setText(user+"보다 큽니다.");
				}else {
					label.setText("축하합니다!! 정답입니다!!");
				}				
				
				
			}
		};
		
		btn.addActionListener(listener);
		
		
		setVisible(true);
	}

}
