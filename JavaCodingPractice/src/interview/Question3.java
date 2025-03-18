package interview;

public class Question3 {
	private int rollNo;
	private String name;
	private String mobNo;

	public Question3(int rollNo, String name, String mobNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mobNo = mobNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "StudentData [rollNo=" + rollNo + ", name=" + name + ", mobNo=" + mobNo + "]";
	}

	public static void main(String[] args) {
		System.out.println(new Question3(4, "Tarun", "987654321"));
	}
}
