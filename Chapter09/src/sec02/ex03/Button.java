package sec02.ex03;

public class Button {
	OnClickListener listenr;
	
	void setOnClickListener(OnClickListener listener) {
		this.listenr=listener;
	}
	
	void touch() {
		listenr.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
