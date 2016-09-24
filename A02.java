import java.util.*;
class A02{
	public static void main(String[] args){
		new A02().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);

		System.out.print("온도를 입력하세요 :");

		double input_degree = s.nextDouble();
		
		System.out.print("입력하신 온도가 섭씨온도이면 C를,화씨온도이면 F를 입력하세요:");
		String kind = s.next();
		double output_degree=0;
		
		if(kind.equals("F")){
			output_degree=(input_degree-32)/1.8;
		}
		else if(kind.equals("C")){
			output_degree=(input_degree*1.8)+32;
		}
		else{
			print("잘못 입력 하셨습니다.");
		}

		print("변환된 온도는 "+output_degree+" 입니다.");
	}

	void print(String str){
		System.out.println(str);
	}
}
