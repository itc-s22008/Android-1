package jp.ac.it_college.std.s22008.listviewreplacesample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22008.listviewreplacesample.databinding.ActivityMainBinding
import jp.ac.it_college.std.s22008.listviewreplacesample.databinding.MenuRowBinding
import java.text.FieldPosition

class MenuListAdapter(
    private val data: List<String>
) : RecyclerView.Adapter<MenuListAdapter.ViewHolder> () {

    class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int) {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MenuRowBinding.inflate((inflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size
        holder.binding.tvMenu.text = data[position]
        holder.binding,root.setonClickListener{
            val msg = it.context.resources.getText(R.string.toast_msg, data[position])
        Toast.makeText(it.context, msg,Toast.LENGTH_LONG).show()


    }
}