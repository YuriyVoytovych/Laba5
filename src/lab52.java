public class lab52 {
    public static void main(String[] args) {
        int counter = 0;
        int array[] = new int[21];
        for (int i = 0; i < 21; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
        }
        for (int i = 0; i < 21; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        for (int i = 0; i < 21; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

