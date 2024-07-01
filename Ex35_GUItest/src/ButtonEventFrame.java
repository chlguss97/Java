import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEventFrame extends JFrame{
	
	//컴포넌트의 참조변수는 가급적 멤버변수로 ...
	JButton btn;
	JLabel label;
	
	JLabel imgLabel;
	JButton btn2;
	
	int num=0;
	
	//constructor
	public ButtonEventFrame() {
		this.setSize(400, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 50);
		setTitle("버튼 클릭 이벤트 처리 실습");
		
		//배치관리자 설정 
		setLayout(new FlowLayout());
		
		//# 버튼 클릭하여 Label 글씨 변경해보기
		
		// JButton과 JLabel을 하나씩 추가..
		// 화면에 보이는 컴포넌트들의 참조변수는 지역변수로 만들면 좋지 않음.
		// 이 Frame 클래스영역 전체에서 마음대로 사용하려면..멤버변수로 만들것을 권장함
		//JButton btn= new JButton("change text");
		//JLabel label= new JLabel("Hello world");
		btn= new JButton("change text");
		label= new JLabel("Hello world");
						
		// JFrame에 컴포넌트를 추가하기
		add(btn);
		add(label);		 
		
		// 버튼을 클릭했을 때 반응하기..
		// 버튼의 클릭(click)이벤트를 듣는 리스너(Listener)객체 생성 및 버튼 설정!
		//ActionListener listener= new ActionListener(); //리스너는 인터페이스여서 추상메소드가 있어서 객체생성불가
		// 인터페이스안에 있는 추상메소드를 구현하는 클래스를 설계하고 이를 객체로 만들어야 함
		//ClickListener listener= new ClickListener();
		ActionListener listener= new ClickListener();
		
		//버튼에 리스너를 추가하기..
		btn.addActionListener(listener);
		
		//이미지 변경해보기
		ImageIcon icon= new ImageIcon("images/ms18.png");
		//이미지 리사이징
		Image img= icon.getImage();
		img= img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		icon= new ImageIcon(img);
		
		imgLabel= new JLabel(icon);
		btn2= new JButton("이미지 변경하기");
				
		add(imgLabel);
		add(btn2);	
		
		// btn2 버튼을 클릭했을때 반응하는 리스너객체를 생성
		// ActionListener 인터페이스를 구현하는 또 다른 클래스를 설계해야 하지만..
		// 또 이너클래스를 만들려니..짜증... 그래서 이름없는 클래스로 설계하기- 익명클래스
		ActionListener listener2= new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("클릭되었음!!");
				
				Image i= new ImageIcon("images/ms19.png").getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(i));
			}
		};
		
		btn2.addActionListener(listener2);
		
		
		setVisible(true);		
	}//constructor ....	
	
	
	//inner class.
	class ClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("clicked!!");
			
			//Frame에 붙어 있는 Label컴포넌트의 글씨를 변경.
			num++;			
			label.setText(""+num);
			
		}		
	}

}//Frame class...




