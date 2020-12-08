import java.util.*;

public class Product {

	String name;
	String description;
	double minimumBid;
	TreeMap<Double, String> productBidHistory = new TreeMap<Double, String>();

	public Product(String name, String description, double minimumBid) {
		this.name = name;
		this.description = description;
		this.minimumBid = minimumBid;

		Repo.productList.add(this);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", description=" + description + ", minimum bid= " + minimumBid + "]";
	}

}
