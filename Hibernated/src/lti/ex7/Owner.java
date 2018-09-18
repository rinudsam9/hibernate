package lti.ex7;

import java.util.Set;

public class Owner {

	private String name;
	private int pancard;
	
	
	
private Set<Estate> estates;
public int getPancard() {
	return pancard;
}



public void setPancard(int pancard) {
	this.pancard = pancard;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}

public Set<Estate> getEstates() {
	return estates;
}

public void setEstates(Set<Estate> estates) {
	this.estates = estates;
}

}
