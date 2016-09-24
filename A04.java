import java.util.*;
class A04{
	public static void main(String[] args){
		new A04().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요:");
		int lan = s.nextInt();
		System.out.print("영어 점수를 입력하세요:");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요:");
		int math = s.nextInt();

		int total = lan+eng+math;
		print("입력하신 점수의 총점은 "+total+" 이고");
		double avg = total/3;
		print("평균은 "+avg+"입니다.");
		
		int maxNum = Math.max(math,Math.max(lan,eng));

		if(maxNum == lan){
			print("국어 점수가 우수합니다.");
		}
		else if(maxNum == eng){
			print("영어 점수가 우수합니다.");
		}
		else{
			print("수학 점수가 우수합니다.");
		}
	}

	void print(String str){
		System.out.println(str);
	}
}
