package chapter07;

public class HttpServletEx {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
