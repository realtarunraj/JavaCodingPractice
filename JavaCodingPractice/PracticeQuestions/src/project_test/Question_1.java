package project_test;

import java.util.ArrayList;
import java.util.List;

class PolizzeSaveDto {
	private int id;
	private String name;

	public PolizzeSaveDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Question_1 {
	public static void main(String[] args) {

		List<PolizzeSaveDto> polizzeSaveDtoList = new ArrayList<>();
		polizzeSaveDtoList.add(new PolizzeSaveDto(1, "Tarun"));
		polizzeSaveDtoList.add(new PolizzeSaveDto(2, "Mugdha"));
		polizzeSaveDtoList.add(new PolizzeSaveDto(7, "Deepak"));
		polizzeSaveDtoList.add(new PolizzeSaveDto(19, "Shreya"));

		// 1st Method ...
		for (PolizzeSaveDto polizzeSaveDto : polizzeSaveDtoList) {
			System.out.println(polizzeSaveDto);

		}

		// 2nd Method ...
		polizzeSaveDtoList.forEach(polizzeSaveDto -> System.out.println(polizzeSaveDto));
	}
}
