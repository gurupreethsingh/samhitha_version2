
// print the array in forward order
package SORTING_PROGRAMES;

public class BUBBLE_SORT {
public static void main(String[] args) {
	int a[]= {33,44,66,55};
	
	for (int i=1;i<a.length;i++)
	{
		for (int j=0;j<a.length-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int t = a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	for (int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
}
}
