package inheritance;

public class Passenger {
	int pnr;
	String name;
	int amount;
	public Passenger(int pnr, String name, int amount) {
		this.pnr = pnr;
		this.name = name;
		this.amount = amount;
	}
	/*@Override
	public String toString() {
		return "Passenger [pnr=" + pnr + ", name=" + name + ", amount=" + amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pnr;
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
		Passenger other = (Passenger) obj;
		if (amount != other.amount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pnr != other.pnr)
			return false;
		return true;
	} */
	
}
