/**
 * @(#)PrashyenArithmetic.java
 *
 * PrashyenArithmetic Applet application
 *
 * @author 
 * @version 1.00 2016/12/1
 */
 
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.util.Collections;

public class PrashyenArithmetic extends  java.applet.Applet implements Runnable {
		int frame, delay, a=0;
	
	Image back, ball, ball1, movball, ball3, player, math, math1, math2;
	
	Thread animator;
	
	Dimension offDimension;
	Image offImage;
	Graphics offGraphics;
	
    TextField score1=new TextField(10);
    TextField avgs=new TextField(10);
    
    TextField c71=new TextField(10);
    TextField c72=new TextField(10);
    TextField c73=new TextField(10);
    TextField c74=new TextField(10);
    TextField c75=new TextField(10);
    TextField c76=new TextField(10);
    TextField c77=new TextField(10);
    TextField c78=new TextField(10);
    TextField c79=new TextField(10);
    TextField c710=new TextField(10);
    
    
    TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	
	TextField txt1=new TextField(10);//Q1
	TextField user1=new TextField(10);
	TextField comment1=new TextField(10);
	
	TextField txt2=new TextField(10);//Q2
	TextField user2=new TextField(10);
	TextField comment2=new TextField(10);
	
	TextField txt3=new TextField(10);//Q3
	TextField user3=new TextField(10);
	TextField comment3=new TextField(10);
	
	TextField txt4=new TextField(10);//Q4
	TextField user4=new TextField(10);
	TextField comment4=new TextField(10);
	
	TextField txt5=new TextField(10);//Q5
	TextField user5=new TextField(10);
	TextField comment5=new TextField(10);
	
	TextField txt6=new TextField(10);//Q6
	TextField user6=new TextField(10);
	TextField comment6=new TextField(10);
	
	TextField txt7=new TextField(10);//Q7
	TextField user7=new TextField(10);
	TextField comment7=new TextField(10);
	
	TextField txt8=new TextField(10);//Q8
	TextField user8=new TextField(10);
	TextField comment8=new TextField(10);
	
	TextField txt9=new TextField(10);//Q9
	TextField user9=new TextField(10);
	TextField comment9=new TextField(10);
	
	TextField txt10=new TextField(10);//Q10
	TextField user10=new TextField(10);
	TextField comment10=new TextField(10);
	

String input2 = JOptionPane.showInputDialog("Welcome to Score Hero! Please enter your name.");
String name = input2;
	
	
	double avg1 = 0;
	int score=0,a1,b1,a2,b2,a3,b3,a4,b4,a5,b5,a6,b6,a7,b7,a8,b8,c8,a9,b9,c9,a10,b10,c10, sum1 =0,sum2 =0,sum3 =0,sum4 =0,sum5 =0,sum6 =0,sum7 =0,sum8 =0,sum9 =0,sum10 =0;
	String str20, str1,str2,str3,str4,str5,str6,str7,str8,str9,str10  ;
	Button s =(new Button("Start"));
	Button c =(new Button("Check"));
	Button so =(new Button("Start over"));
	Button inst =(new Button("Instructions"));
	Button r =(new Button("Results/Comment"));
	
	public void init() {
		String str=getParameter("fps");
		int fps=(str!=null)?Integer.parseInt(str):10;
		delay=100;
		 back = getImage(getDocumentBase(),"back.png");
		ball=getImage(getCodeBase(),"ball.png");
		ball1=getImage(getCodeBase(),"ball1.png");
		movball=getImage(getCodeBase(),"movball.gif");
		ball3=getImage(getCodeBase(),"ball3.gif");
		ball3=getImage(getCodeBase(),"ball3.gif");
		player=getImage(getCodeBase(),"player.png");
		math=getImage(getCodeBase(),"math.png");
		math1=getImage(getCodeBase(),"math1.png");
		math2=getImage(getCodeBase(),"math2.png");

	
	
		add (txt1);//Q1
		add(user1);
		comment1.setText("");
		add(comment1);
		
		add (txt2);//Q2
		add(user2);
		comment2.setText("");
		add(comment2);
		
		add (txt3);//Q3
		add(user3);
		comment3.setText("");
		add(comment3);
		
		add (txt4);//Q4
		add(user4);
		comment4.setText("");
		add(comment4);
		
		add (txt5);//Q5
		add(user5);
		comment5.setText("");
		add(comment5);
		
		add (txt6);//Q6
		add(user6);
		comment6.setText("");
		add(comment6);
		
		add (txt7);//Q7
		add(user7);
		comment7.setText("");
		add(comment7);
		
		add (txt8);//Q8
		add(user8);
		comment8.setText("");
		add(comment8);
		
		add (txt9);//Q9
		add(user9);
		comment9.setText("");
		add(comment9);
		
		add (txt10);//Q10
		add(user10);
		comment10.setText("");
		add(comment10);
		
		add(score1);
		add(avgs);
	
		add(s);
		add(c);
	add(so);
	add(inst);
	add(r);
	add(t1);
	add(t2);
	
	add(c71);
	add(c72);
	add(c73);
	add(c74);
	add(c75);
	add(c76);
	add(c77);
	add(c78);
	add(c79);
	add(c710);
	}
		public void start() {
		animator=new Thread(this);
		animator.start();
	}
	
	public void run() {
	long tm=System.currentTimeMillis();
	while(Thread.currentThread()==animator){
		repaint();
		
		try{tm+=delay;
		Thread.sleep(Math.max(0, tm - System.currentTimeMillis()));
		}catch(InterruptedException e){
			break;
		}
		frame++;
	}
	}
	public void stop() {
	animator=null;
	offImage=null;
	offGraphics=null;
	}
    public void update(Graphics g) {
    Dimension d = size();
    if((offGraphics==null)||(d.width!=offDimension.width)||(d.height!=offDimension.height)){
    	offDimension=d;
    	offImage=createImage(d.width,d.height);
    	offGraphics=offImage.getGraphics();
    }
    offGraphics.setColor(getBackground());
    offGraphics.fillRect(0,0,d.width,d.height);
    offGraphics.setColor(Color.black);
    	paintFrames(offGraphics);
    		g.drawImage(offImage, 0, 0, null);
    	
    }
	
	
	public boolean action(Event evt, Object obj){
		if(evt.target instanceof Button){
			return handleButton((Button) evt.target, (String)obj);
		}return true; }
		
		
		
		
	public boolean handleButton(Button btn, String str){
	
	if (str.equals("Instructions")){ 
		 JOptionPane.showMessageDialog(null,  "Welcome to Scorehero! Start the game by pressing START, then answer all 10 questions by inputing the answer in the textfield below the question.\nAfter completed, check your answers by pressing the check button.\nEach correct answer corresponds to the following scores:\n 0 correct answers = 0 goals\n 1 to 3 correct answers = 1 goals\n 4 to 7 correct answers = 2 goals\n 8 to 10 correct answers = 4 goals\n You can see you results by simplying pressing the button named Results/Comment.\n Try to score 4 goals!\nGame can be reset by pressing START OVER. ");
	}
			 else if (str.equals("Start")){  
				
				t1.setText("3");
				t2.setText("0");
				user1.setText("");//Q1
				a1=(int)(Math.random()*50);
				b1=(int)(Math.random()*10);
				sum1=a1+b1;
				txt1.setText(a1+" + "+ b1+"=?");
				str1=user1.getText();
				
				user2.setText("");//Q2
				a2=(int)(Math.random()*10);
				b2=(int)(Math.random()*50);
				sum2=a2+b2;
				txt2.setText(a2+" + "+ b2+"=?");
				str2=user2.getText();
				
				user3.setText("");//Q3
				a3=(int)(Math.random()*20);
				b3=(int)(Math.random()*20);
				sum3=a3+b3;
				txt3.setText(a3+" + "+ b3+"=?");
				str3=user3.getText();
				
				user4.setText("");//Q4
				a4=(int)(Math.random()*10);
				b4=(int)(Math.random()*10);
				sum4=a4+b4;
				txt4.setText(a4+" + "+ b4+"=?");
				str4=user4.getText();
				
				user5.setText("");//Q5
				a5=(int)(Math.random()*10);
				b5=(int)(Math.random()*10);
				sum5=a5+b5;
				txt5.setText(a5+" + "+ b5+"=?");
				str5=user5.getText();
				
				user6.setText("");//Q6
				a6=(int)(Math.random()*10);
				b6=(int)(Math.random()*10);
				sum6=a6+b6;
				txt6.setText(a6+" + "+ b6+"=?");
				str6=user6.getText();
				
				user7.setText("");//Q7
				a7=(int)(Math.random()*10);
				b7=(int)(Math.random()*10);
				sum7=a7+b7;
				txt7.setText(a7+" + "+ b7+"=?");
				str7=user7.getText();
				
				user8.setText("");//Q8
				a8=(int)(Math.random()*10);
				b8=(int)(Math.random()*10);
				c9=(int)(Math.random()*10);
				sum8=a8+b8*c8;
				txt8.setText(a8+" + "+ b8+" x "+ c8+"=?");
				str8=user8.getText();
				
				user9.setText("");//Q9
				a9=(int)(Math.random()*10);
				b9=(int)(Math.random()*10);
				c9=(int)(Math.random()*10);
				sum9=a9+b9*c9;
				txt9.setText(a9+" + "+ b9+" x "+ c9+"=?");
				str9=user9.getText();
				
				user10.setText("");//Q10
				a10=(int)(Math.random()*10);
				b10=(int)(Math.random()*10);
				c10=(int)(Math.random()*10);
				sum10=a10+b10*c10;
				txt10.setText(a10+" + "+ b10+" x "+ c10+"=?");;
				str10=user10.getText();
				
				
			 
				
				return true;}
				
				else if(str.equals("Check")){
					str1=user1.getText();
					str2=user2.getText();
					str3=user3.getText();
					str4=user4.getText();
					str5=user5.getText();
					str6=user6.getText();
					str7=user7.getText();
					str8=user8.getText();
					str9=user9.getText();
					str10=user10.getText();
					score=0;
				
					
					
					if(String.valueOf(str1).equals(String.valueOf(sum1))){//Q1
						c71.setBackground(Color.green);
						comment1.setText("Correct!");
						score=score+1;
						
					}
					else {comment1.setText("Try Again!"); c71.setBackground(Color.red);}
					
					if(String.valueOf(str2).equals(String.valueOf(sum2))){//Q2
						comment2.setText("Correct!");
						score=score+1;
						c72.setBackground(Color.green);
					}
					else {comment2.setText("Try Again!");c72.setBackground(Color.red);}
					
					if(String.valueOf(str3).equals(String.valueOf(sum3))){//Q3
						comment3.setText("Correct!");
						score=score+1;
						c73.setBackground(Color.green);
					}
					else {comment3.setText("Try Again!");
					c73.setBackground(Color.red);}
					
					if(String.valueOf(str4).equals(String.valueOf(sum4))){//Q4
						comment4.setText("Correct!");
						score=score+1;
						c74.setBackground(Color.green);
					}
					else {comment4.setText("Try Again!");c74.setBackground(Color.red);}
					
					if(String.valueOf(str5).equals(String.valueOf(sum5))){//Q5
						comment5.setText("Correct!");
						score=score+1;
						c75.setBackground(Color.green);
					}
					else {comment5.setText("Try Again!");c75.setBackground(Color.red);}
					
					if(String.valueOf(str6).equals(String.valueOf(sum6))){//Q6
						comment6.setText("Correct!");
						score=score+1;
						c76.setBackground(Color.green);
					}
					else {c76.setBackground(Color.red);comment6.setText("Try Again!");}
					
					if(String.valueOf(str7).equals(String.valueOf(sum7))){//Q7
						comment7.setText("Correct!");
						score=score+1;
						c77.setBackground(Color.green);
					}
					else {c77.setBackground(Color.red);comment7.setText("Try Again!");}
					
					if(String.valueOf(str8).equals(String.valueOf(sum8))){//Q8
						comment8.setText("Correct!");
						score=score+1;
						c78.setBackground(Color.green);
					}
					else {c78.setBackground(Color.red);comment8.setText("Try Again!");}
					
					if(String.valueOf(str9).equals(String.valueOf(sum9))){//Q9
						comment9.setText("Correct!");
						score=score+1;
						c79.setBackground(Color.green);
					}
					else {c79.setBackground(Color.red);comment9.setText("Try Again!");}
					
					if(String.valueOf(str10).equals(String.valueOf(sum10))){//Q10
						comment10.setText("Correct!");
						score=score+1;
						c710.setBackground(Color.green);
					}
					else {c710.setBackground(Color.red);comment10.setText("Try Again!");}
					
					score1.setText("");//score
					score=(int)(score);
					score1.setText("   "+score+"/10");
					str20=score1.getText();
					avg1= (score/10.0)*100.00;
					avgs.setText("");//average
					double x=(int)(avg1);
					avgs.setText("   "+x+"%");
					str20=avgs.getText();
					
					
					return true;}
					
				else if (str.equals("Start over")){
					comment1.setText("");
					comment2.setText("");
					comment3.setText("");
					comment4.setText("");
					comment5.setText("");
					comment6.setText("");
					comment7.setText("");
					comment8.setText("");
					comment9.setText("");
					comment10.setText("");
					score1.setText("");//score
					avgs.setText("   ");
					c71.setBackground(Color.white);
					c72.setBackground(Color.white);
					c73.setBackground(Color.white);
					c74.setBackground(Color.white);
					c75.setBackground(Color.white);
					c76.setBackground(Color.white);
					c77.setBackground(Color.white);
					c78.setBackground(Color.white);
					c79.setBackground(Color.white);
					c710.setBackground(Color.white);
					score =0;
					
						user1.setText("");//Q1
				a1=(int)(Math.random()*50);
				b1=(int)(Math.random()*10);
				sum1=a1+b1;
				txt1.setText(a1+" + "+ b1+"=?");
				str1=user1.getText();
				
				user2.setText("");//Q2
				a2=(int)(Math.random()*10);
				b2=(int)(Math.random()*50);
				sum2=a2+b2;
				txt2.setText(a2+" + "+ b2+"=?");
				str2=user2.getText();
				
				user3.setText("");//Q3
				a3=(int)(Math.random()*20);
				b3=(int)(Math.random()*20);
				sum3=a3+b3;
				txt3.setText(a3+" + "+ b3+"=?");
				str3=user3.getText();
				
				user4.setText("");//Q4
				a4=(int)(Math.random()*10);
				b4=(int)(Math.random()*10);
				sum4=a4+b4;
				txt4.setText(a4+" + "+ b4+"=?");
				str4=user4.getText();
				
				user5.setText("");//Q5
				a5=(int)(Math.random()*10);
				b5=(int)(Math.random()*10);
				sum5=a5+b5;
				txt5.setText(a5+" + "+ b5+"=?");
				str5=user5.getText();
				
				user6.setText("");//Q6
				a6=(int)(Math.random()*10);
				b6=(int)(Math.random()*10);
				sum6=a6+b6;
				txt6.setText(a6+" + "+ b6+"=?");
				str6=user6.getText();
				
				user7.setText("");//Q7
				a7=(int)(Math.random()*10);
				b7=(int)(Math.random()*10);
				sum7=a7+b7;
				txt7.setText(a7+" + "+ b7+"=?");
				str7=user7.getText();
				
				user8.setText("");//Q8
				a8=(int)(Math.random()*10);
				b8=(int)(Math.random()*10);
				c8=(int)(Math.random()*7);
				sum8=a8+b8*c8;
				txt8.setText(a8+" + "+ b8+" x "+ c8+"=?");
				str8=user8.getText();
				
				user9.setText("");//Q9
				a9=(int)(Math.random()*10);
				b9=(int)(Math.random()*10);
				c9=(int)(Math.random()*10);
				sum9=a9+b9*c9;
				txt9.setText(a9+" + "+ b9+" x "+ c9+"=?");
				str9=user9.getText();
				
				user10.setText("");//Q10
				a10=(int)(Math.random()*10);
				b10=(int)(Math.random()*10);
				c10=(int)(Math.random()*10);
				sum10=a10+b10*c10;
				txt10.setText(a10+" + "+ b10+" x "+ c10+"=?");;
				str10=user10.getText();
				
				
			 
				
				return true;}
				
				else if(str.equals("Check")){
					str1=user1.getText();
					str2=user2.getText();
					str3=user3.getText();
					str4=user4.getText();
					str5=user5.getText();
					str6=user6.getText();
					str7=user7.getText();
					str8=user8.getText();
					str9=user9.getText();
					str10=user10.getText();
					score=0;
					
							c71.setBackground(Color.white);
					c72.setBackground(Color.white);
					c73.setBackground(Color.white);
					c74.setBackground(Color.white);
					c75.setBackground(Color.white);
					c76.setBackground(Color.white);
					c77.setBackground(Color.white);
					c78.setBackground(Color.white);
					c79.setBackground(Color.white);
					c710.setBackground(Color.white);
					
					
					if(String.valueOf(str1).equals(String.valueOf(sum1))){//Q1
						comment1.setText("Correct!");
						score=score+1;
						c71.setBackground(Color.green);
					}
					else {comment1.setText("Try Again!"); c71.setBackground(Color.red);}
					
					if(String.valueOf(str2).equals(String.valueOf(sum2))){//Q2
						comment2.setText("Correct!");
						score=score+1;
						c72.setBackground(Color.green);
					}
					else{ comment2.setText("Try Again!");c72.setBackground(Color.red);}
					
					if(String.valueOf(str3).equals(String.valueOf(sum3))){//Q3
						comment3.setText("Correct!");
						score=score+1;
						c73.setBackground(Color.green);
					}
					else {comment3.setText("Try Again!");c73.setBackground(Color.red);}
					
					if(String.valueOf(str4).equals(String.valueOf(sum4))){//Q4
						comment4.setText("Correct!");
						score=score+1;
						c74.setBackground(Color.green);
					}
					else {comment4.setText("Try Again!");c74.setBackground(Color.red);}
					
					if(String.valueOf(str5).equals(String.valueOf(sum5))){//Q5
						comment5.setText("Correct!");
						score=score+1;
						c75.setBackground(Color.green);
					}
					else {comment5.setText("Try Again!");c75.setBackground(Color.red);}
					
					if(String.valueOf(str6).equals(String.valueOf(sum6))){//Q6
						comment6.setText("Correct!");
						score=score+1;
						c76.setBackground(Color.green);
					}
					else {comment6.setText("Try Again!");c76.setBackground(Color.red);}
					
					if(String.valueOf(str7).equals(String.valueOf(sum7))){//Q7
						comment7.setText("Correct!");
						score=score+1;
						c77.setBackground(Color.green);
					}
					else {comment7.setText("Try Again!");c77.setBackground(Color.red);}
					
					if(String.valueOf(str8).equals(String.valueOf(sum8))){//Q8
						comment8.setText("Correct!");
						score=score+1;
						c78.setBackground(Color.green);
					}
					else {comment8.setText("Try Again!");c78.setBackground(Color.red);}
					
					if(String.valueOf(str9).equals(String.valueOf(sum9))){//Q9
						comment9.setText("Correct!");
						score=score+1;
						c79.setBackground(Color.green);
					}
					else {comment9.setText("Try Again!");c79.setBackground(Color.red);}
					
					if(String.valueOf(str10).equals(String.valueOf(sum10))){//Q10
						comment10.setText("Correct!");
						score=score+1;
						c710.setBackground(Color.green);
					}
					else {comment10.setText("Try Again!");c710.setBackground(Color.red);}
					
					score1.setText("");//score
					score=(int)(score);
					score1.setText("   "+score+"/10");
					str20=score1.getText();
					avg1= (score/10.0)*100.00;
					avgs.setText("");//average
					double x=(int)(avg1);
					avgs.setText("   "+x+"%");
					str20=avgs.getText();
					
					 
					
					return true;}
					else if (str.equals("Results/Comment")){
						a=100;
						if(score==10){
					 JOptionPane.showMessageDialog(null,  "Congratulations, you have excelled at soccer hero and won the game. You have gotten 10 questions correct");
				

					}
					else if(score==9){
					 JOptionPane.showMessageDialog(null,  "Congratulations, you have excelled at soccer hero and won the game.You have gotten 9 questions correct");
						 
					}
					else if(score==8){
					 JOptionPane.showMessageDialog(null,  "Congratulations, you have excelled at soccer hero and won the game.You have gotten 8 questions correct");
						
					}
						else if(score==7){
						 JOptionPane.showMessageDialog(null,  "Ouh, close game!Your team fell short by a couple of goals. Try again to win.You have gotten 7 questions correct");
						 
					}
						else if(score==6){
						 JOptionPane.showMessageDialog(null,  "Ouh, close game!Your team fell short by a couple of goals. Try again to win.You have gotten 6 questions correct");
						 
					}
						else if(score==5){
						 JOptionPane.showMessageDialog(null,  "Ouh, close game!Your team fell short by a couple of goals. Try again to win.You have gotten 5 questions correct");
						 
					}
						else if(score==4){
						 JOptionPane.showMessageDialog(null,  "Ouh, close game!Your team fell short by a couple of goals. Try again to win.You have gotten 4 questions correct");
						 
					}	else if(score==3){
						 JOptionPane.showMessageDialog(null,  "Nice try, you have lost the game by a large margin, better luck next time! You have gotten 3 questions correct");
						 
					}	else if(score==2){
						 JOptionPane.showMessageDialog(null,  "Nice try, you have lost the game by a large margin, better luck next time! You have gotten 2 questions correct");
						 
					}	else if(score==1){
						 JOptionPane.showMessageDialog(null,  "Nice try, you have lost the game by a large margin, better luck next time! You have gotten 1 questions correct");
						 
					}
					else if(score==0){
						 JOptionPane.showMessageDialog(null,  "Nice try, you have lost the game by a large margin, better luck next time! You have gotten 0 questions correct");
						 
					}}
					
					return true;
		
	}

	

		
		
		
		public void paint(Graphics g){
			
		 
				
		    
		    
		
			txt1.setLocation(100, 225);//Q1
			user1.setLocation(100, 275);
			comment1.setLocation(100, 325);
			c71.setLocation(100, 375);
			
			txt2.setLocation(350, 225);//Q2
			user2.setLocation(350, 275);
			comment2.setLocation(350, 325);
			c72.setLocation(350, 375);
		    
			txt3.setLocation(600, 225);//Q3
			user3.setLocation(600, 275);
			comment3.setLocation(600, 325);
			c73.setLocation(600, 375);
			
			txt4.setLocation(850, 225);//Q4
			user4.setLocation(850, 275);
			comment4.setLocation(850, 325);
			c74.setLocation(850, 375);
			
			txt5.setLocation(1100, 225);//Q5
			user5.setLocation(1100, 275);
			comment5.setLocation(1100, 325);
			c75.setLocation(1100, 375);
			
			txt6.setLocation(100, 525);//Q6
			user6.setLocation(100, 575);
			comment6.setLocation(100, 625);
			c76.setLocation(100, 675);
			
			txt7.setLocation(350, 525);//Q7
			user7.setLocation(350, 575);
			comment7.setLocation(350, 625);
			c77.setLocation(350, 675);
			
			txt8.setLocation(600, 525);//Q8
			user8.setLocation(600, 575);
			comment8.setLocation(600, 625);
			c78.setLocation(600, 675);
			
			txt9.setLocation(850, 525);//Q9
			user9.setLocation(850, 575);
			comment9.setLocation(850, 625);
			c79.setLocation(850, 675);
			
			txt10.setLocation(1100, 525);//Q10
			user10.setLocation(1100, 575);
			comment10.setLocation(1100, 625);
			c710.setLocation(1100, 675);
			
			score1.setLocation(1075, 40);
			avgs.setLocation(1075, 80);
		
			
		    
			s.setLocation(50, 75);
			c.setLocation(100, 75);
			so.setLocation(165, 75);
			inst.setLocation(50, 110);
			r.setLocation(150, 110);
			t1.setLocation(450, 850);
			t2.setLocation(750, 850);
		     
		    update(g);	
	
		
		}


    
	public void paintFrames(Graphics g) {
		
		Dimension d = size();
		int w = back.getWidth(this);
		int h = back.getHeight(this);
			
			if(a==100){
			
				g.drawImage(back, 0, 0, 1264, 905, this);
				g.drawImage(math1, 700, 95, 100, 110, this);
				g.drawImage(math2, 400, 95, 100, 110, this);
				g.drawImage(ball, 25, 200, 225, 225, this);
				g.drawImage(ball, 275, 200, 225, 225, this);
				g.drawImage(ball, 525, 200, 225, 225, this);
				g.drawImage(ball, 775, 200, 225, 225, this);
				g.drawImage(ball, 1025, 200, 225, 225, this);
				g.drawImage(ball, 25, 500, 225, 225, this);
				g.drawImage(ball, 275, 500, 225, 225, this);
				g.drawImage(ball, 525, 500, 225, 225, this);
				g.drawImage(ball, 775, 500, 225, 225, this);
				g.drawImage(ball, 1025, 500, 225, 225, this);
				g.drawImage(player, 900, 680, 225, 225, this);
				g.drawImage(math, 150, 700, 225, 220, this);
				g.setColor(new Color(0,0,0));
				g.drawRect (410,725,500, 270);
				g.fillRect(410,725,500, 270);
				g.setColor(new Color(255,255,255));
				g.drawRect (410,725,500, 270);
			Font	f = new Font ("Algerian", Font.BOLD, 100);
		    	g.setFont(f);
		    	g.setColor(Color.black);
		    	g.drawString("Score Hero", 275, 100);
		    	f = new Font ("Algerian", Font.BOLD, 40);
		    	g.setFont(f);
		    	g.setColor(Color.white);
		    	g.drawString("Scoreboard", 525, 775);
		    	g.setColor(Color.red);
		    	g.drawString("Home", 450, 820);
		    	g.setColor(Color.blue);
		    	g.drawString("Away", 740, 820);
		    
		        
		    	
		    	
		    	
		    		f = new Font ("Algerian", Font.BOLD, 20);
		    	g.setFont(f);
		    	g.setColor(Color.white);
		    	g.drawString("Score: ", 960, 60);
		    	g.drawString("Average: ", 960, 100);
		    	
		    	g.drawString("Name: "+name, 960, 150);
				
				
			
			}
		w=ball1.getWidth(this);
		h=ball1.getHeight(this);

		
	if(score>=8){

	if((w>0)&&(h>0)){
		w+=d.width;
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/5,this);
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/2,this);
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/3,this);
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/4,this);
			 t1.setText("3");
					 t2.setText("4");
	}
	
	}		
   else if(score<=7&&score>=4){

	if((w>0)&&(h>0)){
		w+=d.width;
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/4,this);
		g.drawImage(ball1, d.width-((frame*20)%w),(d.height-h)/2,this);
			 t1.setText("3");
					 t2.setText("2");
		
	}	}
else if(score<=3&&score>=1){
	if((w>0)&&(h>0)){
		w+=d.width;
		g.drawImage(ball1, d.width-((frame*18)%w),(d.height-h)/3,this);
		 t1.setText("3");
					 t2.setText("1");
		
	}	}
else if(score<1){

		 t1.setText("3");
					 t2.setText("0");
		
	}	
	

	

		}}
