package Array;

public class Arraycw8 {
    public static void main(String[] args) {
  //store the following arrays into an array and print the maximum element of an array
       // 10,15,20,25,35,75,80,95
        int array1[]={10,150,20,25,35,75,80,95};
        int max=array1[0];

        for(int i=0;i<array1.length;i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println(max);
    }
}
