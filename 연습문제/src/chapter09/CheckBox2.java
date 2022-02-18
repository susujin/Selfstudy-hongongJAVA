package chapter09; //9-2-3

public class CheckBox2 {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener=listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}
