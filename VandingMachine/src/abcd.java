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
	System.out.print("1. 사이다(500원)    2. 콜라(600원)    3. 쥬스(700원)   9. 돈반환\n");
	System.out.print("9을 선택하시면 거스름돈이 나옵니다.\n");
	System.out.print("현재 금액은 "+cash+"원 음료수를 선택하시오! ");
	input = s.nextInt();

for(sum=0; sum <= 400; sum++) {
	
	switch(input) {
	case 1: 
	System.out.println("사이다가 나왔습니다.");
	sum += cyder;
	cash -= sum;
	System.out.println("현재잔돈은? "+cash+"원");
	System.out.println("\n");
	break;
	
		case 2:
		System.out.println("콜라가 나왔습니다.");
		sum += cola;
		cash -= sum;
		System.out.println("현재 잔돈은? "+cash+"원");
		System.out.println("\n");
		break;
		
			case 3:
			System.out.println("쥬스가 나왔습니다.");
			sum += juice;
			cash -= sum;
			System.out.println("현재 잔돈은? "+cash+"원");
			System.out.println("\n");
			break;
			
				case 9:
				System.out.println("거스름돈이 나옵니다!");
				System.out.println("거르름돈은 "+cash+"+원 입니다.");
				System.out.println("\n");
				return;
				
					default :
					System.out.println("잘못 입력하였습니다. 다시 입력하여 주시길 바랍니다!");
					System.out.println("\n");
					break;
	}
}
						if(cash == 0) {
						System.out.println("이용해 주셔서 감사합니다");
						return;

						}	
					
					else if(cash <= 400) {
					
					System.out.println("현재금액 "+cash+"원.. 돈이 부족합니다\n");
					System.out.println("돈이 모잘라 돈이 반환됩니다!");
					System.out.println("반환된 돈은 "+cash+"원 입니다!");
					System.out.println("이용해주셔서 감사합니다!");
					return;
					
					}

							

} while(true);
}
}