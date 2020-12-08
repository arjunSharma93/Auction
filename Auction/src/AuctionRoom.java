import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AuctionRoom {

	public static void main(String[] args) throws IOException {

		int choice;

		Scanner s = new Scanner(System.in);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Admin enter your name: ");
		String adminName = br.readLine();
		Admin admin = new Admin(adminName);

		while (true) {

			admin.addProduct();

			System.out.println("want to continue? press 1 for YES, press 0 for NO");
			choice = s.nextInt();
			if (choice == 0)
				break;
		}

		System.out.println("...Bidding Room is open for bidders... \n     Add all the bidders one by one");

		while (true) {

			Repo.addParticipant();

			System.out.println("want to continue? press 1 for YES, press 0 for NO");
			choice = s.nextInt();
			if (choice == 0)
				break;
		}

		for (int i = 0; i < Repo.productList.size(); i++) {

			admin.startAcution();

			System.out.println("to place your bid enter your unique code and amount whitin 10 seconds");

			new BiddingSystem().system();
		}

		/*
		 * while(!copyOfProductList.isEmpty()) { admin.startAcution();
		 * copyOfProductList.remove(Admin.index);
		 * 
		 * while(true) { Timer timer = new Timer(); Auctioneer auctioneer = new
		 * Auctioneer(timer); timer.start(); auctioneer.start();
		 * 
		 * }
		 * 
		 * }/*
		 * 
		 * 
		 * 
		 * /* while (true) { try { new BiddingSystem().getInput(); } catch (Exception e)
		 * { e.printStackTrace(); break; } }
		 */

	}

}
