import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
public static void main(String[] args) {
Test lol = new Test();
lol.setup();
}
JButton red = new JButton();
JButton yellow = new JButton();
JButton blue = new JButton();
JButton green = new JButton();
public void setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	frame.add(panel);
	panel.add(yellow);
	panel.add(red);
	panel.add(blue);
	panel.add(green);
	frame.setVisible(true);
	frame.pack();
	frame.setTitle("Color Teacher");
	yellow.setBackground(Color.yellow);
	yellow.setOpaque(true);
	red.setBackground(Color.red);
	red.setOpaque(true);
	green.setBackground(Color.green);
	green.setOpaque(true);
	blue.setBackground(Color.blue);
	blue.setOpaque(true);
yellow.addActionListener(this);
red.addActionListener(this);
blue.addActionListener(this);
green.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e)
{
	// TODO Auto-generated method stub
	if(e.getSource().equals(yellow)){
		speak("Yellow");
	}
	if(e.getSource().equals(red)){
		speak("Red");
	}
	if(e.getSource().equals(green)){
		speak("Green");
	}
	if(e.getSource().equals(blue)){
		speak("Blue");
	}
 }
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say "+words);
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}



