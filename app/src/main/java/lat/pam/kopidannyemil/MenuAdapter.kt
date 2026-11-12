package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    private val menuList: List<Menu>,
    private val onItemClick: (Menu) -> Unit
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivMenuImage: ImageView = itemView.findViewById(R.id.ivMenuImage)
        val tvMenuName: TextView = itemView.findViewById(R.id.tvMenuName)
        val tvMenuDesc: TextView = itemView.findViewById(R.id.tvMenuDesc)
        val tvMenuPrice: TextView = itemView.findViewById(R.id.tvMenuPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menu = menuList[position]
        holder.tvMenuName.text = menu.name
        holder.tvMenuDesc.text = menu.description
        holder.tvMenuPrice.text = menu.price
        holder.ivMenuImage.setImageResource(menu.imageResource)

        // Event klik ketika item menu dipilih
        holder.itemView.setOnClickListener {
            onItemClick(menu)
        }
    }

    override fun getItemCount(): Int = menuList.size
}