import java.util.Scanner;
 
 public class GabunganSelectionOperator {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
 // Selection statement (if-else)
 System.out.print("Masukkan angka: ");
 int angka = input.nextInt();

if (angka > 0) {
System.out.println("Angka yang dimasukkan adalah bilangan positif");
} else if (angka < 0) {
System.out.println("Angka yang dimasukkan adalah bilangan negatif");
} else {
System.out.println("Angka yang dimasukkan adalah nol");
}

// Operator aritmatika
int x = 5;
int y = 3;
int hasilPenjumlahan = x + y;
int hasilPengurangan = x - y;
int hasilPerkalian = x * y;
double hasilPembagian = (double) x / y;

System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
System.out.println("Hasil Pengurangan: " + hasilPengurangan);
System.out.println("Hasil Perkalian: " + hasilPerkalian);
System.out.println("Hasil Pembagian: " + hasilPembagian);

// Selection statement (switch)
System.out.print("Masukkan pilihan (A, B, atau C): ");
char pilihan = input.next().charAt(0);

switch (pilihan) {
case 'A':
System.out.println("Anda memilih pilihan A");
break;
case 'B':
System.out.println("Anda memilih pilihan B");
break;
case 'C':
System.out.println("Anda memilih pilihan C");
break;
default:
System.out.println("Pilihan yang dimasukkan tidak valid");
break;
}
}
}