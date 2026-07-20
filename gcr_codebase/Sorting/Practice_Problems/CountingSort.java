import java.util.Arrays;
public class CountingSort{
	public static int[] countingSort(int arr[],int range){
		int n=arr.length;
		int output[]=new int[n];
		int count[]=new int[range+1];
		
		System.out.println("Input array:" +Arrays.toString(arr));
		for(int i=0;i<n;i++){
			count[arr[i]]++;
		}
		System.out.println("Count Array:" +Arrays.toString(count));
		for(int i=1;i<=range;i++){
			count[i]+=count[i-1];
		}
		
		System.out.println("Prefix sum Array:" +Arrays.toString(count));
		
		 for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
		return output;
	}		

public static void main(String[] args){
	int[] arr={4, 2, 2, 8, 3, 3, 1};
	int range=8;
	
	int[] sortedArr = countingSort(arr, range);
        System.out.println("Sorted Array:     " + Arrays.toString(sortedArr));
    }
}
