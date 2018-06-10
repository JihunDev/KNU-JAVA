import java.awt.*;

public class AddressBook extends Frame {
	Choice ch;
	Canvas cv;
	Scrollbar sl;
	List list;
	Button bt;
	Label lb;
	TextArea ta;

public AddressBook() {
	this.add(createNorthPanel(), BorderLayout.NORTH);
	this.add(createCenterPanel(), BorderLayout.CENTER);
	this.add(createSouthPanel(), BorderLayout.SOUTH);

	}
public Panel createNorthPanel() {
	Panel p = new Panel(new GridLayout(3,1));
	Panel p1 =new Panel(new GridLayout(2,1));
	Panel p2 =new Panel(new BorderLayout());
	Panel p3 =new Panel(new BorderLayout());
	
	ch = new Choice();
	ch.add("Insert");
	ch.add("Update");
	ch.add("Delete");
	ch.add("Update");
	
	lb = new Label("Flower Filename");
	
	ta = new TextArea();
	
	list = new List();
	
	p.add(p1);
	p.add(p2);
	p.add(p3);
	p1.add(ch);
	p1.add(lb);
	p2.add(ta);
	p3.add(list);
	
	
	return p;
	}

public Panel createCenterPanel(){
	Panel p = new Panel(new BorderLayout());
	
	cv = new Canvas();
	cv.setBackground(Color.BLUE);
	p.add(cv);
	
	return p;
	}
	
public Panel createSouthPanel(){
	Panel p = new Panel(new GridLayout(2,1));
	
	bt = new Button ("a.gif");
	sl = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 10, 200);
	p.add(bt);
	p.add(sl);
	
	return p;
	}

public static void main(String args[]) {
		AddressBook ad = new AddressBook();
		ad.setSize(400,1000);
		ad.setVisible(true);
		
	}
}