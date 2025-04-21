package javaProjects.MadLibsGame;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama seseorang: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan kata sifat: ");
        String kataSifat = scanner.nextLine();
        
        System.out.print("Masukkan kata kerja: ");
        String kataKerja = scanner.nextLine();
        
        System.out.print("Masukkan nama hewan: ");
        String hewan = scanner.nextLine();
        
        System.out.print("Masukkan tempat: ");
        String tempat = scanner.nextLine();
        
        System.out.print("Masukkan kata benda: ");
        String kataBenda = scanner.nextLine();
        
        System.out.print("Masukkan nama seseorang (2): ");
        String nama2 = scanner.nextLine();
        
        System.out.print("Masukkan nama benda (2): ");
        String kataBenda2 = scanner.nextLine();
        
        // Menampilkan cerita dengan input yang dimasukkan
        System.out.println("\n--- Cerita Mad Libs ---\n");
        System.out.println("Pada suatu hari, " + nama + " yang sangat " + kataSifat + " sedang " + kataKerja + " di " + tempat + ".");
        System.out.println("Tiba-tiba, seekor " + hewan + " muncul dan mengambil " + kataBenda + " milik " + nama + ".");
        System.out.println(nama + " pun berusaha mengejar " + hewan + " tersebut agar bisa mendapatkan kembali " + kataBenda + "-nya.");
        System.out.println("Akhirnya, setelah petualangan yang seru, " + nama + " berhasil mendapatkan " + kataBenda + " kembali dan pulang dengan perasaan lega.");
        System.out.println("Namun, cerita belum selesai. " + nama2 + " diam-diam mengamati kejadian tersebut dan melaporkannya kepada sang penguasa.");
        System.out.println("Sang penguasa yang mendengar hal itu menjadi murka dan segera membawa " + kataBenda2 + " menuju " + tempat + ".");
        System.out.println("Setibanya di " + tempat + ", sang penguasa tiba-tiba dikepung oleh " + nama + " dan " + nama2 + ".");
        System.out.println("Terjadilah pertempuran sengit, hingga akhirnya sang penguasa tumbang di " + tempat + ".");
        System.out.println("Dengan kemenangan tersebut, " + nama + " dan " + nama2 + " berhasil merebut kekuasaan dan mengubah nasib mereka selamanya.");
        System.out.println("\n--- Tamat ---\n");
        
        scanner.close();
    }
}
