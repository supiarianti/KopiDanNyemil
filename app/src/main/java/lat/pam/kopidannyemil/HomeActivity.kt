package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val btnHome = findViewById<Button>(R.id.btnHome)

        val menuList = listOf(
            Menu(
                "Kopi Susu Gula Aren",
                "Espresso, susu, gula aren",
                "Rp22.000"
            ),
            Menu(
                "Donat Cokelat",
                "Donat empuk glaze cokelat",
                "Rp12.000"
            ),
            Menu(
                "Sourdough Loaf",
                "Roti fermentasi alami",
                "Rp35.000"
            ),
            Menu(
                "Cappuccino",
                "Espresso, foam susu lembut",
                "Rp25.000"
            ),
            Menu(
                "Matcha Latte",
                "Matcha jepang, susu segar",
                "Rp27.000"
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MenuAdapter(menuList)

        btnProfile.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ProfileActivity::class.java
                )
            )
        }

        btnOrder.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    OrderActivity::class.java
                )
            )
        }

        btnHome.setOnClickListener {
            // Sudah berada di Home, opsional dikosongkan atau Refresh
        }
    }
}