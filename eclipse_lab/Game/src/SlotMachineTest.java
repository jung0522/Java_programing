import java.awt.*;

import java.awt.event.*;
import javax.swing.*;







class MyCounter extends JPanel implements ActionListener { 
   private JLabel[] Labels; 
   private JButton button; 
   private int[] Numbers; 
   private Timer timer;
   private JLabel result;
   int win = 0;
   int lose = 0;
   int count = 0;
    
   public MyCounter() { 
	   
      setLayout(null);
      setBackground (Color.black);
      int width = 1320;
	  int height = 750;
	  setPreferredSize (new Dimension(width, height));
	  
	  JLabel label1 = new JLabel("<html>STAGE1: 슬롯 머신 게임<br><br>");
	  label1.setForeground(Color.white);
	  label1.setFont(new Font("모리스9",Font.BOLD,30));
	  label1.setBounds(500, -300, 1200, 700);
	  add(label1);
	  
	  JLabel label2 = new JLabel( "<html>승리 조건: 계속해서 숫자가 바뀌는 <br>"
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;슬롯 머신을 멈춰서<br>"
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;다음의 조합을 5번을 만들면 승리!<br>"
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;기회는 총 10번!<br><br>"
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Combination List<br>"
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;One pair: 숫자가 한 쌍이 같은 경우<br>"
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Straight: 숫자가 차례로 이어지는 경우<br>" 
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Reverse: 숫자가 반대로 이어지는 경우<br>" 
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Trips: 3개의 숫자가 모두 같은 경우<br>" 
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Odd nums: 숫자가 모두 홀수인 경우<br>" 
				
				+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<html> &nbsp;&nbsp&nbsp;Even nums: 숫자가 모두 짝수인 경우<br>" 
				+ "");
		label2.setForeground(Color.white);
		label2.setFont(new Font("모리스9",Font.BOLD,22));
		label2.setBounds(10, -150, 1200, 700);
		add(label2);
       
      Labels = new JLabel[3]; 
      Numbers = new int[3];
   
      

      for (int i = 0; i < 3; i++) { 
         Labels[i] = new JLabel("" + Numbers[i]); 
         Labels[i].setForeground(Color.white);
         Labels[i].setFont(new Font("모리스9",Font.BOLD,180));
		 Labels[i].setBounds((i*100)+500, 100, 200, 200);

        add(Labels[i]);

       }
      
      
     
      
       timer = new Timer( 100, new TimerListener() );
       timer.start();


      button = new JButton("스탑"); 
      button.setFont(new Font("모리스9",Font.BOLD,50));
      button.setBounds(510, 550, 300, 60);

     add(button);

      button.addActionListener(this); 
      
        result = new JLabel("Combination", JLabel.CENTER);
        result.setForeground(Color.white);
        result.setFont(new Font("모리스9",Font.BOLD,70));
        result.setBounds(410, 350, 500, 200);
		add(result);
    
   }



   public void actionPerformed(ActionEvent event) { 
	   
	   count++;
	   if (count%2 != 0) {
		   timer.stop();
	       button.setText("Spin!");
	      
	       if ( ( Numbers[0] == Numbers[1] ) ||
	    		( Numbers[1] == Numbers[2] ) ||  
	    		( Numbers[0] == Numbers[2] ) ) 
	       {
	    	   result.setText("one pair");
	    	   win++;
	        	
	       }
	       
	       else  if ( ( Numbers[0] + 1 == Numbers[1]  ) &&
		    		( Numbers[1] + 1 == Numbers[2] ) )
		       {
		    	   result.setText("Straight");
		    	   win++;
		        	
		       }
	       else  if ( ( Numbers[0] == Numbers[1]  ) &&
		    		( Numbers[1] == Numbers[2] ) )
		       {
		    	   result.setText("Trips");
		    	   win++;
		        	
		       }
	       else if ( ( Numbers[0] % 2 != 0 ) &&
		    		( Numbers[1] % 2 != 0 ) &&
		    		( Numbers[2] % 2 != 0 ) ) 
		       {
		    	   result.setText("Odd nums");
		    	   win++;
		        	
		       }
	       else if ( ( Numbers[0] % 2 == 0 ) &&
		    		( Numbers[1] % 2 == 0 ) &&
		    		( Numbers[2] % 2 == 0 ) ) 
		       {
		    	   result.setText("Even nums");
		    	   win++;
		        	
		       }
	       else  if ( ( Numbers[2] + 1 == Numbers[1]  ) &&
		    		( Numbers[1] + 1 == Numbers[0] ) )
		       {
		    	   result.setText("Reverse");
		    	   win++;
		        	
		       }
	       else
	       {
	    	   result.setText("Miss");
	    	   lose++;
	       }
	       
	   }
	   else {
	   timer.start();
	   button.setText("Stop!");
	   result.setText("Combination");
	   }
      
   } 
   private class TimerListener implements ActionListener 
	{
		/**
		 * 잠시 대기후 다음 판 허용 
		 */
		public void actionPerformed( ActionEvent event ) 
		{
					
			for (int i = 0; i < 3; i++) { 
		         Numbers[i] = (int) (Math.random() * 10);

		         Labels[i].setText(""+Numbers[i]);
		         
		         }
			
			
			
		}
	}
}



public class SlotMachineTest { 
   public static void main(String[] args) { 
	   JFrame frame = new JFrame("슬롯 머신");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyCounter panels = new MyCounter();
		frame.setContentPane(panels);
		frame.pack();
		frame.setVisible(true);
		
   } 
}