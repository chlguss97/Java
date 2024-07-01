import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	
	public static void main(String[] args) {
		
		// Java GUI 프로그래밍  -- Swing APIs 이용하기
		
		//1. 최상위 컨테이너 생성
		JFrame frame= new JFrame("Swing GUI");
		frame.setSize(500, 400);
		
		// 기본적으로 JFrame 컨테이너는 컴포넌트들을 배치해주는 배치관리자를 보유하고 있음.
		// JFrame은 기본적으로 BorderLayout 이라는 배치관리자가 설정되어 있음.
		// 그래서 가장 쉽게 배치할 수 있는 FlowLayout 으로 배치관리자를 변경설정하기
		frame.setLayout(new FlowLayout());
		
		//2. 컴포넌트 추가
		JButton b1= new JButton();
		b1.setText("Button #1");
		
		// 컨테이너에 추가
		frame.add(b1);
		
		JButton b2= new JButton("버튼 #2");
		frame.add(b2);
		
		// JLabel - 글씨를 보여주는 컴포넌트
		JLabel label= new JLabel("This is Label");
		frame.add(label);
		
		// JTextField - 사용자로부터 글씨를 입력받을 수 있는 컴포넌트
		JTextField tf= new JTextField(20); //최소 20글자 사이즈..
		frame.add(tf);
		
		// 이미지 - 이미지용 컴포넌트가 없음.
		// JLabel에 아이콘(이미지)을 보여줄 수 있는 기능이 있음. 이를 활용!
		
		// .png/.jpg 같은 이미지파일을 stream을 통해 자바에서 사용할 수 있도록
		// 가져와 주는 클래스 ImageIcon
		ImageIcon icon= new ImageIcon("images/ms19.png"); //파일의 경로를 생성자파라미터로 전달
		
		// ImageIcon를 보여줄 액자 컨포넌트 만들기
		JLabel imgLabel= new JLabel();
		imgLabel.setIcon(icon);
		
		// 이미지 리사이징
		// 아이콘에서 이미지만 추출하기
		Image img= icon.getImage();
		// 뽑아온 이미지를 원하는 사이즈로 새롭게 만들기
		Image img2= img.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
		// JLabel 액자에 이미지를 넣기위해 아이콘으로 만들기
		ImageIcon icon2= new ImageIcon(img2);
		// 새로만든 아이콘을 기존 액자에 설정
		imgLabel.setIcon(icon2);
		
		frame.add(imgLabel);
		
		//3. 화면에 보이도록 설정
		// swing으로 만든 frame창은 x버튼을 누르면 자동으로 꺼지지만 프로그램은 종료되지 않음
		// x버튼을 누르면 프로그램도 같이 종료되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 150);
		frame.setVisible(true);
		
		
	}

}
