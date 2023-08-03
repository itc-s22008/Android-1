package jp.ac.it_college.std.s22008.intentsample

import androidx.recyclerview.widget.RecyclerView

abstract class MenuListAdapter(private val data: List<Menu>)
    :RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

        class ViewHolder(var binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)
}