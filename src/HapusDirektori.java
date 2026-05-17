import java.io.File;
import java.util.Scanner;

public class HapusDirektori {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan path folder : ");
        String pathFolder = input.nextLine();
        File folder = new File(pathFolder);

        if (folder.exists() && folder.isDirectory()) {
            File[] isiFolder = folder.listFiles();
            System.out.println("\n======================================");
            for (File data : isiFolder) {
                if (data.isFile()) {
                    boolean hasilHapus = data.delete();
                    if (hasilHapus) {
                        System.out.println("Berhasil menghapus file : " + data.getName());
                    } else {
                        System.out.println("Gagal menghapus file : " + data.getName());
                    }
                }
            }

            System.out.println("======================================");
            boolean folderTerhapus = folder.delete();

            if (folderTerhapus) {
                System.out.println("Folder berhasil dihapus");
            } else {
                System.out.println("Folder gagal dihapus");
            }
            System.out.println("======================================");
        } else {
            System.out.println("Folder tidak ditemukan!");
        }
        input.close();
    }
}