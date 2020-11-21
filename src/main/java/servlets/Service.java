package servlets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Service {
    public String gaussian(double[] Arr) {


        /* Ввод данных */

        int n = 2;
        int m = 2;
        double[][] A = new double[100][100];
        double[] b = new double[100];
        int count = 0;
        for (int i = 0; i < n; i++) {
            //  A[i] = new double[100];
            for (int j = 0; j < m; j++) {
                A[i][j] = Arr[count];
                count++;
            }
            b[i] = Arr[count];
            count++;
        }

        /* Метод Гаусса */

        int N = n;
        for (int p = 0; p < N; p++) {

            int max = p;
            for (int i = p + 1; i < N; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            double[] temp = A[p];
            A[p] = A[max];
            A[max] = temp;
            double t = b[p];
            b[p] = b[max];
            b[max] = t;

            if (Math.abs(A[p][p]) <= 1e-10) {
                System.out.println("NO");
                return "NO Results";
            }

            for (int i = p + 1; i < N; i++) {
                double alpha = A[i][p] / A[p][p];
                b[i] -= alpha * b[p];
                for (int j = p; j < N; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }

        // Обратный проход

        double[] x = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        /* Вывод результатов */
        StringBuffer stringBuffer=new StringBuffer();
        if (n < m) {
            System.out.print("INF");
        } else {
            stringBuffer.append("Results: ");
            System.out.println("YES");
            for (int i = 0; i < N; i++) {
                System.out.print(x[i] + " ");
               stringBuffer.append(x[i]).append(" ");

            }
        }
return stringBuffer.toString();
    }
}



