class abcd
{
public static void main(String[] args) {

int input =0;
int cash = 2000;
int cyder = 500;
int cola = 600;
int juice = 700;
int sum = 0;


java.util.Scanner s = new java.util.Scanner(System.in);
	do {
	System.out.print("1. ���̴�(500��)    2. �ݶ�(600��)    3. �꽺(700��)   9. ����ȯ\n");
	System.out.print("9�� �����Ͻø� �Ž������� ���ɴϴ�.\n");
	System.out.print("���� �ݾ��� "+cash+"�� ������� �����Ͻÿ�! ");
	input = s.nextInt();

for(sum=0; sum <= 400; sum++) {
	
	switch(input) {
	case 1: 
	System.out.println("���̴ٰ� ���Խ��ϴ�.");
	sum += cyder;
	cash -= sum;
	System.out.println("�����ܵ���? "+cash+"��");
	System.out.println("\n");
	break;
	
		case 2:
		System.out.println("�ݶ� ���Խ��ϴ�.");
		sum += cola;
		cash -= sum;
		System.out.println("���� �ܵ���? "+cash+"��");
		System.out.println("\n");
		break;
		
			case 3:
			System.out.println("�꽺�� ���Խ��ϴ�.");
			sum += juice;
			cash -= sum;
			System.out.println("���� �ܵ���? "+cash+"��");
			System.out.println("\n");
			break;
			
				case 9:
				System.out.println("�Ž������� ���ɴϴ�!");
				System.out.println("�Ÿ������� "+cash+"+�� �Դϴ�.");
				System.out.println("\n");
				return;
				
					default :
					System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ֽñ� �ٶ��ϴ�!");
					System.out.println("\n");
					break;
	}
}
						if(cash == 0) {
						System.out.println("�̿��� �ּż� �����մϴ�");
						return;

						}	
					
					else if(cash <= 400) {
					
					System.out.println("����ݾ� "+cash+"��.. ���� �����մϴ�\n");
					System.out.println("���� ���߶� ���� ��ȯ�˴ϴ�!");
					System.out.println("��ȯ�� ���� "+cash+"�� �Դϴ�!");
					System.out.println("�̿����ּż� �����մϴ�!");
					return;
					
					}

							

} while(true);
}
}