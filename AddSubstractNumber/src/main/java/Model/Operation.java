package Model;

import javax.validation.constraints.NotNull;

public class Operation {
	
	@NotNull
	private int firtNumber;
	
	@NotNull
	private int secondNumber;
	
	@NotNull
    String operationType;
	
	public int getFirtNumber() {
		return firtNumber;
	}
	public void setFirtNumber(int firtNumber) {
		this.firtNumber = firtNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
}
