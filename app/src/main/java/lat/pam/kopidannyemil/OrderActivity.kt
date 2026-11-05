package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val etNamaLengkap = findViewById<EditText>(R.id.etNamaLengkap)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val etPatokan = findViewById<EditText>(R.id.etPatokan)
        val btnOrderKirim = findViewById<Button>(R.id.btnOrderKirim)

        btnOrderKirim.setOnClickListener {
            val nama = etNamaLengkap.text.toString()
            val alamat = etAlamat.text.toString()

            if (nama.isEmpty() || alamat.isEmpty()) {
                Toast.makeText(this, "Nama dan Alamat harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Pesanan berhasil dikirim!", Toast.LENGTH_SHORT).show()

                // Pindah ke Halaman Konfirmasi Pesanan
                val intent = Intent(this, ConfirmationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}