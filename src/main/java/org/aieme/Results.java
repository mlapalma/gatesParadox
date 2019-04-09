package org.aieme;

public class Results {

	private int totalCases;
	private int totalOnFirstOption;
	private int totalOnChangeOption;
	private int prcFirst;
	private int prcChange;

	public Results(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}

	public int getTotalOnFirstOption() {
		return totalOnFirstOption;
	}

	public void setTotalOnFirstOption(int totalOnFirstOption) {
		this.totalOnFirstOption = totalOnFirstOption;
	}

	public int getTotalOnChangeOption() {
		return totalOnChangeOption;
	}

	public void setTotalOnChangeOption(int totalOnChangeOption) {
		this.totalOnChangeOption = totalOnChangeOption;
	}

	public int getPrcFirst() {
		return prcFirst;
	}

	public void setPrcFirst(int prcFirst) {
		this.prcFirst = prcFirst;
	}

	public int getPrcChange() {
		return prcChange;
	}

	public void setPrcChange(int prcChange) {
		this.prcChange = prcChange;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Results{");
		sb.append("totalCases=").append(totalCases);
		sb.append(", totalWinsOnFirstOption=").append(totalOnFirstOption);
		sb.append(", totalOnWinsOnChangeOption=").append(totalOnChangeOption);
		sb.append(", prcSuccessFirst=").append(prcFirst);
		sb.append(", prcSuccessChange=").append(prcChange);
		sb.append('}');
		return sb.toString();
	}
}
