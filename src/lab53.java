public class lab53{
    public static void main(String args[]){
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];
        float sum1=0f;
        float sum2=0f;
        float sum3=0f;
        float ser1=0f;
        float ser2=0f;
        float ser3=0f;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 5));
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int)(Math.random() * 5));
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = ((int)(Math.random() * 5));
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
        }
        System.out.println(sum1);
        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];
        }
        System.out.println(sum2);
        for (int i = 0; i < array3.length; i++) {
            sum3 = sum3 + array3[i];
        }
        System.out.println(sum3);
        ser1=sum1/5;
        System.out.println(ser1);
        ser2=sum2/5;
        System.out.println(ser2);
        ser3=sum3/5;
        System.out.println(ser3);
        if(ser1==ser2 && ser1==ser3 && ser2==ser3){
            System.out.println("Середні значення рівні");
        }
        else if(ser1>ser2 && ser1>ser3){
            System.out.println("Найбільшим є перше середнє значення");
        }
        else if(ser2>ser3 && ser2>ser3){
            System.out.println("Найбільшим є друге середнє значення");
        }
        else {
            System.out.println("Найбільшим є третє середнє значення");
        }
    }
}