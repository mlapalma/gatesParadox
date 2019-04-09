package org.aieme;

public class Gate {

	private int id;
	private boolean containsCar;
	private boolean selectedByUser;
	private boolean selectedByManager;

	public Gate(int id, boolean containsCar) {
		this.id = id;
		this.containsCar = containsCar;
	}

	public int getId() {
		return id;
	}

	public boolean isContainsCar() {
		return containsCar;
	}

	public boolean isSelectedByUser() {
		return selectedByUser;
	}

	public void setSelectedByUser(boolean selectedByUser) {
		this.selectedByUser = selectedByUser;
	}

	public boolean isSelectedByManager() {
		return selectedByManager;
	}

	public void setSelectedByManager(boolean selectedByManager) {
		this.selectedByManager = selectedByManager;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Gate{");
		sb.append("id=").append(id);
		sb.append(", containsCar=").append(containsCar);
		sb.append(", selectedByUser=").append(selectedByUser);
		sb.append(", selectedByManager=").append(selectedByManager);
		sb.append('}');
		return sb.toString();
	}
}
