import java.io.File;
import java.util.Scanner;

public class TampilkanFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan path direktori : ");
        String pathDirektori = input.nextLine();
        File folder = new File(pathDirektori);

        if (folder.exists() && folder.isDirectory()) {
            File[] isiFolder = folder.listFiles();
            System.out.println("\n===== DAFTAR FILE =====");
            for (File data : isiFolder) {
                System.out.println(data.getName());
            }
            System.out.println("=======================");
        } else {
            System.out.println("Folder tidak ditemukan!");
        }
        input.close();
    }
}