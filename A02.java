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
		String kind = s.nextLine();
		double output_degree;
		
		if(kind=="F"){
			output_degree=(input_degree-32)/1.8;
		}
		else if(kind=="C"){
			output_degree=(input_degree*1.8)+32;
		}
		
	}
}
