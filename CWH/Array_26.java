public class Array_26 {
    public static void main(String[] args) {
        //Array
        // int[] marks = new int[5];
        // int[] marks;
        // marks = new int[5];

        // int marks[] = new int[5];

        // int[] marks = {1, 2, 3, 4, 5};
        int marks[] = {1, 2, 3, 4, 5};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(marks.length);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            marks[i] = i + 1;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }



    }

}
