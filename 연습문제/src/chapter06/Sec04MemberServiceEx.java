package chapter06;

public class Sec04MemberServiceEx {

	public static void main(String[] args) {
		Sec04MemberService memberService=new Sec04MemberService();
		boolean result=memberService.login("hong","12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}else {
			System.out.println("id Ȥ�� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
