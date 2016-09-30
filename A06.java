import java.util.*;
class A06{
	public static void main(String[] args){
		new A06().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);
		
		print("==============================");
		System.out.print("이름 :");
		String name = s.next();

		System.out.print("국어점수 입력:");
		int lan = s.nextInt();

		System.out.print("수학점수 입력:");
		int math = s.nextInt();

		System.out.print("영어점수 입력:");
		int eng = s.nextInt();
		
		double avg = (lan+math+eng)/3;
		String grade = whatGrade(avg);

		print("==============================");
		print(name+"님은");
		print("평균은 "+avg+"이고");
		print("학점은"+grade+"입니다.");

	}

	 String whatGrade(double avg){
		String grade;

		if(avg >=95 && avg <= 100){
			grade="A+";
		}
		else if(avg>=90 && avg<95){
			grade="A";
		}
		else if(avg>=85 && avg<90){
			grade="B+";
		}
		else if(avg>=80 && avg<85){
			grade="B";
		}
		else if(avg>=75 && avg<80){
			grade="C+";
		}
		else if(avg>=70 && avg<75){
			grade="C";
		}
		else if(avg>=65 && avg<70){
			grade="D+";
		}
		else if(avg>=60 && avg<65){
			grade="D";
		}
		else{
			grade="F";
		}

		return grade;
	}

	void print(String str){
		System.out.println(str);
	}
}
