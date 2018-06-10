import java.awt.*;

public class Title extends Frame {
	Button b1, b2, b3, b4;
	Checkbox cb1, cb2, cb3;
	TextArea ta;	
	
	public Title() {
	this.add(createWestPanel(), BorderLayout.WEST);
	this.add(createSouthPanel(), BorderLayout.SOUTH);
	 ta = new TextArea();
	 this.add(ta , BorderLayout.CENTER);
	 }
	public Panel createWestPanel() {
		Panel p = new Panel();
		Panel p1 = new Panel(new GridLayout(0,0));
		Panel p2 = new Panel(new GridLayout(1,0));
		Panel p3 = new Panel(new GridLayout(2,0));
		Panel p4 = new Panel(new GridLayout(3,0));
		b1 = new Button("red"); 
		b2 = new Button("green"); 
		b3 = new Button("blue");
		b4 = new Button("cyan");
		p1.add(b1); 
		p2.add(b2); 
		p3.add(b3);
		p4.add(b4);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		return p;
	}
	
	public Panel createSouthPanel(){
		Panel p5 = new Panel(new FlowLayout() );
		CheckboxGroup  cbg = new CheckboxGroup();
		cb1 = new Checkbox("10", cbg, true);
		cb2 = new Checkbox("20", cbg, true);
		cb3 = new Checkbox("30", cbg, true);
		p5.add(cb1);
		p5.add(cb2);
		p5.add(cb3);
		return p5;
	}
	public static void main(String args[]){
		Title mg = new Title();
		mg.setSize(500, 500);
		mg.setVisible(true);	
		}
}