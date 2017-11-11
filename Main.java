
public class Main { 
	static stic[] stics;
	static int  size_stic=3;
	public static stic move_nums(stic source,stic help,stic target,int sum) 
	{
		if (sum==1) 
		{
			print_stics() ;
		    mov(source,target);
		    return target;			
		}
		return move_nums(move_nums(source, target, help,sum-1), source,move_nums(source, help, target, 1), sum-1);
		//return 0;
	}
	public static int mov(stic source,stic target) 
	{
		if (source.last_num()<=0) 
		{
			return 0;
		}
		target.set_num(target.last_num(),source.delte(source.last_num()-1));
		return 0;
	}
	public static void print_stics() 
	{
		for (int i = size_stic-1;i>=0;i--) 
		{
			System.out.print(stics[0].get_num(i));
			System.out.print(stics[1].get_num(i));
			System.out.print(stics[2].get_num(i));
			System.out.println();
			
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		stics=new stic[3];
		for(int i =0 ; i<3;i++) {
			stics[i]= new stic(size_stic);
		}
		for (int i = 0 ; i < size_stic ; i++) 
		{
			stics[0].set_num(size_stic-1-i,i+1);
			stics[1].set_num(i, 0);
			stics[2].set_num(i, 0);
		}
		move_nums(stics[0],stics[1],stics[2],size_stic);
		print_stics();
		
		
	}
}
