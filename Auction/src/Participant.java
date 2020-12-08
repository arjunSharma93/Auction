
public class Participant {

	String name;
	String uniqueCode;

	public Participant(String name, String uniqueCode) {

		this.name = name;
		this.uniqueCode = uniqueCode;

		Repo.participantList.add(this);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", uniqueCode=" + uniqueCode + "]";
	}

}
