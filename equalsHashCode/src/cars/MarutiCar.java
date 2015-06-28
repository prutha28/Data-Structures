package cars;

public class MarutiCar {

	private int yearOfManufacture ;
	private String ownerName ;
	private int uniqueId ;
		
	public MarutiCar(int yearOfManufacture, String ownerName, int uniqueId) {
		super();
		this.yearOfManufacture = yearOfManufacture;
		this.ownerName = ownerName;
		this.uniqueId = uniqueId;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public MarutiCar() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + uniqueId;
		result = prime * result + yearOfManufacture;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarutiCar other = (MarutiCar) obj;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (uniqueId != other.uniqueId)
			return false;
		if (yearOfManufacture != other.yearOfManufacture)
			return false;
		return true;
	}
	
}
