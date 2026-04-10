import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            
            int count = 0;
            for (int val : set) {
                System.out.print(val + (count == set.size() - 1 ? "" : " "));
                count++;
            }
            System.out.println();
        }scanner.close();
    }
}
