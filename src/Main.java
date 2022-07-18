import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n!= -1){
            System.out.print("Enter n: ");
            n= scanner.nextInt();
            for(int i=0; i<n;i++){
                st.push(i);
            }
            System.out.println(st);
            ArrayList<Integer>arr= new ArrayList<>();
            for (int j = st.size(); j > 0; j--) {
                int temp = st.pop();
                arr.add(temp);
            }
            for(int i=0; i<arr.size(); i++){
                st.push(arr.get(i));
            }
            System.out.println(st);
        }
        }
       
}
