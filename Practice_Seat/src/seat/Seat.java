package seat;

public class Seat {
	
	private String name;
	
	// 예약한 사람 확인
	public String getName() {
		return name;
	}
	
	// 예약
	public void reserve(String name) {
		this.name =  name;
	}
	
	// 예약 취소
	public void cancel() {
		name = null;
	}
	
	// 예약 여부 확인
	public boolean isOccupied() {
		return name != null;
	}
	
	public boolean isMatched(String name) {
		return this.name.equals(name);
	}
	
	
	
}
