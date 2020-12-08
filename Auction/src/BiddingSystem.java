
import java.io.*;
import java.util.*;

public class BiddingSystem {

	public String code = "";
	public double amount = 0.0;
	// Admin admin;
	// Scanner s = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*
	 * TimerTask task = new TimerTask() {
	 * 
	 * @Override public void run() { if (code.equals("") || amount == 0.0) {
	 * System.out.println("Times Up"); System.out.println(Repo.biddingHistory);
	 * System.out.println(Repo.biddingHistory.get(Repo.biddingHistory.lastKey()) +
	 * " gets the product with rs. " + Repo.biddingHistory.lastKey());
	 * //System.exit(0); } }
	 * 
	 * };
	 * 
	 * public void getInput() throws Exception { Timer timer = new Timer();
	 * timer.schedule(task, 20 * 1000); BufferedReader br = new BufferedReader(new
	 * InputStreamReader(System.in)); while (true) {
	 * System.out.println("enter your correct code:"); code = br.readLine(); if
	 * (Repo.cheackCode(code)) break; else {
	 * System.out.println("your code is wrong\n"); } } while (true) {
	 * System.out.println("enter bid amount more than minimum bid: " +
	 * Repo.productList.get(Admin.index).minimumBid); amount =
	 * Double.parseDouble(br.readLine()); if (amount >
	 * Repo.productList.get(Admin.index).minimumBid) break; else {
	 * System.out.println("amount should be more than minimum bid"); } }
	 * 
	 * timer.cancel(); System.out.println(code + " bid with Rupee " + amount);
	 * Repo.biddingHistory.put(amount, code);
	 * 
	 * 
	 * }
	 */

	public void system() throws IOException {

		while (true) {

			Thread timer = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						for (int i = 0; i < 10; i++) {
							System.out.print(i + " ");
							Thread.sleep(1000);
						}
						System.out.println("times up \n" + Repo.productList.get(Admin.index).productBidHistory);
						try {
							System.out.println(Repo
									.participantDetails(Repo.productList.get(Admin.index).productBidHistory
											.get(Repo.productList.get(Admin.index).productBidHistory.lastKey()))
									+ " gets the product with rs. "
									+ Repo.productList.get(Admin.index).productBidHistory.lastKey());
						} catch (Exception e) {
							System.out.println("No one has enter any bid");
						}

					} catch (InterruptedException e) {
						System.out.println("thread interrupted");

					}

				}

			});

			timer.start();
			while (timer.isAlive()) {
				System.out.println("enter your correct code:");
				code = br.readLine();
				if (Repo.cheackCode(code))
					break;
				else {
					System.out.println("your code is wrong\n");
				}
			}

			while (timer.isAlive()) {
				System.out.println(
						"enter bid amount more than minimum bid: " + Repo.productList.get(Admin.index).minimumBid);
				amount = Double.parseDouble(br.readLine());
				if (amount > Repo.productList.get(Admin.index).minimumBid)
					break;
				else {
					System.out.println("amount should be more than minimum bid");
				}
			}
			if (timer.isAlive()) {
				Repo.productList.get(Admin.index).productBidHistory.put(amount, code);
				timer.interrupt();
			} else {
				break;
			}

		}

	}

}
