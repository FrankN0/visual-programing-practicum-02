//12S23016 - Frank Niroy Siahaan

import java.util.*;
import java.lang.Math;

class P0@ {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, kode, matkul, dosen, deadline, nim, status, hasil1, hasil2, hasil3;
        double tingkat, hari, prioritas;

        nama = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
        nim = input.nextLine();
        tingkat = input.nextDouble();
        hari = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkat * (1.0 / hari);
        System.out.println("Prioritas : " + toFixed(prioritas,2));
        if (prioritas > 3.0) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3.0) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(nama + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + nim + "|" + tingkat + "|" + hari + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
