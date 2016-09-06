import java.util.Random;

public class search {
	public void FIND(int[] array, int x) {
	int i;
    for(i=0; i<array.length; i++)
      if(array[i]==x) break;
    
    if(i==5) System.out.println("Fail!");
    else System.out.println("Success! The RandNum is " + array[i]);
	}
	
	public static void main(String[] args) {
		search sear = new search();
		double randomNum = Math.random();
		int intNum = (int)(randomNum*10)+1;
		int[] arr = {1, 3, 5, 7, 9};
		sear.FIND(arr, intNum);
	}
}
