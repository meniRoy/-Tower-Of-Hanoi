public class stic {
	private int[] arr ;
	private int lastnum;
	public stic(int size) 
	{
		this.arr = new int [size];
		this.lastnum=0;
	}
	public int get_num(int place) 
	{
		return this.arr[place];
	}
	public int last_num() 
	{
		return this.lastnum;
	}
	public void set_num(int place,int num) 
	{
		this.arr[place]=num;
		if(num!=0) 
		{
			this.lastnum++;
		}
		
	}
	public int delte(int place) 
	{
		int num= this.arr[place];
		this.arr[place] =  0;
		this.lastnum--;
		return num;
	}
}
