package modules;

public class Paper {
	
	private int price;
	
	String quaility;
	
	int pages;
	
	public Paper() {
		setPrice(0);
		setPages(0);
		setQuaility("none");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getQuaility() {
		return quaility;
	}

	public void setQuaility(String quaility) {
		this.quaility = quaility;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
