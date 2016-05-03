package command;

public class Panel {
	private String color = "빨강";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.printf("%s에서 %s로 색깔이 바뀜\n", this.color, color);
		this.color = color;
	}

}
