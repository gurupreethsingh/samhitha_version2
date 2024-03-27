package algorithms;

public class Bubblesort {

	public static void main(String[] args) {
		
			int a[]= {33,11,44,55,22};
			for (int i = 1; i < a.length; i++) {
				for (int j = 0; j < a.length-i; j++) {
					{
						if (a[j] > a[j+1])
						{
							int t =a[j];
							a[j]=a[j+1];
							a[j+1]=t;
						}
					
					}
						
					}
				
				}
			for (int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			}

		}

	

	


