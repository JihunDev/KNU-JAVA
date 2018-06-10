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
 String s_menu1 = "신라면" ,s_menu2 = "삼양라면",s_menu3 = "꼬꼬면";
 String s_menu4 = "남자라면", s_menu5 = "기스면",s_menu6 = "육개장";
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
  bc = new Button("투    입"); 
  tf = new TextField(10);
  tf.setFont(font);
  b1 = new Button("신라면(2500원)");  b2 = new Button("삼양라면(2700원)");
  b3 = new Button("꼬꼬면(3500원)");  b4 = new Button("남자라면(2800원)");
  b5 = new Button("기스면(3500원)");  b6 = new Button("육개장(1200원)");
  bc1 = new Button("초  기 화");  br = new Button("반   환");
  bb = new Button("구      입");  l1 = new Label("나오는곳");
  l2 = new Label("거스름돈");
  ta1 = new TextArea("라면 나오는곳");
  ta2 = new TextArea("거스름돈 나오는곳");
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
   ta3.setText(mypoket+"원이 투입되었습니다.\n\n");
   ta1.setText("식권 나오는곳");
   ta2.setText("거스름돈 나오는곳");
  }
  if(ans==b1){
   s_number1 = s_number1+1;
   ta3.setText(ta3.getText()+s_menu1+" "+s_number1+"을 선택하셨습니다.\n\n");
  }
  if(ans==b2){
   s_number2 = s_number2+1;
   ta3.setText(ta3.getText()+s_menu2+" "+s_number2+"을 선택하셨습니다.\n\n");
  }
  if(ans==b3){
   s_number3 = s_number3+1;
   ta3.setText(ta3.getText()+s_menu3+" "+s_number3+"을 선택하셨습니다.\n\n");
  }
  if(ans==b4){
   s_number4 = s_number4+1;
   ta3.setText(ta3.getText()+s_menu4+" "+s_number4+"을 선택하셨습니다.\n\n");
  }
  if(ans==b5){
   s_number5 = s_number5+1;
   ta3.setText(ta3.getText()+s_menu5+" "+s_number5+"을 선택하셨습니다.\n\n");
  }
  if(ans==b6){
   s_number6 = s_number6+1;
   ta3.setText(ta3.getText()+s_menu6+" "+s_number6+"을 선택하셨습니다.\n\n");
  }
  if(ans==bc1){
   s_number1=0;s_number2=0;s_number3=0;
   s_number4=0;s_number5=0;s_number6=0;
   mypoket=0;exchange=0;
   ta1.setText("라면 나오는곳");
   ta2.setText("거스름돈 나오는곳");
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
    ta3.setText("\n구입하신 라면과 가격표 입니다.\n"+"**********************************\n\n"+
      s_menu1+"("+menu1_sale+"원)\t"+s_number1+"개   가격 : "+menu1_sale*s_number1+"원\n\n"+
      s_menu2+"("+menu2_sale+"원)\t"+s_number2+"개   가격 : "+menu2_sale*s_number2+"원\n\n"+
      s_menu3+"("+menu3_sale+"원)\t"+s_number3+"개   가격 : "+menu3_sale*s_number3+"원\n\n"+
      s_menu4+"("+menu4_sale+"원)\t"+s_number4+"개   가격 : "+menu4_sale*s_number4+"원\n\n"+
      s_menu5+"("+menu5_sale+"원)\t"+s_number5+"개   가격 : "+menu5_sale*s_number5+"원\n\n"+
      s_menu6+"("+menu6_sale+"원)\t"+s_number6+"개   가격 : "+menu6_sale*s_number6+"원\n\n"+
      "**********************************\n\n"+
      "합계 : "+ sale+"원\n\n"+"거스름돈 : "+ exchange+"원\n");
    ta1.setText((s_number1!=0 ? s_menu1+"\t"+s_number1+"개\n\n": "")+
      (s_number2!=0 ? s_menu2+"\t"+s_number2+"개\n\n": "")+
      (s_number3!=0 ? s_menu3+"\t"+s_number3+"개\n\n": "")+
      (s_number4!=0 ? s_menu4+"\t"+s_number4+"개\n\n": "")+
      (s_number5!=0 ? s_menu5+"\t"+s_number5+"개\n\n": "")+
      (s_number6!=0 ? s_menu6+"\t"+s_number6+"개\n\n": ""));
    mypoket = exchange;
    s_number1=0;s_number2=0;s_number3=0;
    s_number4=0;s_number5=0;s_number6=0;
    
   }else{
    ta3.setText("잔액이 부족합니다.\n\n다시 구입해주세요.\n\n");
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
   ta2.setText((mon_10000!=0 ? "10000원권\t"+mon_10000+"장\n\n" : "")+
     (mon_5000!=0 ? "5000원권\t"+mon_5000+"장\n\n" : "")+
     (mon_1000!=0 ? "1000원권\t"+mon_1000+"장\n\n" : "")+
     (mon_500!=0 ? "500원권\t\t"+mon_500+"개\n\n" : "")+
     (mon_100!=0 ? "100원권\t\t"+mon_100+"개\n\n" : "")+
     (mon_50!=0 ? "50원권\t\t"+mon_50+"개\n\n" : "")+ 
     (mon_10!=0 ? "10원권\t\t"+mon_10+"개\n\n" : ""));
   tf.setText(""+exchange);
  }  
 }  
 public static void main(String[] args) {
  F vm = new F();
  vm.setSize(1400,700);
  vm.setVisible(true);
  vm.setTitle("기차 라면판매기");
  
 }
}