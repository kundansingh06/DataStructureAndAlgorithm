package kundan.dsalgo.searching;

public class BinarySearch_Iterative {
    public static void main(String[] args) {
        int arr[]={2,3,8,10,12,15,20};
        int searchelement=12;
        int result=binarySearchIterative(arr,searchelement);
        if (result==-1){
            System.out.println("Element "+searchelement+" is not present in array");
        }
        else{
            System.out.println("Element "+searchelement+" is present at index "+result);
        }

    }

    private static int binarySearchIterative(int[] arr, int searchelement) {
        int firstIndex=0;
        int lastIndex=arr.length-1;
        while(firstIndex<=lastIndex){
            int middleIndex=(firstIndex+lastIndex)/2;

            if(arr[middleIndex]==searchelement){
                return middleIndex;
            }
            else if(arr[middleIndex]<searchelement){
                firstIndex= middleIndex+1;
            }
            else if(arr[middleIndex]>searchelement){
                lastIndex= middleIndex-1;
            }
        }
        return -1;
    }
}
