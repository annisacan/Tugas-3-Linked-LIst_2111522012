import java.util.LinkedList;

public class testugas {
    public static void main(String[] args){
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();
        
        //add data nama,no.bp,alamat

        System.out.println("---------------------------------TUGAS 3-------------------------------\n");

        nama_mahasiswa.add("Annisa Hasifah Cantika");
        no_bp.add("2111522012");
        alamat.add("Bukittinggi");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        nama_mahasiswa.add("Resi Vilda Hadiutama");
        no_bp.add("2110253044");
        alamat.add("Dharmasraya");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        nama_mahasiswa.add("Sausan Akbari Affa");
        no_bp.add("2111212065");
        alamat.add("Padang");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        nama_mahasiswa.add("Halimah Tusa'diah");
        no_bp.add("2110211010");
        alamat.add("Solok");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");


        System.out.println("-----------------------------------------------------------------------\n");

        //melihat panjang data dengan size()

        System.out.println("Rincian Data Mahasiswa:");

        System.out.println("Banyak Mahasiswa : " +nama_mahasiswa.size());
        System.out.println("Jumlah NIM Mahasiswa : " +no_bp.size());
        System.out.println("Jumlah Alamat Mahasiswa : " +alamat.size());
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

        //menggunakan perintah remove()

        System.out.println("Data Mahasiswa Setelah Dihapus:");

        nama_mahasiswa.removeLast();
        nama_mahasiswa.removeFirst();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        no_bp.removeLast();
        no_bp.removeFirst();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        alamat.removeLast();
        alamat.removeFirst();
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

        //menyelipkan data dengan set()

        System.out.println("Data Mahasiswa setelah diselipkan:");

        nama_mahasiswa.set(0, "Annisa Hasifah Cantika");
        no_bp.set(0, "2111522012");
        alamat.set(0, "Bukittinggi");
        
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

        //mengambil data dengan perintah get()

        System.out.println("Data Mahasiswa setelah diambil:");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Asal Mahasiswa : " +alamat.getFirst());
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

        //menggunakan fungsi pop dan push

        System.out.println("Data Mahasiswa setelah diPush:");

        nama_mahasiswa.push("Resi Vilda Hadiutama");
        no_bp.push("2110253044");
        alamat.push("Dharmasraya");

        nama_mahasiswa.push("Halimah Tusa'diah");
        no_bp.push("2110211010");
        alamat.push("Solok");

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Data Mahasiswa setelah diPop:");
        
        no_bp.pop();
        nama_mahasiswa.pop();
        alamat.pop();

        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Asal Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

        //melihat panjang data dengan size()

        System.out.println("IndeksOF dari Data Mahasiswa:");

        System.out.println(nama_mahasiswa.indexOf("Annisa Hasifah Cantika") );
        System.out.println(no_bp.indexOf("2111522012"));
        System.out.println(alamat.indexOf("Bukittinggi"));
        System.out.println("");

        System.out.println("-----------------------------------------------------------------------\n");

    }

}
