package BasicHashing;

import java.util.Scanner;
public class hashing01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sizer of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element");
            arr[i]=sc.nextInt();
        }
        int[] hash=new int[13];
        for(int i =0;i<size;i++){
            hash[arr[i]]+=1;
        }


        System.out.println("Enter the number of elemets you want to search ");
        int q = sc.nextInt();
        while(q--!=0){
            System.out.println("enter the elemt occurence you want to search ");
            int n = sc.nextInt();
            System.out.println(hash[n]);
        }

    }
}