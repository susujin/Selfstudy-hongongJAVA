package chapter09; //9-1-5

import chapter09.CheckBox.OnSelectListener;

public class BackgroundChangeListener implements OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다");

	}

}
