package chapter09;

public class CheckBox2Ex {

	public static void main(String[] args) {
		CheckBox checkBox=new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
				System.out.println("����� �����մϴ�");
			}
		});
		checkBox.select();

	}

}
