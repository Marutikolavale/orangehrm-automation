package TestDemo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array Array=new Array();
		Array.array3();
	}
	public void singleArray1(){
		int a[]= new int[5];
		System.out.println("lenght of array"+a.length);
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;

		for(int x:a)
		{
			System.out.println(x+"");
		}



	}


	public void array2()
	{
		int b[]= {10,20,30,40,50,60,70};	 


		System.out.println("length array"+b.length);
		for(int x:b)
		{
			System.out.println(x+" ");
		}


	}
	public void array3()
	{
		int c[][]= {{100,200,900,1000},{300,400,700},{500,600}};


		System.out.println(c.length);
		System.out.println(c[1].length);
		System.out.println(c[2].length);

		/*	 for(int r=0;r<c.length;r++)
	 {
		 for(int k=0;k<c[r].length;k++ )
		 {
			 System.out.print(c[r][k]+" ");
		 }
		 System.out.println();
	 }
 }
		 */
		for(int arr[] :c)
		{
			System.out.print("{");
			for(int a :arr)
			{
				System.out.print(+a+" ");
			}
			System.out.print("}");
			System.out.println();
		}
	}

}
