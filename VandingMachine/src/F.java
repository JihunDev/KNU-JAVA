import java.awt.*;
import java.awt.event.*;

public class F extends Frame implements ActionListener{
 Panel p1,p2,p3,p4,p5,p6,p7,p8,p9;
 Button bc;
 Button b1, b2, b3, b4, b5, b6;
 Button bc1, br, bb;
 Label l1, l2;
 TextField tf;
 TextArea ta1, ta2, ta3;
 int menu1_sale = 2500;
 int menu2_sale = 3000;
 int menu3_sale = 3500;
 int menu4_sale = 2000;
 int menu5_sale = 2500;
 int menu6_sale = 2500;
 String s_menu1 = "�Ŷ��" ,s_menu2 = "�����",s_menu3 = "������";
 String s_menu4 = "���ڶ��", s_menu5 = "�⽺��",s_menu6 = "������";
 int s_number1, s_number2, s_number3, s_number4, s_number5, s_number6;
 int mypoket, exchange, sale;
 int mon_10000, mon_5000, mon_1000, mon_500, mon_100, mon_50, mon_10;
 public F(){
 this.setLayout(new FlowLayout());
 p1=new Panel(new BorderLayout());
 p2=new Panel(new GridLayout(2,1));
 p3=new Panel(new GridLayout(2,1));
 p4=new Panel(new GridLayout(1,6));
 p5=new Panel(new GridLayout(1,3));
 p6=new Panel(new GridLayout(2,1));
 p7=new Panel(new GridLayout(2,1));
 p8=new Panel(new GridLayout(1,2));
 Font font = new Font("Curuier new", Font.PLAIN,40);
  bc = new Button("��    ��"); 
  tf = new TextField(10);
  tf.setFont(font);
  b1 = new Button("�Ŷ��(2500��)");  b2 = new Button("�����(2700��)");
  b3 = new Button("������(3500��)");  b4 = new Button("���ڶ��(2800��)");
  b5 = new Button("�⽺��(3500��)");  b6 = new Button("������(1200��)");
  bc1 = new Button("��  �� ȭ");  br = new Button("��   ȯ");
  bb = new Button("��      ��");  l1 = new Label("�����°�");
  l2 = new Label("�Ž�����");
  ta1 = new TextArea("��� �����°�");
  ta2 = new TextArea("�Ž����� �����°�");
  ta3 = new TextArea(18, 30);
  
  
  bc.addActionListener(this);
  b1.addActionListener(this);  b2.addActionListener(this);
  b3.addActionListener(this);  b4.addActionListener(this);
  b5.addActionListener(this);  b6.addActionListener(this);
  bc1.addActionListener(this);  br.addActionListener(this);
  bb.addActionListener(this);
  
  p1.add(tf,BorderLayout.CENTER); p1.add(bc,BorderLayout.EAST);
  p4.add(b1); p4.add(b2); p4.add(b3); p4.add(b4); p4.add(b5); p4.add(b6);
  p5.add(bc1); p5.add(br); p5.add(bb);
  p6.add(p4); p6.add(p5);
  p2.add(p1); p2.add(p6);
  p8.add(ta1); p8.add(ta2);
 p7.add(ta3); p7.add(p8);
  p3.add(p7);
  this.add(p2,BorderLayout.NORTH); this.add(p3,BorderLayout.CENTER);
  addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we){System.exit(0);}
     });  
 }
 
 public void actionPerformed(ActionEvent ae) { 
  Object ans = ae.getSource();
  if(ans==bc){
   mypoket = Integer.parseInt(tf.getText());
   ta3.setText(mypoket+"���� ���ԵǾ����ϴ�.\n\n");
   ta1.setText("�ı� �����°�");
   ta2.setText("�Ž����� �����°�");
  }
  if(ans==b1){
   s_number1 = s_number1+1;
   ta3.setText(ta3.getText()+s_menu1+" "+s_number1+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==b2){
   s_number2 = s_number2+1;
   ta3.setText(ta3.getText()+s_menu2+" "+s_number2+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==b3){
   s_number3 = s_number3+1;
   ta3.setText(ta3.getText()+s_menu3+" "+s_number3+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==b4){
   s_number4 = s_number4+1;
   ta3.setText(ta3.getText()+s_menu4+" "+s_number4+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==b5){
   s_number5 = s_number5+1;
   ta3.setText(ta3.getText()+s_menu5+" "+s_number5+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==b6){
   s_number6 = s_number6+1;
   ta3.setText(ta3.getText()+s_menu6+" "+s_number6+"�� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==bc1){
   s_number1=0;s_number2=0;s_number3=0;
   s_number4=0;s_number5=0;s_number6=0;
   mypoket=0;exchange=0;
   ta1.setText("��� �����°�");
   ta2.setText("�Ž����� �����°�");
   ta3.setText("");
   tf.setText("");
  }  
  if(ans==bb){
   sale =  (menu1_sale*s_number1)+
     (menu2_sale*s_number2)+
     (menu3_sale*s_number3)+
     (menu4_sale*s_number4)+
     (menu5_sale*s_number5)+
     (menu6_sale*s_number6);
   exchange = mypoket-sale;
   if(exchange>=0){
    ta3.setText("\n�����Ͻ� ���� ����ǥ �Դϴ�.\n"+"**********************************\n\n"+
      s_menu1+"("+menu1_sale+"��)\t"+s_number1+"��   ���� : "+menu1_sale*s_number1+"��\n\n"+
      s_menu2+"("+menu2_sale+"��)\t"+s_number2+"��   ���� : "+menu2_sale*s_number2+"��\n\n"+
      s_menu3+"("+menu3_sale+"��)\t"+s_number3+"��   ���� : "+menu3_sale*s_number3+"��\n\n"+
      s_menu4+"("+menu4_sale+"��)\t"+s_number4+"��   ���� : "+menu4_sale*s_number4+"��\n\n"+
      s_menu5+"("+menu5_sale+"��)\t"+s_number5+"��   ���� : "+menu5_sale*s_number5+"��\n\n"+
      s_menu6+"("+menu6_sale+"��)\t"+s_number6+"��   ���� : "+menu6_sale*s_number6+"��\n\n"+
      "**********************************\n\n"+
      "�հ� : "+ sale+"��\n\n"+"�Ž����� : "+ exchange+"��\n");
    ta1.setText((s_number1!=0 ? s_menu1+"\t"+s_number1+"��\n\n": "")+
      (s_number2!=0 ? s_menu2+"\t"+s_number2+"��\n\n": "")+
      (s_number3!=0 ? s_menu3+"\t"+s_number3+"��\n\n": "")+
      (s_number4!=0 ? s_menu4+"\t"+s_number4+"��\n\n": "")+
      (s_number5!=0 ? s_menu5+"\t"+s_number5+"��\n\n": "")+
      (s_number6!=0 ? s_menu6+"\t"+s_number6+"��\n\n": ""));
    mypoket = exchange;
    s_number1=0;s_number2=0;s_number3=0;
    s_number4=0;s_number5=0;s_number6=0;
    
   }else{
    ta3.setText("�ܾ��� �����մϴ�.\n\n�ٽ� �������ּ���.\n\n");
    s_number1=0;s_number2=0;s_number3=0;
    s_number4=0;s_number5=0;s_number6=0;
   }   
  }
  if(ans==br){
   for(mon_10000 = 0; mon_10000<10; ++mon_10000){
    if (exchange<10000) break;
    exchange = exchange-10000;    
   }
   for(mon_5000 = 0; mon_5000<2; ++mon_5000){
    if (exchange<5000) break;
    exchange = exchange-5000;    
   }
   for(mon_1000 = 0; mon_1000<5; ++mon_1000){
    if (exchange<1000) break;
    exchange = exchange-1000;    
   }
   for(mon_500 = 0; mon_500<2; ++mon_500){
    if (exchange<500) break;
    exchange = exchange-500;    
   }
   for(mon_100 = 0; mon_100<5; ++mon_100){
    if (exchange<100) break;
    exchange = exchange-100;    
   }
   for(mon_50 = 0; mon_50<2; ++mon_50){
    if (exchange<50) break;
    exchange = exchange-50;    
   }
   for(mon_10 = 0; mon_10<5; ++mon_10){
    if (exchange<10) break;
    exchange = exchange-10;    
   }   
   ta2.setText((mon_10000!=0 ? "10000����\t"+mon_10000+"��\n\n" : "")+
     (mon_5000!=0 ? "5000����\t"+mon_5000+"��\n\n" : "")+
     (mon_1000!=0 ? "1000����\t"+mon_1000+"��\n\n" : "")+
     (mon_500!=0 ? "500����\t\t"+mon_500+"��\n\n" : "")+
     (mon_100!=0 ? "100����\t\t"+mon_100+"��\n\n" : "")+
     (mon_50!=0 ? "50����\t\t"+mon_50+"��\n\n" : "")+ 
     (mon_10!=0 ? "10����\t\t"+mon_10+"��\n\n" : ""));
   tf.setText(""+exchange);
  }  
 }  
 public static void main(String[] args) {
  F vm = new F();
  vm.setSize(1400,700);
  vm.setVisible(true);
  vm.setTitle("���� ����Ǹű�");
  
 }
}