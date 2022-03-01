package uml;

import java.util.List;

public class Port {
	public String city;
	public int containers;
	public int oil;
	public List<Crane> cranes;

	private class Crane {
		public int levelOfMaintenance;
		
		public boolean unload(IFrieght ship) {
			return false;
		}
	}
}
