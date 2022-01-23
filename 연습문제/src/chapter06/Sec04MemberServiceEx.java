package chapter06;

public class Sec04MemberServiceEx {

	public static void main(String[] args) {
		Sec04MemberService memberService=new Sec04MemberService();
		boolean result=memberService.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 혹은 password가 올바르지 않습니다.");
		}

	}

}
