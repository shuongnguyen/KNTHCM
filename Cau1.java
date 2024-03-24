//Nhap 1 day so nguyen, ket thuc boi -1
//in ra man hinh la 2 so nguyen co gia tri lon nhat va gia tri trung binh cua cac so nguyen da nhap (ko ke -1)
//Nhap 3 5 6 2 -1 Output 6 4
// import java.util.Scanner;

// public class Cau1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num, max = Integer.MIN_VALUE, sum = 0, count = 0;
//         System.out.println("Nhap vao day so nguyen (ket thuc bang -1): ");
        
//         // Nhập dãy số và tìm giá trị lớn nhất
//         while (true) {
//             num = scanner.nextInt();
//             if (num == -1) {
//                 break; // Thoát vòng lặp khi nhập -1
//             }
//             sum += num; // Cộng dồn sum các số (không tính -1)
//             count++; // Tăng biến đếm số lượng số nguyên đã nhập (không tính -1)

//             if (num > max) {
//                 max = num; // Cập nhật giá trị lớn nhất mới vào max
//             }
//         }
//         // Tính trung bình
//         float average = (float) sum / count;

//         // In kết quả
//         System.out.println("Gia tri lon nhat: " + max);
//         System.out.printf("Gia tri trung binh cua cac so: %.2f\n", average);
//     }
// }

//Nhap vao 1 so nguyen duong N, tiep theo la day so gom N so nguyen tu ban phim.
//dem so luong so khac nhau co trong mang
//print la 1 so nguyen duy nhat, la so luong so khac nhau tim duoc
//Input 5 3 2 2 9 2 Output 3

// int main() {
//     int i,n;
//     printf("Nhap N:");
//     scanf("%d", &n);

//     if(n<0 || n>1000) {
//         printf("Khong hop le");
//         return 1;
//     }
//     int a[n];
//     for (i=0; i<n; i++) {
//         printf("Nhap a[%d]", i);
//         scanf("%d", &a[i]);
//     }
//     int mark[1001] = {0};
//     int count = 0;
//     for(i=0;i<n;i++) {
//         if(!mark[a[i]]) {
//             mark[a[i]] = 1;
//             count++;
//         }
//     }
//     printf("So luong so khac nhau la %d", count);
//     getch();
//     return 0;
// }

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n;
        System.out.print("Nhap N: ");
        n = scanner.nextInt();

        if (n < 0 || n > 1000) {
            System.out.println("Khong hop le");
            return;
        }

        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        boolean[] mark = new boolean[1001];
        int count = 0;
        for (i = 0; i < n; i++) {
            if (!mark[a[i]]) {
                mark[a[i]] = true;
                count++;
            }
        }
        System.out.println("So luong so khac nhau la " + count);
    }
}

