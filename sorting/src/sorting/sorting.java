package sorting;

import java.util.Arrays;

class sorting {
	public int[] sorting(int[] array){
		int k=array.length;
		int temp;
		
		k-=1;
	    for(int i=0; i<k; i++)
	    {
	    	for(int j=0; j<k; j++)
	    	{
	    		if(array[j]>array[j+1])
	    		{
	    			temp=array[j];
	    			array[j]=array[j+1];
	    			array[j+1]=temp;
	    		}
	    	}
	    }
	    return array;
	}
	public static void main(String[] args) {
		sorting sor = new sorting();
		int[] arr = {2, 5, 1, 3, 4};
		System.out.println(Arrays.toString(sor.sorting(arr)));

	}

}
