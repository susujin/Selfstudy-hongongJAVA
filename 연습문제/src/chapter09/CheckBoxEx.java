package chapter09; //9-1-5

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox checkBox=new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();

	}

}
