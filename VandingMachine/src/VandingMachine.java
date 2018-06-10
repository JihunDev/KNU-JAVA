import java.awt.*;
import java.awt.event.*;

public class VandingMachine extends Frame implements ActionListener{
 //��ư �� �ʵ� ����
 Button coin;
 Button menu1, menu2, menu3, menu4, menu5, menu6;
 Button cancle, return_b, buy_b;
 Label Label1, Label2;
 TextField money;
 TextArea txtA1, txtA2, txtA3;
 int menu1_sale = 2500;
 int menu2_sale = 3000;
 int menu3_sale = 3500;
 int menu4_sale = 2000;
 int menu5_sale = 2500;
 int menu6_sale = 2500;
 String s_menu1 = "�Ŷ��" ,s_menu2 = "������",s_menu3 = "���";
 String s_menu4 = "���", s_menu5 = "���",s_menu6 = "������";
 int s_number1, s_number2, s_number3, s_number4, s_number5, s_number6;
 int mypoket, exchange, sale;
 int mon_10000, mon_5000, mon_1000, mon_500, mon_100, mon_50, mon_10;
 GridBagLayout gbl;
 GridBagConstraints gbc;
 
 public VandingMachine(){
  Font font = new Font("Curuier new", Font.PLAIN,40);
  coin = new Button("��    ��"); 
  money = new TextField(10);
  money.setFont(font);
  menu1 = new Button("�Ŷ��(2500��)");  menu2 = new Button("������(3000��)");
  menu3 = new Button("��   ��(3500��)");  menu4 = new Button("��   ��(2000��)");
  menu5 = new Button("��   ��(2500��)");  menu6 = new Button("������(0200��)");
  cancle = new Button("��  �� ȭ");  return_b = new Button("��   ȯ");
  buy_b = new Button("��      ��");  Label1 = new Label("�����°�");
  Label2 = new Label("�Ž�����");
  txtA1 = new TextArea("�ı� �����°�");
  txtA2 = new TextArea("�Ž����� �����°�");
  txtA3 = new TextArea(18, 30);
  gbl = new GridBagLayout();
  gbc = new GridBagConstraints();
  setLayout(gbl);
  gbc.fill = GridBagConstraints.BOTH;
  gbc.weightx = 1.0;
  gbc.weighty = 1.0;
  add(money,0,0,4,1);
  add(coin,4,0,2,1);
  add(txtA3,0,1,6,6);
  add(menu1,0,7,1,1);
  add(menu2,1,7,1,1);
  add(menu3,2,7,1,1);
  add(menu4,3,7,1,1);
  add(menu5,4,7,1,1);
  add(menu6,5,7,1,1);
  add(cancle,0,8,2,1);
  add(return_b,2,8,2,1);
  add(buy_b,4,8,2,1);
  add(txtA1,0,9,3,4);
  add(txtA2,3,9,3,4); 
  
  //ActionListener ����
  coin.addActionListener(this);
  menu1.addActionListener(this);  menu2.addActionListener(this);
  menu3.addActionListener(this);  menu4.addActionListener(this);
  menu5.addActionListener(this);  menu6.addActionListener(this);
  cancle.addActionListener(this);  return_b.addActionListener(this);
  buy_b.addActionListener(this);
  //set Window Size
  setSize(600,700);
  setVisible(true);
  setTitle("5���а� �ı� �Ǹű�");
  
  //�����ư 
  addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we){System.exit(0);}
     });  
 }
 private void add(Component c, int x, int y, int w, int h) {
       gbc.gridx = x;
       gbc.gridy = y;
       gbc.gridwidth  = w;
       gbc.gridheight = h;
       gbl.setConstraints(c, gbc);
       add(c);
    }
 
 public void actionPerformed(ActionEvent ae) { 
  Object ans = ae.getSource();
  if(ans==coin){
   mypoket = Integer.parseInt(money.getText());
   txtA3.setText(mypoket+"���� ���ԵǾ����ϴ�.\n\n");
   txtA1.setText("�ı� �����°�");
   txtA2.setText("�Ž����� �����°�");
  }
  if(ans==menu1){
   s_number1 = s_number1+1;
   txtA3.setText(txtA3.getText()+s_menu1+" "+s_number1+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==menu2){
   s_number2 = s_number2+1;
   txtA3.setText(txtA3.getText()+s_menu2+" "+s_number2+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==menu3){
   s_number3 = s_number3+1;
   txtA3.setText(txtA3.getText()+s_menu3+" "+s_number3+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==menu4){
   s_number4 = s_number4+1;
   txtA3.setText(txtA3.getText()+s_menu4+" "+s_number4+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==menu5){
   s_number5 = s_number5+1;
   txtA3.setText(txtA3.getText()+s_menu5+" "+s_number5+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==menu6){
   s_number6 = s_number6+1;
   txtA3.setText(txtA3.getText()+s_menu6+" "+s_number6+"���� �����ϼ̽��ϴ�.\n\n");
  }
  if(ans==cancle){
   s_number1=0;s_number2=0;s_number3=0;
   s_number4=0;s_number5=0;s_number6=0;
   mypoket=0;exchange=0;
   txtA1.setText("�ı� �����°�");
   txtA2.setText("�Ž����� �����°�");
   txtA3.setText("");
   money.setText("");
  }  
  if(ans==buy_b){
   sale =  (menu1_sale*s_number1)+
     (menu2_sale*s_number2)+
     (menu3_sale*s_number3)+
     (menu4_sale*s_number4)+
     (menu5_sale*s_number5)+
     (menu6_sale*s_number6);
   exchange = mypoket-sale;
   if(exchange>=0){
    txtA3.setText("\n�����Ͻ� �ı� ����� ����ǥ �Դϴ�.\n"+"**********************************\n\n"+
      s_menu1+"("+menu1_sale+"��)\t"+s_number1+"��   ���� : "+menu1_sale*s_number1+"��\n\n"+
      s_menu2+"("+menu2_sale+"��)\t"+s_number2+"��   ���� : "+menu2_sale*s_number2+"��\n\n"+
      s_menu3+"("+menu3_sale+"��)\t"+s_number3+"��   ���� : "+menu3_sale*s_number3+"��\n\n"+
      s_menu4+"("+menu4_sale+"��)\t"+s_number4+"��   ���� : "+menu4_sale*s_number4+"��\n\n"+
      s_menu5+"("+menu5_sale+"��)\t"+s_number5+"��   ���� : "+menu5_sale*s_number5+"��\n\n"+
      s_menu6+"("+menu6_sale+"��)\t"+s_number6+"��   ���� : "+menu6_sale*s_number6+"��\n\n"+
      "**********************************\n\n"+
      "�հ� : "+ sale+"��\n\n"+"�Ž����� : "+ exchange+"��\n");
    txtA1.setText((s_number1!=0 ? s_menu1+"\t"+s_number1+"��\n\n": "")+
      (s_number2!=0 ? s_menu2+"\t"+s_number2+"��\n\n": "")+
      (s_number3!=0 ? s_menu3+"\t"+s_number3+"��\n\n": "")+
      (s_number4!=0 ? s_menu4+"\t"+s_number4+"��\n\n": "")+
      (s_number5!=0 ? s_menu5+"\t"+s_number5+"��\n\n": "")+
      (s_number6!=0 ? s_menu6+"\t"+s_number6+"��\n\n": ""));
    mypoket = exchange;
    s_number1=0;s_number2=0;s_number3=0;
    s_number4=0;s_number5=0;s_number6=0;
    
   }else{
    txtA3.setText("�ܾ��� �����մϴ�.\n\n�ٽ� �������ּ���.\n\n");
    s_number1=0;s_number2=0;s_number3=0;
    s_number4=0;s_number5=0;s_number6=0;
   }   
  }
  if(ans==return_b){
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
   txtA2.setText((mon_10000!=0 ? "10000����\t"+mon_10000+"��\n\n" : "")+
     (mon_5000!=0 ? "5000����\t"+mon_5000+"��\n\n" : "")+
     (mon_1000!=0 ? "1000����\t"+mon_1000+"��\n\n" : "")+
     (mon_500!=0 ? "500����\t\t"+mon_500+"��\n\n" : "")+
     (mon_100!=0 ? "100����\t\t"+mon_100+"��\n\n" : "")+
     (mon_50!=0 ? "50����\t\t"+mon_50+"��\n\n" : "")+ 
     (mon_10!=0 ? "10����\t\t"+mon_10+"��\n\n" : ""));
   money.setText(""+exchange);
  }  
 }  
 public static void main(String[] args) {
  @SuppressWarnings("unused")
VandingMachine vm = new VandingMachine();
 }
}