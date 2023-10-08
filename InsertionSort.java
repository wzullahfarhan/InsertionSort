import java.util.Scanner;
public class InsertionSort {
    public static void ShowArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        //array input
        System.out.print("Enput "+a+" Elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        ShowArray(arr);
        //Insertion Sort
        for(int i=1;i<arr.length;i++){
            int current=arr[i]; //70 80
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;

        }
        System.out.println();
        //Sorted Array Called
        ShowArray(arr);
    }
    
}
