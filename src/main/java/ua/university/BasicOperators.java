package ua.university;

import java.util.Arrays;

public class BasicOperators
{
    public static double[] sumAndAverage(int a, int b, int c)
    {
        double sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    public static int maxOfThree(int a, int b, int c)
    {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score)
    {
        if (score < 0 || score > 100)
        {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return 'F';
    }

    public static String dayOfWeek(int day)
    {
        switch (day)
        {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("Day must be 1-7");
        }
    }

    public static int[] countdown(int n)
    {
        if (n < 1)
        {
            throw new IllegalArgumentException("n must be positive");
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = n - i;
        }
        return arr;
    }

    public static long factorial(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Negative not allowed");
        }

        long result = 1;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static int[] reverseArray(int[] arr)
    {
        if (arr == null)
        {
            throw new IllegalArgumentException("Array is null");
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int sumMatrix(int[][] matrix)
    {
        if (matrix == null)
        {
            throw new IllegalArgumentException("Matrix is null");
        }

        int sum = 0;
        for (int[] row : matrix)
        {
            for (int v : row)
            {
                sum += v;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("String is null");
        }

        int left = 0, right = s.length() - 1;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] findMinMax(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];
        int max = arr[0];
        for (int val : arr)
        {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("n must be > 0");
        }

        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static int[] evenNumbersUpToN(int n)
    {
        if (n < 2)
        {
            return new int[0];
        }

        int count = n / 2;
        int[] result = new int[count];
        for (int i = 0; i < count; i++)
        {
            result[i] = 2 * (i + 1);
        }
        return result;
    }

    public static boolean isPrime(int n)
    {
        if (n < 2)
        {
            return false;
        }
        if (n == 2)
        {
            return true;
        }
        if (n % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(String s)
    {
        if (s == null)
        {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray())
        {
            if (vowels.indexOf(c) != -1)
            {
                count++;
            }
        }
        return count;
    }

    public static int[] fibonacci(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }

        if (n == 0)
        {
            return new int[0];
        }

        int[] arr = new int[n];
        if (n >= 1) arr[0] = 0;
        if (n >= 2) arr[1] = 1;

        for (int i = 2; i < n; i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static int[][] transpose(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int[] sortArray(int[] arr)
    {
        if (arr == null)
        {
            throw new IllegalArgumentException("Array is null");
        }

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }
}
