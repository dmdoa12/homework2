import java.util.*;
class A03{
	public static void main(String[] args){
		new A03().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);

		System.out.print("날수를 입력하세요:");
		int days = s.nextInt();
		
		int seconds = days*24*60*60;
		print("날수에 해당되는 기간은 모두 "+seconds+" 초 입니다");
		
		int m_count=0;
		while(seconds > 1000000){
			m_count=m_count+1;
			seconds=seconds-1000000;
		}

		print("100만 초가 모두 "+m_count+"번이나 포함됩니다.");
	}

	void print(String str){
		System.out.println(str);
	}
}
