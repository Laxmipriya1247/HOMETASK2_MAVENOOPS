

import java.util.Comparator;
	public class Sortchocos implements Comparator<Chocos>
	{
		int op;
		Sortchocos(int n)
		{
			this.op=n;
		}
		public int compare(Chocos a,Chocos b)
		{
			switch(op) 
			{
				case 1:return a.price-b.price;
				case 2:return a.weight-b.weight;
				case 3:return a.no-b.no;
			}
			return 0;
		}
	}