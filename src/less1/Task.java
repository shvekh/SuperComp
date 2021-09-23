package less1;

import java.util.Scanner;

public class Task {
  public static void one(Scanner sc) {
    System.out.print("less1.Task #1\nEnter a number: ");
    System.out.print("Result: " + sc.nextInt() % 10 + "\n");
  }

  public static void two(Scanner sc) {
    System.out.print("less1.Task #2\nEnter a number: ");
    int a = sc.nextInt();
    System.out.println("Result: " + (a / 100 + a / 10 % 10 + a % 10));
  }

  public static void three(Scanner sc) {
    System.out.print("less1.Task #3\nEnter a number: ");
    int a = sc.nextInt();
    System.out.println(a > 0 ? a + 1 : a);
  }

  public static void four(Scanner sc) {
    System.out.print("less1.Task #4\nEnter a number: ");
    int a = sc.nextInt();

    if (a > 0)
      a += 1;
    else if (a < 0)
      a -= 2;
    else
      a = 10;
    System.out.println(a);
  }

  public static void five(Scanner sc) {
    System.out.println("less1.Task #5\nEnter three number: ");
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();

    System.out.print("Minimum: ");
    if (d < e && d < f)
      System.out.println(d);
    else if (e < d && e < f)
      System.out.println(e);
    else
      System.out.println(f);
  }

  public static void six(Scanner sc) {
    System.out.print("less1.Task #6\nEnter a number: ");
    int a = sc.nextInt();
5
    if (a == 0)
      System.out.println("Zero number");
    else if (a > 0 && a % 2 == 0)
      System.out.println("Positive even number");
    else if (a > 0 && a % 2 != 0)
      System.out.println("Positive odd number");
    else if (a < 0 && a % 2 == 0)
      System.out.println("Negative even number");
    else if (a < 0 && a % 2 != 0)
      System.out.println("Negative odd number");
  }

  public static void seven(Scanner sc) {
    System.out.print("less1.Task #7\nEnter a number: ");
    int r = sc.nextInt();

    if (r == 905)
      System.out.println("Москва. стоимость разговра: " + 4.15 * 10);
    else if (r == 194)
      System.out.println("Ростов. стоимость разговра: " + 1.98 * 10);
    else if (r == 491)
      System.out.println("Краснодар. стоимость разговра: " + 2.69 * 10);
    else if (r == 800)
      System.out.println("Киров. стоимость разговра: " + 5 * 10);
    else
      System.out.println("Город не найден");
  }

  public static void eight(int[] ar) {
    System.out.print("less1.Task #8\nArray: ");
    for (int a : ar)
      System.out.print(a + " ");
    System.out.print("\n");

    int len = ar.length;
    int max = 0;
    int sumPos = 0;
    int evenNeg = 0;
    int countPos = 0;
    int sumNeg = 0;
    int countNeg = 0;
    int i = 0;

    while (i < len) {
      if (max < ar[i])
        max = ar[i];
      if (ar[i] < 0 && ar[i] % 2 == 0)
        evenNeg += ar[i];
      if (ar[i] >= 0) {
        sumPos += ar[i];
        countPos++;
      } else {
        sumNeg += ar[i];
        countNeg++;
      }
      i++;
    }
    if (countNeg == 0)
      countNeg = 1;
    System.out.println("Max value: " + max);
    System.out.println("Sum positive elements: " + sumPos);
    System.out.println("Sum negative odd elements: " + evenNeg);
    System.out.println("Quantity positive elements: " + countPos);
    System.out.println("Arithmetic mean negative elements" + sumNeg / countNeg);
  }

  public static void nine(int[] arr) {
    System.out.print("less1.Task #9\nArray: ");
    for (int a : arr)
      System.out.print(a + " ");
    System.out.print("\n");

    int len = arr.length;
    int[] arr2 = new int[len];
    int i = 0;
    System.out.print("Result: ");
    while (len > 0) {
      arr2[i] = arr[--len];
      System.out.print(arr2[i++] + " ");
    }
    System.out.print("\n");
  }

  public static void ten(int[] arr) {
    System.out.print("less1.Task #10\nArray: ");
    for (int a : arr)
      System.out.print(a + " ");
    System.out.print("\n");

    int len = arr.length;
    int[] arr2 = new int[len];
    int i = 0;
    int z = 0;
    while (i < len) {
      if (arr[i] != 0)
        arr2[z++] = arr[i];
      i++;
    }
    while (z < len) {
      arr2[z++] = 0;
    }
    System.out.print("Result: ");
    for (int a : arr2)
      System.out.print(a + " ");
    System.out.print("\n");
  }

  public static void main(String[] mss) {
    Scanner sc = new Scanner(System.in);
    int arr1[] = { 1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2 };
    int arr2[] = { 15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52 };
    int arr3[] = { 15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52 };
    one(sc);
    two(sc);
    three(sc);
    four(sc);
    five(sc);
    six(sc);
    seven(sc);
    eight(arr1);
    nine(arr2);
    ten(arr3);
  }
}
