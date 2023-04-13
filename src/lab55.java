public class lab55{
    public static void main(String args[]){
        int[] array1 = new int[15];
        int sum=0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 10));
            System.out.print(array1[i] + " ");
        }
        for (int i=0; i < array1.length; i++) {
            if(array1[i]%2==0){
                sum=sum+1;
            }
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}