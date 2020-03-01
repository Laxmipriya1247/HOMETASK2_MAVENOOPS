
public class Sweet {
	int price;
    int no;
	public int weight;
	Sweet(int w,int p, int n)
	{
		this.price=p;
		this.weight=w;
		this.no=n;
	}
	public String toString() 
	{
		return "Price: "+this.price+" Weight: "+this.weight+" Quantity: "+this.no;
	}


}
