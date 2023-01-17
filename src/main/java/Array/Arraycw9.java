package Array;

public class Arraycw9 {
    public static void main(String[] args) {
        int array2[]={2,23,32,3,53,1,43};
        int min=array2[0];
        for(int i=0;i<array2.length;i++){
            if(array2[i]<min){
                min=array2[i];
            }


        }
        System.out.println(min);
    }
}
