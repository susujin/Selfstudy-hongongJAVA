package chapter06;

public class Sec03Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Sec03Board(String title, String content){
		this(title,content,"�α����� ȸ�����̵�","���� ��ǻ�� ��¥",0);
	}
	Sec03Board(String title, String content, String writer){
		this(title,content,writer,"���� ��ǻ�� ��¥",0);
	}
	Sec03Board(String title, String content, String writer, String date){
		this(title,content,writer,date,0);
	}
	Sec03Board(String title, String content, String writer, String date, int hitcount){
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;
	}
}
