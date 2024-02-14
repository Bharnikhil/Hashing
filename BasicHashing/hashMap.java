package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the element in the array");
            arr[i] = sc.nextInt();
        }

        // pre compute
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int key =arr[i];
            int freq;
            if(mp.containsKey(key)){
                freq=mp.get(key); // fetching from the map
                freq++;
                mp.put(key,freq);
            }else{
                mp.put(key,1);
            }


        }
        System.out.println("for how many elements you want to search ");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("Enter the num whose occurences you want to search");
            int num= sc.nextInt();
            // fetch
            if(mp.containsKey(num)){
                System.out.println(mp.get(num));
            }else{
                System.out.println(0);
            }
        }
    }
}
