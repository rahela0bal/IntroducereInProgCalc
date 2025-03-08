package main;

import java.util.Scanner;

public class tema_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Verificare număr
        System.out.print("Introdu un număr: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("INVALID");
        } else if (num > 5) {
            System.out.println("ADMIS");
        } else {
            System.out.println("RESPINS");
        }
        
        // 2. Convertire număr în litere
        System.out.print("Introdu un număr între 1 și 5: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println("UNU");
            case 2 -> System.out.println("DOI");
            case 3 -> System.out.println("TREI");
            case 4 -> System.out.println("PATRU");
            case 5 -> System.out.println("CINCI");
            default -> System.out.println("INVALID");
        }
        
        // 3. Operatii pe două numere
        System.out.print("Introdu două numere: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Media: " + (a + b) / 2.0);
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Produs: " + (a * b));
        } else {
            System.out.println("Suma: " + (a + b));
        }
        
        // 4. Minim din trei numere
        System.out.print("Introdu trei numere: ");
        int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
        System.out.println("Minim: " + Math.min(x, Math.min(y, z)));
        
        // 5. Suma primelor n numere pare
        System.out.print("Introdu n: ");
        int m = scanner.nextInt();
        int sumEven = 0, sumOdd = 0, count = 0, sum = 0;
        for (int i = 2; count < m; i += 2, count++) sumEven += i;
        System.out.println("Suma pare: " + sumEven);
        
        // 6. Suma primelor n numere impare
        count = 0;
        for (int i = 1; count < m; i += 2, count++) sumOdd += i;
        System.out.println("Suma impare: " + sumOdd);
        
        // 7. Media n numere
        System.out.print("Introdu n: ");
        int numCount = scanner.nextInt();
        sum = 0;
        for (int i = 0; i < numCount; i++) sum += scanner.nextInt();
        System.out.println("Media: " + (sum / (double) numCount));
        
        // 8. Factorial
        System.out.print("Introdu n: ");
        int factN = scanner.nextInt();
        long fact = 1;
        for (int i = 1; i <= factN; i++) fact *= i;
        System.out.println("Factorial: " + fact);
        
        // 9. Verificare număr prim
        System.out.print("Introdu n: ");
        int primeNum = scanner.nextInt();
        boolean isPrime = primeNum > 1;
        for (int i = 2; i * i <= primeNum && isPrime; i++) if (primeNum % i == 0) isPrime = false;
        System.out.println(isPrime ? "PRIM" : "NU ESTE PRIM");
        
        // 10. Cel mai mic număr prim mai mare ca 1000
        int nextPrime = 1001;
        while (true) {
            boolean found = true;
            for (int i = 2; i * i <= nextPrime; i++) if (nextPrime % i == 0) found = false;
            if (found) break;
            nextPrime++;
        }
        System.out.println("Cel mai mic prim > 1000: " + nextPrime);
        
        // 11. Divizorii unui număr
        System.out.print("Introdu n: ");
        int divNum = scanner.nextInt();
        System.out.print("Divizori: ");
        for (int i = 1; i <= divNum; i++) if (divNum % i == 0) System.out.print(i + " ");
        System.out.println();
        
        // 16. Cifrele unui număr
        System.out.print("Introdu un număr: ");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.print(number % 10 + " ");
            number /= 10;
        }
        System.out.println();
        
        // 19. Inversul unui număr
        System.out.print("Introdu un număr: ");
        int revNum = scanner.nextInt();
        int reversed = 0;
        while (revNum > 0) {
            reversed = reversed * 10 + revNum % 10;
            revNum /= 10;
        }
        System.out.println("Invers: " + reversed);
        
        // 20. Verificare palindrom
        System.out.print("Introdu un număr: ");
        int palNum = scanner.nextInt(), temp = palNum, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(palNum == rev ? "PALINDROM" : "NU ESTE PALINDROM");
    }
}
