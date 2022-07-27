package br.com.impacta.recyclerviewdatabinding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.impacta.recyclerviewdatabinding.data.Email
import br.com.impacta.recyclerviewdatabinding.databinding.EmailItemBinding

class EmailAdapter(val emailList: MutableList<Email>): RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder (val binding: EmailItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val binding = EmailItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  EmailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.binding.email = emailList[position]
    }

    override fun getItemCount(): Int = emailList.size
}