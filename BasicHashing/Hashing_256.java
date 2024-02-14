package BasicHashing;

import java.util.Scanner;

public class Hashing_256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING");
        String str=sc.next();

        int[] hash = new int[256];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]+=1;

        }
        int q;
        System.out.println("Enter the number of occurences you want ");
        q=sc.nextInt();
        while (q--!=0){
            char c;
            System.out.println("eNTER THE CHARCATER WHOSE occurence you want to find out");
            c=sc.next().charAt(0);
            System.out.println(hash[c]);
        }

    }
}
