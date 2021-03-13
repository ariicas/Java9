package repls;

public class Q {

	public static void main(String[] args) {
		
	
		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];
		                  System.out.println(what);
		        }

		}

		
		int k=3, tot=0;

		do{

		   tot=tot+k;

		   k++;

		} while(k<11);

		System.out.print(tot);
		int x=1;

		do{

		   x++;

		   System.out.print(x);
	
		}

		while(x<5);
		
		int z=2, sum=0;

		while(z<9) {

		   z++;

		   sum=sum+z;

		}

		System.out.print(sum);
System.out.println("=========================================================");		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		int nums[] = { 12, 15, 16, 17, 19 };

		   for (int i = nums.length-1; i >0; i--) {

		      System.out.println(nums[i]);
		      
		    }
		  
		   int[] a = {12, 15, 11, 13, 9, 25};
		      int[] a2 = {12, 15, 11, 13, 9, 25};
		      int su = 0;
		      for (int l = 0; l <a.length; l++) {
		               if (a[l] % 2== a2[l ] % 5)  {
		                        su += l * l;
		                        System.out.println("sum = " + su);
		               }
		             
		            
//		               int[] arry = { 1, 4, 3, 6, 8, 2, 5 };
//
//		               int wht = array[0];
//
//		               for (int index = 0; index < array.length; index++) {
//
//		                      if (arry[index] > wht) {
//
//		                                 wht = arry[index];
//		                                 	System.out.println(wht);
		                       
		                 

for(int u = 0; u <= 5; u++ ) {
   System.out.println("i = " + u );
}
//
//System.out.println("i after the loop = " + u );

		      }
		    
		}

	}

		