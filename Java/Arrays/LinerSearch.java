import java.util.Scanner;

public class LinerSearch {
    public static void main(String []arg){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        int arr [];
        arr = new int[size];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<size;i++)
            arr[i] = scan.nextInt();
        System.out.println("Enter the Key which you want to find :");
        int key = scan.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++)
        {
            if(key == arr[i])
            {
                System.out.println("Key "+key+ " Found at index " + i);
                flag = true;
                break;
            }      
        }
        if(flag == false)
            System.out.println("Key not found:");


    }
}
