package Array;
public class array1 {
    public static void main(String[] args) {
        int a[] = {11,22,33,40,50};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}