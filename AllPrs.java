import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class AllPrs extends JFrame //implements ActionListener
{ 
    JFrame jf,f2,f3,f4;
    JTextField j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
    JTextField j11,j12,j13,j14,j15,j16,j17,j18,j19,j20;
    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jll;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton jb1,jb2,jb3;
    int n,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    int n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
    int i,j,k;
    AllPrs()
    {
    	JFrame jf= new JFrame("All Pairs");
        jll=new JLabel("**ALL PAIRS SHORTEST PATH**");
        Font font1 = new Font("lucida", Font.BOLD, 50);
        jll.setFont(font1);
        jll.setForeground(Color.RED);
        jll.setBounds(500,10,900,100);
        //jf.setBounds(0,50,100,100);
        jl1=new JLabel("Enter no. of vertices : ");
        Font font2 = new Font("lucida", Font.BOLD, 28);
        jl1.setFont(font2);
        jl1.setForeground(Color.BLUE);
        jl1.setBounds(500,120,500,120);

        j1=new JTextField(20);
        j1.setFont(font1);
        j1.setForeground(Color.GREEN);

        j1.setBounds(800,120,150,100);
        jb1=new JButton("Get");
        jb1.setBounds(800,250,150,100);

        jf.add(jl1);
        jf.add(j1);
        jf.add(jb1);
        jf.add(jll);
        //jf.add(j2);

    jb1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae)
    {
            int n=Integer.parseInt(j1.getText());
            //j2.setText(String.valueOf(n));
            JFrame f2 = new JFrame("Store Values");
            if(n==4)
            {
                jb2=new JButton("Solution");

                jl2=new JLabel("Value for 1-1:->");
                jl3=new JLabel("Value for 1-2:->");
                jl4=new JLabel("Value for 1-3:->");
                jl5=new JLabel("Value for 1-4:->");
                jl6=new JLabel("Value for 2-1:->");
                jl7=new JLabel("Value for 2-2:->");
                jl8=new JLabel("Value for 2-3:->");
                jl9=new JLabel("Value for 2-4:->");
                jl10=new JLabel("Value for 3-1:->");
                l1=new JLabel("Value for 3-2:->");
                l2=new JLabel("Value for 3-3:->");
                l3=new JLabel("Value for 3-4:->");
                l4=new JLabel("Value for 4-1:->");
                l5=new JLabel("Value for 4-2:->");
                l6=new JLabel("Value for 4-3:->");
                l7=new JLabel("Value for 4-4:->");

                j2=new JTextField(20);
                j3=new JTextField(20);
                j4=new JTextField(20);
                j5=new JTextField(20);
                j6=new JTextField(20);
                j7=new JTextField(20);
                j8=new JTextField(20);
                j9=new JTextField(20);
                j10=new JTextField(20);
                j11=new JTextField(20);
                j12=new JTextField(20);
                j13=new JTextField(20);
                j14=new JTextField(20);
                j15=new JTextField(20);
                j16=new JTextField(20);
                j17=new JTextField(20);

                Font font3 = new Font("lucida", Font.BOLD, 25);

                jl2.setBounds(10,20,200,50);      
                jl2.setFont(font3);
                jl2.setForeground(Color.RED); 

                jl3.setBounds(10,80,200,50); 
                jl3.setFont(font3);
                jl3.setForeground(Color.RED); 

                jl4.setBounds(10,140,200,50); 
                jl4.setFont(font3);
                jl4.setForeground(Color.RED); 

                jl5.setBounds(10,200,200,50);   
                jl5.setFont(font3);
                jl5.setForeground(Color.RED); 

                jl6.setBounds(10,260,200,50);  
                jl6.setFont(font3);
                jl6.setForeground(Color.RED); 

                jl7.setBounds(10,320,200,50);   
                jl7.setFont(font3);
                jl7.setForeground(Color.RED);  

                jl8.setBounds(10,380,200,50);  
                jl8.setFont(font3);
                jl8.setForeground(Color.RED);    
                jl9.setBounds(10,440,200,50); 
                jl9.setFont(font3);
                jl9.setForeground(Color.RED);  
                jl10.setBounds(300,20,200,50);
                jl10.setFont(font3);
                jl10.setForeground(Color.RED); 
                l1.setBounds(300,80,200,50);
                l1.setFont(font3);
                l1.setForeground(Color.RED);                                      
                l2.setBounds(300,140,200,50);
                l2.setFont(font3);
                l2.setForeground(Color.RED);                
                l3.setBounds(300,200,200,50);
                l3.setFont(font3);
                l3.setForeground(Color.RED);                        
                l4.setBounds(300,260,200,50);
                l4.setFont(font3);
                l4.setForeground(Color.RED);                       
                l5.setBounds(300,320,200,50);
                l5.setFont(font3);
                l5.setForeground(Color.RED);                     
                l6.setBounds(300,380,200,50);
                l6.setFont(font3);
                l6.setForeground(Color.RED);                    
                l7.setBounds(300,440,200,50);
                l7.setFont(font3);
                l7.setForeground(Color.RED);
                j2.setBounds(200,20,50,50); 
                j2.setFont(font3);
                j2.setForeground(Color.GREEN);
                j3.setBounds(200,80,50,50);  
                j3.setFont(font3);
                j3.setForeground(Color.GREEN);
                j4.setBounds(200,140,50,50); 
                j4.setFont(font3);
                j4.setForeground(Color.GREEN);
                j5.setBounds(200,200,50,50); 
                j5.setFont(font3);
                j5.setForeground(Color.GREEN);
                j6.setBounds(200,260,50,50);
                j6.setFont(font3);
                j6.setForeground(Color.GREEN);
                j7.setBounds(200,320,50,50); 
                j7.setFont(font3);
                j7.setForeground(Color.GREEN);
                j8.setBounds(200,380,50,50);
                j8.setFont(font3);
                j8.setForeground(Color.GREEN);               
                j9.setBounds(200,440,50,50);
                j9.setFont(font3);
                j9.setForeground(Color.GREEN);
                j10.setBounds(500,20,50,50);
                j10.setFont(font3);
                j10.setForeground(Color.GREEN);                
                 j11.setBounds(500,80,50,50);
                 j11.setFont(font3);
                j11.setForeground(Color.GREEN);
                j12.setBounds(500,140,50,50); 
                j12.setFont(font3);
                j12.setForeground(Color.GREEN);
                j13.setBounds(500,200,50,50);
                j13.setFont(font3);
                j13.setForeground(Color.GREEN);               
                j14.setBounds(500,260,50,50);
                j14.setFont(font3);
                j14.setForeground(Color.GREEN);
                j15.setBounds(500,320,50,50); 
                j15.setFont(font3);
                j15.setForeground(Color.GREEN);
                j16.setBounds(500,380,50,50);  
                j16.setFont(font3);
                j16.setForeground(Color.GREEN);
                j17.setBounds(500,440,50,50); 
                j17.setFont(font3);
                j17.setForeground(Color.GREEN);
                jb2.setBounds(20,550,100,70);
                f2.add(jl2);               
                f2.add(jl10);                
                f2.add(jl3);               
                f2.add(l1);                
                f2.add(jl4);              
                f2.add(l2);               
                f2.add(jl5);               
                f2.add(l3);               
                f2.add(jl6);                
                f2.add(l4);                
                f2.add(jl7);                
                f2.add(l5);                
                f2.add(jl8);               
                f2.add(l6);               
                f2.add(jl9);               
                f2.add(l7);
               f2.add(j2);              
                f2.add(j3);                
                f2.add(j4);                
                f2.add(j5);               
                f2.add(j6);              
                f2.add(j7);               
                f2.add(j8);              
                f2.add(j9);               
                f2.add(j10);
                f2.add(j11);
                f2.add(j12);
                f2.add(j13);
                f2.add(j14);
                f2.add(j15);
                f2.add(j16);
                f2.add(j17);
                f2.add(jb2);
                jb2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae)
                   {
                        int n1=Integer.parseInt(j2.getText());
                        int n2=Integer.parseInt(j3.getText());
                        int n3=Integer.parseInt(j4.getText());
                        int n4=Integer.parseInt(j5.getText());
                        int n5=Integer.parseInt(j6.getText());
                        int n6=Integer.parseInt(j7.getText());
                        int n7=Integer.parseInt(j8.getText());
                        int n8=Integer.parseInt(j9.getText());
                        int n9=Integer.parseInt(j10.getText());
                        int n10=Integer.parseInt(j11.getText());
                        int n11=Integer.parseInt(j12.getText());
                        int n12=Integer.parseInt(j13.getText());
                        int n13=Integer.parseInt(j14.getText());
                        int n14=Integer.parseInt(j15.getText());
                        int n15=Integer.parseInt(j16.getText());
                        int n16=Integer.parseInt(j17.getText());
                        
                        JFrame f3= new JFrame("Solution..");

                        int[][] cost=new int[10][10];
                        int[][] a=new int[10][10];
                        int[][] b=new int[10][10];
                        int[][] p=new int[10][10];
                        b[1][1]=n1;
                        b[1][2]=n2;
                        b[1][3]=n3;
                        b[1][4]=n4;
                        b[2][1]=n5;
                        b[2][2]=n6;
                        b[2][3]=n7;
                        b[2][4]=n8;
                        b[3][1]=n9;
                        b[3][2]=n10;
                        b[3][3]=n11;
                        b[3][4]=n12;
                        b[4][1]=n13;
                        b[4][2]=n14;
                        b[4][3]=n15;
                        b[4][4]=n16;

                        for(i=1;i<=4;i++)
                        {
                            for(j=1;j<=4;j++)
                            {
                                cost[i][j]=b[i][j];
                                p[i][j]=999;
                                a[i][j]=0;
                            }
                        }
                       
                        for(k=1;k<=n;k++)
                           for(i=1;i<=n;i++)
                               for(j=1;j<=n;j++)
                                   if(i==j){
                                      a[i][j]=0;
                                    }
                                    
                                    else{
                                        if(cost[i][j]<(cost[i][k]+cost[k][j]))
                                       {
                                           a[i][j]=cost[i][j];
                                        }
                                        
                                        else{
                                            cost[i][j]=cost[i][k]+cost[k][j];
                                            a[i][j]=cost[i][j];
                                        }
                                    }

                        l1=new JLabel("**Adjacency closure is **");
                        l2=new JLabel(a[1][1]+"   "+a[1][2]+"   "+a[1][3]+"   "+a[1][4]);
                        l3=new JLabel(a[2][1]+"   "+a[2][2]+"   "+a[2][3]+"   "+a[2][4]);
                        l4=new JLabel(a[3][1]+"   "+a[3][2]+"   "+a[3][3]+"   "+a[3][4]);
                        l5=new JLabel(a[4][1]+"   "+a[4][2]+"   "+a[4][3]+"   "+a[4][4]);
                         Font font4 = new Font("lucida", Font.BOLD, 30); 
                        l1.setBounds(500,30,900,40);
                        l1.setFont(font4);
                        l1.setForeground(Color.RED); 

                        l2.setBounds(685,80,250,50);
                        l2.setFont(font4);
                        l2.setForeground(Color.GREEN); 

                        l3.setBounds(685,140,250,50);
                        l3.setFont(font4);
                        l3.setForeground(Color.GREEN); 

                        l4.setBounds(685,200,250,50);
                        l4.setFont(font4);
                        l4.setForeground(Color.GREEN);

                        l5.setBounds(685,260,250,50);
                        l5.setFont(font4);
                        l5.setForeground(Color.GREEN);

                        f3.add(l1);
                        f3.add(l2);
                        f3.add(l3);
                        f3.add(l4);
                        f3.add(l5);
                        f3.setSize(1000,1000);
                        f3.setLayout(null);
                        f3.setVisible(true);
                        f2.setVisible(false);
                   }
                });
            	
            }
            else if(n==3)
            {

                jb2=new JButton("Solution");

                jl2=new JLabel("Value for 1-1");
                jl3=new JLabel("Value for 1-2");
                jl4=new JLabel("Value for 1-3");
                jl5=new JLabel("Value for 2-1");
                jl6=new JLabel("Value for 2-2");
                jl7=new JLabel("Value for 2-3");
                jl8=new JLabel("Value for 3-1");
                jl9=new JLabel("Value for 3-2");
                jl10=new JLabel("Value for 3-3");

                j2=new JTextField(20);
                j3=new JTextField(20);
                j4=new JTextField(20);
                j5=new JTextField(20);
                j6=new JTextField(20);
                j7=new JTextField(20);
                j8=new JTextField(20);
                j9=new JTextField(20);
                j10=new JTextField(20);


                Font font3 = new Font("lucida", Font.BOLD, 25);

                jl2.setBounds(10,20,200,50);      
                jl2.setFont(font3);
                jl2.setForeground(Color.RED); 

                jl3.setBounds(10,80,200,50); 
                jl3.setFont(font3);
                jl3.setForeground(Color.RED); 

                jl4.setBounds(10,140,200,50); 
                jl4.setFont(font3);
                jl4.setForeground(Color.RED); 

                jl5.setBounds(10,200,200,50);   
                jl5.setFont(font3);
                jl5.setForeground(Color.RED); 

                jl6.setBounds(10,260,200,50);  
                jl6.setFont(font3);
                jl6.setForeground(Color.RED); 

                jl7.setBounds(10,320,200,50);   
                jl7.setFont(font3);
                jl7.setForeground(Color.RED);  

                jl8.setBounds(10,380,200,50);  
                jl8.setFont(font3);
                jl8.setForeground(Color.RED);    

                jl9.setBounds(10,440,200,50); 
                jl9.setFont(font3);
                jl9.setForeground(Color.RED);  


                jl10.setBounds(10,500,200,50);
                jl10.setFont(font3);
                jl10.setForeground(Color.RED);

                j2.setBounds(200,20,50,50); 
                j2.setFont(font3);
                j2.setForeground(Color.GREEN);

                j3.setBounds(200,80,50,50);  
                j3.setFont(font3);
                j3.setForeground(Color.GREEN);

                j4.setBounds(200,140,50,50); 
                j4.setFont(font3);
                j4.setForeground(Color.GREEN);

                j5.setBounds(200,200,50,50); 
                j5.setFont(font3);
                j5.setForeground(Color.GREEN);


                j6.setBounds(200,260,50,50);
                j6.setFont(font3);
                j6.setForeground(Color.GREEN);
                

                j7.setBounds(200,320,50,50); 
                j7.setFont(font3);
                j7.setForeground(Color.GREEN);
            

                j8.setBounds(200,380,50,50);
                j8.setFont(font3);
                j8.setForeground(Color.GREEN);
                
                j9.setBounds(200,440,50,50);
                j9.setFont(font3);
                j9.setForeground(Color.GREEN);
                

                j10.setBounds(200,500,50,50);
                j10.setFont(font3);
                j10.setForeground(Color.GREEN);
                
                

                jb2.setBounds(20,560,100,50);
                

                f2.add(jl2);
                f2.add(j2);
                f2.add(jl3);
                f2.add(j3);
                f2.add(jl4);
                f2.add(j4);
                f2.add(jl5);
                f2.add(j5);

                f2.add(jl6);
                f2.add(j6);
                f2.add(jl7);
                f2.add(j7);
                f2.add(jl8);
                f2.add(j8);
                f2.add(jl9);
                f2.add(j9);
                f2.add(jl10);
                f2.add(j10);


                f2.add(jb2);

                jb2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae)
                   {
                        int n1=Integer.parseInt(j2.getText());
                        int n2=Integer.parseInt(j3.getText());
                        int n3=Integer.parseInt(j4.getText());
                        int n4=Integer.parseInt(j5.getText());

                        int n5=Integer.parseInt(j6.getText());
                        int n6=Integer.parseInt(j7.getText());
                        int n7=Integer.parseInt(j8.getText());
                        int n8=Integer.parseInt(j9.getText());
                        int n9=Integer.parseInt(j10.getText());    


                        


                        JFrame f3= new JFrame("Solution..");
                        
                        int[][] cost=new int[10][10];
                        int[][] a=new int[10][10];
                        int[][] b=new int[10][10];
                        int[][] p=new int[10][10];
                        b[1][1]=n1;
                        b[1][2]=n2;
                        b[1][3]=n3;
                        b[2][1]=n4;
                        b[2][2]=n5;
                        b[2][3]=n6;
                        b[3][1]=n7;
                        b[3][2]=n8;
                        b[3][3]=n9;


                        for(i=1;i<=n;i++)
                        {
                            for(j=1;j<=n;j++)
                            {
                                cost[i][j]=b[i][j];
                                p[i][j]=999;
                                a[i][j]=0;
                            }
                        }




                        
                        for(k=1;k<=n;k++)
                           for(i=1;i<=n;i++)
                               for(j=1;j<=n;j++)
                                   if(i==j){
                                      a[i][j]=0;
                                    }
                                    else if(k==j || k==i){
                                       if(cost[i][j]<p[i][j])
                                       {
                                          a[i][j]=cost[i][j];
                                          p[i][j]=a[i][j];
                                       }
                                       else{
                                          a[i][j]=p[i][j];
                                       }
                                    }
                                    else{
                                        if(cost[i][j]<(cost[i][k]+cost[k][j]) && cost[i][j]<p[i][j])
                                       {
                                           a[i][j]=cost[i][j];
                                           p[i][j]=cost[i][j];
                                        }
                                        else if((cost[i][k]+cost[k][j])<p[i][j] && (cost[i][k]+cost[k][j])<cost[i][j])
                                        {
                                            a[i][j]=(cost[i][k]+cost[k][j]);
                                            p[i][j]=a[i][j];
                                        }
                                        else{
                                            a[i][j]=p[i][j];
                                        }
                                    }

                        l1=new JLabel("**Adjacency closure is **");
                        l2=new JLabel(a[1][1]+"   "+a[1][2]+"   "+a[1][3]);
                        l3=new JLabel(a[2][1]+"   "+a[2][2]+"   "+a[2][3]);
                        l4=new JLabel(a[3][1]+"   "+a[3][2]+"   "+a[3][3]);                      
                        Font font4 = new Font("lucida", Font.BOLD, 30);                         
                        l1.setBounds(500,30,900,40);
                        l1.setFont(font4);
                        l1.setForeground(Color.RED); 
                        l2.setBounds(685,80,250,50);
                        l2.setFont(font4);
                        l2.setForeground(Color.GREEN); 
                        l3.setBounds(685,140,250,50);
                        l3.setFont(font4);
                        l3.setForeground(Color.GREEN); 
                        l4.setBounds(685,200,250,50);
                        l4.setFont(font4);
                        l4.setForeground(Color.GREEN); 
                        f3.add(l1);
                        f3.add(l2);
                        f3.add(l3);
                        f3.add(l4);
                        f3.setSize(600,700);
                        f3.setLayout(null);
                        f3.setVisible(true);
                        f2.setVisible(false);
                    }
                });   

            }
            
            f2.setSize(600,800);
            f2.setLayout(null);
            f2.setVisible(true);
            jf.setVisible(false);
    }
         });
    
        jf.setSize(500,600);
        jf.setLayout(null);
        jf.setVisible(true);

    }
    public static void main(String args[])
    {
       new AllP();
    }
}