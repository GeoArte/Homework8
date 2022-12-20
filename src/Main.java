public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {2, 12, 24, 54, 6656};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {2, 12, 24, 54, 6656};
        System.out.print("    ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(a[i]);
            if (i < 2)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("    ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(b[i]);
            if (i < 2)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("    ");
        for (int i = 0; i < c.length; i++)
        {
            System.out.print(c[i]);
            if (i < c.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {2, 12, 24, 54, 6656};
        System.out.print("    ");
        for (int i = a.length-1; i >= 0; i--)
        {
            System.out.print(a[i]);
            if (i > 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("    ");
        for (int i = 02; i >=0; i--)
        {
            System.out.print(b[i]);
            if (i > 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("    ");
        for (int i = (c.length-1); i >=0; i--)
        {
            System.out.print(c[i]);
            if (i > 0)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        System.out.print("    ");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i ++)
        {
            if (a[i] % 2 == 1)
                a[i] ++;
            System.out.print(a[i]);
            if (i < a.length-1)
            {
                System.out.print(", ");
            }
        }
    }
}