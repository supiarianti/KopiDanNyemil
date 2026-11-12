package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Inisialisasi RecyclerView dari layout
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 2. Siapkan data list menu makanan & minuman
        val menuList = listOf(
            Menu("Kopi Susu Gula Aren", "Espresso dengan fresh milk dan gula aren asli.", "Rp 18.000", R.drawable.ic_launcher_foreground),
            Menu("Thai Green Tea", "Teh hijau khas Thailand yang creamy & segar.", "Rp 15.000", R.drawable.ic_launcher_foreground),
            Menu("Basreng Si Madu", "Bakso goreng renyah dengan bumbu pedas gurih.", "Rp 12.000", R.drawable.ic_launcher_foreground),
            Menu("Kue Pancong Lumer", "Kue pancong tradisional dengan lumeran cokelat.", "Rp 10.000", R.drawable.ic_launcher_foreground)
        )

        // 3. Pasang Adapter dan Intent ke OrderActivity saat item diklik
        menuAdapter = MenuAdapter(menuList) { selectedMenu ->
            val intent = Intent(this, OrderActivity::class.java).apply {
                putExtra("EXTRA_MENU_NAME", selectedMenu.name)
                putExtra("EXTRA_MENU_PRICE", selectedMenu.price)
            }
            startActivity(intent)
        }

        recyclerView.adapter = menuAdapter
    }
}