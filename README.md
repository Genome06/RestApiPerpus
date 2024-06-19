# RestApiPerpusApplication

Project RestAPI perpus ini adalah sebuah mini project RestAPI yang memungkinkan pengguna mengelola daftar buku dalam sebuah perpustakaan. API ini akan memungkinkan pengguna untuk menambahkan, mengambil daftar, mengambil detail, memperbarui, dan menghapus buku dari perpustakaan. Project ini menggunakan springboot sebagai framework nya dan MySQL sebagai sumber database nya.

## Instalasi

Langkah-langkah untuk menginstal dan menjalankan proyek ini:

1. Clone Repository :
   - "git clone https://github.com/username/RestApiPerpus.git"

     Ganti username dengan username GitHub Anda atau URL repository yang sesuai. 
2. Masuk Ke Direktori Proyek :
   - "cd RestApiPerpus"

     Pindah ke direktori proyek yang baru saja di-clone.
3. Konfigurasi Database :
   Pastikan Anda memiliki konfigurasi database yang sesuai dalam file application.properties atau application.yml. Sesuaikan URL, username, dan password database dengan lingkungan pengembangan Anda.
4. Build Proyek :
   - "mvn clean install"

     Perintah di atas akan membersihkan proyek, mengunduh dependensi yang diperlukan, dan melakukan build proyek.
5. Menjalankan Proyek
   - "mvn spring-boot:run"

     Proyek akan dijalankan pada server Tomcat embedded di port default 8080.
6. Uji Coba API
   - Setelah proyek berhasil dijalankan, Anda dapat mengakses API menggunakan alamat http://localhost:8080/api/buku.
   - Gunakan Postman atau aplikasi serupa untuk menguji endpoint API yang telah disediakan.
7. Dokumentasi API
   Untuk melihat dokumentasi lengkap API, buka http://localhost:8080/swagger-ui.html setelah proyek berhasil dijalankan.
8. Berhenti Menjalankan Proyek
   Tekan Ctrl + C di terminal untuk menghentikan server Tomcat yang sedang berjalan.

## Kontribusi
Jika Anda ingin berkontribusi pada proyek ini, silakan ikuti langkah-langkah berikut:

1. Fork repository ini (Fork button di atas kanan halaman).
2. Clone repository yang telah di-fork ke komputer lokal Anda.
3. Buat branch baru untuk fitur yang akan Anda tambahkan atau perbaiki.
4. Lakukan perubahan yang diperlukan di branch tersebut.
5. Commit dan push perubahan Anda ke repository di GitHub.
6. Buat Pull Request di GitHub, dan berikan deskripsi yang jelas tentang perubahan yang Anda lakukan.

Pastikan untuk mengganti username dan repo-name dengan informasi yang sesuai dari repository GitHub Anda. Dengan mengikuti langkah-langkah ini, pengguna atau kontributor baru dapat dengan mudah menginstal, menjalankan, dan berkontribusi pada proyek Anda.
