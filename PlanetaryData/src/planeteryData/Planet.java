package planeteryData;
public class Planet {
	private String name;
	private String gases[];
	private int moons;
	private boolean rings;
	
	public Planet(String name,int moons,boolean rings,String[] gases)
	{
		this.setName(name);
		this.setMoons(moons);
		this.setRings(rings);
		this.setGases(gases);
	}
	




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getGases() {
		return gases;
	}


	public void setGases(String gases[]) {
		this.gases = gases;
	}


	public int getMoons() {
		return moons;
	}


	public void setMoons(int moons) {
		this.moons = moons;
	}


	public boolean haveRings() {
		return rings;
	}


	public void setRings(boolean rings) {
		this.rings = rings;
	}

}

