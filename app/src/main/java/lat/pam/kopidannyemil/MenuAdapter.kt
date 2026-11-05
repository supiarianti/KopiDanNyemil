package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    private val menuList: List<Menu>
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val tvNama: TextView =
            itemView.findViewById(R.id.tvNama)

        val tvDeskripsi: TextView =
            itemView.findViewById(R.id.tvDeskripsi)

        val tvHarga: TextView =
            itemView.findViewById(R.id.tvHarga)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_menu,
                parent,
                false
            )

        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

        val menu = menuList[position]

        holder.tvNama.text = menu.nama
        holder.tvDeskripsi.text = menu.deskripsi
        holder.tvHarga.text = menu.harga
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}