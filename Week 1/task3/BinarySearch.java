import java.util.Scanner;
public class BinarySearch{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.print("Enter the element to the search:");
        int key = sc.nextInt();
        int found = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                found = mid;
                break;
            }
            else if(key>arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(found!=-1){
            System.out.println("Element is found :"+found);
        }else{
            System.out.println("Element is not found");
        }
    }
}

