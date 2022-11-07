class OneD_Array {

    public static void main(String[] arg) {
        int arr[] = { 10, 20, 30, 40, 50 };
        for (int x : arr)
            System.out.println(x);

        System.out.println("Now we will print useing normal Loop");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}

class TwoD_Array {

    public static void main(String[] arg) {
        int arr[][] = { { 10, 20, 30, 40 }, { 80, 90, 100, 120 } };
        for (int X[] : arr) {
            for (int ele : X) {
                System.out.print(ele + " ");
            }
            System.out.println(" ");
        }

    }
}

class FatchAlternativeValue {

    public static void main(String[] arg) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        for (int i = 0; i < arr.length; i += 2)
            System.out.print(arr[i] + " ");
    }
}

// class ArrayInitilization {

//     public static void main(String[] arg) {
//         int arr[][]; // valid
//         int[][] brr; // valid
//         int[] crr[];
//         int[] drr; // Valid
//         // int [6] err; InValid

//         int[][] xx, yy; // xx = 2D yy = 2D
//         int[] x[], y; // A=2D, B= 1D
//         drr = new int[-2]; // It will through error in runtime negative size
//         int [][]x1[],y1; //  x1 = 3D, y1 = 2D
//         int [] []x2,y2[6];  // x2 = 2D, y2 = 3D
//     }
// }

class MinMaxEle {

    public static void main(String[] arg) {
        int[] arr = { 25, 30, 40, 70, 10 };
        int max = arr[0];
        int min = arr[0];
        for (int X : arr) {
            if (X > max)
                max = X;
            else if (X < min)
                min = X;
        }
        System.out.println("The Max value " + max);
        System.out.println("The Min value " + min);

    }
}

class CopyArray {

    public static void main(String[] arg) {
        int[] arr = { 25, 30, 40, 70, 10 };
        int[] brr;
        brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            brr[i] = arr[i];
        for (int X : arr)
            System.out.print(X + " ");
        System.out.println("Now 2nd Array elements is:");
        for (int Y : brr)
            System.out.print(Y + " ");

    }
}

class ArrayClass{
    public static void main(String []arg){
        int [] a = new int[4];
        System.out.println(a.getClass().getName());

        int[][] ar=new int[4][2];
		
		System.out.println(ar.getClass().getName());

    }
}