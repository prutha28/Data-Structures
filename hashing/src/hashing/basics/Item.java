package hashing.basics;

public class Item {

	private String productId ; // key
	private String productName ;
	private double productPrice ;
	private Item nextItem ;


	public Item(String productId, String productName, double productPrice, Item nextItem) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.nextItem = nextItem ;
	}

	public Item( String productName ) {
		this.productName = productName;
		this.productId = "" ;
		this.productPrice = 0 ;
		this.nextItem = null ;
	}

	public Item getNextItem() {
		return nextItem;
	}

	public void setNextItem(Item nextItem) {
		this.nextItem = nextItem;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public boolean equals(Object obj) {
		Item other ;

		if( obj instanceof Item)
			other = (Item)obj ;
		else
			return false ;

		if( this == null && other == null)
			return true ;
		else if( this != null && other != null)
			return this.getProductName().equals(other.getProductName()) ;
		else
			return false ;

	}

	@Override
	public int hashCode() {

		int hash = 0 ;

		for (int i = 0; i < productName.length(); i++) {
			hash = hash + productName.charAt(i) ;
		}
		return (int) ( hash % Hash.TABLE_SIZE) ;
	}


	@Override
	public String toString() {
		return String.format("Product Id : %s\nProduct Name : %s\nProduct Price : %f",
				this.getProductId(),
				this.getProductName(),
				this.getProductPrice()) ;
	}


	public String getKey( Item item){
		return item.getProductName() ;
	}

}
