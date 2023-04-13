public class lab51 {
    public static void main(String[] args) {
        int i=0;
        int[] array = new int[50];
        for(int a=1; a<=99; a= 2 + a, i++){
           array[i]=a;
           System.out.println(array[i]);
        }
    }
}