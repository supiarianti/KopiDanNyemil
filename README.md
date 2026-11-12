KopiDanNyemil ☕🍪

Project tugas Pemrograman Aplikasi Mobile (PAM) berupa aplikasi pemesanan kopi dan makanan ringan berbasis Android (Kotlin/XML).

📁 Struktur Package & Berkas

Aplikasi ini dibangun dalam package lat.pam.kopidannyemil dengan alur navigasi multi-activity:

SplashActivity.kt / activity_splash.xml — Layar awal aplikasi (Splash Screen).

SignUpActivity.kt / activity_sign_up.xml — Halaman registrasi akun baru.

LoginActivity.kt / activity_login.xml — Layar autentikasi masuk.

RegisterActivity.kt / activity_register.xml — Halaman pendaftaran lanjutan.

HomeActivity.kt / activity_home.xml — Beranda utama katalog produk.

Menu.kt & MenuAdapter.kt / item_menu.xml — Model data dan adapter RecyclerView untuk daftar menu.

OrderActivity.kt / activity_order.xml — Form input data pemesan (Nama, Alamat, Patokan).

ConfirmationActivity.kt / activity_confirmation.xml — Ringkasan dan status konfirmasi pemesanan.

ProfileActivity.kt / activity_profile.xml — Layar profil pengguna.

📱 Fitur Aplikasi

Autentikasi Pengguna: Registrasi & Login akun.

Katalog Menu: Menampilkan pilihan minuman kopi dan kudapan (nyemil).

Pemesanan Produk: Pengisian form data pengiriman pesanan secara langsung.

Status Pesanan: Layar konfirmasi penyelesaian transaksi.

🛠️ Teknologi & Resource

Bahasa: Kotlin

Layout: Android XML (ConstraintLayout, LinearLayout)

Min SDK: Android 7.0 (API level 24)

Resource Custom: Drawable custom shape (button_black, button_outline, edit_text_background, circle_ok_background).

🚀 Cara Menjalankan

Clone repository ini:

https://github.com/supiarianti/KopiDanNyemil.git


Buka project di Android Studio.

Sinkronkan dependensi Gradle (Build -> Clean / Rebuild Project).

Jalankan aplikasi via Emulator atau HP Android (Run ▶️).

📸 Screenshot / Tampilan Aplikasi
Screenshot tampilan aplikasi terlampir terpisah di repository ini, pada file SATU.jpeg sampai SEMBILAN.jpeg.

Mata Kuliah Pemrograman Aplikasi Mobile (PAM)
