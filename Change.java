class Change
{
	public static void change(int x,int y)
	{
		x = x + y;
		y = x - y;
		x = x -y;
	}
	
	public static void change(int[] num)
	{
		num[0] = num[0] + num[1];
		num[1] = num[0] - num[1];
		num[0] = num[0] - num[1];
	}
	
	public static void main(String[] args)
	{
		/*
		int x = 4;
		int y = 5;
		
		change(x,y);
		System.out.println("x=" + x + ", y= "+y);
		*/
		int[] num = new int[] {4,5};
		change(num);
		System.out.println("x=" + num[0] + ", y= "+num[1]);
	}


}