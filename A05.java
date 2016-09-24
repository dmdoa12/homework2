import java.util.*;
class A05{
	public static void main(String[] args){
		new A05().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);

		System.out.print("태어난 년도를 입력하세요:");
		int birth_year = s.nextInt();

		int age = 2012-birth_year+1;

		if(age < 7 && age > 0){
			print("유아 입니다.");
		}
		else if(age >= 7 && age < 13){
			print("어린이 입니다.");
		}
		else if(age >= 13 && age < 20){
			print("청소년 입니다.");
		}
		else if(age >=20 && age < 30){
			print("청년 입니다.");
		}
		else if(age >= 30 && age < 60){
			print("중년 입니다.");
		}
		else if(age >= 60){
			print("노년 입니다.");
		}
		else{
			print("잘못 입력하셨습니다.");
		}
	}

	void print(String str){
		System.out.println(str);
	}
}
