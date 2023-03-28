package kundan.dsalgo.searching;

public class LinearSearch_Iterative {

    public static void main(String[] args) {
        int arr[]={2,3,8,10,12,15,20};
        int searchelement=12;
        int result=searchIterative(arr,searchelement);
        if (result==-1){
            System.out.println("Element "+searchelement+" is not present in array");
        }
        else{
            System.out.println("Element "+searchelement+" is present at index "+result);
        }

    }

    private static int searchIterative(int[] arr, int searchelement) {
        for(int i=0;i< arr.length;i++){
            if (arr[i]==searchelement){
                return i;
            }
        }
        return -1;
    }
}
