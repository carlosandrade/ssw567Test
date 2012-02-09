import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChandlerTriangle extends JFrame{
	private JLabel lblSide1,lblSide2,lblSide3;
	private JTextArea txtSide1,txtSide2,txtSide3;
	private JButton btnCheck,btnClear,btnExit;
	public ChandlerTriangle (){
		super();
		this.setBounds(200, 100, 320, 120);
		lblSide1=new JLabel();
		txtSide1=new JTextArea();
		lblSide2=new JLabel();
		txtSide2=new JTextArea();
		lblSide3=new JLabel();
		txtSide3=new JTextArea();
		lblSide1.setBounds(10, 10, 35, 20);
		txtSide1.setBounds(55, 10, 35, 20);
		lblSide2.setBounds(100, 10, 35, 20);
		txtSide2.setBounds(145, 10, 35, 20);
		lblSide3.setBounds(190, 10, 35, 20);
		txtSide3.setBounds(235, 10, 35, 20);
		lblSide1.setText("Side 1");
		lblSide2.setText("Side 2");
		lblSide3.setText("Side 3");
		btnCheck=new JButton();
		btnClear=new JButton();
		btnExit=new JButton();
		btnCheck.setBounds(10, 45, 75, 20);
		btnCheck.setText("Check");
		btnClear.setBounds(110, 45, 75, 20);
		btnClear.setText("Clear");
		btnExit.setBounds(210, 45, 75, 20);
		btnExit.setText("Exit");
		Container container=this.getContentPane();
		container.setLayout(null);
		container.add(lblSide1);
		container.add(lblSide2);
		container.add(lblSide3);
		container.add(txtSide1);
		container.add(txtSide2);
		container.add(txtSide3);
		container.add(btnCheck);
		container.add(btnClear);
		container.add(btnExit);
		btnCheck.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				check();
			}
		});
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear();
			}
		});
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exit();
			}
		});
	}
	private void check(){
		JOptionPane.showMessageDialog(this, checkResultMessage(txtSide1.getText(),txtSide2.getText(),txtSide3.getText()));
	}
	public String checkResultMessage(String s1, String s2, String s3){
		String message="";
		try{
			float side1=Float.parseFloat(s1);
			float side2=Float.parseFloat(s2);
			float side3=Float.parseFloat(s3);
			if(!(side2-side1<side3&&side1-side2<side3&&side1+side2>side3)){
				return "Not a triangle.";
			}else{
				if(side1==side2||side2==side3||side3==side1){
					if(side1==side2&&side2==side3){
						return "This triangle is equilateral.";
					}else{
						message+="isosceles.";
					}
				}else{
					message+="scalene.";
				}
				if(isRightTriangle(side1,side2,side3)){
					return "This triangle is right "+message;
				}else{
					return "This triangle is "+message;
				}
			}
			}catch(NumberFormatException e){
				return "Invalid input number.";
			}
	}
	private boolean isRightTriangle(float side1, float side2, float side3){
		float max=side1;
		if(side2>max) max=side2;
		if(side3>max) max=side3;
		if(Math.abs(Math.sqrt(side3*side3+side2*side2+side1*side1-max*max)-max)/max<0.01){
			return true;
		}else{
			return false;
		}
	}
	private void clear(){
		txtSide1.setText("");
		txtSide2.setText("");
		txtSide3.setText("");
	}
	private void exit(){
		System.exit(0);
	}
	public static void main(String args[]){
		new ChandlerTriangle().setVisible(true);
	}
}
