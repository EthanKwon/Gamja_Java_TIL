package gui_ex01;

import javax.swing.*;

//상속을 통해 구현
public class FrameTest_Basic extends JFrame {
	
	public FrameTest_Basic() {
		//프레인 설정의 기본 틀
		setLocation(200, 300); 		//프레임 창 위치 지정
		setTitle("Gamja Title");	//프레임 창 이름 지정
		setSize(300,500);			//프레임 창의 크기
		setResizable(false);		//프레임 창 크기조절 가능여부 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//프레임 종료시 백그라운드 동시 종료 설정
		setVisible(true);			//프레임 창 생성
		
	}
	public static void main(String[] args) {
		new FrameTest_Basic();
	}

}
