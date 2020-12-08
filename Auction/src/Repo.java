import java.util.*;

public class Repo {

	static List<Participant> participantList = new ArrayList<Participant>();

	static List<Product> productList = new ArrayList<Product>();

	//static TreeMap<Double, String> biddingHistory = new TreeMap<Double, String>();

	public static void addParticipant() {

		Scanner s = new Scanner(System.in);

		System.out.println("Participant enter your name: ");
		String participantName = s.nextLine();
		while (true) {
			System.out.println("enter a unique code: ");
			String participantUniqueCode = s.nextLine();
			if (cheackCode(participantUniqueCode)) {
				System.out.println("This code is already taken, try again");
			} else {
				new Participant(participantName, participantUniqueCode);
				break;
			}
			//s.close();
		}
	}

	/*
	 * Iterator<Participant> it = Repo.participantList.iterator(); while
	 * (it.hasNext()) { if (it.next().uniqueCode.equals(participantUniqueCode)) {
	 * System.out.println("This code is already taken, try again"); break; } else {
	 * count++; } } if (count == Repo.participantList.size()) { Participant
	 * participant = new Participant(participantName, participantUniqueCode); } }
	 */

	public static boolean cheackCode(String code) {

		Iterator<Participant> it = Repo.participantList.iterator();
		while (it.hasNext()) {
			if (it.next().uniqueCode.equals(code)) {
				return true;
			}
		}
		return false;
	}
	
	public static Participant participantDetails(String code) {
		for(int i=0; i<Repo.participantList.size(); i++) {
			if(Repo.participantList.get(i).uniqueCode.equals(code)) {
				return Repo.participantList.get(i);
			}
			
		}
		return null;
	}

}
