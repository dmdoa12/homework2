import java.util.*;
class A01{
	public static void main(String[] args){
		new A01().start();
	}
	
	void start(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 :");

		int year = s.nextInt();
		
		int age = 2014-year+1;

		if(age < 20 && age > 0){
			print("미성년자 입니다.");
		}
		else{
			print("미성년자가 아닙니다.");
		}
	}

	void print(String str){
		System.out.print(str);
	}
}
