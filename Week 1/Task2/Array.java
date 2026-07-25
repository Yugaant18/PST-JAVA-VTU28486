import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.print("Enter the index:");
        int index=sc.nextInt();
        System.out.println("Element :"+arr[index]);

    }
}