//Nhap vao 1 so nguyen duong N, tiep theo la day so gom N so nguyen tu ban phim (theo dung thu tu)
//a. Su dung thuat toan phu hop, sap xep theo thu tu giam dan theo gia tri phan tu. In ra sau khi sap xep

// void GiamDan(int a[], int n) {
//     int i, j, temp = 0;
//     for(i=0;i<n-1;i++) {
//         for(j=i+1;j<n;j++) {
//             if(a[i]<a[j]) {
//                 temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//             }
//         }
//     }
// }
// int main() {
//     int i,n;
//     printf("Nhap N:");
//     scanf("%d", &n);

//     if(n<0 || n>1000) {
//         printf('Khong hop le');
//         return 1;
//     }
//     int a[n];
//     for(i=0;i<n;i++) {
//         printf("Nhap a[%d]", i);
//         scanf("%d", &a[i]);
//     }
//     GiamDan(a,n);
//     printf("Mang sau khi sap xeep la:");
//     for(i=0;i<n;i++){
//         printf("%d", a[i]);
//     }
//     getch();
//     return 0;
// }

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N phai la so nguyen duong.");
            return;
        }

        int[] arr = new int[N];
        System.out.println("Nhap day so gom " + N + " so nguyen:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp dãy số theo thứ tự giảm dần bằng thuật toán sắp xếp chọn
        for (int i = 0; i < N - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Hoán đổi vị trí giữa phần tử tại vị trí i và phần tử có giá trị lớn nhất
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Day so sau khi sap xep giam dan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Tang Dan
// import java.util.Scanner;

// public class Cau3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Nhap vao so nguyen duong N: ");
//         int N = scanner.nextInt();

//         if (N <= 0) {
//             System.out.println("N phai la so nguyen duong.");
//             return;
//         }

//         int[] arr = new int[N];
//         System.out.println("Nhap day so gom " + N + " so nguyen:");
//         for (int i = 0; i < N; i++) {
//             System.out.print("Nhap so thu " + (i + 1) + ": ");
//             arr[i] = scanner.nextInt();
//         }

//         // Sắp xếp dãy số theo thứ tự tăng dần bằng thuật toán sắp xếp chọn
//         for (int i = 0; i < N - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < N; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             // Hoán đổi vị trí giữa phần tử tại vị trí i và phần tử có giá trị nhỏ nhất
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }

//         System.out.println("Day so sau khi sap xep tang dan:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//Cho 1 so nguyen duong, so nguyen dao nguoc thu duoc bang cach viet cac chu so theo thu tu nguoc lai.
//Nhap vao 1 so nguyen duong, tinh hieu cua so nguyen nay voi so nguyen dao nguoc cua no
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Khong hop le");
            return;
        }

        int tam = n;
        int num, temp = 0;
        while (n > 0) {
            num = n % 10;
            temp = temp * 10 + num;
            n /= 10;
        }

        int tru = tam - temp;
        System.out.println("Ket qua la: " + tru);
    }
}
