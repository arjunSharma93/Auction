
import java.util.*;

public class Admin {

	String name;
	public static int index;
	public List<Product> copyOfProductList = new LinkedList<Product>();

	public Admin(String name) {
		this.name = name;
	}

	Scanner s = new Scanner(System.in);

	public void addProduct() {

		System.out.println("enter product name: ");
		String productName = s.nextLine();
		System.out.println("enter product description: ");
		String productDescription = s.nextLine();
		System.out.println("enter product minimum bid: ");
		double minimumBid = s.nextDouble();

		copyOfProductList.add(new Product(productName, productDescription, minimumBid));
		
		
		s.nextLine();

	}

	public void startAcution() {
		
		

		System.out.println("choose product from the list: " + copyOfProductList);
		System.out.println("enter product's index no: ");
		index = s.nextInt();
		System.out.println("Biding / Auction start for: " + copyOfProductList.get(index));
		copyOfProductList.remove(index);

	}

}
