package Trail;

public class Class_Driver extends Object
{
	public static void main(String[] args) {
		Lamda_Expression  i=(int a,int b)-> {
			int e=a+b;
		  //System.out.println(e);(without return type)
			return e;
			};
		int z=i.m(10,20);
			
			
			System.out.println(z);
	}
}
